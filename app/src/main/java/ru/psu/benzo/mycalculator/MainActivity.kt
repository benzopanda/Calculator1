package ru.psu.benzo.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import ru.psu.benzo.mycalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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
        if(!binding.editTextValue1.editText?.text.isNullOrEmpty() && !binding.editTextValue2.editText?.text.isNullOrEmpty()) {
            val val1 = binding.editTextValue1.editText?.text.toString().toDouble()
            val val2 = binding.editTextValue2.editText?.text.toString().toDouble()
            binding.textViewOutput.text = "  " + (val1 + val2)
        }
    }
    fun onButtonMinusClick(view : View)
    {
        if(!binding.editTextValue1.editText?.text.isNullOrEmpty() && !binding.editTextValue2.editText?.text.isNullOrEmpty()) {
            val val1 = binding.editTextValue1.editText?.text.toString().toDouble()
            val val2 = binding.editTextValue2.editText?.text.toString().toDouble()
            binding.textViewOutput.text = "  "+(val1-val2)
        }
    }
    fun onButtonMulClick(view : View)
    {
        if(!binding.editTextValue1.editText?.text.isNullOrEmpty() && !binding.editTextValue2.editText?.text.isNullOrEmpty()) {
            val val1 = binding.editTextValue1.editText?.text.toString().toDouble()
            val val2 = binding.editTextValue2.editText?.text.toString().toDouble()
            binding.textViewOutput.text = "  "+(val1*val2)
        }
    }
    fun onButtonDivClick(view : View)
    {
        if(!binding.editTextValue1.editText?.text.isNullOrEmpty() && !binding.editTextValue2.editText?.text.isNullOrEmpty()) {
            val val1 = binding.editTextValue1.editText?.text.toString().toDouble()
            val val2 = binding.editTextValue2.editText?.text.toString().toDouble()
            binding.textViewOutput.text = "  "+(val1/val2)
        }
    }
}