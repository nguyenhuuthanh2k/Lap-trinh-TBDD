package NguyenHuuThanh.BaiKT1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUserName,edtPass;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setEvent();
        setControl();
    }

    private void setEvent() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //kiem tra
                if(edtUserName.getText().toString().equals("maicuongtho") && edtPass.getText().toString().equals("Cntt60ntu!")){
                    Toast.makeText(MainActivity.this,"User and Password is correct",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"User and Password is wrong",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void setControl() {
        edtUserName = findViewById(R.id.edtUserName);
        edtPass = findViewById(R.id.edtPass);
        btnLogin = findViewById(R.id.btnLogin);
    }
}