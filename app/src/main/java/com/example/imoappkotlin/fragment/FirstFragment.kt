package com.example.imoappkotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imoappkotlin.R
import com.example.imoappkotlin.adapter.MyAdapter
import com.example.imoappkotlin.model.ListData

class FirstFragment : Fragment() {
    var recyclerView: RecyclerView? = null
    var list = ArrayList<ListData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView?.setHasFixedSize(true)
        recyclerView?.setLayoutManager(LinearLayoutManager(this@FirstFragment.activity))

        val adapter = MyAdapter(this@FirstFragment.activity, list)
        recyclerView?.setAdapter(adapter)
        list.add(ListData(R.drawable.img1, "Mason Mount", "Hi, do you speak English", 8))
        list.add(ListData(R.drawable.img2, "Eldor Turgunov", "", 0))
        list.add(ListData(R.drawable.img3, "Hamdam Sobirov", "Hi, do you speak English", 1))
        list.add(ListData(R.drawable.img4, "Chelsea FC", "Happy", 1))
        list.add(ListData(R.drawable.img5, "Adama Traore", "Play Futboll", 7))
        list.add(ListData(R.drawable.img1, "Mason Mount", "Hi, do you speak English", 8))
        list.add(ListData(R.drawable.img2, "Eldor Turgunov", "", 0))
        list.add(ListData(R.drawable.img3, "Hamdam Sobirov", "Hi, do you speak English", 1))
        list.add(ListData(R.drawable.img4, "Chelsea FC", "Happy", 1))
        list.add(ListData(R.drawable.img5, "Adama Traore", "Play Futboll", 7))
        list.add(ListData(R.drawable.img1, "Mason Mount", "Hi, do you speak English", 8))
        list.add(ListData(R.drawable.img2, "Eldor Turgunov", "", 0))
        list.add(ListData(R.drawable.img3, "Hamdam Sobirov", "Hi, do you speak English", 1))
        list.add(ListData(R.drawable.img4, "Chelsea FC", "Happy", 1))
        list.add(ListData(R.drawable.img5, "Adama Traore", "Play Futboll", 7))
        list.add(ListData(R.drawable.img1, "Mason Mount", "Hi, do you speak English", 8))
        list.add(ListData(R.drawable.img2, "Eldor Turgunov", "", 0))
        list.add(ListData(R.drawable.img3, "Hamdam Sobirov", "Hi, do you speak English", 1))
        list.add(ListData(R.drawable.img4, "Chelsea FC", "Happy", 1))
        list.add(ListData(R.drawable.img5, "Adama Traore", "Play Futboll", 7))

    }
}