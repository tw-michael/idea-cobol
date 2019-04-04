// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolInspectStatement extends PsiElement {

  @Nullable
  CobolConvertingPhrase getConvertingPhrase();

  @NotNull
  CobolQualifiedDataName getQualifiedDataName();

  @Nullable
  CobolReplacingPhrase getReplacingPhrase();

  @Nullable
  CobolTallyingPhrase getTallyingPhrase();

}
