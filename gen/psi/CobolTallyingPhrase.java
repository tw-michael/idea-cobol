// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolTallyingPhrase extends PsiElement {

  @NotNull
  List<CobolBeforeAfterPhrase> getBeforeAfterPhraseList();

  @NotNull
  List<CobolIdentifier> getIdentifierList();

  @NotNull
  List<CobolLiteral> getLiteralList();

  @Nullable
  CobolReplacingPhrase getReplacingPhrase();

}
