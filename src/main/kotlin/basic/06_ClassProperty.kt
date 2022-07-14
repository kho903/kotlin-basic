package basic

//class Coffee constructor(val name: String) {
//
//}

// constructor 생략 가능
class Coffee(val name: String) {

}

class Coffee2(
    val name: String,
    val price: Int,
    val brand: String,
    ) {

}

class Coffee3(
    var name: String = "",
    var price: Int = 0,
    var iced : Boolean = false,
) {

    val brand: String
        get() = "스타벅스"

    var quantity : Int = 0
        set(value) {
            if (value > 0) { // 수량이 0 보다 큰 경우에만 할당
                field = value // field : 식별자
//                quantity = value // 직접 할당할 경우 StackOverflow
            }
        }
}

class EmptyClass

fun main() {

    val coffee = Coffee3();
    coffee.name = "아이스 아메리카노"
    coffee.price = 2000
    coffee.quantity = 1
    coffee.iced = true

    if (coffee.iced) {
        println("아이스 커피")
    }
    println("${coffee.brand} ${coffee.name} 가격은 ${coffee.price} 수량은 ${coffee.quantity}")
}
