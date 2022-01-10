package com.example.loginappexample.database

data class DbUser(val id:String, var name:String, var password:String, var email:String){

    override fun hashCode(): Int {
        return id.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DbUser

        if (id != other.id) return false
        if (name != other.name) return false
        if (password != other.password) return false
        if (email != other.email) return false

        return true
    }
}