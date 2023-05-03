package com.example.simple_calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var etfirstvalue: EditText? = null
    var etsecondvalue: EditText? = null
    var btnadds: Button? = null
    var btnsubs: Button? = null
    var btnmultiply: Button? = null
    var btndivide: Button? = null
    var num1: Double? = null
    var num2: Double? = null
    var tvresult: TextView? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etfirstvalue = findViewById(R.id.etfirstvalue)
        etsecondvalue = findViewById(R.id.etsecondvalue)
        btnadds = findViewById(R.id.btnadds)
        btnsubs = findViewById(R.id.btnsubs)
        btnmultiply = findViewById(R.id.btmultiply )
        btndivide = findViewById(R.id.btndivide)
        tvresult = findViewById(R.id.tvresult)
        Clicklistener()
    }

    fun Clicklistener() {
        btnadds!!.setOnClickListener {
            num1 = etfirstvalue!!.text.toString().toDouble()
            num2 = etsecondvalue!!.text.toString().toDouble()
            val result = num1!! + num2!!
            tvresult!!.text = result.toString()
        }
        btnsubs!!
            .setOnClickListener {
                num1 = etfirstvalue!!.text.toString().toDouble()
                num2 = etsecondvalue!!.text.toString().toDouble()
                val result = num1!! - num2!!
                tvresult!!.text = result.toString()
            }
        btnmultiply!!.setOnClickListener {
            num1 = etfirstvalue!!.text.toString().toDouble()
            num2 = etsecondvalue!!.text.toString().toDouble()
            val result = num1!! * num2!!
            tvresult!!.text = result.toString()
        }
        btndivide!!.setOnClickListener {
            num1 = etfirstvalue!!.text.toString().toDouble()
            num2 = etsecondvalue!!.text.toString().toDouble()
            val result = num1!! / num2!!
            tvresult!!.text = result.toString()
        }
    }
}