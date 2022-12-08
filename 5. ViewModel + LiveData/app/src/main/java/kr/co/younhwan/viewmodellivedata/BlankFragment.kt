package kr.co.younhwan.viewmodellivedata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import kr.co.younhwan.viewmodellivedata.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    private var _binding: FragmentBlankBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: BlankViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlankBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this)[BlankViewModel::class.java]

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button2.setOnClickListener {
            viewModel.plus()
        }

        viewModel.liveCount.observe(viewLifecycleOwner) {
            binding.fragCount.text = it.toString()
        }
    }
}