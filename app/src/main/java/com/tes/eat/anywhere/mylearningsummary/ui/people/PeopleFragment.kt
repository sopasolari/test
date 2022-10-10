package com.tes.eat.anywhere.mylearningsummary.ui.people

import com.tes.eat.anywhere.mylearningsummary.R
import com.tes.eat.anywhere.mylearningsummary.databinding.FragmentPeopleBinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.tes.eat.anywhere.mylearningsummary.data.model.People
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint  // make sure it is also set in Activity
class PeopleFragment : Fragment(R.layout.fragment_people) {

    lateinit var binding: FragmentPeopleBinding
    val viewModel by viewModels<PeopleViewmodel>()

//    @Inject  // make sure the AndroidEntryPoint is set
//    lateinit var api: EmployeeApi

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPeopleBinding.inflate(inflater)

        // observe the changes in viewmodel liveData
        viewModel.people.observe(viewLifecycleOwner) {

            setupUI(it)
        }
        //setupUI(it)
        // call the API for result
        viewModel.getPeople()

        return binding.root
    }

    private fun setupUI(peopleList: People) {
        binding.peopleList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = PeopleAdapter(
                peopleList

            )

        }


    }
}