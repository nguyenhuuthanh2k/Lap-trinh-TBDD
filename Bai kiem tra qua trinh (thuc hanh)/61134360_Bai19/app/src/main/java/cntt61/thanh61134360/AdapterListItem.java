package cntt61.thanh61134360;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdapterListItem extends ArrayAdapter<String> {

    private Activity context;
    private int resource;
    private List<String> objects;

    public AdapterListItem(@NonNull Activity context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View row, @NonNull ViewGroup parent) {
        if(row==null){
            row = LayoutInflater.from(this.context).inflate(this.resource, null);
        }
        TextView txt_item = row.findViewById(R.id.txt_item);
        ImageView img_item = row.findViewById(R.id.imgItem);

        String txt = this.objects.get(position);
        if(txt.length()>3){
            img_item.setImageResource(R.drawable.earth);
        }else {
            img_item.setImageResource(R.drawable.star);
        }
        txt_item.setText(txt);
        return row;
    }
}
