package com.meubolso.app.ui.di

import com.meubolso.app.ui.cadastro.LoginCadastroViewModel
import com.meubolso.app.ui.login.LoginViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelApp = module {
    viewModel{
        LoginViewModel(
            androidApplication()
        )
    }
    viewModel{
        LoginCadastroViewModel(
            androidApplication()
        )
    }
}

val uiAppModule = listOf(viewModelApp)