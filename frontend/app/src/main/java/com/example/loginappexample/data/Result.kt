package com.example.loginappexample.data

/**
 * A generic class that holds a value with its loading status.
 * @param <T>
 */
sealed class Result<out T : Any, out E : Any> {

    data class Success<out T : Any, out E : Any>(val data: T) : Result<T,E>()
    data class Error<out T : Any, out E : Any>(val data: E) : Result<T,E>()

    override fun toString(): String {
        return when (this) {
            is Success<*,*> -> "Success[data=$data]"
            is Error<*,*> -> "Error[data=$data]"
        }
    }
}