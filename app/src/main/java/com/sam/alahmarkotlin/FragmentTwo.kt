package com.sam.alahmarkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.sam.alahmarkotlin.databinding.FragmentTwoBinding


class FragmentTwo : Fragment() {

    private lateinit var binding : FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentTwoBinding.inflate(inflater,container,false)


        Toast.makeText(activity,"Fragment two",Toast.LENGTH_LONG)



        return binding.root
    }


}