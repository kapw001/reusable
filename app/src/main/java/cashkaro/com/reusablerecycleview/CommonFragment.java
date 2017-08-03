package cashkaro.com.reusablerecycleview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yasar on 3/8/17.
 */

public class CommonFragment extends Fragment {

    private ReusableRecyclerVIew reusableRecyclerVIew;
    public RecyclerViewAdapter recyclerViewAdapter;

    private List<String> list;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        list = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            list.add("Ttt " + i);
        }

        reusableRecyclerVIew = (ReusableRecyclerVIew) view.findViewById(R.id.reusablerecyclerview);
        recyclerViewAdapter = new RecyclerViewAdapter(getActivity(), list);
        reusableRecyclerVIew.setLayoutForRecyclerView("Vertical");
        reusableRecyclerVIew.setAdapter(recyclerViewAdapter);

        if (list.size() <= 0) {
            reusableRecyclerVIew.setErrorVisibility(true);
            reusableRecyclerVIew.setRecyclerViewVisibility(false);
            reusableRecyclerVIew.setErrorMsg("No data");
        }
    }
}
