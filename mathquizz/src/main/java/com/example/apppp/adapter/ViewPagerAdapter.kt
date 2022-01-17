package com.example.apppp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.apppp.fragment.*

class ViewPagerAdapter(FragmentManager: FragmentManager,lifecycle: Lifecycle): FragmentStateAdapter(FragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
      return  when(position){
            0->{
                firstfragment()
            }
            1->{
                SecondFragment()
            }
            2->{
                LastFragment()
            }
            3->{
                fourthFragment()
            }
            4->{
                FivethFragment()
            }

            else->{
                Fragment()
            }
        }
    }
}