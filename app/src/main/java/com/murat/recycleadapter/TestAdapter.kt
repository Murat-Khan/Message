package com.murat.recycleadapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.murat.recycleadapter.databinding.ItemTestBinding

class TestAdapter( val massage:ArrayList<String>) : RecyclerView.Adapter<TestAdapter.TestViewHolder>(){




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        return TestViewHolder(ItemTestBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
      holder.onBind(massage[position])
    }

    override fun getItemCount() = massage.size


    inner class TestViewHolder(private val binding: ItemTestBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(str : String){
            binding.tvMassage.text = str


        }

    }
}