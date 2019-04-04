import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CobolFileTypeTest {

    @Test
    fun shouldGetIcon() {
        val expectedIcon = COBOL
        assertEquals(expectedIcon, CobolFileType.INSTANCE.icon)
    }

    @Test
    fun getName() {
        assertEquals("Cobol", CobolFileType.INSTANCE.name)
    }

    @Test
    fun getDefaultExtension() {
        assertEquals("cbl", CobolFileType.INSTANCE.defaultExtension)
    }

    @Test
    fun getDescription() {
        assertEquals("", CobolFileType.INSTANCE.description)
    }
}