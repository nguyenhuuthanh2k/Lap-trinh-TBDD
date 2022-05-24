package cntt61.thanh61134360.model.AdapterLv;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import cntt61.thanh61134360.R;
import cntt61.thanh61134360.model.BaiTho;

public class AdapterListViewBaiTho extends ArrayAdapter<BaiTho> {
    private Activity context;
    private int resource;
    private List<BaiTho> objects;

    public AdapterListViewBaiTho(@NonNull Activity context, int resource, @NonNull List<BaiTho> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.context);
        convertView = inflater.inflate(this.resource, null);
        TextView txtTieuDe = convertView.findViewById(R.id.txt_TieuDe);
        TextView txtNoiDung = convertView.findViewById(R.id.txt_NoiDung);
        TextView txtTacGia = convertView.findViewById(R.id.txt_TacGia);

        BaiTho bt = this.objects.get(position);
        txtTieuDe.setText(bt.getTieuDe());
        txtNoiDung.setText(bt.getToiDung());
        txtTacGia.setText(bt.getTacGia());
        return convertView;
    }
}
