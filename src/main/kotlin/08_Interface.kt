class Product(val name: String, val price: Int)

interface Wheel {
    fun roll()
}

interface Cart : Wheel {

    var coin: Int

    val weight: String
        get() = "20KG"

    fun add(product: Product)

    fun rent() {
        if (coin > 0) {
            println("카트를 대여합니다.")
        }
    }

    override fun roll() {
        if (coin > 0)
            println("카트가 굴러갑니다.")
    }

    fun printId() = println("1234")
}

interface Order {
    // 같은 이름의 메소드가 있을 때, super<Order>.add() 와 같이 사용
    fun add(product: Product) {
        println("${product.name} 주문이 완료되었습니다.")
    }

    fun printId() = println("5678")
}

// 2가지 이상의 인터페이스 구현 가능
class MyCart(override var coin: Int) : Cart, Order {

    override fun add(product: Product) {
        if (coin <= 0) println("코인을 넣어주세요")
        else println("${product.name}이(가) 카트에 추가되었습니다.")

        // 주문하기
        super<Order>.add(product)
    }

    override fun printId() {
        super<Cart>.printId()
        super<Order>.printId()
    }
}

fun main() {
    val cart = MyCart(coin = 100)
//    val cart = MyCart(coin = 0)
    cart.rent()
    cart.roll()
    cart.add(Product(name = "장난감", price = 1000))
    cart.printId()
}