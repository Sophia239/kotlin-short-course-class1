/*
Напечатайте рамку размера width x height, состоящую из символов frameChar.
Можно считать, что width>=2, height>=2
Например, вызов printFrame(5,3,'+') должен напечатать следующее:

+++++
+   +
+++++

В решении удобно воспользоваться циклом repeat. Например, следующий код печатает числа от 1 до 10:

    repeat(10) {
        println(it + 1)
    }

 */

fun printFrame(width: Int, height: Int, frameChar: Char = '*') {
    repeat(height) {
        if (it == 0 || it == height - 1){
            repeat(width) {
                print(frameChar)
            }
        }
        else {
            repeat(width) {
                if (it == 0 || it == width - 1)
                    print(frameChar)
                else
                    print(" ")
            }
        }
        println()
    }
}

fun main() {
    printFrame(5,3,'+')
}