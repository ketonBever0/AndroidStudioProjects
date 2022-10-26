package com.example.adatkotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.adatkotes.databinding.ActivityMainBinding
import java.math.RoundingMode
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var testAdatok=Testadatok(0f,0f,0f,0f)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.testadat=testAdatok

        binding.send.setOnClickListener{
            var magassag=binding.magassagInput.text.toString().toFloat()
            var testsuly=binding.testsulyInput.text.toString().toFloat()
            var cmMagassag=magassag/100;


            var bmi=testsuly/cmMagassag.pow(2)
            testAdatok.bmiIndex=bmi.toBigDecimal().setScale(2,RoundingMode.HALF_UP).toFloat()

            var idealisSuly=(magassag-100)*0.9
            testAdatok.idealisSuly=idealisSuly.toFloat()

            binding.invalidateAll()
        }



//        setContentView(R.layout.activity_main)







    }
}