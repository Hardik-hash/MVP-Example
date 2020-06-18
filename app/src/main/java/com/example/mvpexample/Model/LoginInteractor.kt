package com.example.mvpexample.Model


import androidx.core.os.HandlerCompat.postDelayed
//import androidx.core.os.HandlerCompat.postDelayed
import java.util.*
import java.util.logging.Handler

class LoginInteractor {

    interface OnLoginFinishedListener{
        fun onUsernameError()
        fun onPasswordError()
        fun onSuccess()
    }

      fun login(username: String, password: String, listener: OnLoginFinishedListener){
                    when{
                        username.isEmpty() -> listener.onUsernameError()
                        password.isEmpty() -> listener.onPasswordError()

                        else -> listener.onSuccess()
                    }
      }
}