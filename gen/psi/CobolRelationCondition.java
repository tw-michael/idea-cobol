// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolRelationCondition extends PsiElement {

  @NotNull
  List<CobolArithmeticExpression> getArithmeticExpressionList();

  @Nullable
  CobolRelationalOperator getRelationalOperator();

  @Nullable
  CobolSignCondition getSignCondition();

}
