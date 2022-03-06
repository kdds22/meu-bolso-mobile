package com.meubolso.app.ui.di

import com.meubolso.app.ui.login.LoginCadastroViewModel
import com.meubolso.app.ui.login.LoginViewModel
import com.meubolso.app.ui.main.MainViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelApp = module {
    viewModel {
        MainViewModel(
            androidApplication()
        )
    }

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