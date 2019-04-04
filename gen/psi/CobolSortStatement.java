// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolSortStatement extends PsiElement {

  @Nullable
  CobolAlphabetName getAlphabetName();

  @NotNull
  List<CobolFileName> getFileNameList();

  @NotNull
  List<CobolProcedureName> getProcedureNameList();

  @NotNull
  List<CobolQualifiedDataName> getQualifiedDataNameList();

}
