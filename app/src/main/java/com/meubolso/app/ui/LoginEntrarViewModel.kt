package com.meubolso.app.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginEntrarViewModel : ViewModel() {
    val nomeCompletoInput = MutableLiveData<String?>()
    val numeroInput = MutableLiveData<Int?>()
    val emailInput = MutableLiveData<String?>()
    val senhaInput = MutableLiveData<String?>()
}