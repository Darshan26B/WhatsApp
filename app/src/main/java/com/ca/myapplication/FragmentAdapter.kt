package com.ca.myapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragmentAdapter(fm: FragmentManager, fragment: Array<Fragment>, title: Array<String>) : FragmentPagerAdapter(fm) {
    var fragment:Array<Fragment> = fragment
    var title: Array<String> =title
    override fun getCount(): Int {
         return title.size
    }

    override fun getItem(position: Int): Fragment {
        return fragment[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return title.get(position)
    }
}