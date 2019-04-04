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

public class CobolIOControlClauseImpl extends ASTWrapperPsiElement implements CobolIOControlClause {

  public CobolIOControlClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitIOControlClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolMultipleFileClause getMultipleFileClause() {
    return findChildByClass(CobolMultipleFileClause.class);
  }

  @Override
  @Nullable
  public CobolRerunClause getRerunClause() {
    return findChildByClass(CobolRerunClause.class);
  }

  @Override
  @Nullable
  public CobolSameAreaClause getSameAreaClause() {
    return findChildByClass(CobolSameAreaClause.class);
  }

}
