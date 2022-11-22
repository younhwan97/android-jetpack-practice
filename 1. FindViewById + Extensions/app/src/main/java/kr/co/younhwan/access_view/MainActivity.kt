package kr.co.younhwan.access_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.younhwan.binding.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // findViewById 사용
        // 문제점: 위젯이 많아질수록 복잡도 증가
        val id_btn1: Button = findViewById(R.id.btn1)
        val id_btn2: Button = findViewById(R.id.btn2)
        val id_btn3: Button = findViewById(R.id.btn3)

        id_btn1.text = "findViewById1"
        id_btn2.text = "findViewById2"
        id_btn3.text = "findViewById3"

        // Kotlin Extensions
        // 문제점: 다른 엑티비티에 레이아웃 파일의 아이디에 접근시 앱이 종료되는 등의 문제가 생길 수 있음
        // 문제점: 성능이슈
        btn1.text = "kotlin extensions1"
        btn2.text = "kotlin extensions2"
        btn3.text = "kotlin extensions3"
    }
}