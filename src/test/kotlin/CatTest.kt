import kotlin.test.Test
import kotlin.test.assertEquals

class CatTest {

    @Test fun catGoesMeow() {
        val cat = Cat()
        assertEquals(cat.meow(), "Meow")
    }
}