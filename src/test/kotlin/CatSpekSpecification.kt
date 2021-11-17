import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals

object CatSpec: Spek({

	describe("A cat") {
		val cat = Cat()
		it ("can meow") {
			assertEquals(cat.meow(), "Meow")
		}
	}
})