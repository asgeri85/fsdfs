package com.example.ders2

data class Product(val id: Int, val count: Int? = null) {

    fun qiymetHesabla(qiymet: Int): Int {
        count?.let {
            val toplamQiymet = qiymet * count
            return toplamQiymet
        }
        return 0
    }
}
