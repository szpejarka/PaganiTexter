package com.example.loginappexample.database

data class DbRegisterErrorsRapport(
    var validEmail:Boolean,
    var validUsername:Boolean,
    var emailNote:String,
    var usernameNote:String,
    var emailErrorId:Long?,
    var usernameErrorId:Long?)