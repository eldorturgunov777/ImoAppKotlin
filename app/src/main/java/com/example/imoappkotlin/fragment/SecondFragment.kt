package com.example.imoappkotlin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imoappkotlin.R
import com.example.imoappkotlin.adapter.ContactAdapter
import com.example.imoappkotlin.model.ListContacts


class SecondFragment : Fragment() {
    var recyclerView: RecyclerView? = null
    var contacts = ArrayList<ListContacts>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView2)
        recyclerView?.setHasFixedSize(true)
        recyclerView?.setLayoutManager(LinearLayoutManager(this@SecondFragment.activity))

        val adapter = ContactAdapter(this@SecondFragment.activity, contacts)
        recyclerView?.setAdapter(adapter)
        contacts.add(ListContacts(R.drawable.img1, "Mason Mount"))
        contacts.add(ListContacts(R.drawable.img2, "Eldor Turgunov"))
        contacts.add(ListContacts(R.drawable.img3, "Hamdam Sobirov"))
        contacts.add(ListContacts(R.drawable.img4, "Chelsea FC"))
        contacts.add(ListContacts(R.drawable.img5, "Adama Traore"))
        contacts.add(ListContacts(R.drawable.img1, "Mason Mount"))
        contacts.add(ListContacts(R.drawable.img2, "Eldor Turgunov"))
        contacts.add(ListContacts(R.drawable.img3, "Hamdam Sobirov"))
        contacts.add(ListContacts(R.drawable.img4, "Chelsea FC"))
        contacts.add(ListContacts(R.drawable.img5, "Adama Traore"))
        contacts.add(ListContacts(R.drawable.img1, "Mason Mount"))
        contacts.add(ListContacts(R.drawable.img2, "Eldor Turgunov"))
        contacts.add(ListContacts(R.drawable.img3, "Hamdam Sobirov"))
        contacts.add(ListContacts(R.drawable.img4, "Chelsea FC"))
        contacts.add(ListContacts(R.drawable.img5, "Adama Traore"))
        contacts.add(ListContacts(R.drawable.img1, "Mason Mount"))
        contacts.add(ListContacts(R.drawable.img2, "Eldor Turgunov"))
        contacts.add(ListContacts(R.drawable.img3, "Hamdam Sobirov"))
        contacts.add(ListContacts(R.drawable.img4, "Chelsea FC"))
        contacts.add(ListContacts(R.drawable.img5, "Adama Traore"))

    }
}