package com.example.samolo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputSeb:EditText=findViewById(R.id.inputSebesseg);
        var eredmeny:TextView=findViewById(R.id.eredmeny);
        var gomb:Button=findViewById(R.id.szamoloGomb);
        var msSeb=0.0;

        gomb.setOnClickListener {
            try {
                var akSeb=inputSeb.text.toString().toFloat();
                msSeb=akSeb/3.6;
                eredmeny.text=msSeb.toString();
            }catch (e:Exception) {
                Log.e("Hiba",e.message.toString());
                /*val alertD=AlertDialog.Builder(this);
                alertD.setTitle("Hiba")
                alertD.setMessage("Hibás bevitel!");
                alertD.show();*/

                Toast.makeText(this,"Hibás bevitel!",Toast.LENGTH_LONG).show();


            }

        }


    }
}