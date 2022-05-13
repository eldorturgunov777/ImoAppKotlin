package com.example.imoappkotlin.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.imoappkotlin.R
import com.example.imoappkotlin.adapter.VPAdapter
import com.example.imoappkotlin.fragment.FirstFragment
import com.example.imoappkotlin.fragment.SecondFragment
import com.google.android.material.tabs.TabLayout


class FirstActivity : AppCompatActivity() {
    var tabLayout: TabLayout? = null
    var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        tabLayout = findViewById(R.id.tab_layout)
        viewPager = findViewById(R.id.viewPager)
        tabLayout?.setupWithViewPager(viewPager)
        val adapter = VPAdapter(
            supportFragmentManager,
            FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
        )
        adapter.addFragment(FirstFragment(), "Calls")
        adapter.addFragment(SecondFragment(), "Contacts")
        viewPager?.setAdapter(adapter)


    }
}