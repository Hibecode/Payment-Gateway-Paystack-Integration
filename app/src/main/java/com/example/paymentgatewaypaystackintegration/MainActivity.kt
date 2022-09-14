package com.example.paymentgatewaypaystackintegration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val price = 2000
        val checkOut: Button = findViewById(R.id.btn_checkout)
        checkOut.setOnClickListener {
            val intent = Intent(this, CheckoutActivity::class.java).apply {
                putExtra(getString(R.string.bag_name), price)
            }
            startActivity(intent)
        }
    }
}