package com.example.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_highest_in_array.*

class HighestInArrayActivity : AppCompatActivity() {
    var someArray: Array<Int> = arrayOf(1,3,7,5,6)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_highest_in_array)
        init()
    }

    private fun biggestNumInArray(): Int {
        var largest = someArray[0]
        for(value in someArray) {
            if(value > largest) {
                largest = value
            }
        }
        return largest
    }

    private fun init() {
        array_view.text = "[1,3,7,5,6]"
        buttonFor_biggestIntInArray.setOnClickListener {
            highest_in_array_view.text = "Highest number in array: "+biggestNumInArray().toString()
        }
    }
}