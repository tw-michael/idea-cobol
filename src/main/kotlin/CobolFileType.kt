import com.intellij.lang.java.JavaLanguage
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.util.Icons
import javax.swing.Icon

class CobolFileType : LanguageFileType(JavaLanguage.INSTANCE) {
    companion object {
        val INSTANCE = CobolFileType()
    }
    override fun getIcon(): Icon? = null

    override fun getName(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDefaultExtension(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDescription(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
