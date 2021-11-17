import kotlin.test.Test
import kotlin.test.assertEquals

class CatTest {

    @Test fun `Cat goes Meow`() {
        val cat = Cat()
        assertEquals(cat.meow(), "Meow")
    }
}