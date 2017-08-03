package cashkaro.com.reusablerecycleview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yasar on 3/8/17.
 */

public class Frag1 extends CommonFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fraglayout, container, false);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<String> l = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            l.add("GGGGGG " + i);
        }

        recyclerViewAdapter.updateList(l);
    }
}
