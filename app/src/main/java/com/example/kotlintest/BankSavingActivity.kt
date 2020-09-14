package com.example.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bank.*
import kotlinx.android.synthetic.main.activity_bank.current_amount_view
import kotlinx.android.synthetic.main.activity_bank_saving.*

var savingBalance: Int = 0

class BankSavingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bank_saving)
        init()
    }

    private fun withdraw(): Int {
        if(savingBalance.toString().toInt() > 100) {
            savingBalance -= savings_amount.text.toString().toInt()
            return savingBalance

        } else {
            Toast.makeText(this, "Need 100 in account to withdraw", Toast.LENGTH_SHORT).show()
        }
        savingBalance -= savings_amount.text.toString().toInt()
        return savingBalance

    }

    private fun deposit(): Int {
        savingBalance += savings_amount.text.toString().toInt()
        return savingBalance

    }


    private fun init() {
        if(savings_amount.text.toString() == "") {
            savings_amount.setText("0")
        }
        savingBalance = current_savings.text.toString().toInt()
        saving_withdraw.setOnClickListener {
            current_savings.text = withdraw().toString()
        }
        saving_deposit.setOnClickListener {
            current_savings.text = deposit().toString()
        }
    }
}