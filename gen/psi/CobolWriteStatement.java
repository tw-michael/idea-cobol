// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolWriteStatement extends PsiElement {

  @Nullable
  CobolAdvancingPhrase getAdvancingPhrase();

  @Nullable
  CobolQualifiedDataName getQualifiedDataName();

  @NotNull
  CobolRecordName getRecordName();

  @NotNull
  List<CobolStatementList> getStatementListList();

}
