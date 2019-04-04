// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolStartStatement extends PsiElement {

  @NotNull
  CobolFileName getFileName();

  @Nullable
  CobolQualifiedDataName getQualifiedDataName();

  @NotNull
  List<CobolStatementList> getStatementListList();

}
