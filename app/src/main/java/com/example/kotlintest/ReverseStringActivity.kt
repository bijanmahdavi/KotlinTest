package com.example.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_reverse_string.*

class ReverseStringActivity : AppCompatActivity() {
    var someString: String = "some String"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reverse_string)
        init()
    }

    //recursively reverses string
    private fun reverseString(stringToReverse: String): String {
        if(stringToReverse.isEmpty()) {
            return stringToReverse
        }
            return reverseString(stringToReverse.substring(1)) + stringToReverse[0]
    }

    private fun init() {
        buttonFor_stringReverse.setOnClickListener {
            reversed_string_view.text = reverseString(someString)
        }
    }
}