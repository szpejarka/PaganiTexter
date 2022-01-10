package com.example.loginappexample.data

import com.example.loginappexample.data.model.LoggedInUser
import com.example.loginappexample.database.DataBase
import com.example.loginappexample.database.DbLoginErrorsRapport
import com.example.loginappexample.database.DbResult

/**
 * Class that handles authentication w/ login credentials and retrieves DbUser information.
 */
class LoginDataSource(private val dataBase: DataBase) {

    fun login(email: String, password: String): Result<LoggedInUser, DbLoginErrorsRapport> {
        val loginResult = dataBase.login(email, password)
        return if(loginResult is DbResult.Success){
            Result.Success(LoggedInUser(loginResult.dbUser.id, loginResult.dbUser.name))
        } else {
            loginResult as DbResult.Error
            Result.Error(loginResult.data)
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }

}