package com.dememos.admin.myremember.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
<<<<<<< HEAD
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
=======
import android.support.v4.app.Fragment;
>>>>>>> parent of dcd5b09... del error
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dememos.admin.myremember.R;
import com.dememos.admin.myremember.adapter.RemindListAdapter;
import com.dememos.admin.myremember.dto.RemindDTO;

import java.util.List;

<<<<<<< HEAD

public class HistoryFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_history;
    private List<RemindDTO> data;
    private RemindListAdapter adapter;
=======
public class HistoryFragment extends Fragment {
    private static final int LAYOUT = R.layout.fragment_example;

    private static String title;
    private Context context;

    private View view;
>>>>>>> parent of dcd5b09... del error

    public static HistoryFragment getInstance(Context context, List<RemindDTO> data){
        Bundle args = new Bundle();
        HistoryFragment fragment = new HistoryFragment();
        fragment.setArguments(args);
        fragment.setData(data);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_history));
        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);


        RecyclerView cv = (RecyclerView) view.findViewById(R.id.recycleView);
        cv.setLayoutManager(new LinearLayoutManager(context));
        adapter = new RemindListAdapter(data);
        cv.setAdapter(adapter);
        return view;

    }



    public void setContext(Context context) {
        this.context = context;
    }

<<<<<<< HEAD

    public void setData(List<RemindDTO> data) {
        this.data = data;
    }

    public void refreshData(List<RemindDTO> data){
        adapter.setData(data);
        adapter.notifyDataSetChanged();


=======
    public static void setTitle(String title) {
        HistoryFragment.title = title;
>>>>>>> parent of dcd5b09... del error
    }
}
