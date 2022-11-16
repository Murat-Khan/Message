package com.murat.recycleadapter

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.murat.recycleadapter.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding
   private var massage = arrayListOf<String>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = TestAdapter(massage)
        binding.recycle.adapter = adapter

        binding.btnAdd.setOnClickListener {
            val result = binding.editText.text.toString()
            massage.add(result)

            adapter.notifyItemChanged(massage.size -1)
            binding.editText.setText("")
            binding.recycle.scrollToPosition(massage.size - 1)
        }

    }



    }


