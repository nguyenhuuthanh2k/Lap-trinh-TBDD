package cntt61.thanh61134360;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {
    ArrayList<String> items;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();
        ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        setListAdapter(myArrayAdapter);
        txt = findViewById(R.id.text);
        setEvent();
    }

    private void setEvent() {
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                txt.setVisibility(View.VISIBLE);
                txt.setText("position: "+ (position+1) + "; Value: "+ items.get(position));
            }
        });
    }


    private void setData() {
        items = new ArrayList<>();
        items.add("Intel");
        items.add("SamSung");
        items.add("Nokia");
        items.add("Simen");
        items.add("EMD");
        items.add("KCD");
        items.add("ECD");
    }
}