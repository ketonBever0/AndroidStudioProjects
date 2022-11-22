package com.example.recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.recycleview.databinding.FragmentListBinding

class DetailF : Fragment() {

    private lateinit var binding: FragmentListBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_detail,container,false)
        val curPerson=DetailFArgs.fromBundle(requireArguments()).curPerson
        binding.person=curPerson
        //return inflater.inflate(R.layout.fragment_detail, container, false)
        return binding.root
    }

}