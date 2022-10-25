package com.example.atlagfogyasztas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var tankolt:TextView=findViewById(R.id.tankoltInput);
        var megtett:TextView=findViewById(R.id.megtettInput);


        val sendData:Button=findViewById(R.id.sendData);

        sendData.setOnClickListener{
//            Toast.makeText(applicationContext,"Üdv",Toast.LENGTH_SHORT).show()
            var tankolt=tankolt.text.toString().toDouble();
            var megtett=megtett.text.toString().toDouble();

            

        }



    }
}

//<TextView
//        android:layout_width="wrap_content"
//        android:layout_height="wrap_content"
//        android:text="Hello World!"
//        app:layout_constraintBottom_toBottomOf="parent"
//        app:layout_constraintEnd_toEndOf="parent"
//        app:layout_constraintStart_toStartOf="parent"
//        app:layout_constraintTop_toTopOf="parent" />