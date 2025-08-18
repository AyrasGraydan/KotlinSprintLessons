package Lesson_2

fun main() {

    //variant 1

    val student1: Byte = 3
    val student2: Byte = 4
    val student3: Byte = 3
    val student4: Byte = 5

    val numberOfMarks = 4

    println((student1 + student2 + student3 + student4) / numberOfMarks.toFloat())

    //variant 2

    /* var class1 = ArithmeticMean(listOf(2,5,4,3,5,4,5,5,4,3,2,2,4,42))
     println(class1.arithmeticMean())


     var a = class1.arithmeticMean()
     println(a)*/

}

/*class ArithmeticMean(var marks: List<Int>){

    fun arithmeticMean() = "%.2f".format(marks.sum()/marks.size.toFloat())

}*/
