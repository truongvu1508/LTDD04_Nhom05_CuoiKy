package com.ktck124.lop124ltdd04.nhom05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ktck124.lop124ltdd04.nhom05.R;
import com.ktck124.lop124ltdd04.nhom05.nhanvien;
import com.ktck124.lop124ltdd04.nhom05.thongtinnhom;

import java.util.List;

public class NhanvienAdapter extends RecyclerView.Adapter<NhanvienAdapter.NhanvienViewHolder> {

    private Context context;
    private List<thongtinnhom> nhanVienList;

    public NhanvienAdapter(Context context, List<thongtinnhom> nhanVienList) {
        this.context = context;
        this.nhanVienList = nhanVienList;
    }

    @NonNull
    @Override
    public NhanvienViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_nhanvien, parent, false);
        return new NhanvienViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NhanvienViewHolder holder, int position) {
        thongtinnhom nhanVien = nhanVienList.get(position);

        holder.textName.setText(nhanVien.getTennhom());
        holder.textChucVu.setText(nhanVien.getChucvu());
        holder.textMaSinhVien.setText(nhanVien.getMsv());
    }

    @Override
    public int getItemCount() {
        return nhanVienList.size();
    }

    public void addItem(thongtinnhom nhanVien) {
        nhanVienList.add(nhanVien);
        notifyItemInserted(nhanVienList.size() - 1);
    }

    static class NhanvienViewHolder extends RecyclerView.ViewHolder {
        TextView textName, textChucVu, textMaSinhVien;

        public NhanvienViewHolder(@NonNull View itemView) {
            super(itemView);
            textName = itemView.findViewById(R.id.text_name);
            textChucVu = itemView.findViewById(R.id.textView_ChucVu);
            textMaSinhVien = itemView.findViewById(R.id.textView_TrangThai);
        }
    }
}
