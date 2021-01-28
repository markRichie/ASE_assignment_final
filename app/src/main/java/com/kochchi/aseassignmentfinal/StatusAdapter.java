package com.kochchi.aseassignmentfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.StatusViewHolder> {

    private LinkedList<Status> statusList;
    private LayoutInflater layoutInflater;

    public StatusAdapter (Context context, LinkedList<Status> statusList){
        layoutInflater = LayoutInflater.from(context);
        this.statusList = statusList;

    }


    @NonNull
    @Override
    public StatusAdapter.StatusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mview = layoutInflater.inflate(R.layout.status_tile, parent, false);
        return new StatusViewHolder(mview, this);
    }

    @Override
    public void onBindViewHolder(@NonNull StatusAdapter.StatusViewHolder holder, int position) {
        final Status status = statusList.get(position);
        holder.statusAmout.setText(String.valueOf(status.getStatus_number()));
        holder.statusName.setText(status.getStatus_progress());
        holder.cardView.setCardBackgroundColor(status.getTile_color());
    }

    @Override
    public int getItemCount() {
        return statusList.size();
    }

    class StatusViewHolder extends RecyclerView.ViewHolder{
        public final TextView statusAmout,statusName;
        public final CardView cardView;
        final StatusAdapter statusAdapter;


        public StatusViewHolder(View itemView, StatusAdapter statusAdapter) {
            super(itemView);
            statusAmout = itemView.findViewById(R.id.status_amount);
            statusName = itemView.findViewById(R.id.status_name);
            cardView = itemView.findViewById(R.id.status_card);
            this.statusAdapter = statusAdapter;
        }
    }
}
