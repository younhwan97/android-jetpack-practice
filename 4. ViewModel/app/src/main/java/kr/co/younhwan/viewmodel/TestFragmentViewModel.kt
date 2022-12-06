package kr.co.younhwan.viewmodel

import androidx.lifecycle.ViewModel

class TestFragmentViewModel: ViewModel() {
    var value = 0

    fun plus(){
        value += 1
    }

    fun minus(){
        value -= 1
    }

    fun getCountValue(): Int{
        return value
    }
}