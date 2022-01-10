package com.example.loginappexample.data

import com.example.loginappexample.database.DbRegisterErrorsRapport

class RegisterRepository(private val dataSource: RegisterDataSource) {

    fun register(id:String, username:String, email:String, password:String): Result<Any, DbRegisterErrorsRapport> {
        return dataSource.register(id, username, email, password)
    }
}