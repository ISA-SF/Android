package com.example.corrutinas.main.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.corrutinas.main.data.datasourceimplementations.MainUseCaseImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    private val _requestData = MutableLiveData<String>()
    val requestData: LiveData<String> = _requestData

    val mainUseCaseEmpl = MainUseCaseImpl()

    fun requestData(){
        viewModelScope.launch(Dispatchers.IO){
            _requestData.postValue(mainUseCaseEmpl.requestData())
        }
    }
}
