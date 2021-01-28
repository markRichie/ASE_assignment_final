package com.kochchi.aseassignmentfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class RecentAdapter extends RecyclerView.Adapter<RecentAdapter.RecentViewHolder> {

    private LinkedList<Recent> recentList;
    private LayoutInflater layoutInflater;

    public RecentAdapter (Context context, LinkedList<Recent> recentList){
        layoutInflater = LayoutInflater.from(context);
        this.recentList = recentList;

    }

    @NonNull
    @Override
    public RecentAdapter.RecentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mview = layoutInflater.inflate(R.layout.recent_title, parent, false);
        return new RecentAdapter.RecentViewHolder(mview,this);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentAdapter.RecentViewHolder holder, int position) {
        final Recent recent = recentList.get(position);
        holder.recentTitle.setText(recent.getTitle());
        holder.recentDes.setText(recent.getDescription());
    }

    @Override
    public int getItemCount() {
        return recentList.size();
    }

    class RecentViewHolder extends RecyclerView.ViewHolder{
        public final TextView recentTitle, recentDes;
        final RecentAdapter recentAdapter;


        public RecentViewHolder(View itemView, RecentAdapter recentAdapter) {
            super(itemView);
            recentTitle = itemView.findViewById(R.id.recentTitle);
            recentDes = itemView.findViewById(R.id.recentDescription);
            this.recentAdapter = recentAdapter;
        }
    }
}
