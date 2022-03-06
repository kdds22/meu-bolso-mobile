package com.meubolso.app.domain.repository

import com.meubolso.app.data.dao.UsuarioDao
import com.meubolso.app.data.entity.Usuario
import com.meubolso.app.domain.interfaces.UsuarioRepository

class UsuarioRepositoryImpl(val dao: UsuarioDao): UsuarioRepository {

    val usuarioLogado by lazy { dao.getUsuarioLogado() }

    override suspend fun getUsuario(): Usuario {
        return dao.getUsuario()
    }

    override suspend fun singIn(usuario: Usuario) {
        dao.insertUsuario()
    }

    suspend fun signOut(user: Usuario) {
        dao.deleteUsuario(user)
    }

}

/*
    val newUser = UsuarioSession(
        id = userData.id,
        codigo = userData.codigo,
        nome = userData.nome,
        empresa = userData.empresa,
        filial = userData.filial,
        token = userData.token,
        localEstoque = userData.localEstoque,
        nomeFilial = userData.nomeFilial,
        tipoEstoque = userData.tipoEstoque,
        access_token = token.access_token,
        expires_in = token.expires_in,
        loginTime = token.refresh_token_expires_in,
        refresh_token = token.refresh_token,

    )
*/