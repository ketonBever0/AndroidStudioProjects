package com.example.bminav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
<<<<<<< HEAD

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
=======
import androidx.databinding.DataBindingUtil
import com.example.bminav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var testAdatok=Testadatok(0.0f,0.0f,0.0f,0.0f)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.testadat=testAdatok
    }

    fun Szamol(){

    }


>>>>>>> 4ae157bfcd2a6ba3afd6da7b7e2018b1ebf01d48
}