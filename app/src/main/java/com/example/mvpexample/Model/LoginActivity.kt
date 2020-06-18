package com.example.mvpexample.Model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mvpexample.Presenter.LoginPresenter
import com.example.mvpexample.R
import com.example.mvpexample.View.LoginView
import com.example.mvpexample.View.MainActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() , LoginView {

    private  val presenter = LoginPresenter(this, LoginInteractor())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        b1.setOnClickListener { validateCredentials() }
    }

    private fun validateCredentials() {
        presenter.validateCredentials(uname.text.toString(),pwd.text.toString())
    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }

    override fun showProgress() {
        progress.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        progress.visibility= View.INVISIBLE
    }

    override fun setUsernameError() {
        uname.error= "Usrname cannot be empty"
    }

    override fun setPasswordError() {
        pwd.error= "Password cannot be empty"
    }

    override fun navigateToHome() {
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }




}
