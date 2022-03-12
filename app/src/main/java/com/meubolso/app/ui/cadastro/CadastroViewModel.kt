package com.meubolso.app.ui.cadastro

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class CadastroViewModel(application: Application) : AndroidViewModel(application) {
    var nomeCompletoInput = MutableLiveData("")
    var numeroInput = MutableLiveData("")
    var emailInput = MutableLiveData("")
    var senhaInput = MutableLiveData("")
}