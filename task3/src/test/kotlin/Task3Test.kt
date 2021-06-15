import kotlin.math.PI
import kotlin.test.Test
import kotlin.test.assertEquals

class Task3Test {
    @Test
    fun deg2RadTest1() {
        assertEquals(PI, deg2rad(180.0), 1e-5)
        assertEquals(PI, deg2rad(2*360 + 180.0), 1e-5)
    }

    @Test
    fun rad2DegTest1() {
        assertEquals(180.0, rad2deg(PI), 1e-5)
        assertEquals(360.0, rad2deg(2 * PI), 1e-5)
    }

    @Test
    fun moreTests() {
        assertEquals(0.0, deg2rad(0.0), 1e-5)
        assertEquals(0.5 * PI, deg2rad(90.0), 1e-5)
        assertEquals(PI, deg2rad(180.0), 1e-5)
        assertEquals(PI, deg2rad(4*360 + 180.0), 1e-5)
        assertEquals(- PI / 6, deg2rad(- 30.0), 1e-5)
        assertEquals(0.0, rad2deg(0.0), 1e-5)
        assertEquals(90.0, rad2deg(0.5 * PI), 1e-5)
        assertEquals(180.0, rad2deg(PI), 1e-5)
        assertEquals(30.0, rad2deg(PI / 6), 1e-5)
        assertEquals(-180.0, rad2deg(-PI), 1e-5)
    }
}