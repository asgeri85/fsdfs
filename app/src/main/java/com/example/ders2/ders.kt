package com.example.ders2

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
fun main() {
    /* val reqemler = arrayListOf<Int>()

     val seherler = arrayListOf<String>()

     seherler.add("Bakı")
     seherler.add("Naxçıvan")
     seherler.add("Şeki")

     val seherler2 = arrayListOf<String>()

     seherler2.add("Sumqayıt")
     seherler2.add("Lenkeran")
     seherler2.add("Sumqayıt")
     seherler2.add("Lenkeran")
     seherler2.add("Sumqayıt")
     seherler2.add("Lenkeran")
     seherler2.add("Sumqayıt")
     seherler2.add("Lenkeran")

     println(seherler2.toString())

     seherler2.removeAt(5)

     println("---------")

     println(seherler2.toString())

    val isciler = arrayListOf<Isci>()

    val scanner = Scanner(System.`in`)

    for (i in 1..2){
        println("Ad giriniz")
        val ad = scanner.next()
        println("Maaş giriniz")
        val maas = scanner.nextInt()

        val isci = Isci(ad, maas)
        isciler.add(isci)
    }

    println(isciler.toString())

    val meyveler= ArrayList<String>()

    meyveler.add("Çiyelek")
    meyveler.add("Alma")

    println(meyveler[1])
    meyveler[1]="Portoğal"


    meyveler.isEmpty()
    meyveler.size
    meyveler.first()
    meyveler.last()


    meyveler.contains("Portoğal")


    val reqemler= arrayListOf<Int>()

    reqemler.add(1)
    reqemler.add(2)
    reqemler.add(3)

    reqemler.max()
    reqemler.min()

    reqemler.sort()
    reqemler.reverse()
    reqemler.clear()

    val telebeler = arrayListOf<Student>()

    telebeler.add(Student("ali", 30, 50))
    telebeler.add(Student("veli", 32, 60))

    telebeler.sortedBy { it.age

    val scanner = Scanner(System.`in`)
    val telebeler = arrayListOf<Student>()

    for (i in 1..2) {
        println("ad gir")
        val name = scanner.next()
        println("not gir")
        val not1 = scanner.nextDouble()
        val not2 = scanner.nextDouble()
        val not3 = scanner.nextDouble()
        val student = Student(name, not1, not2, not3)
        telebeler.add(student)
    }

    val elacilar = arrayListOf<Student>()

    for (i in telebeler) {
        if (i.ortalamaHesabla() > 60.0) {
            elacilar.add(i)
        }
    }

    println(elacilar.toString())}

    val isciler = arrayListOf<Isci>()

    isciler.add(Isci("ali",500))
    isciler.add(Isci("adad",55004))
    isciler.add(Isci("adadasd",2323))

    println(isciler.toString())*/

    // val boyukler = arrayListOf<Int>()

    /* for (i in reqemler) {
         if (i > 2) {
             boyukler.add(i)
         }
     }

    // println(boyukler.toString())


    var count: Int? = null

    var price: Int? = null

    /*  if (count!=null && price != null){
          val toplam = count + price
      }?/

      count?.let {
          price?.let {it1 ->
              val toplam = it + it1
          }
      }*/

    val isci = Isci("asdasd", Maas("24.04.2024", 5000))

    println(isci.maas.mebleg)*/


    val telebe = Student(100, "AAli", 45, 1.80)
    val muellim = Teacher("1000", "Tarix", "Şamil", 30, 1.90)

    telebe.notHesabla()
    telebe.dogumİli()

    muellim.maasYazdir()
    muellim.dogumİli()


}