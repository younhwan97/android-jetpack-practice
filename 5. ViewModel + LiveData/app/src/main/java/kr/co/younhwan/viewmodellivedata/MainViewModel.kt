package kr.co.younhwan.viewmodellivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var _testMutableLiveData = MutableLiveData(0)
    val testLiveData : LiveData<Int>
        get() = _testMutableLiveData

    fun plus(){
        _testMutableLiveData.value = _testMutableLiveData.value!!.plus(1)
    }
}