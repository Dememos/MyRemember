package com.dememos.admin.myremember.adapter;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.dememos.admin.myremember.R;

import java.util.Map;

public class TabsFragmentAdapter extends FragmentPagerAdapter{

    private Map<Integer, Fragment> tabs;
    private Context context;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        tabs.put(0, context.getString(R.string.tab_item_history));
        tabs.put(1, context.getString(R.string.tab_item_ideas));
        tabs.put(2, context.getString(R.string.tab_item_todo));
        tabs.put(3, context.getString(R.string.tab_item_birthdays));

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
        return tabs.length;
    }
}
