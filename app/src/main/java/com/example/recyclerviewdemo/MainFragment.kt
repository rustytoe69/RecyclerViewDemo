package com.example.recyclerviewdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recyclerviewdemo.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val courses = listOf(
            Course("Comp Sci 1", "Jones",  R.drawable.ic_launcher_foreground),
            Course("Comp Sci 2", "Jones", R.drawable.ic_launcher_foreground),
            Course("Calculus", "Wagner", R.drawable.ic_launcher_foreground),
            Course("Jewelery", "Fenton",R.drawable.ic_launcher_foreground),
            Course("Sculpting","Fenton",R.drawable.ic_launcher_foreground),
            Course("Chemistry", "Siwak", R.drawable.ic_launcher_foreground)
            )

        val mAdapter = CourseAdapter(courses)
        binding.recyclerView.adapter=mAdapter



        return rootView
    }
}