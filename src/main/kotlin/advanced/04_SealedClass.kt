package advanced

// Sealed 클래스의 하위 클래스들은 같은 모듈 / 패키지 내에서만 정의 가는
/*abstract*/ sealed class Developer {
    abstract val name: String
    abstract fun code(language: String)
}

data class BackendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("저는 백엔드 개발자입니다. ${language}를 사용합니다.")
    }
}

data class FrontendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("저는 프론트엔드 개발자입니다. ${language}를 사용합니다.")
    }
}

object OtherDeveloper : Developer() {
    override val name: String = "익명"

    override fun code(language: String) {
        TODO("Not yet implemented")
    }

}

data class AndroidDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("저는 안드로이드 개발자입니다. ${language}를 사용합니다.")
    }
}

data class IosDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("저는 안드로이드 개발자입니다. ${language}를 사용합니다.")
    }
}

object DeveloperPool {
    val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when(developer) {
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontendDeveloper -> pool[developer.name] = developer
        is AndroidDeveloper -> pool[developer.name] = developer
        is IosDeveloper -> pool[developer.name] = developer
        is OtherDeveloper -> println("지원하지 않는 개발자 종류입니다.")
        // Sealed 클래스에서는 else가 없어도 된다.
//        else -> {
//            println("지원하지 않는 개발자입니다.")
//        }
    }

    fun get(name: String) = pool[name]
}

fun main() {
    val backendDeveloper = BackendDeveloper(name = "김지훈")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = FrontendDeveloper(name = "토니")
    DeveloperPool.add(frontendDeveloper)

    val androidDeveloper = AndroidDeveloper(name = "코틀린")
    DeveloperPool.add(androidDeveloper)

    println(DeveloperPool.get("김지훈"))
    println(DeveloperPool.get("토니"))
    println(DeveloperPool.get("코틀린"))
}
