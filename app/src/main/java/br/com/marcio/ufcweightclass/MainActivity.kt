package br.com.marcio.ufcweightclass

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var sex = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        radioGroup?.setOnCheckedChangeListener { group, checkedId ->
            if (R.id.radioMale == checkedId)
                sex = "M"
            else
                sex = "F"

        }

    }

    fun calcWeightClass(view: View){

        val height: Double = edtHeightId.text.toString().toDouble()
        val weight: Double = edtWeightId.text.toString().toDouble()
        val bmi = Math.round(weight / (height*height))

        //open new activity
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("bmi", bmi.toInt())
        startActivity(intent)

    }










}
