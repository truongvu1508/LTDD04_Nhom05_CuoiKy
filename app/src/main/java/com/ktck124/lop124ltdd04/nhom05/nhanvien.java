package com.ktck124.lop124ltdd04.nhom05;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class nhanvien extends Fragment {
    private RecyclerView rcvNhanVien;
    private NhanvienAdapter adapter;
    private List<thongtinnhom> nhanVienList;

    public nhanvien() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nhanvien, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Initialize RecyclerView
        rcvNhanVien = view.findViewById(R.id.rcv_NhanVien);
        rcvNhanVien.setLayoutManager(new LinearLayoutManager(getContext()));

        // Initialize data
        nhanVienList = new ArrayList<>();
        nhanVienList.add(new thongtinnhom("Nguyễn Trường Vũ", "Nhóm trưởng", "22115053122250"));
        nhanVienList.add(new thongtinnhom("Lê Quang Mạnh Hùng", "Thành viên", "22115053122216"));
        nhanVienList.add(new thongtinnhom("Đỗ Thành Bảo", "Thành viên", "22115053122202"));

        // Set adapter
        adapter = new NhanvienAdapter(getContext(), nhanVienList);
        rcvNhanVien.setAdapter(adapter);
    }
}
