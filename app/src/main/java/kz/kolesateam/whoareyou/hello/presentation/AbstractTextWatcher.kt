package kz.kolesateam.whoareyou.hello.presentation

import android.text.Editable
import android.text.TextWatcher

open class AbstractTextWatcher(): TextWatcher {

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) = Unit

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) = Unit

    override fun afterTextChanged(s: Editable?) = Unit
}