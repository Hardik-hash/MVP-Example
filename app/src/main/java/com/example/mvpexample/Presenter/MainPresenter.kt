package com.example.mvpexample.Presenter

import com.example.mvpexample.Model.MainInteractor
import com.example.mvpexample.View.MainView

class MainPresenter(var mainView: MainView?, val mainInteractor: MainInteractor) {

    fun onResume()  {
        mainView?.showProgress()
          mainInteractor.findMsg (::onMsgLoaded)
    }

    private fun onMsgLoaded(data:String){
        mainView?.apply {
            showMessage(data)
            hideProgress()
        }
    }

    fun onDestroy()
    {
        mainView = null
    }

}