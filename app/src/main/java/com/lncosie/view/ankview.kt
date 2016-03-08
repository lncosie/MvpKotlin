package com.lncosie.view

import android.app.Activity
import android.app.Fragment
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView





fun<T: Activity> T.LinearLayout(init: LinearLayout.() -> Unit): LinearLayout {
    val view=android.widget.LinearLayout(this.baseContext)
    view.init()
    this.setContentView(view)
    return view
}
fun<T: Fragment> T.LinearLayout(init: LinearLayout.() -> Unit): LinearLayout {
    val view=android.widget.LinearLayout(this.context)
    view.init()
    return view
}
fun<T: ViewGroup> T.LinearLayout(init: LinearLayout.() -> Unit): LinearLayout {
    val view=android.widget.LinearLayout(this.context)
    this.addView(view)
    view.init()
    return view
}

fun<T: ViewGroup> T.TextView(init: TextView.() -> Unit): TextView {
    val view= TextView(this.context)
    this.addView(this)
    view.init()
    return view
}

fun<T: ViewGroup> T.EditText(init: TextView.() -> Unit): EditText {
    val view= EditText(this.context)
    this.addView(this)
    view.init()
    return view
}

