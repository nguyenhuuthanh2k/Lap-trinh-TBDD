package NguyenHuuThanh.BaiKT3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edt_vitri, edt_giatri;
    AppCompatButton btn_luu, btn_sua, btn_xoa;
    ListView lv;
    ArrayAdapter<String> arrayAdapter;
    ArrayList<String> lsitem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setEvent() {
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.e("onItemClick: ", position+": "+lsitem.get(position));
                edt_vitri.setText(String.valueOf(position+1));
                edt_giatri.setText(lsitem.get(position));
            }
        });
        btn_luu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addData(edt_giatri.getText().toString());
                clearEditText();
            }
        });
        btn_sua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt_vitri.getText().toString().equals("")){
                    return;
                }
                int vitrichon = Integer.valueOf(edt_vitri.getText().toString())-1;
                String item = edt_giatri.getText().toString();
                suaData(vitrichon, item);
//                clearEditText();
            }
        });
        btn_xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt_vitri.getText().toString().equals("")){
                    return;
                }
                int vitrichon = Integer.valueOf(edt_vitri.getText().toString())-1;
                lsitem.remove(vitrichon);
                arrayAdapter.notifyDataSetChanged();
                clearEditText();
            }
        });
    }

    private void setControl() {
        edt_vitri = findViewById(R.id.edt_vitri);
        edt_giatri = findViewById(R.id.edt_giatri);
        btn_luu = findViewById(R.id.btn_luu);
        btn_sua = findViewById(R.id.btn_sua);
        btn_xoa = findViewById(R.id.btn_xoa);
        lv = findViewById(R.id.lv);
        // set dữ liệu vào list
        SetData();
        // gán dữ liệu cho listView
        arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, lsitem);
        lv.setAdapter(arrayAdapter);
    }

    private  void SetData(){
        lsitem = new ArrayList<>();
        lsitem.add("Content");
        lsitem.add("Graphics");
        lsitem.add("Hardware");
        lsitem.add("Media");
        lsitem.add("MSC");
        lsitem.add("OS");
        lsitem.add("Preference");
    }

    private void addData(String s){
        if(s.equals("")){
            return;
        }
        lsitem.add(s);
        // load lại để hiện thị trên list
        arrayAdapter.notifyDataSetChanged();
    }
    private void suaData(int vitri, String giatri){
        if(giatri.equals("")){
            return;
        }
        lsitem.set(vitri,giatri);
        arrayAdapter.notifyDataSetChanged();
    }
    private void clearEditText(){
        edt_vitri.setText("");
        edt_giatri.setText("");
    }
}