package collections

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class CollectionMethodsTest {

    private lateinit var list: List<Int>
    private lateinit var elementNullableList: List<Int?>

    @BeforeEach
    internal fun setUp() {
        this.list = mutableListOf(0, 1, 2, 3, 4, 5)
        this.elementNullableList = mutableListOf(0, 1, 2, null, 3, 4, null)
    }

    @Test
    fun sliceTest() {
        this.list.slice(1..2).also { assertEquals(listOf(1, 2), it) }
        this.list.slice(0..4 step 2).also { assertEquals(listOf(0, 2, 4), it) }
        this.list.slice(setOf(2, 4)).also { assertEquals(listOf(2, 4), it) }
    }

    @Test
    fun filterNotNullTest() {
        this.elementNullableList.filterNotNull().also {
            println(it)
            assertEquals(listOf(0, 1, 2, 3, 4), it)
        }
    }
}