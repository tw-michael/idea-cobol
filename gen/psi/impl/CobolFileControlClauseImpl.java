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

public class CobolFileControlClauseImpl extends ASTWrapperPsiElement implements CobolFileControlClause {

  public CobolFileControlClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitFileControlClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolAccessModeClause getAccessModeClause() {
    return findChildByClass(CobolAccessModeClause.class);
  }

  @Override
  @Nullable
  public CobolAlternateRecordKeyClause getAlternateRecordKeyClause() {
    return findChildByClass(CobolAlternateRecordKeyClause.class);
  }

  @Override
  @Nullable
  public CobolFileStatusClause getFileStatusClause() {
    return findChildByClass(CobolFileStatusClause.class);
  }

  @Override
  @Nullable
  public CobolOrganizationClause getOrganizationClause() {
    return findChildByClass(CobolOrganizationClause.class);
  }

  @Override
  @Nullable
  public CobolPaddingCharacterClause getPaddingCharacterClause() {
    return findChildByClass(CobolPaddingCharacterClause.class);
  }

  @Override
  @Nullable
  public CobolPasswordClause getPasswordClause() {
    return findChildByClass(CobolPasswordClause.class);
  }

  @Override
  @Nullable
  public CobolRecordDelimiterClause getRecordDelimiterClause() {
    return findChildByClass(CobolRecordDelimiterClause.class);
  }

  @Override
  @Nullable
  public CobolReserveClause getReserveClause() {
    return findChildByClass(CobolReserveClause.class);
  }

}
