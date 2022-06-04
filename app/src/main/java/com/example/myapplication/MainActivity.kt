package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txt1:TextView
    lateinit var btnMudar :Button

    lateinit var edtxt1: EditText
    var multiplicador=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt1= findViewById(R.id.textView)
        edtxt1=findViewById(R.id.editTextNumber)

        btnMudar=findViewById(R.id.button)

        btnMudar.setText("Tabuada")

        btnMudar.setOnClickListener(){
            txt1.setText("")
            txt1.setTextColor(Color.RED)
            txt1.setTextSize(18.0f)
            multiplicador=(edtxt1.text.toString()).toInt()
            for(i in 0..10){
                txt1.setText(txt1.text.toString() + multiplicador.toString() + " X " + i + " = " + multiplicador*i + "\n" )
            }

        }
    }
}


