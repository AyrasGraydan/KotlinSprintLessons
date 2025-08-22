package Lesson_3

fun main() {

    val variable = 42

    val multiplicationTable = """
        $variable * 1 = $variable
        $variable * 2 = ${variable * 2} 
        $variable * 3 = ${variable * 3} 
        $variable * 4 = ${variable * 4} 
        $variable * 5 = ${variable * 5} 
        $variable * 6 = ${variable * 6} 
        $variable * 7 = ${variable * 7} 
        $variable * 8 = ${variable * 8} 
        $variable * 9 = ${variable * 9} 
    """.trimIndent()

    println(multiplicationTable)

}