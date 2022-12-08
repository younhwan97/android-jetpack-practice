package kr.co.younhwan.viewmodellivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BlankViewModel : ViewModel(){
    private var _mutableCount = MutableLiveData(0)
    val liveCount : LiveData<Int>
            get() = _mutableCount

    fun plus(){
        _mutableCount.value = _mutableCount.value!!.plus(1)
    }
}