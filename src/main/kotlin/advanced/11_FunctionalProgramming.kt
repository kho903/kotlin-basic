package advanced

import java.util.StringJoiner

fun main() {
//    val list = mutableListOf(printHello)
//    list[0]()
//
//    val func: () -> Unit = list[0]
//    func()

//    call(printHello)


//    val list = mutableListOf(printNo)
//    val func = printNo
//    call(printNo)


//    val result: Int = plus(1, 3)
//    println(result)
//    val result2: Int = plus2(1, 2, 3)
//    println(result2)

//    val list = listOf("a", "b", "c")
//    val printStr : (String) -> Unit = { println(it) }
//    forEachStr(list, printStr)
//
//    forEachStr(list) {
//        println(it)
//    }
//
//    list.forEach {
//        println(it)
//    }
//
//    val filter = list.filter {
//        it == "a"
//    }
//    println(filter)
//
//    list.forEach(printStr)
//
//    val upperCase : (String) -> String = {it.uppercase()}
//    println(list.map(upperCase))

//    outerFunc()()
//
//    val func = outerFunc()
//    func()


    arg1 {
        it.length
        it.first()
    }

    // 인자가 2개 이상일 때에는 it 사용 불가
    arg2 { a: String, b: String ->
        a.length
        b.first()
    }

//    val callReference: () -> Unit = { printHello() }
//    callReference()

//    val callReference = ::printHello
//    callReference()()

    val numberList = listOf("1", "2", "3")
    numberList.map {it.toInt()}.forEach {println(it)}
    numberList.map(String::toInt).forEach(::println)
}

//val func : () -> Unit = {}
val printHello: () -> Unit = { println("Hello") }

// 함수를 인자로 받아 실행하는 함수
fun call(block: () -> Unit) {
    block()
}

fun printNo() = println("NO!")

val printMessage: (String) -> Unit = { message: String -> println(message) }
//val printMessage2: (String) -> Unit = { message -> println(message) }
//val printMessage3: (String) -> Unit = { println(it) }

val plus: (Int, Int) -> Int = { a, b -> a + b }
val plus2: (Int, Int, Int) -> Int = { a, b, c -> a + b + c }

// 고차함수
fun forEachStr(collection: Collection<String>, action: (String) -> Unit) {
    for (item in collection) {
        action(item)
    }
}

// 익명함수
// 이름 없는 함수
/*fun outerFunc() : () -> Unit {
    return fun() {
        println("이것은 익명 함수!")
    }

    // 람다식으로 변경
    return { println("이것은 익명 함수!") }
}*/

// 람다로 더 간결히
fun outerFunc() : () -> Unit = { println("이것은 익명 함수!") }

// 람다 표현식의 전체 식
val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

// 최대한 생략한 람다 식
val sum2 = { x: Int, y: Int -> x + y }


fun arg1(block: (String) -> Unit) {}
fun arg2(block: (String, String) -> Unit) {}
