package com.example.imoappkotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.imoappkotlin.R
import com.example.imoappkotlin.model.ListContacts
import com.example.imoappkotlin.model.ListData
import com.google.android.material.imageview.ShapeableImageView


/**
 * Created by Eldor Turgunov on 13.05.2022.
 * Imo App Kotlin
 * eldorturgunov777@gmail.com
 */
class ContactAdapter(var context: FragmentActivity?, var list: ArrayList<ListContacts>) :
    RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var iv_profile: ShapeableImageView
        var tv_fullname: TextView

        init {
            iv_profile = itemView.findViewById(R.id.iv_profile)
            tv_fullname = itemView.findViewById(R.id.tv_fullname)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapter.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.contact_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]

        if (true) {
            val iv_profile = holder.iv_profile
            val tv_fullname = holder.tv_fullname

            iv_profile.setImageResource(data.image)
            tv_fullname.text = data.name
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

}