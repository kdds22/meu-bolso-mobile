package com.meubolso.app.ui.di

import com.meubolso.app.ui.cadastro.CadastroViewModel
import com.meubolso.app.ui.home.HomeViewModel
import com.meubolso.app.ui.login.LoginViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelApp = module {
    viewModel{
        HomeViewModel(
            androidApplication()
        )
    }
    viewModel {
        CadastroViewModel(
            androidApplication()
        )
    }
    viewModel {
        LoginViewModel(
            androidApplication()
        )
    }
}

val uiAppModule = listOf(viewModelApp)