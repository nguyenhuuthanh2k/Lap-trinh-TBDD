package com.huuthanh.caculatorez;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtA, edtB;
    LinearLayout btnAdd,btnSub, btnMul, btnDiv;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setEvent() {
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printResult("+");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printResult("-");
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printResult("*");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printResult("/");
            }
        });
    }

    private void printResult(String pt){
        if(edtA.getText().toString().trim().equals("")){
            edtA.setError("Không được để rỗng");
        }else if(edtB.getText().toString().trim().equals("")){
            edtB.setError("Không được để rỗng");
        }else {
            if(pt.equals("+")){
                tvResult.setText(Float.parseFloat(edtA.getText().toString()) + Float.parseFloat(edtB.getText().toString())+"");
            }else if(pt.equals("-")){
                tvResult.setText(Float.parseFloat(edtA.getText().toString()) - Float.parseFloat(edtB.getText().toString())+"");
            }else if(pt.equals("*")){
                tvResult.setText(Float.parseFloat(edtA.getText().toString()) * Float.parseFloat(edtB.getText().toString())+"");
            }else if(pt.equals("/")){
                if(edtB.getText().toString().trim().equals("0")){
                    edtB.setError("Số B không được để 0 trong phép toán chia");
                }else {
                    tvResult.setText(Float.parseFloat(edtA.getText().toString()) / Float.parseFloat(edtB.getText().toString())+"");
                }
            }
        }
    }

    private void setControl() {
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        tvResult = findViewById(R.id.tvResult);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Phép tính"); //Thiết lập tiêu đề nếu muốn
        actionBar.hide();
        return super.onCreateOptionsMenu(menu);
    }
}