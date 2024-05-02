package com.example.t1_grupo05

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible

class homePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun SiguienteCuenta (view: View){
        val siguientecuenta = Intent(this, accountPage::class.java )
        startActivity(siguientecuenta)
    }

    fun ocultarSaldo (view: View){
        val cuentaahorro = findViewById<TextView>(R.id.textView12)
        val tarjetainterbank = findViewById<TextView>(R.id.textView15)

        if (cuentaahorro.visibility == View.VISIBLE && tarjetainterbank.visibility == View.VISIBLE) {
            cuentaahorro.visibility = View.GONE
            tarjetainterbank.visibility = View.GONE
        } else {
            cuentaahorro.visibility = View.VISIBLE
            tarjetainterbank.visibility = View.VISIBLE
        }
    }
}