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

public class CobolOrganizationClauseImpl extends ASTWrapperPsiElement implements CobolOrganizationClause {

  public CobolOrganizationClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitOrganizationClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolIndexedOrganizationClause getIndexedOrganizationClause() {
    return findChildByClass(CobolIndexedOrganizationClause.class);
  }

  @Override
  @Nullable
  public CobolLineSequentialOrganizationClause getLineSequentialOrganizationClause() {
    return findChildByClass(CobolLineSequentialOrganizationClause.class);
  }

  @Override
  @Nullable
  public CobolRelativeOrganizationClause getRelativeOrganizationClause() {
    return findChildByClass(CobolRelativeOrganizationClause.class);
  }

  @Override
  @Nullable
  public CobolSequentialOrganizationClause getSequentialOrganizationClause() {
    return findChildByClass(CobolSequentialOrganizationClause.class);
  }

}
