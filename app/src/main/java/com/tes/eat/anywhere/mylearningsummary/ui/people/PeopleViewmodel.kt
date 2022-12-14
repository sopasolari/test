package com.tes.eat.anywhere.mylearningsummary.ui.people

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tes.eat.anywhere.mylearningsummary.data.EmployeeApi
import com.tes.eat.anywhere.mylearningsummary.data.model.People
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PeopleViewmodel @Inject constructor(
    private val api: EmployeeApi
): ViewModel() {

    private val _people = MutableLiveData<People>()
    val people: LiveData<People> = _people

    // API call to fetch the data
    fun getPeople() {
        CoroutineScope(Dispatchers.Main).launch {
            val peopleList = api.getPeople()

            // verify if the response was successful
            if (peopleList.isSuccessful) {
                _people.postValue(peopleList.body())
            } else {
                _people.postValue(People())
            }
        }
    }
}