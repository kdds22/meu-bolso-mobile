package com.meubolso.app.di

import com.meubolso.app.data.di.dataAppModule
import com.meubolso.app.domain.di.domainAppModule
import com.meubolso.app.ui.di.uiAppModule

val appModule = (domainAppModule + dataAppModule + uiAppModule)