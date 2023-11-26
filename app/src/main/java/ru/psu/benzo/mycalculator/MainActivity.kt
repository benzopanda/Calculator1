package ru.psu.benzo.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import ru.psu.benzo.mycalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    lateinit var textViewOutput : TextView
//    lateinit var editTextValue1 : EditText
//    lateinit var editTextValue2 : EditText

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //val view = binding.root
        setContentView(binding.root)


//        textViewOutput = findViewById(R.id.textViewOutput)
//        editTextValue1 = findViewById(R.id.editTextValue1)
//        editTextValue2 = findViewById(R.id.editTextValue2)
        binding.textViewOutput.text = getString(R.string._initial_output)

        binding.buttonPlus.setOnLongClickListener {
            Toast.makeText(
                this,
                "Long click!",
                Toast.LENGTH_LONG
                ).show()   
            return@setOnLongClickListener true
        }

    }
    fun onButtonPlusClick(view : View)
    {
        val val1 = binding.editTextValue1.text.toString().toDouble()
        val val2 = binding.editTextValue2.text.toString().toDouble()
        binding.textViewOutput.text = ""+(val1+val2)
        //textViewOutput.text = editTextValue1.text //.toString()
        //textViewOutput.text = "2222222"
    }


}