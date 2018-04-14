package com.example.anshuman_hp.qazwsxedc;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Anshuman-HP on 31-03-2017.
 */

public class pageradapter extends FragmentStatePagerAdapter {
    public pageradapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PostFrag();
            case 1:
                return new ClubChatFrag();
            case 2:
                return new ShareFilefrag();
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:return "Posts";
            case 1:return  "Club Chat";
            case 2:return "Share Files";
            default:return "Test";
        }
    }
}
