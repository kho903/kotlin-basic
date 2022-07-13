open class Dog {
    open var age: Int = 0

    open fun bark() {
        println("멍멍")
    }
}

open class Bulldog(
    override var age: Int = 0
) : Dog() {

    // override 된 것은 자동으로 open
    // 한번더 override를 막으려면 final 키워드를 사용해야 된다.
    final override fun bark() {
        super.bark()
//        println("컹컹")
    }
}

class ChildBulldog : Bulldog() {
    override var age: Int = 0

    // final 이므로 override 불가
    /*override fun bark() {
        super.bark()
    }*/
}

abstract class Developer {

    abstract var age: Int
    abstract fun code(language: String)
}

class BackendDeveloper(
    override var age: Int
) : Developer() {

    override fun code(language: String) {
        println("I code with $language")
    }
}

fun main() {
    /*val dog = Bulldog(age = 2)
    println(dog.age)
    dog.bark()*/

    val backendDeveloper = BackendDeveloper(age = 27);
    println(backendDeveloper.age)
    backendDeveloper.code("Kotlin")

}
