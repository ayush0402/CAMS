package com.example.cams

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class ProblemToSolveFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val v= inflater.inflate(R.layout.fragment_problem_to_solve, container, false)
        val txt: TextView =v.findViewById(R.id.lear_more_pts)
        txt.setOnClickListener {
            replaceFragment(ProblemToSolveLearnMore())
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