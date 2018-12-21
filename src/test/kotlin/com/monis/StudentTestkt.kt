package com.monis

import com.monis.student.Studentkt
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTestkt {
    @Test
    fun highestTest() {
        val student = Studentkt("monis", 60, 80)
        Assertions.assertEquals(80,student.highest())
    }

    @Test
    fun averageTest() {
        val student = Studentkt("monis", 60, 80)
        Assertions.assertEquals((60+80)/2,student.getAverage())
    }

    @Test
    fun gradingTest() {
        val student = Studentkt("monis", 60, 80)
        Assertions.assertEquals('C',student.grading())
    }
}