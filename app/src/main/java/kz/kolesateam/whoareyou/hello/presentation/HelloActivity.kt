package kz.kolesateam.whoareyou.hello.presentation

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kz.kolesateam.whoareyou.R

const val NAME_KEY = "name"

class HelloActivity : AppCompatActivity() {

    private lateinit var editTextPersonName: EditText
    private lateinit var buttonContinue: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        initViews()

        editTextPersonName.addTextChangedListener(object: AbstractTextWatcher() {
            override fun afterTextChanged(s: Editable?) {
                buttonContinue.isEnabled = s.toString().isNotBlank()
            }
        })

        buttonContinue.setOnClickListener {

            val name = editTextPersonName.text.toString().trim()
            val sharedPref = getSharedPreferences(
                NAME_KEY, Context.MODE_PRIVATE)
            with(sharedPref.edit()) {
                putString(NAME_KEY, name)
                apply()
            }
            startActivity(HelloRouter().createIntent(this))
        }
    }

    private fun initViews(){
        editTextPersonName = findViewById(R.id.activity_hello_edit_text)
        buttonContinue = findViewById(R.id.activity_hello_button_continue)
    }
}