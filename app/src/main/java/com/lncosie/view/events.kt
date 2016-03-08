package com.lncosie.view

import android.view.View

fun<T> View.click(context:T,action:T.(view:View)->Boolean){
    this.setOnClickListener {
        context.action(this)
    }
}
fun<T> View.longClick(context:T,action:T.(view:View)->Boolean){
    this.setOnLongClickListener {
        context.action(this)
    }
}
