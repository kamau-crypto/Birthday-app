package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.happybirthday.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)
        //
//        binding.fab.setOnClickListener { view->
//            val originalValue= binding.textDisplayedContent.text.toString().toInt()
//            val newValue= originalValue*2
//            binding.textDisplayedContent.text= newValue.toString()
//            Snackbar.make(
//                view,
//                "Value Changed from $originalValue to $newValue",
//                Snackbar.LENGTH_LONG
//            ).show()
//        }
    }
}