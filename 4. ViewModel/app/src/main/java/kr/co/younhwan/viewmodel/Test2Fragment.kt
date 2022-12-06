package kr.co.younhwan.viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import kr.co.younhwan.viewmodel.databinding.FragmentTest2Binding

class Test2Fragment : Fragment() {

    private lateinit var binding : FragmentTest2Binding
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_test2, container, false)

        binding.textView2.text = viewModel.getCountValue().toString()

        binding.frag2Plus.setOnClickListener {
            viewModel.plus()
            binding.textView2.text = viewModel.getCountValue().toString()
        }

        binding.frag2Minus.setOnClickListener {
            viewModel.minus()
            binding.textView2.text = viewModel.getCountValue().toString()
        }

        return binding.root
    }
}