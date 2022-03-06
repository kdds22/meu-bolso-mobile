package com.meubolso.app.ui.login

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class LoginCadastroViewModel(application: Application) : AndroidViewModel(application) {
    val emailInput = MutableLiveData<String?>()
    val passwordInput = MutableLiveData<String>()
}