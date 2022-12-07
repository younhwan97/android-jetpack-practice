package kr.co.younhwan.viewmodellivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider

// LiveDate
//// 데이터를 관찰해 줄 수 있는 친구(LiftCycle 과 결합해서)

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        findViewById<Button>(R.id.button).setOnClickListener {
            viewModel.plus()
        }

        viewModel.testMutableLiveData.observe(this) {
            findViewById<TextView>(R.id.count).text = viewModel.testMutableLiveData.value.toString()
        }
    }
}