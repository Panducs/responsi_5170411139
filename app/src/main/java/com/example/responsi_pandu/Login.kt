package com.example.responsi_pandu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*


class Login : AppCompatActivity() {

    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var btnRegister: Button
    private  lateinit var btnLogin: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        username =findViewById(R.id.user)
        password = findViewById(R.id.password)
        btnLogin = findViewById(R.id.login)
        btnRegister = findViewById(R.id.register)

        btnRegister.setOnClickListener {
            val movetoregister = Intent(this, ActivityRegister::class.java)
            startActivity(movetoregister)
        }

            btnLogin.setOnClickListener {
                if(intent.extras != null) {
                val movetobiodata = Intent(this, ActivityBiodata::class.java)

                movetobiodata.putExtra("GetNama", intent.getStringExtra("GetNama"))
                movetobiodata.putExtra("GetAlamat", intent.getStringExtra("GetAlamat"))
                movetobiodata.putExtra("GetEmail", intent.getStringExtra("GetEmail"))

                startActivity(movetobiodata)
                } else {
                    Toast.makeText(this, "TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show()
                }
            }

        home.setOnClickListener{
           val home = Intent(this, MainActivity::class.java)
            startActivity(home)
        }

    }
}
