package com.example.ders2

class Teacher(
    val maas: String,
    val ders: String,
     tecaherName: String,
     teacherAge: Int,
     teacherHeight: Double,
) : İnsan(tecaherName, teacherAge, teacherHeight),İnsanFunksiyaları {

    fun maasYazdir() {
        println(maas)
    }

    override var ab: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun adYazdir() {

    }

}