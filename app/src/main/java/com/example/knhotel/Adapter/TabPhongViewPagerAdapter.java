package com.example.knhotel.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.knhotel.Fragment.FragmentLoaiPhong;
import com.example.knhotel.Fragment.FragmentPhong;


public class TabPhongViewPagerAdapter extends FragmentStateAdapter {
    public TabPhongViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                return new FragmentPhong();
            case 1:
                return new FragmentLoaiPhong();

        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
