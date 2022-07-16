package advanced

class HelloBot {

    // LazyThreadSafetyMode.SYNCHRONIZED - 디폴트
    // LazyThreadSafetyMode.NONE
    // LazyThreadSafetyMode.PUBLICATIOn
    val greeting: String by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        println("초기화 로직 수행")
        getHello()
    }

    fun sayHello() = println(greeting)
}

fun getHello() = "안녕하세요"

fun main() {
    val helloBot = HelloBot()

    // ...
    // ...

    for (i in 1..5) {
        Thread {
            helloBot.sayHello()
        }.start()
    }
}