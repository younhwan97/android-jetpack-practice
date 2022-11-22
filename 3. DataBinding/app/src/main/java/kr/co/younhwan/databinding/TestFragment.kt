package kr.co.younhwan.databinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kr.co.younhwan.databinding.databinding.FragmentTestBinding

class TestFragment : Fragment() {
    lateinit var binding : FragmentTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_test, container, false)

        binding.text.text = "변경된 프래그먼트 텍스트"

        return binding.root
    }

}