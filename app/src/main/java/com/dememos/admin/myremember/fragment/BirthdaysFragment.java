package com.dememos.admin.myremember.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dememos.admin.myremember.R;


public class BirthdaysFragment extends Fragment {
    private static final int LAYOUT = R.layout.fragment_example;

    private static String title;
    private Context context;

    private View view;
    public static BirthdaysFragment getInstance(Context context){
        Bundle args = new Bundle();
        BirthdaysFragment fragment = new BirthdaysFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_birthdays));


        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        return view;

    }

    public static void setTitle(String title) {
        BirthdaysFragment.title = title;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
