package kz.kolesateam.whoareyou.hello.presentation

import android.content.Context
import android.content.Intent

class HelloRouter {
    fun createIntent(context: Context): Intent = Intent(context, TestHelloActivity::class.java)
}