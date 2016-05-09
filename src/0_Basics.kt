/**
 * Why?
 * - Concise
 * - Safe
 * - Versatile
 * - Interoperable
 * - Tooling
 */
fun main(args: Array<String>) {
    val someImmutable: Float = 1.0f
    val anotherImmuatable = 2
    val array: Array<String>? = null //<-- uninitialised

    var someMutable: Boolean = true

    array?.size

    println("Hello World ${someImmutable + anotherImmuatable}")  //String templates and expressions

}