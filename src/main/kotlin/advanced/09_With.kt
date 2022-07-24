package advanced

fun main() {
    val str = "안녕하세요"

    /*with(str) {
        println("length= $length")
    }*/

    val length = with(str) {
        length
    }
    println(length)
}
