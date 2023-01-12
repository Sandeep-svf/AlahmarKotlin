package com.sam.alahmarkotlin

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.sam.alahmarkotlin.databinding.ActivityMainBinding

import com.sam.alahmarkotlin.databinding.FragmentOneBinding


class FragmentOne : Fragment() {

    // view binding for the activity
    private lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        /*return inflater.inflate(R.layout.fragment_one, container, false)*/
        // inflate the layout and bind to the _binding
        binding = FragmentOneBinding.inflate(inflater, container, false)


        Toast.makeText(activity, "Fragment One", Toast.LENGTH_SHORT).show()


        // Inflate the layout for this fragment
        return binding.root
    }



}