package com.example.mvpexample.Model

import androidx.core.os.HandlerCompat.postDelayed
import javax.security.auth.callback.Callback

class MainInteractor {

    fun findMsg(callback: (String) -> Unit){
            callback(showMsg()) }

    private fun showMsg(): String = "Welcome to Main Screen"


}