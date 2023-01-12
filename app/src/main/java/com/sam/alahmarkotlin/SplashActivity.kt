package com.sam.alahmarkotlin

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.sam.alahmarkotlin.databinding.ActivitySplashBinding

class SplashActivity : FragmentActivity() {

    // view binding for the activity
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // when app is initially opened the Fragment 3 should be visible
        supportFragmentManager.beginTransaction().apply {
            replace(binding.fragmentContainerView.id, FragmentThird())
            addToBackStack(null)
            commit()
        }



        binding.btn1.setOnClickListener {
            changeFragment(FragmentOne())
            Log.e("test_sam_frg","1")
        }

        binding.btn2.setOnClickListener {
            changeFragment(FragmentTwo())
            Log.e("test_sam_frg","2")
        }

        binding.btn3.setOnClickListener {
            changeFragment(FragmentThird())
            Log.e("test_sam_frg","3")
        }




    }

    // function to change the fragment which is used to reduce the lines of code
    private fun changeFragment(fragmentToChange: Fragment): Unit {
        supportFragmentManager.beginTransaction().apply {
            replace(binding.fragmentContainerView.id, fragmentToChange)
            addToBackStack(null)
            commit()
        }
    }
}