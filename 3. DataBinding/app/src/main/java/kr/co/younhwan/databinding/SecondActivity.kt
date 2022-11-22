package kr.co.younhwan.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.younhwan.databinding.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    private val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val trans = manager.beginTransaction()
        val frag = TestFragment()
        trans.replace(R.id.frameArea, frag)
        trans.addToBackStack(null)
        trans.commit()
    }
}