package com.example.corrutinas.main.presentation.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.corrutinas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //initActions()
        //initObservers()
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.imageView.setOnClickListener { var pant2 = Intent(this, login::class.java)
        startActivity(pant2)}

    }
    /*private fun initActions(){
        viewModel.requestData()
    }

    private fun initObservers(){
        viewModel.requestData.observe(this, ::handleData)
    }

    private fun handleData( response: String){

    }*/

}