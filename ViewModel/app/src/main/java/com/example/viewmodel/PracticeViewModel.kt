package com.example.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PracticeViewModel(beErtek: Int) :ViewModel() {
    val adatErtek=MutableLiveData<Int>()

    init {
        adatErtek.value=beErtek
    }

    fun Novel(){
        adatErtek.value=adatErtek.value?.plus(1)
    }

    fun Csokkent(){
        adatErtek.value=adatErtek.value?.minus(1)
    }


}