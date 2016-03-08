package com.lncosie.view

import android.app.Activity
import android.view.View
import com.lncosie.binding.BiText
import com.lncosie.binding.Binding
import com.lncosie.viewmodel.ViewModel
import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


class ThisModel : ViewModel {
    var a =FireProperty<String>()
}
class FireProperty<T>():ReadWriteProperty<Any,T>{
    override fun getValue(thisRef: Any, property: KProperty<*>): T {
        throw UnsupportedOperationException()
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: T) {
        throw UnsupportedOperationException()
    }
}

class ThisView :Activity(), KVM {
    override var model:ViewModel by Delegates.notNull()

    fun init() {
        val model = ThisModel()
        var c = Binding(this, BiText(model.a))

        this.LinearLayout {
            stype {
                VerticalLayout()
            }
            c + EditText {
                stype {

                }
                click(this) {
                    longClick(this) { false }
                    true
                }
            }
            LinearLayout {

            }
        }
    }
}