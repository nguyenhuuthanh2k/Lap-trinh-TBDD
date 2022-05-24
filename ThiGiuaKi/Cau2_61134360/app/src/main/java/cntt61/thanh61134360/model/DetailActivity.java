package cntt61.thanh61134360.model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import cntt61.thanh61134360.R;

public class DetailActivity extends AppCompatActivity {
    TextView txt_tieude, txt_noidung, txt_tacgia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setControl();
    }

    private void setControl() {
        txt_tieude = findViewById(R.id.txt_TieuDe);
        txt_noidung = findViewById(R.id.txt_NoiDung);
        txt_tacgia = findViewById(R.id.txt_TacGia);

        BaiTho bt = (BaiTho) getIntent().getSerializableExtra("BaiTho");
        txt_tieude.setText(bt.getTieuDe());
        txt_noidung.setText(bt.getToiDung());
        txt_tacgia.setText(bt.getTacGia());
    }
}