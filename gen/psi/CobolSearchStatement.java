// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolSearchStatement extends PsiElement {

  @NotNull
  List<CobolCondition> getConditionList();

  @NotNull
  List<CobolQualifiedDataName> getQualifiedDataNameList();

  @NotNull
  List<CobolStatementList> getStatementListList();

}
