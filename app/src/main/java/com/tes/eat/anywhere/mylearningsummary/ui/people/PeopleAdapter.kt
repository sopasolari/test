package com.tes.eat.anywhere.mylearningsummary.ui.people

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tes.eat.anywhere.mylearningsummary.R
import com.tes.eat.anywhere.mylearningsummary.data.model.People
import com.tes.eat.anywhere.mylearningsummary.databinding.ItemPersonFirstLastNameBinding

class PeopleAdapter(
    private val persons: People

) : RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder>() {

    class PeopleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //private val binding = ItemPersonBinding.bind(itemView)
        private val bindingFirstLastName = ItemPersonFirstLastNameBinding.bind(itemView)

        fun setupUI(fact: People?, position: Int) {
                //binding.tvPersonFact.text = fact?.get(position)?.firstNameModel
            bindingFirstLastName.firstName.text = fact?.get(position)?.firstNameModel
            bindingFirstLastName.lastName.text = fact?.get(position)?.lastNameModel
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleAdapter.PeopleViewHolder {
        return PeopleViewHolder(
            //LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)
            LayoutInflater.from(parent.context).inflate(R.layout.item_person_first_last_name, parent, false)

        )
    }
    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        holder.setupUI(persons, position)
    }
    override fun getItemCount() = persons.size

}