package com.sam.alahmarkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sam.alahmarkotlin.databinding.ActivityImplementBinding
import com.sam.alahmarkotlin.databinding.ActivityMainBinding
import com.sam.alahmarkotlin.retrofit.RetrofitHelper
import com.sam.alahmarkotlin.retrofit.api
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ImplementApiActivity : AppCompatActivity() {

    // view binding for the activity
    private lateinit var binding: ActivityImplementBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImplementBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        val quotesApi = RetrofitHelper.getInstance().create(api::class.java)
        // launching a new coroutine
        GlobalScope.launch {
            val result = quotesApi.getQuotes()
            if (result != null)
            // Checking the results
                Log.d("ayush: ", result.body().toString())
        }

    }
}