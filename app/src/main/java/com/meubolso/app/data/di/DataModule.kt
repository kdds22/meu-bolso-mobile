package com.meubolso.app.data.di

import com.meubolso.app.domain.interfaces.UsuarioRepository
import com.meubolso.app.domain.repository.UsuarioRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    factory<UsuarioRepository>{
        UsuarioRepositoryImpl(
            dao = get()
        )
    }
}

val dataAppModule = listOf(repositoryModule, RoomModule)