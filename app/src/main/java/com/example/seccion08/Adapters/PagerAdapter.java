package com.example.seccion08.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.seccion08.Fragments.FirstFragment;
import com.example.seccion08.Fragments.SecondFragment;
import com.example.seccion08.Fragments.ThirdFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int numbOfTabs;

    public PagerAdapter(FragmentManager fm, int numbOfTabs) {
        super(fm);
        this.numbOfTabs = numbOfTabs;

    }

    // Entra cuando cambia de tab
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new FirstFragment();

            case 1:
                return new SecondFragment();

            case 2:
                return new ThirdFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return numbOfTabs;
    }
}
