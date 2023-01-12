package com.sam.alahmarkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import com.sam.alahmarkotlin.databinding.ActivityMainBinding
import com.sam.alahmarkotlin.databinding.ActivitySplashBinding

class SplashActivity : FragmentActivity() {

    // view binding for the activity
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btn1.setOnClickListener {
            if (savedInstanceState == null) {
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    add<FragmentActivity>(R.id.fragment_container_view)
                }
            }
        }

        binding.btn2.setOnClickListener {

        }

        binding.btn3.setOnClickListener {

        }




    }
}