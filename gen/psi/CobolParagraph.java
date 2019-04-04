// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolParagraph extends PsiElement {

  @Nullable
  CobolAlteredGoto getAlteredGoto();

  @Nullable
  CobolExitStatement getExitStatement();

  @NotNull
  CobolParagraphName getParagraphName();

  @NotNull
  List<CobolSentence> getSentenceList();

}
