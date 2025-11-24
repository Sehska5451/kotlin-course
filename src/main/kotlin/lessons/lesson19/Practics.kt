package main.kotlin.lessons.lesson19

class Container<A>(private val arg: A) {
    fun getA(): A {
        return arg
    }
}

class Pairbox<A, B>(val arg1: A, val arg2: B) {
    fun getMap(): Map<A, B> {
        return mapOf(arg1 to arg2)
    }
}

class Multiplier<A: Number>() {
    fun multiply(arg1: A): Double {
        return arg1.toDouble() * 2
    }
}

interface Storage<F> {
    fun save(arg: F)
    fun getBack(): F
}

interface Transformer<A, B> {
    fun transform(arg: A): B
}

interface PairProcessor<A, B> {
    fun action(arg1: A, arg2: B)
}

interface ConnectionDifferent<A, B, C> {
    fun connect(arg1: List<A>, arg2: List<B>): List<C>
}

fun <F> swap(arg1: MutableList<F>, ind1: Int, ind2: Int): List<F> {
    if (ind1 in arg1.indices && ind2 in arg1.indices) {

    }
}