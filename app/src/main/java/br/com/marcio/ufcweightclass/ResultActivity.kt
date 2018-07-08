package br.com.marcio.ufcweightclass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        val bmi = intent.getIntExtra("bmi", 0)

        if(bmi < 16){
            textResult.text = bmi.toString() +"\n"+ getText(R.string.bmi1)
        } else if(bmi < 17){
            textResult.text = bmi.toString() +"\n"+ getText(R.string.bmi2)
        } else if(bmi < 19){
            textResult.text = bmi.toString() +"\n"+ getText(R.string.bmi3)
        }else if(bmi < 25){
            textResult.text = bmi.toString() +"\n"+ getText(R.string.bmi4)
        }else if(bmi < 30){
            textResult.text = bmi.toString() +"\n"+ getText(R.string.bmi5)
        }else if(bmi < 35){
            textResult.text = bmi.toString() +"\n"+ getText(R.string.bmi6)
        }else if(bmi < 40){
            textResult.text = bmi.toString() +"\n"+ getText(R.string.bmi7)
        }else {
            textResult.text = bmi.toString() +"\n"+ getText(R.string.bmi8)
        }
    }

}

