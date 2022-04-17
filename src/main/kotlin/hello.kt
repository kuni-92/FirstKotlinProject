fun main() {
    println("Hello, World")
    val result = sum(1, 2)
    println(result)
    println(greet("Tom"))
}

fun sum(a: Int, b:Int) = a + b

fun greet(name: String) :String {
    return "Hello, $name"
}
