package com.example.databindingviewmodel

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.databinding.DataBindingUtil
import com.example.databindingviewmodel.databinding.ActivityMainBinding
import kotlinx.coroutines.Job
import java.security.Key
import java.security.KeyStore

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
   // val Tag = "configuration_changes"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //  binding.student=Student("Abhishek ","Shukla")


        binding.btnSubmit.setOnClickListener {
//           val student= Student(binding.etFname.text.toString(), binding.etLname.text.toString())
//            binding.fname.text=student.Fname
//            binding.lname.text=student.lname


            binding.student =
                Student(binding.etFname.text.toString(), binding.etLname.text.toString())


        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

    }


    }


