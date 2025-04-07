package com.example.clickcount

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        var contar = 0
        val buttonmais = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        val buttonmenos = findViewById<FloatingActionButton>(R.id.floatingActionButton2)

        buttonmais.setOnClickListener {
            contar++
            textView.text = "$contar"
        }
        buttonmenos.setOnClickListener {
            if (contar > 0) {
                contar--
            }
            textView.text = "$contar"
        }
    }
}