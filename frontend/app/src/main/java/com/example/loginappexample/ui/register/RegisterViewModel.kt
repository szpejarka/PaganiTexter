package com.example.loginappexample.ui.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loginappexample.data.RegisterRepository
import java.util.*
import com.example.loginappexample.data.Result

class RegisterViewModel(private val registerRepository:RegisterRepository) : ViewModel(){

    private val _registerForm = MutableLiveData<RegisterFormState>()
    val registerForm:LiveData<RegisterFormState> = _registerForm

    private val _registerResult = MutableLiveData<RegisterResult>()
    val registerResult:LiveData<RegisterResult> = _registerResult

    fun register(name:String, email:String, password:String){
        val id = UUID.randomUUID().toString()
        val result = registerRepository.register(id, name, email, password)

        /*if(result is Result.Success){
            _registerForm.value =
                RegisterFormState(isDataValid = true)
        }
        else if(result is Result.Error){
            if(!result.data.validUsername)
        }*/
    }
}