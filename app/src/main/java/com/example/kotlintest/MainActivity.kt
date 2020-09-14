package com.example.kotlintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        button_stringReverse.setOnClickListener(this)
        button_highestInArray.setOnClickListener(this)
        button_bank.setOnClickListener(this)
        button_savings.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.button_stringReverse -> startActivity(Intent(this, ReverseStringActivity::class.java))
            R.id.button_highestInArray -> startActivity(Intent(this, HighestInArrayActivity::class.java))
            R.id.button_bank -> startActivity(Intent(this, BankActivity::class.java))
            R.id.button_savings -> startActivity(Intent(this, BankSavingActivity::class.java)) // for some reason this one is not working!
        }
    }
}