import kotlin.test.Test
import kotlin.test.assertEquals

class Task2Test {
    @Test
    fun min3Test1() {
        assertEquals(0, min3(0, 0, 3))
    }

    @Test
    fun min3Test2() {
        assertEquals(-2, min3(-2, 5, 3))
    }

    @Test
    fun min3Test3() {
        assertEquals(2, min3(2, 2, 2))
    }

    @Test
    fun min3Test4() {
        assertEquals(3552, min3(20000, 123456, 3552))
    }

    @Test
    fun min3Test5() {
        assertEquals(-6, min3(-2, -6, -3))
    }

}