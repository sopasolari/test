package com.tes.eat.anywhere.mylearningsummary.ui.people

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tes.eat.anywhere.mylearningsummary.R
import com.tes.eat.anywhere.mylearningsummary.databinding.FragmentDetailBinding
import com.tes.eat.anywhere.mylearningsummary.databinding.FragmentPeopleBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFragment : Fragment(R.layout.fragment_detail) {

    lateinit var binding: FragmentDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentDetailBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }


}