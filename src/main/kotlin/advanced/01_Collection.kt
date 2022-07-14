package advanced

import java.util.LinkedList
import java.util.stream.Collectors

fun main() {

    // immutable
    val currencyList = listOf("달러", "유로", "원")

    // mutable
    val mutableCurrencyList = mutableListOf<String>()
    mutableCurrencyList.add("달러")
    mutableCurrencyList.add("유로")
    mutableCurrencyList.add("원")

    val mutableCurrencyList2 = mutableListOf<String>().apply {
        add("달러")
        add("유로")
        add("원")
    }

    // immutable set
    val numberSet = setOf(1, 2, 3, 4)

    // mutable set
    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2)

    // mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1 // 추천
    mutableNumberMap.put("two", 2) // 권장 X
    mutableNumberMap["three"] = 3

    // 컬렉션 빌더는 내부에선 mutable 반환은 immutable
    val numberList/*: List<Int>*/ = buildList {
        add(1)
        add(2)
        add(3)
    }

    // linkedList
    val linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(1)
    }

    // arrayList
    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator = currencyList.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    println("===============")
    for (currency in currencyList) {
        println(currency)
    }

    println("===============")
    currencyList.forEach {
        println(it)
    }

    // for loop -> map
    println("===============")
    val lowerList = listOf("a", "b", "c")
    // for
    /*val upperList = mutableListOf<String>()
    for (lowerCase in lowerList) {
        upperList.add(lowerCase.uppercase())
    }*/
    // map
    val upperList = lowerList.map { it.uppercase() }
    println(upperList)

    // filter
    println("===============")
    /*val filteredList = mutableListOf<String>()
    for (upperCase in upperList) {
        if (upperCase == "A" || upperCase == "C") {
            filteredList.add(upperCase)
        }
    }*/
    val filteredList = upperList.filter { it == "A" || it == "C" }
    println(filteredList)

    // filter java8
    val filteredListJava = upperList.stream()
        .filter { it == "A" || it == "C" }
        .collect(Collectors.toList())
    println(filteredListJava)

    // java8과 비슷한 kotlin
    val filteredListKotlin = upperList
        .asSequence()
        .filter { it == "A" || it == "C" }
        .filter { it == "C" }
        .filter { it == "C" }
        .toList()
    println(filteredListKotlin)
}