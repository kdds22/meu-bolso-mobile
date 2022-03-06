package com.meubolso.app.data.dao

import androidx.room.*
import com.meubolso.app.data.entity.Usuario
import kotlinx.coroutines.flow.Flow

@Dao
interface UsuarioDao {

    @Query("SELECT * from Usuario limit 1")
    fun getUsuarioLogado(): Flow<Usuario?>

    @Query("Select * From Usuario")
    suspend fun getUsuario(): Usuario

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUsuario(vararg usuario: Usuario)

    @Delete
    suspend fun deleteUsuario(vararg usuario: Usuario)

}