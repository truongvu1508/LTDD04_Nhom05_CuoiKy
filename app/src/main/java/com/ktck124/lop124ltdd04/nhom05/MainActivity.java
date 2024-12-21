package com.ktck124.lop124ltdd04.nhom05;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tìm BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        // Đặt Fragment mặc định khi mở ứng dụng
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame_layout, new ThucDonFragment())
                    .commit();
        }

        // Lắng nghe sự kiện click menu
        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;

            // Sử dụng if-else thay cho switch-case
            if (item.getItemId() == R.id.thucdon) {
                selectedFragment = new ThucDonFragment();
            } else if (item.getItemId() == R.id.thongtin) {
                selectedFragment = new ThongTinFragment();
            }

            // Thay thế Fragment nếu không null
            if (selectedFragment != null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_layout, selectedFragment)
                        .commit();
            }
            return true;
        });
    }
}
