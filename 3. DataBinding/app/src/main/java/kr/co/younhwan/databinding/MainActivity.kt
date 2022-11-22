package kr.co.younhwan.databinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kr.co.younhwan.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // DataBinding
        // ViewBinding과 차이? -> 이름처럼 데이터를 연결해주는 역할을 할 수 있다. (데이터와 같이 결합해서 사용할 수 있음)
        // build.gradle에 DataBinding 사용 선언!
        // layout 파일 상위에 layout 태그 추가
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.dataBindingEx.text = "바뀐 텍스트"
        binding.dataBindingEx.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}