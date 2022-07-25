package advanced

fun getStr(): Nothing = throw Exception("예외 발생 기본 값으로 초기화")

fun main() {
    /*val result = try {
        getStr()
    } catch (e: Exception) {
        println(e.message)
        "기본값"
    }*/

    /*val result = runCatching { getStr() }.getOrElse {
        println(it.message)
        "기본값"
    }
    println(result)*/

    /*val result2 = runCatching {
//        getStr()
        "성공"
    }.getOrNull()
    println(result2)*/

    /*val result: Throwable? = runCatching { getStr() }
        .exceptionOrNull()

    result?.let {
        println(it.message)
        throw it
    }*/

    /*val result = runCatching { getStr() }
        .getOrDefault("기본 값")
    println(result)*/

    /*val result = runCatching { getStr() }
        .getOrElse {
            println(it.message)
            "기본 값"
        }
    println(result)*/

    /*val result: *//*Nothing*//* String = runCatching {
//        getStr() :
        "성공"
    }.getOrThrow()
    println(result)*/

    /*val result: String = runCatching { "안녕" }
        .map {
            "${it}하세요"
        }.getOrThrow()
    println(result)*/

    /*val result = runCatching { "안녕" }
        *//*.map {
            throw Exception("예외")
        }*//*
        // map 내의 예외는 잡지 못함
        // mapCatching 사용
        .mapCatching { throw Exception("예외") }
        .getOrDefault("기본 값")
    println(result)*/

    /*val result = runCatching { getStr()}
        .recover { "복구" }.getOrNull()
    println(result)*/

    val result = runCatching { getStr() }
        .recoverCatching {
            throw Exception("예외")
        }.getOrDefault("복구")
    println(result)
}


// 예외 발생 기본 값으로 초기화
// 기본값
