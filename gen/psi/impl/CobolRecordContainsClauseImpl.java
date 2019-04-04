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

public class CobolRecordContainsClauseImpl extends ASTWrapperPsiElement implements CobolRecordContainsClause {

  public CobolRecordContainsClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitRecordContainsClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CobolIntegerConstant> getIntegerConstantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolIntegerConstant.class);
  }

  @Override
  @Nullable
  public CobolQualifiedDataName getQualifiedDataName() {
    return findChildByClass(CobolQualifiedDataName.class);
  }

}
