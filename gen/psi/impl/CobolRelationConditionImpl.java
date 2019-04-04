// This is a generated file. Not intended for manual editing.
package psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static psi.CobolTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import psi.*;

public class CobolRelationConditionImpl extends ASTWrapperPsiElement implements CobolRelationCondition {

  public CobolRelationConditionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitRelationCondition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CobolArithmeticExpression> getArithmeticExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolArithmeticExpression.class);
  }

  @Override
  @Nullable
  public CobolRelationalOperator getRelationalOperator() {
    return findChildByClass(CobolRelationalOperator.class);
  }

  @Override
  @Nullable
  public CobolSignCondition getSignCondition() {
    return findChildByClass(CobolSignCondition.class);
  }

}