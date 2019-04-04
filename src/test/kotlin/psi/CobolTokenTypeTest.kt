package psi

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CobolTokenTypeTest {

    @Test
    fun shouldReturnCobolSpecificTokenTypeString() {
        val debugName = "CobolTokenTypeDebugName"
        assertEquals("CobolTokenType.$debugName", CobolTokenType(debugName).toString())
    }
}