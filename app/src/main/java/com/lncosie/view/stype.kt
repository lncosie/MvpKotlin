package com.lncosie.view

import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

inline fun<reified T: View> T.stype(init:T.()->Unit):Unit{
    this.init()
}
inline fun<reified T:LinearLayout> T.VerticalLayout(){
    orientation=LinearLayout.VERTICAL
    setGravity(Gravity.CENTER)
    layoutParams.height=-1

}
