package com.example.apppp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast

import androidx.viewpager2.widget.ViewPager2
import com.example.apppp.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)









            val tablayout = findViewById<TabLayout>(R.id.tab_layout)
            val viewPager2 = findViewById<ViewPager2>(R.id.view_pager_2)


            val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

            viewPager2.adapter = adapter

            TabLayoutMediator(tablayout, viewPager2) { tab, position ->
                when (position) {
                    0 -> {
                        tab.text = "1"
                    }
                    1 -> {
                        tab.text = "2"
                    }
                    2 -> {
                        tab.text = "3"
                    }
                    3 -> {tab.text = "4"
                    }
                    4 -> tab.text = "5"
                    }
            }.attach()


        }



    }










