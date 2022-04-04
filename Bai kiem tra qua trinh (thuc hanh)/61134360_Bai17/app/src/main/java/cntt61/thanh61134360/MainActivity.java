package cntt61.thanh61134360;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrLastname;
    ArrayAdapter<String> adapterLastname;
    ListView lvLastname;
    TextView txtLastname;
    EditText editText;
    AppCompatButton btnNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setEvent() {
        lvLastname.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int temp=i+1;
                txtLastname.setText("Vị trí: "+temp+"; Tên là: "+ arrLastname.get(i));
            }
        });
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrLastname.add(editText.getText().toString());
                adapterLastname.notifyDataSetChanged();
                editText.setText("");}
        });
    }

    private void setControl() {
        //anh xa listview tu code java qua xml
        lvLastname = findViewById(R.id.lvLastname);
        txtLastname = findViewById(R.id.txtLastname);
        editText = findViewById(R.id.edtNhap);
        btnNhap = findViewById(R.id.btnNhap);
        //xac dinh nguon du lieu
        arrLastname = new ArrayList<>();
        //fake data
        arrLastname.add("Teo");
        arrLastname.add("Ty");
        arrLastname.add("Bin");
        //tao adapter co cung du lieu voi nguon va gan nguon cho adapter
        adapterLastname = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrLastname);
        //khi nao thay doi thi load lai

        //khoi tao lv de anh xa layout vao
        lvLastname.setAdapter(adapterLastname);

    }
}