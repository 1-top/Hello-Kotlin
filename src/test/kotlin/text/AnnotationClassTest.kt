package text

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.text.Annotation

class AnnotationClassTest {

    @Test
    fun test() {
        val annotation = Annotation("value1")
        assertEquals("value1", annotation.value)
    }

}