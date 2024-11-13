fun main() {
    println("Введите два числа и операцию между ними")
    val input = readlnOrNull() ?: return
    val parts = input.split(" ")

    if (parts.size != 3) {
        println("Ошибка!")
        return
    }

    try {
        val num1 = parts[0].toDouble()
        val num2 = parts[1].toDouble()
        val operation = parts[2]

        val result = when (operation) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> {
                if (num2 != 0.0) num1 / num2
                else throw ArithmeticException("Нельзя делить на ноль")
            }
            else -> throw IllegalArgumentException("Ошибка")
        }

        println("Результат: $result")
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }
}