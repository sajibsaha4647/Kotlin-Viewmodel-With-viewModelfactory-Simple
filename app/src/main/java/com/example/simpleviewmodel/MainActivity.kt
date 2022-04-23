package com.example.simpleviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var Counter : TextView ;
    lateinit var Buttom: Button;
    lateinit var mainViewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this,MainViewmodelFactory(10)).get(MainViewModel::class.java)
        Counter = findViewById(R.id.counter)
        Buttom = findViewById(R.id.counterBtn);
        Counter.setText(mainViewModel.count.toString())
        Buttom.setOnClickListener{
            mainViewModel.increment()
            Counter.setText(mainViewModel.count.toString())
        }

    }




}



