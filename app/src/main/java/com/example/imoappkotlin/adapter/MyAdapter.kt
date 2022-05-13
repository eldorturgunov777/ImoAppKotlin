package com.example.imoappkotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.imoappkotlin.R
import com.example.imoappkotlin.model.ListData
import com.google.android.material.imageview.ShapeableImageView


/**
 * Created by Eldor Turgunov on 10.05.2022.
 * Imo App Kotlin
 * eldorturgunov777@gmail.com
 */
class MyAdapter(var context: FragmentActivity?, var list: List<ListData>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var iv_profile: ShapeableImageView
        var tv_fullname: TextView
        var desc: TextView
        var tv_count: TextView

        init {
            iv_profile = itemView.findViewById(R.id.iv_profile)
            tv_fullname = itemView.findViewById(R.id.tv_fullname)
            desc = itemView.findViewById(R.id.tv_message)
            tv_count = itemView.findViewById(R.id.tv_count)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]

        if (true) {
            val iv_profile = holder.iv_profile
            val tv_fullname = holder.tv_fullname
            val desc = holder.desc
            val tv_count = holder.tv_count

            iv_profile.setImageResource(data.image)
            tv_fullname.text = data.name
            desc.text = data.desc
            tv_count.text = data.count.toString()

            if (data.count > 0) {
                tv_count.visibility = View.VISIBLE
            } else {
                tv_count.visibility = View.GONE
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}