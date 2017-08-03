package cashkaro.com.reusablerecycleview;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by yasar on 3/8/17.
 */

public class ReusableRecyclerVIew extends FrameLayout {

    private RecyclerView recyclerView;
    private TextView error;
    private Context context;

    public ReusableRecyclerVIew(@NonNull Context context) {
        super(context);
        init(context);
    }

    public ReusableRecyclerVIew(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ReusableRecyclerVIew(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public ReusableRecyclerVIew(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr, @StyleRes int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        this.context = context;
        View view = inflate(context, R.layout.reusablerecyclerview, this);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);

        error = (TextView) view.findViewById(R.id.error);
    }

    public void setLayoutForRecyclerView(String layoutname) {
        switch (layoutname) {
            case "Vertical":

                recyclerView.setLayoutManager(new LinearLayoutManager(context));

                break;

            case "Horizontal":

                recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));


                break;
        }
    }

    public void setAdapter(RecyclerView.Adapter t) {

        recyclerView.setAdapter(t);

    }


    public void setErrorMsg(String msg) {
        error.setText(msg);
    }

    public void setRecyclerViewVisibility(boolean isVisible) {
        if (isVisible) {
            recyclerView.setVisibility(VISIBLE);
        } else {
            recyclerView.setVisibility(GONE);
        }
    }

    public void setErrorVisibility(boolean isVisible) {
        if (isVisible) {
            error.setVisibility(VISIBLE);
        } else {
            error.setVisibility(GONE);
        }
    }


    public RecyclerView getRecyclerView() {
        return recyclerView;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public TextView getError() {
        return error;
    }

    public void setError(TextView error) {
        this.error = error;
    }
}
