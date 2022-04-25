package com.example.cams


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.fragment.app.Fragment


class WhatIsCamsFragment : Fragment() {


    var simpleVideoView: VideoView? = null
    var mediaControls: MediaController? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val v = inflater.inflate(R.layout.fragment_what_is_cams, container, false)
        val txt: TextView = v.findViewById(R.id.learn_more_text)
        txt.setOnClickListener {
            replaceFragment(MoreInfoFragment())
        }
        return v
    }
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = parentFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.my_frag, fragment)
        fragmentTransaction.commit()
    }
}