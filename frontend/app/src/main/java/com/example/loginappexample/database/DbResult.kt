package com.example.loginappexample.database

sealed class DbResult<out T : Any> {

    data class Success(val dbUser: DbUser) : DbResult<Nothing>()
    data class Error<out T : Any>(val data: T) : DbResult<T>()
}