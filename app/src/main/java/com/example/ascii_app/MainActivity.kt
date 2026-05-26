package com.example.ascii_app

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Linking the TextView to display the art//
        val txtArt = findViewById<TextView>(R.id.txtArt)

        //Variable to hold the art string//
        var art = ""

        //Counter to track the current row//
        var row = 1

        //While loop for building each row of stars//
        while (row <= 8) {

            //Inner counter to track stars in current row//
            var stars = 1

            //Adding the stars to the current row//
            while (stars <= row) {
                //Adding one star//
                art += "*"
                //Moving to next star//
                stars++
            }
            //Used to move to next line after each row//
            art += "\n"
            //move to next row//
            row++
        }
        //Display the final art//
        txtArt.text = art






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}