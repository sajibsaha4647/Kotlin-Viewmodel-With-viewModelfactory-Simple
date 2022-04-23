package com.example.simpleviewmodel

import androidx.lifecycle.ViewModel

class MainViewModel(val Initialvalue: Int) : ViewModel(){

    var count:Int = Initialvalue


    fun increment (){
        count++
    }

}