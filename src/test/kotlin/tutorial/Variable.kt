package tutorial

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class VariableTest {

    @Test
    @DisplayName("simple variable test")
    fun simpleVariableTest() {
        val a = 1
        Assertions.assertEquals(1, a)
    }

}