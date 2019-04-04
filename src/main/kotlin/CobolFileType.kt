import com.intellij.lang.java.JavaLanguage
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.util.Icons
import javax.swing.Icon

class CobolFileType : LanguageFileType(CobolLanguage.INSTANCE) {
    companion object {
        val INSTANCE = CobolFileType()
    }
    override fun getIcon(): Icon? = COBOL

    override fun getName() = "Cobol"

    override fun getDefaultExtension() = "cbl"

    override fun getDescription() = ""

}
