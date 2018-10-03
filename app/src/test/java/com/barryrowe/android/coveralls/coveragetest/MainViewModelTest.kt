package com.barryrowe.android.coveralls.coveragetest

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MainViewModelTest {

    private lateinit var viewModel: MainViewModel

    @Before
    fun setup() {
        viewModel = MainViewModel(listOf("Bob", "Jane", "Sarah"))
    }

    @Test
    fun testNameStartsAsFirstName() {
        assertEquals("Bob", viewModel.name)
    }

    @Test
    fun testNameChangeMovesToTheNextName() {
        viewModel.changeName()
        assertEquals("Jane", viewModel.name)
    }

//    @Test
//    fun alwaysFail(){
//        assertEquals(1.0f, 2.0f)
//    }
}
