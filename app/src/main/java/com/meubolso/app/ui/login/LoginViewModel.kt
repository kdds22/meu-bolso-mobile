package com.meubolso.app.ui.login

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class LoginViewModel(application: Application) : AndroidViewModel(application) {
    var emailInput = MutableLiveData<String?>()
    var passwordInput = MutableLiveData<String>()
}