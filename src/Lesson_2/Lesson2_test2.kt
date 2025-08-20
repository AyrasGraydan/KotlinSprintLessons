package Lesson_2

fun main() {

//    employees 50 / 30 000
//    interns 30 / 20 000

    val employees = 50
    val interns = 30

    val employeesWage = 30000
    val internsWage = 20000

    val paymentExpensesEmployees = employees * employeesWage
    val paymentExpensesAll = interns * internsWage + paymentExpensesEmployees
    val averageWage = paymentExpensesAll / (employees + interns)

    println(
        """
        $paymentExpensesEmployees
        $paymentExpensesAll
        $averageWage
    """.trimIndent()
    )

}



