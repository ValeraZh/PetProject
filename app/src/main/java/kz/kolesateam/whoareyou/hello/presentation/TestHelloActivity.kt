package kz.kolesateam.whoareyou.hello.presentation

import android.content.Context
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kz.kolesateam.whoareyou.R

class TestHelloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_hello)

        val textView: TextView = findViewById(R.id.text_view_test)
        val sharedPref = getSharedPreferences(NAME_KEY, Context.MODE_PRIVATE)
        val name = sharedPref.getString(NAME_KEY, "")
        textView.text = name
    }
}