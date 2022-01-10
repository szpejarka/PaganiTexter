package com.example.loginappexample.database

interface DataBase {

    fun login(email:String, password:String): DbResult<DbLoginErrorsRapport>

    fun register(id:String,
                 username:String,
                 email:String,
                 password:String
    ): DbResult<DbRegisterErrorsRapport>
}