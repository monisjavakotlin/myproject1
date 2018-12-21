package com.monis

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTestkt {
    @Test
    fun humanBmiTest() {
        val human = Human("monis", 66.5f, 1.7f)
        Assertions.assertEquals(66.5f / (1.7f * 1.7f), human.bmi())
    }

    @Test
    fun personBmiTest() {
        val person = Person(66.5f, 1.7f)
        Assertions.assertEquals(66.5f / (1.7f * 1.7f), person.bmi())
    }
}