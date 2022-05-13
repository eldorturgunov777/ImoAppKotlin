package com.example.imoappkotlin.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


/**
 * Created by Eldor Turgunov on 13.05.2022.
 * Imo App Kotlin
 * eldorturgunov777@gmail.com
 */
class VPAdapter(fm: FragmentManager, var behavior: Int): FragmentPagerAdapter(fm) {
    var fragments = ArrayList<Fragment>()
    var title = ArrayList<String>()

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments.get(position)
    }
    fun addFragment(fragment: Fragment?, s: String?) {
        fragments.add(fragment!!)
        title.add(s!!)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return title.get(position)
    }
}