package cntt61.thanh61134360;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import cntt61.thanh61134360.model.AdapterLv.AdapterListViewBaiTho;
import cntt61.thanh61134360.model.BaiTho;
import cntt61.thanh61134360.model.DetailActivity;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    List<BaiTho> lsBaiTho;
    AdapterListViewBaiTho adapterListViewBaiTho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setEvent() {
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("BaiTho", lsBaiTho.get(i));
                startActivity(intent);
            }
        });

    }

    private void setControl() {
        lv = findViewById(R.id.lv);
        lsBaiTho = new ArrayList<>();
        setData();
        adapterListViewBaiTho = new AdapterListViewBaiTho(this, R.layout.item_baitho, lsBaiTho);
        lv.setAdapter(adapterListViewBaiTho);
    }

    private void setData() {
        lsBaiTho.add(new BaiTho(1," Việt Nam Quê Hương Ta","Việt Nam đất nước ta ơi\n" +
                "Mênh mông biển lúa đâu trời đẹp hơn\n" +
                "Cánh cò bay lả rập rờn\n" +
                "Mây mờ che đỉnh Trường Sơn sớm chiều\n" +
                "Quê hương biết mấy thân yêu\n" +
                "Bao nhiêu đời đã chịu nhiều thương đau\n" +
                "Mặt người vất vả in sâu\n" +
                "Gái trai cũng một áo nâu nhuộm bùn\n" +
                "Đất nghèo nuôi những anh hùng\n" +
                "Chìm trong máu lửa lại vùng đứng lên\n" +
                "Đạp quân thù xuống đất đen\n" +
                "Súng gươm vứt bỏ lại hiền như xưa\n" +
                "Việt Nam đất nắng chan hoà\n" +
                "Hoa thơm quả ngọt bốn mùa trời xanh\n" +
                "Mắt đen cô gái long lanh\n" +
                "Yêu ai yêu trọn tấm tình thuỷ chung\n" +
                "Đất trăm nghề của trăm vùng\n" +
                "Khách phương xa tới lạ lùng tìm xem\n" +
                "Tay người như có phép tiên\n" +
                "Trên tre lá cũng dệt nghìn bài thơ\n" +
                "Nước bâng khuâng những chuyến đò\n" +
                "Đêm đêm còn vọng câu hò Trương Chi\n" +
                "Đói nghèo nên phải chia ly\n" +
                "Xót xa lòng kẻ rời quê lên đường\n" +
                "Ta đi ta nhớ núi rừng\n" +
                "Ta đi ta nhớ dòng sông vỗ bờ\n" +
                "Nhớ đồng ruộng, nhớ khoai ngô\n" +
                "Bũa cơm rau muống quả cà giòn tan ...","Nguyễn Đình Thi"));
        lsBaiTho.add(new BaiTho(1," Việt Nam Quê Hương Ta","Việt Nam đất nước ta ơi\n" +
                "Mênh mông biển lúa đâu trời đẹp hơn\n" +
                "Cánh cò bay lả rập rờn\n" +
                "Mây mờ che đỉnh Trường Sơn sớm chiều\n" +
                "Quê hương biết mấy thân yêu\n" +
                "Bao nhiêu đời đã chịu nhiều thương đau\n" +
                "Mặt người vất vả in sâu\n" +
                "Gái trai cũng một áo nâu nhuộm bùn\n" +
                "Đất nghèo nuôi những anh hùng\n" +
                "Chìm trong máu lửa lại vùng đứng lên\n" +
                "Đạp quân thù xuống đất đen\n" +
                "Súng gươm vứt bỏ lại hiền như xưa\n" +
                "Việt Nam đất nắng chan hoà\n" +
                "Hoa thơm quả ngọt bốn mùa trời xanh\n" +
                "Mắt đen cô gái long lanh\n" +
                "Yêu ai yêu trọn tấm tình thuỷ chung\n" +
                "Đất trăm nghề của trăm vùng\n" +
                "Khách phương xa tới lạ lùng tìm xem\n" +
                "Tay người như có phép tiên\n" +
                "Trên tre lá cũng dệt nghìn bài thơ\n" +
                "Nước bâng khuâng những chuyến đò\n" +
                "Đêm đêm còn vọng câu hò Trương Chi\n" +
                "Đói nghèo nên phải chia ly\n" +
                "Xót xa lòng kẻ rời quê lên đường\n" +
                "Ta đi ta nhớ núi rừng\n" +
                "Ta đi ta nhớ dòng sông vỗ bờ\n" +
                "Nhớ đồng ruộng, nhớ khoai ngô\n" +
                "Bũa cơm rau muống quả cà giòn tan ...","Nguyễn Đình Thi"));
        lsBaiTho.add(new BaiTho(1," Việt Nam Quê Hương Ta","Việt Nam đất nước ta ơi\n" +
                "Mênh mông biển lúa đâu trời đẹp hơn\n" +
                "Cánh cò bay lả rập rờn\n" +
                "Mây mờ che đỉnh Trường Sơn sớm chiều\n" +
                "Quê hương biết mấy thân yêu\n" +
                "Bao nhiêu đời đã chịu nhiều thương đau\n" +
                "Mặt người vất vả in sâu\n" +
                "Gái trai cũng một áo nâu nhuộm bùn\n" +
                "Đất nghèo nuôi những anh hùng\n" +
                "Chìm trong máu lửa lại vùng đứng lên\n" +
                "Đạp quân thù xuống đất đen\n" +
                "Súng gươm vứt bỏ lại hiền như xưa\n" +
                "Việt Nam đất nắng chan hoà\n" +
                "Hoa thơm quả ngọt bốn mùa trời xanh\n" +
                "Mắt đen cô gái long lanh\n" +
                "Yêu ai yêu trọn tấm tình thuỷ chung\n" +
                "Đất trăm nghề của trăm vùng\n" +
                "Khách phương xa tới lạ lùng tìm xem\n" +
                "Tay người như có phép tiên\n" +
                "Trên tre lá cũng dệt nghìn bài thơ\n" +
                "Nước bâng khuâng những chuyến đò\n" +
                "Đêm đêm còn vọng câu hò Trương Chi\n" +
                "Đói nghèo nên phải chia ly\n" +
                "Xót xa lòng kẻ rời quê lên đường\n" +
                "Ta đi ta nhớ núi rừng\n" +
                "Ta đi ta nhớ dòng sông vỗ bờ\n" +
                "Nhớ đồng ruộng, nhớ khoai ngô\n" +
                "Bũa cơm rau muống quả cà giòn tan ...","Nguyễn Đình Thi"));
    }
}