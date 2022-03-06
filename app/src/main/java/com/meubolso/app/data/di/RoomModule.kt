package com.meubolso.app.data.di

import androidx.room.Room
import com.meubolso.app.data.AppDatabase
import org.koin.dsl.module

val RoomModule = module {
    factory {
        get<AppDatabase>().usuarioDao()
    }

    single {
        Room.databaseBuilder(
            get(),
            AppDatabase::class.java,
            "app_meubolso_database"
        )
            .fallbackToDestructiveMigration()
            .build()
    }
}