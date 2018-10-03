package com.barryrowe.android.coveralls.coveragetest

import androidx.lifecycle.ViewModel

class MainViewModel(
        private val names: List<String> = listOf("John", "Sally", "Erica", "Brad", "Veda")
) : ViewModel() {

    private var currentIndex = 0
    var name = names[currentIndex]


    fun changeName() {
        currentIndex = currentIndex.inc() % names.size
        name = names[currentIndex]
    }
}