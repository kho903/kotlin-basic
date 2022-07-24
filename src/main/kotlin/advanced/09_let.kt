package advanced

/*
스코프 함수란
- 코틀린의 표준 라이브러리에는 객체의 컨텍스트 내에서 코드 블록을 실행하기
  위해서만 존재하는 몇가지 함수가 포함되어 있는데 이를 스코프함수라 부른다.
- 스코프 함수를 제대로 사용하면 불필요한 변수 선언이 없어지며
  코드를 더 간결하고 읽기 쉽게 만든다.
- 스코프 함수의 코드 블록 내부에서는 변수명을 사용하지 않고도 객체에 접근할 수
  있는데 그 이유는 수신자 객체에 접근할 수 있기 때문이다.
- 수신자 객체는 람다식 내부에서 사용할 수 있는 객체의 참조이다.
- 스코프 함수를 사용하면 수신자 객체에 대한 참조로 `this` 또는 `it`을 사용한다.
 */

fun main() {
//    val str: String? = null
    val str: String? = "안녕"

    val result = str?.let {
        println(it)
        val abc: String? = "abc"
        /*abc?.let {
            val def : String? = "def"
            def?.let {
                println("abcdef가 null이 아님")
            }
        }*/
        // depth가 깊을 때 가독성 면에서 좋지 않기 때문에 if-else 문이 나을수 있음
        val def : String? = "def"
        if (!abc.isNullOrEmpty() && !def.isNullOrEmpty()) {
            println("abcdef가 null이 아님")
        }
        1234
    }

    println(result) // 1234

//    val this: String? = null // 키워드이므로 변수명 사용 불가
//    val it: String? = null // 소프트 키워드로 변수명 사용 가능

    val hello = "hello"
    val hi = "hi"

    // 중첩된 let 안에서 it을 쓰는 것 보다는
    // 변수를 따로 선언해서 사용하는 것이 가독성 면에서 좋음
    // 또한 밖의 변수를 중첩된 let에서도 사용가능해짐
    hello.let {a: String ->
//        println(it.length)
        println(a.length)

        hi.let {b ->
//            println(it.length)
            println(b.length)
            println(a.length)
        }
    }

}