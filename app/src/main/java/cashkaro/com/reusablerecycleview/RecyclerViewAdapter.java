package cashkaro.com.reusablerecycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by yasar on 3/8/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.Row> {

    public RecyclerViewAdapter(Context context, List<String> list) {
        this.list = list;
        this.context = context;
    }

    private List<String> list;
    private Context context;

    public void updateList(List<String> list) {
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();

    }

    @Override
    public Row onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row, parent, false);
        return new Row(view);
    }

    @Override
    public void onBindViewHolder(Row holder, int position) {
        String msg = list.get(position);

        holder.msg.setText(msg);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class Row extends RecyclerView.ViewHolder {

        private TextView msg;

        public Row(View itemView) {
            super(itemView);
            msg = (TextView) itemView.findViewById(R.id.msg);
        }
    }


}
