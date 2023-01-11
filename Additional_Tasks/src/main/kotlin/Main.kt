import javax.print.attribute.SetOfIntegerSyntax
import kotlin.collections.get as get1

fun enter_value(value_str: String = readLine()!!): Float
{
    return value_str.toFloat()
}


fun operators_1()
{
    print("Задание 1. Введите число: ")
    val num1: Float = enter_value()

    if (num1 > 10) println("Число больше десяти")
    else if (num1.toInt() == 10) println("Число равно десяти")
    else println("Число меньше десяти")
}

fun operators_2()
{
    println("\nЗадание 2.")
    print("Введите первое число: ")
    val numA: Float = enter_value()

    print("Введите второе число: ")
    val numB: Float = enter_value()

    if (numA > numB) println("Первое число больше второго: $numA > $numB")
    else if (numA == numB) println("Первое число равно второму: $numA = $numB")
    else println("Первое число меньше второго: $numA < $numB")
}

fun operators_3()
{
    println("\nЗадание 3.")
    print("Введите первую сторону треугольника: ")
    val side_a: Float = enter_value()

    print("Введите вторую сторону треугольника: ")
    val side_b: Float = enter_value()

    print("Введите третью сторону треугольника: ")
    val side_c: Float = enter_value()

    if (side_a.toInt() == side_b.toInt() && side_a.toInt() == side_c.toInt())
        println("Треугольник равносторонний")
    else if (side_a.toInt() == side_b.toInt() ||
        side_a.toInt() == side_c.toInt() ||
        side_b.toInt() == side_c.toInt())
        println("Треугольник равнобедренный")
    else println("Треугольник разносторонний")
}

fun operators_4()
{
    println("\nЗадание 4.")
    var countPlus: Int = 0
    var countMinus: Int = 0

    for (i in 1..4)
    {
        print("Введите число: ")
        val num: Float = enter_value()

        if (num >= 0) countPlus += 1
        else countMinus += 1
    }

    println("Количество положительных чисел: $countPlus")
    println("Количество отрицательных чисел: $countMinus")
}

fun operators_5()
{
    println("\nЗадание 5.")
    var numbArray = arrayOfNulls<Float>(3)
    for (i in 0..2)
    {
        print("Введите число: ")
        numbArray[i] = enter_value()
    }

    for (i in 0..1)
    {
        for (j in 0..1)
        {
            if (numbArray[j]!! > numbArray[j + 1]!!)
            {
                var k: Float = numbArray[j+1]!!
                numbArray[j+1] = numbArray[j]
                numbArray[j] = k
            }
        }
    }
    println("Самое большое число: ${numbArray[2]}")
}

fun operators_6()
{
    println("\nЗадание 6.")
    var nArray = arrayOfNulls<Float>(3)

    for (i in 0..2)
    {
        print("Введите число: ")
        nArray[i] = enter_value()
    }

    for (i in 0..1)
    {
        for (j in 0..1)
        {
            if (nArray[j]!! > nArray[j + 1]!!)
            {
                var k: Float = nArray[j+1]!!
                nArray[j+1] = nArray[j]
                nArray[j] = k
            }
        }
    }
    println("Сумма наибольшего и наименьшего чисел: " +
            "\n ${nArray[2]} + ${nArray[0]} = ${nArray.last()!! + nArray.first()!!}")
}

fun operators_7()
{
    println("\nЗадание 7.")
    print("Введите число: ")
    val n: Float = enter_value()

    if ((n % 2).toInt() != 0) println("Число нечетное")
    else println("Число четное")
}

fun operators_8()
{
    println("\nЗадание 8.")
    println("Хлеб: 100 руб.")
    println("Кукуруза: 180 руб.")
    println("Йогурт: 50 руб.")

    print("\nВыберите товар: ")
    val item: String = readLine()!!

    print("Введите цену: ")
    val price = enter_value()

    if (item == "Хлеб" || item == "хлеб")
    {
        if (price.toInt() == 100) println("Спасибо за покупку!")
        else if (price.toInt() < 100) println("Денег не хватает! Нужно еще ${100 - price}")
        else println("Ваша сдача: ${price - 100}")
    }

    if (item == "Кукуруза" || item == "кукуруза")
    {
        if (price.toInt() == 180) println("Спасибо за покупку!")
        else if (price.toInt() < 180) println("Денег не хватает! Нужно еще ${180 - price}")
        else println("Ваша сдача: ${price - 180}")
    }

    if (item == "Йогурт" || item == "йогурт")
    {
        if (price.toInt() == 50) println("Спасибо за покупку!")
        else if (price.toInt() < 50) println("Денег не хватает! Нужно еще ${50 - price}")
        else println("Ваша сдача: ${price - 50}")
    }
}


fun cycles_1()
{
    println("\nЗадание 1.")
    for (i in 1..10)
    {
        println("4 * $i = ${4 * i}")
    }
}

fun cycles_2()
{
    println("\nЗадание 2.")
    print("Введите число: ")
    val x = enter_value()

    println("Все четные числа от 0 до $x: ")
    for (i in 0..x.toInt())
    {
        if (i % 2 == 0) print("$i ")
    }
}

fun cycles_3()
{
    println("\nЗадание 3.")
    print("Введите число: ")
    val fibX = enter_value()

    if (fibX.toInt() == 1)
    {
        println("Число из последовательности Фибоначчи с индексом 1 = 0")
    }
    else if (fibX.toInt() == 2)
    {
        println("Число из последовательности Фибоначчи с индексом 2 = 1")
    }
    else
    {
        var fibArray = arrayOfNulls<Int>(fibX.toInt())
        fibArray[0] = 0
        fibArray[1] = 1

        for (i in 2 until fibX.toInt()) {
            fibArray[i] = fibArray[i - 1]!! + fibArray[i - 2]!!
        }

        println("Число из последовательности Фибоначчи с индексом ${fibX.toInt()} = ${fibArray[fibX.toInt() - 1]}")
    }
}

fun cycles_4()
{
    println("\nЗадание 4.")
    print("Введите число: ")
    var fibX = enter_value()
    var fib: Int = 1

    for (i in 2..fibX.toInt())
    {
        fib *= i
    }

    println("Факториал числа ${fibX.toInt()} = $fib")
}

fun cycles_5()
{
    println("\nЗадание 4.")
    print("Введите строку: ")
    var stroka: String = readLine()!!

    for (i in 0..stroka.length)
    {
        println("${stroka[i]}")
    }
}


fun arrays_1()
{
    println("\nЗадание 1.")
    print("Введите размер массива: ")
    val masSize = enter_value().toInt()

    val array = (1..masSize).map { (-20..20).random() }
    println("Массив рандомных целочисленных значений:")
    for(i in 0..masSize-1)
        print("${array[i]} ")

    var countPlus: Int = 0
    var countMinus: Int = 0

    for(i in 0..masSize-1)
    {
        if(array[i] >= 0)
            countPlus += 1
        else countMinus += 1
    }

    println("\nМассив содержит $countPlus положительных и $countMinus отрицательных чисел")
}

fun arrays_2()
{
    println("\nЗадание 2.")
    print("Введите размер массива: ")
    val masSize = enter_value().toInt()

    val array = (1..masSize).map { (-20..20).random() }
    println("Массив рандомных целочисленных значений:")
    for(i in 0..masSize-1)
        print("${array[i]} ")

    var count: Int = 0

    for (i in 0..masSize-1)
    {
        if (i % 2 == 0) count += array[i]
    }

    println("\nСумма элементов массива с четными индексами = $count")
}

fun arrays_3()
{
    println("\nЗадание 3.")
    print("Введите размер массива: ")
    val masSize = enter_value().toInt()

    val array = (1..masSize).map { (-20..20).random() }
    println("Массив рандомных целочисленных значений:")
    for(i in 0..masSize-1)
        print("${array[i]} ")

    var count: Int = 0

    for (i in 0..masSize-1)
    {
        if (array[i] % 2 == 0) count += array[i]
    }

    println("\nСумма элементов массива с четными значениями = $count")
}

fun arrays_4()
{
    println("\nЗадание 4.")
    print("Введите размер массива: ")
    val masSize = enter_value().toInt()

    val array = (1..masSize).map { (-20..20).random() }.toMutableList()
    println("Массив рандомных целочисленных значений:")
    for(i in 0..masSize-1)
        print("${array[i]} ")

    var k: Int = 0

    for (i in 0..masSize-2)
    {
        for (j in 0..masSize-2)
        {
            if (array[j] > array[j + 1])
            {
                k = array[j + 1]
                array[j + 1] = array[j]
                array[j] = k
            }
        }
    }

    println("\nНаибольшее значение в массиве: ${array[masSize-1]}")
}

fun arrays_5()
{
    println("\nЗадание 5.")
    print("Введите размер массива: ")
    val masSize = enter_value().toInt()

    val array = (1..masSize).map { (-20..20).random() }.toMutableList()
    println("Массив рандомных целочисленных значений:")
    for(i in 0..masSize-1)
        print("${array[i]} ")


    var uniqueSet = mutableSetOf(0)
    uniqueSet.remove(0)

    var dictionary = mutableMapOf("key" to 1)
    dictionary.remove("key")

    var k: Int = 0
    var count: Int = 0

    for(i in 0..masSize-1)
    {
        k = array[i]

        if (array[i] !in uniqueSet)
        {
            uniqueSet.add(array[i])
        }
        else
        {
            for(j in 0..masSize-1)
            {
                if (array[j] == k)
                {
                    count += 1
                }
            }

            dictionary[array[i].toString()] = count
            count = 0
        }
    }

    if (dictionary.isEmpty())
    {
        println("\nВ массиве нет повторяющихся значений")
    }
    else
    {
        println("\nСтатистика:")
        for (i in dictionary.keys) {
            println("-- элемент $i встречается ${dictionary[i]} раз")
        }

        print("Наиболее часто встречающееся значение массива = ")
        uniqueSet.clear()

        for (i in dictionary.keys)
        {
            if (dictionary[i] == dictionary.values.max())
            {
                uniqueSet.add(i.toInt())
            }
        }

        println(uniqueSet.max())
    }
}

fun arrays_6()
{
    println("\nЗадание 6.")
    val array = arrayOf((1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() })

    println("Двумерный массив 10x10: ")
    for (i in 0..9)
    {
        for (j in 0..9)
        {
            print("${array[i][j]} ")
        }
        println()
    }

    println("Все числа по диагонали от [1][1] до [10][10]: ")
    for (i in array.indices)
    {
        print("${array[i][i]} ")
    }
}

fun arrays_7()
{
    println("\nЗадание 7.")
    val array = arrayOf((1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() },
        (1..10).map { (10..50).random() })

    println("Двумерный массив 10x10: ")
    for (i in 0..9)
    {
        for (j in 0..9)
        {
            print("${array[i][j]} ")
        }
        println()
    }

    println("Все числа по диагонали от [1][10] до [10][1]: ")
    var k: Int = 9

    for (i in 0..9)
    {
        print("${array[i][k]} ")
        k -= 1
    }
}

fun arrays_8()
{
    println("\nЗадание 8.")
    val array = arrayOf((1..5).map { (10..50).random() },
        (1..5).map { (10..50).random() },
        (1..5).map { (10..50).random() },
        (1..5).map { (10..50).random() },
        (1..5).map { (10..50).random() })

    println("Двумерный массив 5x5: ")
    for (i in 0..4)
    {
        for (j in 0..4)
        {
            print("${array[i][j]} ")
        }
        println()
    }

    var sum: Int = 0
    val sumArray = arrayOf(0, 0, 0, 0, 0)

    for (i in 0..4)
    {
        for (j in 0..4)
        {
            sum += array[j][i]
        }

        println("Сумма чисел в столбце ${i + 1} = $sum")
        sumArray[i] = sum
        sum = 0
    }

    println("Наибольшая сумма = ${sumArray.max()}")
}


fun main(args: Array<String>) {
    println("------УСЛОВНЫЕ ОПЕРАТОРЫ-----")
    operators_1()
    operators_2()
    operators_3()
    operators_4()
    operators_5()
    operators_6()
    operators_7()
    operators_8()

    println("------ЦИКЛЫ-----")
    cycles_1()
    cycles_2()
    cycles_3()
    cycles_4()
    cycles_5()

    println("------МАССИВЫ-----")
    arrays_1()
    arrays_2()
    arrays_3()
    arrays_4()
    arrays_5()
    arrays_6()
    arrays_7()
    arrays_8()
}