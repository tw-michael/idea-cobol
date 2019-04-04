import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.LanguageFileType
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.Mockito.*

class CobolFileTypeFactoryTest {
    @Test
    internal fun shouldConsumeCobolFileType() {
        val fileTypeConsumerMock = mock(FileTypeConsumer::class.java)
        CobolFileTypeFactory().createFileTypes(fileTypeConsumerMock)
        Mockito.verify(fileTypeConsumerMock).consume(Mockito.any(CobolFileType::class.java))
    }
}