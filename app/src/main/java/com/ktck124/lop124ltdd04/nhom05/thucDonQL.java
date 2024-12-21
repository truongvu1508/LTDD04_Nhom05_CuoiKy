package com.ktck124.lop124ltdd04.nhom05;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link thucDonQL#newInstance} factory method to
 * create an instance of this fragment.
 */
public class thucDonQL extends Fragment {

    // Static keys for arguments
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private Spinner spinnerLoaiMon;
    private RecyclerView recyclerViewMonAn;

    // Parameters (if needed)
    private String mParam1;
    private String mParam2;

    public thucDonQL() {
        // Required empty public constructor
    }

    public static thucDonQL newInstance(String param1, String param2) {
        thucDonQL fragment = new thucDonQL();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_thuc_don_q_l, container, false);

        // Kết nối View
        spinnerLoaiMon = view.findViewById(R.id.spinner_loaiMon);
        recyclerViewMonAn = view.findViewById(R.id.rcv_DSMon);

        // Setup Spinner
        setupSpinner();

        // Setup RecyclerView
        setupRecyclerView();

        return view;
    }

    private void setupSpinner() {
        // Dữ liệu giả lập cho Spinner
        List<String> loaiMonList = new ArrayList<>();
        loaiMonList.add("Tất cả");
        loaiMonList.add("Món chính");
        loaiMonList.add("Món phụ");
        loaiMonList.add("Đồ uống");

        // Cài đặt Adapter cho Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_spinner_item, loaiMonList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLoaiMon.setAdapter(adapter);
    }

    private void setupRecyclerView() {
        // Dữ liệu giả lập cho RecyclerView
        List<String> danhSachMonAn = new ArrayList<>();
        danhSachMonAn.add("Cà phê đen");
        danhSachMonAn.add("Cà phê sữa");
        danhSachMonAn.add("Trà");
        danhSachMonAn.add("Trà sữa");

        // Cài đặt LayoutManager và Adapter
        recyclerViewMonAn.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView.Adapter adapter = new MonAnAdapter(danhSachMonAn);
        recyclerViewMonAn.setAdapter(adapter);
    }
}
