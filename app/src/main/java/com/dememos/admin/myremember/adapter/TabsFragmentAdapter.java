package com.dememos.admin.myremember.adapter;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.dememos.admin.myremember.dto.RemindDTO;
import com.dememos.admin.myremember.fragment.AbstractTabFragment;
import com.dememos.admin.myremember.fragment.BirthdaysFragment;
import com.dememos.admin.myremember.fragment.HistoryFragment;
import com.dememos.admin.myremember.fragment.IdeasFragment;
import com.dememos.admin.myremember.fragment.TodoFragment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TabsFragmentAdapter extends FragmentPagerAdapter{

    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;
    private List<RemindDTO> data;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabMap(context);

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {


       return tabs.get(position);

    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabMap(Context context) {
        tabs = new HashMap<>();
        HistoryFragment historyFragment = HistoryFragment.getInstance(context, data);
        tabs.put(0, historyFragment);
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
    }


    public void setData(List<RemindDTO> data) {
        this.data = data;
    }
}
