package advanced

class `07_LateInit` {

    lateinit var text: String

    fun printText() {
/*//        println(text) // UninitializedPropertyAccessException
        text = "안녕하세요"
        println(text)*/

        if (this::text.isInitialized) {
            println("초기화됨")
        } else {
            text = "안녕하세요"
        }
        println(text)
    }
}

fun main() {
    val test = `07_LateInit`()
    test.text = "하이"
//    test.text.isInitialized // 불가
    test.printText()
}
