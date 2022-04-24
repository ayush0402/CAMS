package com.example.cams

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cams.databinding.FragmentWhatIsCamsBinding


class WhatIsCamsFragment : Fragment() {


    var whatIsCamsBinding: FragmentWhatIsCamsBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        whatIsCamsBinding = FragmentWhatIsCamsBinding.inflate(inflater, container, false)


//        whatIsCamsBinding!!.learnMoreText.setOnClickListener { view: View? ->
//            val action = WhatIsCamsFragmentDirections.actionWhatIsCamsFragmentToCamsInfoFragment()
//            it.findNavController().navigate(action)
//        }

        return whatIsCamsBinding?.root

    }


}