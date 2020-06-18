package com.example.mvpexample.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.mvpexample.Model.LoginInteractor
import com.example.mvpexample.Model.MainInteractor
import com.example.mvpexample.Presenter.LoginPresenter
import com.example.mvpexample.Presenter.MainPresenter
import com.example.mvpexample.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),MainView {

    private val presenter = MainPresenter(this, MainInteractor())


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

        override fun onDestroy() {
            super.onDestroy()
            presenter.onDestroy()
        }

        override fun showProgress() {
            progress.visibility = View.VISIBLE
        }

        override fun hideProgress() {
            progress.visibility = View.GONE
        }

    override fun showMessage(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }
}
