package Lesson_2

fun main() {

//    employees 50 / 30 000
//    interns 30 / 20 000

    //variant 1

    val employees = 50
    val interns = 30

    val employeesWage = 30000
    val internsWage = 20000

    val paymentExpensesEmployees = employees * employeesWage
    val paymentExpensesAll = interns * internsWage + paymentExpensesEmployees
    val averageWage = paymentExpensesAll/ (employees + interns)

    println("""
        $paymentExpensesEmployees
        $paymentExpensesAll
        $averageWage
    """.trimIndent())


    //variant 2

    println()


    println(expenses(50, 30000))
    println(expenses(50, 30000) + expenses(30, 20000))

    println(arithmeticMean(mapOf(50 to 30000, 30 to 20000)))
    // "количество сотрудников с одинаковым достатком" to "ЗП"
}

fun expenses(employees: Int, wage: Int) = employees * wage

fun arithmeticMean(values: Map<Int, Int>): Int{
        var amount = 0
        var quantity = 0
        values.forEach { numberOfEmployees, wage ->
            amount += numberOfEmployees * wage
            quantity += numberOfEmployees
        }
        return amount / quantity
}


