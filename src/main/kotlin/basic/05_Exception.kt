package basic

fun main() {
    Thread.sleep(1)


    try {
        Thread.sleep(1)
    } catch (e: Exception) {
        println("에러 발생!")
    }

    try {
        throw Exception()
    } catch (e: Exception) {
        println("에러 발생")
    } finally {
        println("finally 실행")
    }

    // kotlin에서는 try-catch가 표현식
    // 값 전달 가능
    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println("예외 발생!!")
    }
    println(a)

//    throw Exception("예외 발생!")

//    failFast("예외 발생!!")

//    val b: String? = "null이 아님"
    val b: String? = null
    val c: String = b ?: failFast("b is null")
    println(c.length)
}

fun failFast(message: String): Nothing {
    throw IllegalArgumentException(message);
}