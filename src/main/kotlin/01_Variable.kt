var x = 5 // 탑레벨에 위치한 변수 (클래스나 함수에 속하지 않음)

fun main() {
    x += 1
    println(x)

    val a : Int = 1

    val b = 1

    // 지연 할당 (타입을 필수로 명시해야 함
    val c : Int
    c = 3

    val d : Int
    d = 123

    // val : value      : 자바의 final 키워드처럼 read-only, 재할당 불가
    // var : variable   : 가변 변수, 재할당 가능

    // 컴파일 에러
//    val e : String = "Hello"
//    e = "World"

    // var이어도 타입을 변경할 수는 없다.
//    var f = 123
//    f = "hi"
}