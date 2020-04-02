package com.example.praktikumonline9

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val mName = MutableLiveData<String>()
    private val mName2 = MutableLiveData<String>()

    val name: LiveData<String>
        get() = mName

    val name2: LiveData<String>
        get() = mName2

    fun setName(name: String) {
        mName.value = name
    }

    fun setName2(name2: String) {
        mName2.value = name2
    }
}