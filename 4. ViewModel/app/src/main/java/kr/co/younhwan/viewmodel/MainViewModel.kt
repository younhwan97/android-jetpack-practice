package kr.co.younhwan.viewmodel

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var count = 0

    fun plus() {
        count++
    }

    fun minus() {
        count--
    }

    fun getCountValue(): Int {
        return count
    }
}