package com.sam.alahmarkotlin

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.sam.alahmarkotlin.databinding.FragmentThirdBinding


class FragmentThird : Fragment() {


    // view binding for the activity
    private lateinit var binding: FragmentThirdBinding






    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // view binding....
        binding = FragmentThirdBinding.inflate(inflater, container, false)

        Toast.makeText(activity,"Third fragment called...", Toast.LENGTH_LONG)




        return binding.root

    }


}