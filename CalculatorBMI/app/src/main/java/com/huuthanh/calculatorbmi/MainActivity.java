package com.huuthanh.calculatorbmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtKg,edtCm;
    AppCompatButton btnCalculate;
    TextView txtResult, txtCompare, txtStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setEvent() {
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calculate();
            }
        });
    }

    private void Calculate() {
        if(edtKg.getText().toString().trim().equals("")){
            edtKg.setError("Yêu cầu bạn nhập đầy đủ");
        }else if(edtCm.getText().toString().trim().equals("")){
            edtCm.setError("Yêu cầu bạn nhập đầy đủ");
        }else {
            Double bmi = (Float.valueOf(edtKg.getText().toString())) /(Float.valueOf(edtCm.getText().toString())*Float.valueOf(edtCm.getText().toString()) *0.0001);
            double roundOff = Math.round(bmi * 100.0) / 100.0;
            txtResult.setText(String.valueOf(roundOff));
            CompareBMI(roundOff);
            txtCompare.setVisibility(View.VISIBLE);
        }
    }

    private void CompareBMI(double roundOff) {
        if(roundOff<18.5){
            txtStatus.setText("Bạn bị gầy");
            txtCompare.setText(roundOff+ " < 18.5");
        }else if(18.5<=roundOff && roundOff<=24.99){
            txtStatus.setText("Bạn bình thường");
            txtCompare.setText( "18.5 <= "+roundOff+" <= 24.99");
        }else if(roundOff==25){
            txtStatus.setText("Bạn thừa cân");
            txtCompare.setText( roundOff+" = 25");
        }else if(roundOff>25 && roundOff <= 29.99){
            txtStatus.setText("Bạn ở mức tiền béo phì");
            txtCompare.setText( "25 < "+roundOff+" <= 29.99");
        }else if(roundOff>=30 && roundOff <= 34.99){
            txtStatus.setText("Bạn ở mức béo phì độ I");
            txtCompare.setText( "30 <= "+roundOff+" <= 34.99");
        }else if(roundOff>=35 && roundOff <= 39.99){
            txtStatus.setText("Bạn ở mức béo phì độ II");
            txtCompare.setText( "35 <= "+roundOff+" <= 39.99");
        }else {
            txtStatus.setText("Bạn ở mức béo phì độ III");
            txtCompare.setText( roundOff+" >= 40");
        }
    }

    private void setControl() {
        edtKg = findViewById(R.id.edtKg);
        edtCm = findViewById(R.id.edtCm);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txtResult);
        txtCompare = findViewById(R.id.txtCompare);
        txtStatus = findViewById(R.id.txtStatus);
    }
}