package com.dememos.admin.myremember.adapter;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

<<<<<<< HEAD
import com.dememos.admin.myremember.dto.RemindDTO;
import com.dememos.admin.myremember.fragment.AbstractTabFragment;
import com.dememos.admin.myremember.fragment.BirthdaysFragment;
import com.dememos.admin.myremember.fragment.HistoryFragment;
import com.dememos.admin.myremember.fragment.IdeasFragment;
import com.dememos.admin.myremember.fragment.TodoFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
=======
import com.dememos.admin.myremember.R;

>>>>>>> parent of dcd5b09... del error
import java.util.Map;

public class TabsFragmentAdapter extends FragmentPagerAdapter{

    private Map<Integer, Fragment> tabs;
    private Context context;
    private List<RemindDTO> data;
    private HistoryFragment historyFragment;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
<<<<<<< HEAD
        this.data = new ArrayList<>();

        initTabMap(context);
=======
        tabs.put(0, context.getString(R.string.tab_item_history));
        tabs.put(1, context.getString(R.string.tab_item_ideas));
        tabs.put(2, context.getString(R.string.tab_item_todo));
        tabs.put(3, context.getString(R.string.tab_item_birthdays));
>>>>>>> parent of dcd5b09... del error

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position);
    }

    @Override
    public Fragment getItem(int position) {


       return tabs.get(position);

    }

    @Override
    public int getCount() {
<<<<<<< HEAD
        return tabs.size();
    }

    private void initTabMap(Context context) {
        tabs = new HashMap<>();
        historyFragment = HistoryFragment.getInstance(context, data);
        tabs.put(0, historyFragment);
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
=======
        return tabs.length;
>>>>>>> parent of dcd5b09... del error
    }


    public void setData(List<RemindDTO> data) {
        this.data = data;
        historyFragment.refreshData(data);
    }
}
