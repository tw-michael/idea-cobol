// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolUseStatement extends PsiElement {

  @NotNull
  List<CobolFileName> getFileNameList();

  @NotNull
  List<CobolProcedureName> getProcedureNameList();

}
