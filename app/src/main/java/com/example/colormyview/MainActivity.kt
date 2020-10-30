package com.example.colormyview
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val button: Button = findViewById(R.id.button1)
        button.setOnClickListener{
                    showTextView( it)
        }
    }



    private fun showTextView(view: View) {
        val getText: TextView = findViewById(R.id.textviewTxt)
        getText.visibility = View.VISIBLE

    }


}


