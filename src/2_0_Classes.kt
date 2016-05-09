/**
 *
 */



class BasicClass

/** Primary constructor*/
open class ClassWithProperties(val p1: String, var p2: Int = 0) {
    open fun doSomething() {}
}

/** Classes are `final` by default*/
class AdvancedClass(p1: String) : ClassWithProperties(p1) {
    /** Secondary constructor ... must delegate to primary constructor*/
    constructor( p1: String, p2: Int, p3: Float) : this(p1)
    override fun doSomething() {}
}

class OutterClass(val p1: Int) {
    inner class InnerClass(val p1: Int) {
        fun getOutterP1(): Int = this@OutterClass.p1 // <-- this is how you reference outter-class props
        fun getInnerP1(): Int = p1 // <-- reference `this`.property
    }
    class NestedClass {
        fun getP1(): Int = p1 // <-- can't access outter class
    }
}

fun main(args: Array<String>) {

    val advancedClassInstance = AdvancedClass("James", 50, 0.8f)
    //advancedClassInstance.p1 = "Bad" // <-- immutable
    advancedClassInstance.p2 = 2

    var o = OutterClass(1)
    var nested = OutterClass.NestedClass()
}