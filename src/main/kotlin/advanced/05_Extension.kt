package advanced

fun String.first(): Char {
    return this[0]
}

fun String.addFirst(char: Char): String {
    return char + this.substring(0)
}

class MyExample {
    fun printMessage() = println("클래스 출력")
}

//fun MyExample.printMessage() = println("확장 출력")
fun MyExample.printMessage(message: String) = println(message)

fun MyExample?.printNullOrNotNull() {
    if (this == null) println("널인 경우에만 출력")
    else println("널이 아닌 경우에만 출력")
}

fun main() {
    println("ABCD".first())

    println("ABCD".addFirst('Z'))

    MyExample().printMessage() // 클래스 출력
    MyExample().printMessage("확장 출력")

    var myExample: MyExample? = null
    myExample.printNullOrNotNull() // 메소드 내에서 null에 대한 처리를 하기 떄문에 ? 없이 사용 가능

    myExample = MyExample()
    myExample.printNullOrNotNull()
}
