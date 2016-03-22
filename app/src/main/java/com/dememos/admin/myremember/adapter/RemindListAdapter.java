package com.dememos.admin.myremember.adapter;


import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dememos.admin.myremember.R;
import com.dememos.admin.myremember.dto.RemindDTO;

import java.util.List;

public class RemindListAdapter extends RecyclerView.Adapter<RemindListAdapter.RemindVeiwHolder>{

    private List<RemindDTO> data;

    public RemindListAdapter(List<RemindDTO> data) {
        this.data = data;
    }

    public static class RemindVeiwHolder extends RecyclerView.ViewHolder{
        CardView cardview;
        TextView title;

        public RemindVeiwHolder(View itemView){
            super(itemView);
            cardview = (CardView) itemView.findViewById(R.id.cardView);
            title = (TextView) itemView.findViewById(R.id.title);
        }


    }


    @Override
    public RemindVeiwHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.remind_item, parent, false);
        return new RemindVeiwHolder(view);
    }

    @Override
    public void onBindViewHolder(RemindVeiwHolder holder, int position) {
        RemindDTO item = data.get(position);
        holder.title.setText(item.getTitle());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<RemindDTO> data) {
        this.data = data;
    }
}
