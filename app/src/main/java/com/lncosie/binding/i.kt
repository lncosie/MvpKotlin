package com.lncosie.binding

import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.lncosie.view.FireProperty
import com.lncosie.view.KVM
import com.lncosie.viewmodel.ViewModel
import kotlinx.android.synthetic.*
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty

interface Operator {
    operator fun unaryPlus(): Operator {
        return this
    }

    operator fun unaryMinus(): Operator {
        return this
    }

    operator fun plus(next: Operator): Operator {
        return this
    }

    operator fun div(next: Operator): Operator {
        return this
    }
}

interface Binder{
    fun<E> bind(r: E)
}

class BiText<R>(val p: FireProperty<R>) : Binder {
    override fun<E> bind(r: E) {
        when (r) {
            is EditText -> r.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(p0: Editable?) {
                    p.setValue(,null as KProperty<*>,r.text.toString() as R)
                }
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }
                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }
            }
            )
            else->r
        }
    }
}

class Binding<T : KVM>(val view:T,val binder:Binder) {
    operator fun<R : View> plus(r: R):R {

        return r
    }
}
