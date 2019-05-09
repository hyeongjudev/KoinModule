package com.goldforest.koinproject.viewmodel

import android.databinding.ObservableField
import android.util.Log
import com.goldforest.koinproject.base.BaseViewModel

class MainViewModel : BaseViewModel() {
    var value = ObservableField<String>()

    init {
        value.set("Test Start!!")
    }


    fun setValues(value1: String?) {
        Log.e("Click", "[HJ]value1 : $value1")
        value.set(value1)
    }
}