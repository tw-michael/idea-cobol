import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.LanguageFileType
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.ArgumentCaptor
import org.mockito.Mockito
import org.mockito.Mockito.*

class CobolFileTypeFactoryTest {
    @Test
    internal fun shouldConsumeCobolFileType() {
        // given
        val fileTypeConsumerMock = mock(FileTypeConsumer::class.java)
        CobolFileTypeFactory().createFileTypes(fileTypeConsumerMock)

        val cobolFileTypeArgumentCaptor = ArgumentCaptor.forClass(CobolFileType::class.java)

        // when / then
        Mockito.verify(fileTypeConsumerMock).consume(cobolFileTypeArgumentCaptor.capture())

        // and then
        assertEquals(cobolFileTypeArgumentCaptor.value.language, CobolLanguage.INSTANCE)
    }
}