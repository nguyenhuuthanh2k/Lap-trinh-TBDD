package NguyenHuuThanh.BaiKT2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rd_13,rd_15, rd_18;
    RadioGroup rd_gr;
    EditText edt_input;
    TextView txt_value;
    AppCompatButton btn_cacul;
    //
    float precent = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setEvent() {
        btn_cacul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Caculater();
            }
        });
        rd_gr.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rd_13:
                        precent = (float) 0.13;
                        break;
                    case  R.id.rd_15:
                        precent = (float) 15/100;
                        break;
                    case R.id.rd_18:
                        precent = (float) 18/100;
                        break;
                    default:
                        precent = 1;
                        break;
                }
            }
        });
    }

    private void Caculater() {
        float value = 0;
        String text = edt_input.getText().toString();
        if(text.equals("")){
            text = "0";
        }
        value = Float.valueOf(text) * precent;
//        Log.e("Caculater: ", value+"");
        txt_value.setText("Your Tip will be $"+value);
        Toast.makeText(MainActivity.this, "Your Tip will be $"+value, Toast.LENGTH_SHORT).show();
    }

    private void setControl() {
        rd_13 = findViewById(R.id.rd_13);
        rd_15 = findViewById(R.id.rd_15);
        rd_18 = findViewById(R.id.rd_18);
        rd_gr = findViewById(R.id.rd_gr);
        edt_input = findViewById(R.id.edt_input);
        txt_value = findViewById(R.id.txt_value);
        btn_cacul = findViewById(R.id.btn_cacul);
    }
}