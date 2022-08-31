package com.example.corrutinas.main.presentation.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.corrutinas.databinding.ActivityLoginBinding


class login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



            binding.etRuta.setError("Para iniciar sesión, necesitas estar conectado a internet")

            binding.btnLogin.setOnClickListener{var pant3 = Intent(this, progress::class.java)
            startActivity(pant3)}


}
}