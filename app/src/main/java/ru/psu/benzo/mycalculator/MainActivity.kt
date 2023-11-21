package ru.psu.benzo.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var textViewOutput : TextView
    lateinit var editTextValue1 : EditText
    lateinit var editTextValue2 : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewOutput = findViewById(R.id.textViewOutput)
        editTextValue1 = findViewById(R.id.editTextValue1)
        editTextValue2 = findViewById(R.id.editTextValue2)
        textViewOutput.text = "11111"

    }
    fun onButtonPlusClick(view : View)
    {
        val val1 = editTextValue1.text.toString().toDouble()
        val val2 = editTextValue2.text.toString().toDouble()
        textViewOutput.text = ""+(val1+val2)
        //textViewOutput.text = editTextValue1.text //.toString()
        //textViewOutput.text = "2222222"
    }


}