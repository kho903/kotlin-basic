package advanced


fun main() {
    // apply는 DatabaseClient 그대로 반환
    // run 에서는 마지막에 호출한 connect의 반환타입인 boolean 반환
    val client: DatabaseClient = DatabaseClient().apply {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
//        connect()
    }
    println(client)

    val connect = client.connect()
    println(connect)

    client.connect().run { println(this) }

    DatabaseClient().apply {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
    }.connect().run { println(this) }
}