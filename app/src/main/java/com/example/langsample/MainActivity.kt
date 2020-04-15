package com.example.langsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val langChangeTextView = findViewById<TextView>(R.id.language_changer)

        when (LanguageUtils.checkActualLanguageVersion(resources)) {
            "en" -> langChangeTextView.text = "SK"
            "sk" -> langChangeTextView.text = "EN"
        }

        langChangeTextView.setOnClickListener {
            LanguageUtils.changeLanguage(this, resources)
        }
    }
}
