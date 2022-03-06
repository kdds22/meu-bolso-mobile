package com.meubolso.app.domain.di

import org.koin.dsl.module

val useCaseModule = module {

}

val domainAppModule = listOf(useCaseModule)