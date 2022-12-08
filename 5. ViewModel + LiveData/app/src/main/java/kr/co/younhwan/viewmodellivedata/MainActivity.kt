package kr.co.younhwan.viewmodellivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import kr.co.younhwan.viewmodellivedata.databinding.ActivityMainBinding

// LiveDate
//// 데이터를 관찰해 줄 수 있는 친구(LiftCycle 과 결합해서)

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        setContentView(binding.root)

        binding.button.setOnClickListener {
            viewModel.plus()
        }

        viewModel.testLiveData.observe(this) {
            findViewById<TextView>(R.id.count).text = it.toString()
        }
    }
}