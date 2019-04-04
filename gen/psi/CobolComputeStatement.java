// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolComputeStatement extends PsiElement {

  @NotNull
  CobolArithmeticExpression getArithmeticExpression();

  @NotNull
  List<CobolQualifiedDataName> getQualifiedDataNameList();

  @NotNull
  List<CobolStatementList> getStatementListList();

}
