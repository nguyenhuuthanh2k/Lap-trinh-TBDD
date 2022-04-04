package cntt61.thanh61134360;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] arrLastname;
    ArrayAdapter<String> adapterLastname;
    ListView lvLastname;
    TextView txtLastname;

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
                txtLastname.setText("Vị trí: "+temp+"; Tên là: "+ arrLastname[i]);

            }
        });
    }

    private void setControl() {
        //anh xa listview tu code java qua xml
        lvLastname = findViewById(R.id.lvLastname);
        txtLastname = findViewById(R.id.txtLastname);
        //xac dinh nguon du lieu
        arrLastname = getResources().getStringArray(R.array.arrLastname);
        //tao adapter co cung du lieu voi nguon va gan nguon cho adapter
        adapterLastname = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrLastname);
        //khoi tao lv de anh xa layout vao
        lvLastname.setAdapter(adapterLastname);

    }
}