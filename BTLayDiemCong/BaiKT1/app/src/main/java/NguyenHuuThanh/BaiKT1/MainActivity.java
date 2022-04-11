package NguyenHuuThanh.BaiKT1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUserName, edtPass;
    AppCompatButton btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setEvent() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = edtUserName.getText().toString();
                String passWord = edtPass.getText().toString();
                if(userName.equals("maicuongtho") && passWord.equals("Cntt60ntu!")){
                    Toast.makeText(MainActivity.this, "User and Password is correct", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "User and Password is wrong", Toast.LENGTH_SHORT).show();
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