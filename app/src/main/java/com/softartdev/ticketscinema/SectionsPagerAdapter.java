package com.softartdev.ticketscinema;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.softartdev.ticketscinema.fragments.AfishaFragment;
import com.softartdev.ticketscinema.fragments.MyTicketsFragment;
import com.softartdev.ticketscinema.fragments.SoonFragment;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new SoonFragment();
            case 1:
                return new AfishaFragment();
            case 2:
                return new MyTicketsFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Скоро в кино";
            case 1:
                return "Афиша";
            case 2:
                return "Мои билеты";
        }
        return null;
    }
}
