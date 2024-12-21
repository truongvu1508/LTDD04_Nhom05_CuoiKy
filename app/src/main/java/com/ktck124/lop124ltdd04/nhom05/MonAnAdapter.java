package com.ktck124.lop124ltdd04.nhom05;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MonAnAdapter extends RecyclerView.Adapter<MonAnAdapter.MonAnViewHolder> {

    private final List<String> danhSachMonAn;

    public MonAnAdapter(List<String> danhSachMonAn) {
        this.danhSachMonAn = danhSachMonAn;
    }

    @NonNull
    @Override
    public MonAnViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new MonAnViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MonAnViewHolder holder, int position) {
        String monAn = danhSachMonAn.get(position);
        holder.textViewMonAn.setText(monAn);
    }

    @Override
    public int getItemCount() {
        return danhSachMonAn.size();
    }

    static class MonAnViewHolder extends RecyclerView.ViewHolder {
        TextView textViewMonAn;

        public MonAnViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewMonAn = itemView.findViewById(android.R.id.text1);
        }
    }
}
