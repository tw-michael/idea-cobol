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

public class CobolPerformStatementImpl extends ASTWrapperPsiElement implements CobolPerformStatement {

  public CobolPerformStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitPerformStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolPerformFlavour getPerformFlavour() {
    return findChildByClass(CobolPerformFlavour.class);
  }

  @Override
  @Nullable
  public CobolPerformProcedureScopeClause getPerformProcedureScopeClause() {
    return findChildByClass(CobolPerformProcedureScopeClause.class);
  }

  @Override
  @Nullable
  public CobolStatementList getStatementList() {
    return findChildByClass(CobolStatementList.class);
  }

}
