package com.example.cams

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class VolunteerToHelpFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v= inflater.inflate(R.layout.fragment_volunteer_too_help, container, false)
        val camgit:Button=v.findViewById(R.id.camsgit)
        val project:Button=v.findViewById(R.id.project)
        val ask:Button=v.findViewById(R.id.ask)
        camgit.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW).apply { data = Uri.parse("https://github.com/CriticalAssetManagement") }
            startActivity(i)
        }
        project.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW).apply { data = Uri.parse("https://github.com/orgs/CriticalAssetManagement/projects/1") }
            startActivity(i)
        }
        ask.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW).apply { data = Uri.parse("https://github.com/CriticalAssetManagement/CAMS/discussions") }
            startActivity(i)
        }
        return v
    }


}