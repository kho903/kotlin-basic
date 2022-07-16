package advanced

class MyGenerics<out T>(val t: T) {

}

class Bag<T> {

    fun saveAll(
        to: MutableList<in T>,
        from: MutableList<T>
    ) {
        to.addAll(from)
    }
}


fun main() {
    // 제네릭을 사용한 클래스의 인스턴스를 만드려면 타입 아규먼트를 제공
//    val generics = MyGenerics<String>("테스트")
    // <String> 생략 가능
    val generics = MyGenerics("테스트")

    // 변수의 타입에 제네릭을 사용한 경우
    val list1: MutableList<String> = mutableListOf();
    // 타입 아규먼트를 생성자에서 추가
    val list2 = mutableListOf<String>()

    val list3: List<*> = listOf<String>("테스트")
    val list4: List<*> = listOf(1, 2, 3, 4)

    // 변성 : 제네릭에서 파라미터화된 타입이 서로 어떤 관계인지 설명하는 개념
    // PECS (Producer-Extends, Consumer-Super)
    // 공변성은 자바 제네릭의 extends 코틀린에선 out
    val charGenerics: MyGenerics<CharSequence> = generics

    // 반공변성
    // 반공변성은 자바 제네릭의 super 코틀린에선 in
    val bag = Bag<String>()
    bag.saveAll(mutableListOf<CharSequence>("1", "2"), mutableListOf<String>("3", "4"))
}
