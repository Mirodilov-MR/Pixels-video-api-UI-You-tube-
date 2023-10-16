package com.ytp.pixe.screens.shorts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ytp.pixe.databinding.FragmentShortsBinding


class ShortsFragment : Fragment() {
    private lateinit var binding: FragmentShortsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentShortsBinding.inflate(inflater, container, false)
        return binding.root
    }
}