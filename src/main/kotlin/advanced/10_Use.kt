package advanced

import java.io.FileWriter

fun main() {
    FileWriter("test_kotlin.txt")
        .use {
            it.write("Hello Kotlin")
        }
}