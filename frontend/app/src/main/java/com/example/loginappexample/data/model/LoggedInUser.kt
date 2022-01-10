package com.example.loginappexample.data.model

/**
 * Data class that captures DbUser information for logged in users retrieved from LoginRepository
 */
data class LoggedInUser(
    val userId: String,
    val username: String
)