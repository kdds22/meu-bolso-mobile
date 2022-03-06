package com.meubolso.app.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Usuario")
data class Usuario(
    @PrimaryKey
    var id: Long = 0L,
    var nome: String = "",
    var token: String? = null,
    var access_token: String? = null,
    var refresh_token: String? = null,
    var expires_in: Int? = 0,
    var loginTime: Int? = 0
)