import com.intellij.icons.AllIcons
import com.intellij.ide.highlighter.JavaFileType
import com.intellij.openapi.util.IconLoader
import com.intellij.util.Icons
import com.intellij.util.Icons.JAR_ICON
import org.junit.Ignore
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import javax.swing.Icon

internal class CobolFileTypeTest {

    @Disabled
    @Test
    fun shouldGetIcon() {
        val expectedIcon = JAR_ICON
        assertEquals(expectedIcon, CobolFileType().icon)
    }

    @Disabled
    @Test
    fun getName() {
    }

    @Disabled
    @Test
    fun getDefaultExtension() {
    }

    @Disabled
    @Test
    fun getDescription() {
    }
}