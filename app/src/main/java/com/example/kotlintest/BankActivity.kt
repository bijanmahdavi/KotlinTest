package com.example.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bank.*
import kotlinx.android.synthetic.main.activity_reverse_string.*

var balance: Int = 0

class BankActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bank)
        init()
    }

    private fun withdraw(): Int {
        balance -= current_amount.text.toString().toInt()
            return balance

    }

    private fun deposit(): Int {
        balance += current_amount.text.toString().toInt()
        return balance

    }


    private fun init() {
        if(current_amount.text.toString() == "") {
            current_amount.setText("0")
        }
        balance = current_amount_view.text.toString().toInt()
        current_withdraw.setOnClickListener {
            current_amount_view.text = withdraw().toString()
        }
        current_deposit.setOnClickListener {
            current_amount_view.text = deposit().toString()
        }
    }
}