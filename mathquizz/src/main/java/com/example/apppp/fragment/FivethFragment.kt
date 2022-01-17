package com.example.apppp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.apppp.R


class FivethFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        Toast.makeText(activity,"თქვენ დაასრულეთ ქვიზი ,გადააამოწმეთ პასუხები", Toast.LENGTH_LONG).show()
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fiveth, container, false)
    }

    companion object {

            }
    }
