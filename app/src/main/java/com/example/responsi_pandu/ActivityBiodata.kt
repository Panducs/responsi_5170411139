package com.example.responsi_pandu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityBiodata: AppCompatActivity(){
    private lateinit var namedata: TextView
    private lateinit var alamtdata: TextView
    private lateinit var emaildata: TextView
    private lateinit var btnGet: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.biodata)

        namedata = findViewById(R.id.nama)
        alamtdata = findViewById(R.id.almt)
        emaildata = findViewById(R.id.eml)
        btnGet = findViewById(R.id.back_log)

       if (intent.extras != null) {
                namedata.setText(intent.getStringExtra("GetNama"))
                alamtdata.setText(intent.getStringExtra("GetAlamat"))
                emaildata.setText(intent.getStringExtra("GetEmail"))
       }

        btnGet.setOnClickListener{
            val backdat = Intent(this, Login::class.java)

            backdat.putExtra("GetNama", namedata.text.toString())
            backdat.putExtra("GetAlamat", alamtdata.text.toString())
            backdat.putExtra("GetEmail", emaildata.text.toString())

            startActivity(backdat)
        }

    }
}

