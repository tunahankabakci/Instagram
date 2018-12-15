package com.tunahan.instagram.utils

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class HomePagerAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {



    private var fragmentListOfHomeActivity:ArrayList<Fragment> = ArrayList()


    override fun getItem(p0: Int): Fragment {
        return fragmentListOfHomeActivity.get(p0)

    }

    override fun getCount(): Int {
        return fragmentListOfHomeActivity.size
    }

    fun addFragment(fragment:Fragment){
        fragmentListOfHomeActivity.add(fragment)
    }


}