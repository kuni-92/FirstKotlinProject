import main.kotlin.Rectangle

fun main() {
    println("Hello, World")
    val result = sum(1, 2)
    println(result)
    println(greet("Tom"))

    // Use class
    var rect = Rectangle(10,20)
    println("Height: ${rect.height}")
    println("Width : ${rect.width}")
    println("Area  : ${rect.area}")
}

fun sum(a: Int, b:Int) = a + b

fun greet(name: String) :String {
    return "Hello, $name"
}
