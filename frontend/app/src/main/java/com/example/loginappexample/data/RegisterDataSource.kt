package com.example.loginappexample.data

import com.example.loginappexample.database.DataBase
import com.example.loginappexample.database.DbRegisterErrorsRapport
import com.example.loginappexample.database.DbResult

class RegisterDataSource(private val dataBase:DataBase) {

    fun register(id:String, username:String, email:String, password:String): Result<Any, DbRegisterErrorsRapport>{
        val registerResult = dataBase.register(id, username, email, password)
        return if(registerResult is DbResult.Success){
            Result.Success(id)
        } else {
            registerResult as DbResult.Error<DbRegisterErrorsRapport>
            Result.Error(registerResult.data)
        }
    }
}