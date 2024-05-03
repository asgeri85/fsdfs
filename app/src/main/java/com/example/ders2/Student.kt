package com.example.ders2

class Student(
    val not: Int, studentName: String,
    studentAge: Int,
    studentHeight: Double,
) : İnsan(studentName, studentAge, studentHeight) {

    fun notHesabla() {
        println(not * 10)
    }

}