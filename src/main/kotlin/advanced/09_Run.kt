package advanced

class DatabaseClient {
    var url: String? = null
    var username: String? = null
    var password: String? = null

    // DB에 접속하고 Boolean 결과를 반환
    fun connect(): Boolean {
        println("DB 접속중 ...")
        Thread.sleep(1000)
        println("DB 접속 완료")
        return true;
    }
}

fun main() {
    /*val config = DatabaseClient()
    config.url = "localhost:3306"
    config.username = "mysql"
    config.password = "1234"
    val connected = config.connect()*/

    val connected = DatabaseClient().run {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
        connect()
    }
    // let으로 변경 가능
    // 하지만, it이 반복되므로 run을 사용하는 것이 더 적절
    /*val connected = DatabaseClient().let {
        it.url = "localhost:3306"
        it.username = "mysql"
        it.password = "1234"
        it.connect()
    }*/
    println(connected)

    // run과 with는 비슷
    // with로 바꾼 코드
    val result = with(DatabaseClient()) {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
        connect()
    }
    println(result)
}