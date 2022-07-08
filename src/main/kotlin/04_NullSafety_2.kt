fun getNullStr(): String? = null

fun getLengthIfNotNull(str: String?) = str?.length ?: 0

fun main() {

    val nullableStr = getNullStr()

//    val nullableStrLength = nullableStr.length // 컴파일 에러
    val nullableStrLength = nullableStr?.length ?: "null인 경우 반환"
    println(nullableStrLength)

    val length = getLengthIfNotNull(null)
    println(length)

    // NPE 발생 코드
//    throw NullPointerException()

//    val c: String? = null
//    val d = c!!.length // NPE

    // kotlin에서 java 코드를 호출 할 때에는 항상 nullable에 대한 가능성을 염두해 두어야 함
//    println(Java_NullSafety.getNullStr().length) // NPE
    println(Java_NullSafety.getNullStr()?.length ?: 0)
}