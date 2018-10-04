package com.barryrowe.android.coveralls.coveragetest

import androidx.lifecycle.ViewModel

class MainViewModel(
        _names: List<String> = mutableListOf("John", "Sally", "Erica", "Brad", "Veda")
) : ViewModel() {

    private val names = mutableListOf<String>()

    init {
        names.addAll(_names)
    }


    private var currentIndex = 0
    var name = names[currentIndex]


    fun changeName() {
        currentIndex = currentIndex.inc() % names.size
        name = names[currentIndex]
    }

    fun addName(newName: String) {
        names.add(newName)
    }
}