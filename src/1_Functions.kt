/**
 *
 */
fun main(args: Array<String>) {
    234.show()
    println( "${5.add(4).takeaway(1) mltply 3 }" )
    saveUser("James", age = 30, lastName = "Bond")
    savePersonalInfo("James", "Bond", 30, hobbies = *arrayOf("Gold", "fishing", "Gaming"))

}

/** Single-expression function */
fun someHobbies() = arrayOf("Golf", "Cars", "Martinis")


/** Optional arguments & Named arguments*/
fun saveUser(firstName: String, lastName: String, age: Int, title: String? = "Dr") {
    println("$title $firstName $lastName $age")
}

/**
 * Variable arguments
 * PS don't forget '*'prefix on array
 */
fun savePersonalInfo(firstName: String, lastName: String, age: Int, title: String? = "Dr", vararg hobbies: String) {
    saveUser(firstName, lastName, age, title)
    for (h in hobbies) {
        print("$h,")
    }
}

/**
 * Function type => function signature -> function return-type
 * e.g
 * () -> Unit
 * (String) -> Boolean
 * (Int, Int) -> Int
 */

/** Function Literals */
val sum = fun (a: Int, b: Int): Int { return a + b }
val multiply: (Int, Int) -> Int = { a,b -> a*b }
val whaaaaat: (Int, Int) -> (Int) -> Unit = { a,b -> { c -> println("${a+b+b}") } }

/** Higher-order functions*/
fun calculate( a: Int, b: Int, op: (a: Int, b: Int) -> Int ): Int = op(a, b)
fun curryingSum( a: Int, b: Int ): Int {
    return calculate(a, b) { a,b -> a+b }
}

/** Extension functions*/
fun Int.show() { println("Show me $this") }

/** Extension function expression */
val add:  Int.( num: Int ) -> Int = { i -> this + i }
val takeaway: Int.( num: Int ) -> Int = { i -> this - i }

infix fun Int.mltply (i: Int) : Int = this * i