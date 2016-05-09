/**
 *
 */


class MyClass(val p1: Int, var p2: Int) {

    // override property getter/setter
    var p3: Int = 0 // <-- initialise backing field
        get() = 100
        set(value) {
            field = value // <-- example of a backing field
        }
}

class YourTestCase {
    var p1: String? = null // <---not cool

    lateinit var p2: String


    @Before fun doBefore() {
        p2 = "Hello, World"
    }

    @After fun doAfter() {
        p2.orEmpty()
    }


}