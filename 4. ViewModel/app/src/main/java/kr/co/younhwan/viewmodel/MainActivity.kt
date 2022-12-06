package kr.co.younhwan.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var viewModel : MainViewModel

    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // ViewModel의 장점
        // 상태(엑티비티의 생성, 시작, 중지, 재시작 등)가 변경될 때 마다 데이터를 관리해줘야 하는데 이 관리가 편하다.
        // https://developer.android.com/static/images/topic/libraries/architecture/viewmodel-lifecycle.png?hl=ko
        // 아래 예제의 경우 화면 전환시 값이 초기화 됨

        val plusBtn : Button = findViewById(R.id.plus)
        val minusBtn : Button = findViewById(R.id.minus)
        val result : TextView = findViewById(R.id.result)

//        plusBtn.setOnClickListener {
//            var value = (result.text).toString().toInt()
//            value ++
//            result.text = value.toString()
//        }
//
//        minusBtn.setOnClickListener {
//            var value = (result.text).toString().toInt()
//            value --
//            result.text = value.toString()
//        }

        // 뷰 모델 사용
        result.text = viewModel.getCountValue().toString()

        plusBtn.setOnClickListener {
            viewModel.plus()
            result.text = viewModel.getCountValue().toString()
        }

        minusBtn.setOnClickListener {
            viewModel.minus()
            result.text = viewModel.getCountValue().toString()
        }


        // 프래그먼트에서 뷰 모델 라이프사이클을 확인하기위해 프래그먼트 추가
        val trans = manager.beginTransaction()
//        val frag = TestFragment()
//        trans.replace(R.id.frameArea, frag)
//        trans.addToBackStack(null)
//        trans.commit()

        // 엑티비티와 뷰모델을 공유하는 프래그먼트를 확인하기위해 프래그먼트 추가
        val frag2 = Test2Fragment()
        trans.replace(R.id.frameArea2, frag2)
        trans.addToBackStack(null)
        trans.commit()
    }
}