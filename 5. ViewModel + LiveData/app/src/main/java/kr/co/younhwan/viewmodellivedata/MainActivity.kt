package kr.co.younhwan.viewmodellivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData

// LiveData 란?
//// 데이터를 관찰해 줄 수 있는 친구(LifeCycle 과 결합해서)

class MainActivity : AppCompatActivity() {

    private var testMutableLiveData = MutableLiveData(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
