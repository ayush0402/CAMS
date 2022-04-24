package com.example.cams

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v= inflater.inflate(R.layout.fragment_home, container, false)
        val camsgithub:Button=v.findViewById(R.id.camsgithub)
        camsgithub.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW).apply { data = Uri.parse("https://github.com/CriticalAssetManagement") }
            startActivity(i)
        }
        return v
    }


}