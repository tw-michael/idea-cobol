// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolFileControlEntry extends PsiElement {

  @NotNull
  CobolAssignClause getAssignClause();

  @NotNull
  List<CobolFileControlClause> getFileControlClauseList();

  @NotNull
  CobolSelectClause getSelectClause();

}
