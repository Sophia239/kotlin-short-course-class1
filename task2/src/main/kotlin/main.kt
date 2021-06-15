/**
 * возвращает наименьшее из трёх заданных чисел
 */
fun min3(a: Int, b: Int, c: Int): Int {
    return if (a <= b && a <= c)
        a;
    else if (b <= a && b <= c)
        b
    else
        c
}

fun main() {
    println(min3(2, 0, 3))
}