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

public class CobolComputeStatementImpl extends ASTWrapperPsiElement implements CobolComputeStatement {

  public CobolComputeStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitComputeStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CobolArithmeticExpression getArithmeticExpression() {
    return findNotNullChildByClass(CobolArithmeticExpression.class);
  }

  @Override
  @NotNull
  public List<CobolQualifiedDataName> getQualifiedDataNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolQualifiedDataName.class);
  }

  @Override
  @NotNull
  public List<CobolStatementList> getStatementListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolStatementList.class);
  }

}