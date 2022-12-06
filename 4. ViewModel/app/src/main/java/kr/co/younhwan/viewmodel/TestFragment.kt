package kr.co.younhwan.viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import kr.co.younhwan.viewmodel.databinding.FragmentTestBinding

class TestFragment : Fragment() {
    private lateinit var binding : FragmentTestBinding

    private lateinit var viewmodel : TestFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_test, container, false)

        viewmodel = ViewModelProvider(this).get(TestFragmentViewModel::class.java)

        binding.count.text = viewmodel.getCountValue().toString()

        binding.fragPlus.setOnClickListener {
            viewmodel.plus()
            binding.count.text = viewmodel.getCountValue().toString()
        }

        binding.fragMinus.setOnClickListener {
            viewmodel.minus()
            binding.count.text = viewmodel.getCountValue().toString()
        }

        return binding.root
    }
}