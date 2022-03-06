package com.meubolso.app.domain.interfaces

import com.meubolso.app.data.entity.Usuario

interface UsuarioRepository {
    suspend fun getUsuario(): Usuario
    suspend fun singIn(usuario: Usuario)
}