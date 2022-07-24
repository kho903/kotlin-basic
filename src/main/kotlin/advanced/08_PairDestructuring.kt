package advanced
// 튜플
// f((1, 3)) = 1 + 3 = 4
// f(1, 3) = 1 + 3 = 4
//data class Tuple(val a: Int, val b: Int)
//fun plus(a: Int, b: Int) = a + b
//fun plus(tuple: Tuple) = tuple.a + tuple.b

// 값이 2개일 때에는 직접 Tuple을 만들지 않아도
// 코틀린에서 pair를 제공해준다.
fun plus(pair: Pair<Int, Int>) = pair.first + pair.second

fun main() {
//    println(plus(1, 3))
//    val result = plus(Tuple(1, 3))
//    println(result)

    // Pair는 불변
    val pair = Pair("A", 1)
//    pair.first = "B"
    val newPair = pair.copy(first = "B")
    println(newPair)

    val second = newPair.component2(); // second 값
    println(second)

    val list = newPair.toList()
    println(list)

    val triple = Triple("A", "B", "C")
    println(triple)
    println(triple.first)
    println(triple.second)
    println(triple.third)

    val newTriple = triple.copy(third = "D")
    println(newTriple)
    println(newTriple.component3())

    // 구조 분해 할당
//    val (a, b, c) = newTriple
    val (a: String, b: String, c: String) = newTriple
    println("$a $b $c")

    val list3: List<String> = newTriple.toList()
    val (a1, a2, a3) = list3
    println("$a1 $a2 $a3")

    // 1 ~ 5 까지 제공
    list3.component1()
    list3.component2()
    list3.component3()
//    list3.component4()
//    list3.component5()

    // Pair로 치환 가능
//    val map = mutableMapOf("김지훈" to "개발자")
    val map = mutableMapOf(Pair("김지훈", "개발자"))
    for ((key, value) in map) {
        println("${key}의 직업은 $value")
    }
}