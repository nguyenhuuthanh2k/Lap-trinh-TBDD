package cntt61.thanh61134360;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> arrls;
    AdapterListItem adapter;
    TextView txt_Detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //anh xa
        setControl();
        //set envent
        setEvent();
    }

    private void setEvent() {
        //su kien khi click vao 1 item trong list view
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //set hien text detail bi an
                txt_Detail.setVisibility(View.VISIBLE);
                //positon la vi tri click vao lay du lieu tu arraylist
                txt_Detail.setText(arrls.get(position));
            }
        });
    }

    private void setControl() {
        //anh xa list view va xet adapter
        lv = findViewById(R.id.lv);
        txt_Detail = findViewById(R.id.txt_detail);
        //tao data
        setData();
        adapter = new AdapterListItem(MainActivity.this,R.layout.itemls,arrls);
        lv.setAdapter(adapter);
    }

    private void setData() {
        arrls = new ArrayList<>();
        arrls.add("Hà Nội");
        arrls.add("Huế");
        arrls.add("Spa");
        arrls.add("Côn Sơn");
        arrls.add("Vũng Tàu");
        arrls.add("Đà Nẵng");
    }
}