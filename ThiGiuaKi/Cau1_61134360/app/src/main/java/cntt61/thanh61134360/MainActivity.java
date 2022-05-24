package cntt61.thanh61134360;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    AppCompatButton btncv, btndt, btnkq;
    TextView txtcanh2, txtkq;
    EditText edtcanh1, edtcanh2;
    boolean checkCachTinh = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }
    private void setControl() {
        btncv = findViewById(R.id.btn_cv);
        btndt = findViewById(R.id.btn_dt);
        btnkq = findViewById(R.id.btn_kq);

        txtcanh2 = findViewById(R.id.txt_canh2);
        txtkq = findViewById(R.id.txt_ketqua);

        edtcanh1 = findViewById(R.id.edt_canh1);
        edtcanh2 = findViewById(R.id.edt_canh2);
    }

    private void setEvent() {
        btncv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkCachTinh = false;
                txtcanh2.setText("Nhập độ dài cạnh b");
                SetRong();
            }
        });
        btndt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkCachTinh = true;
                txtcanh2.setText("Nhập độ dài cạnh h");
                SetRong();
            }
        });
        btnkq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TinhToan(checkCachTinh, edtcanh1, edtcanh2);
            }
        });
    }
    private void SetRong(){
        edtcanh1.setText("");
        edtcanh2.setText("");
    }
    private void TinhToan(boolean check, EditText edtcanh1, EditText edtcanh2){
        if(edtcanh1.getText().toString().trim().equals("")&&edtcanh2.getText().toString().trim().equals("")){
            txtkq.setText("Yêu cầu nhập đầy đủ");
            return;
        }
        float canh1 = Float.parseFloat(edtcanh1.getText().toString());
        float canh2 = Float.parseFloat(edtcanh2.getText().toString());

        float ketqua;
        if(check){
            ketqua = canh1*canh2;
            txtkq.setText("Diện tích của hình bình hành là: "+ketqua);
        }else {
            ketqua = 2*(canh1+canh2);
            txtkq.setText("Chu vi của hình bình hành là: "+ketqua);
        }
    }
}