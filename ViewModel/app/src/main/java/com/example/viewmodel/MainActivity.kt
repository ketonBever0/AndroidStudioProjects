package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: PracticeViewModel
    private lateinit var viewModelFactory: PracticeViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModelFactory= PracticeViewModelFactory(10)
        viewModel=ViewModelProvider(this).get(PracticeViewModel::class.java)


        binding.viewModel= viewModel

        binding.setLifecycleOwner(this)
    }

    /*override fun onStart() {
        super.onStart()
        Log.i("Start","Elindult")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Stop","Megállt")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Resume","Visszatérve")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Killed","Kilőve")
    }*/



}