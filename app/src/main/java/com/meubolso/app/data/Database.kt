package com.meubolso.app.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.meubolso.app.data.dao.UsuarioDao
import com.meubolso.app.data.entity.Usuario

@Database(
    entities = [
        Usuario::class
    ],
    version = 2,
    exportSchema = false
)

abstract class AppDatabase: RoomDatabase(){
    abstract fun usuarioDao(): UsuarioDao
}

