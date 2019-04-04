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

public class CobolDataDescriptionEntryClauseImpl extends ASTWrapperPsiElement implements CobolDataDescriptionEntryClause {

  public CobolDataDescriptionEntryClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitDataDescriptionEntryClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolDataBlankWhenZeroClause getDataBlankWhenZeroClause() {
    return findChildByClass(CobolDataBlankWhenZeroClause.class);
  }

  @Override
  @Nullable
  public CobolDataExternalClause getDataExternalClause() {
    return findChildByClass(CobolDataExternalClause.class);
  }

  @Override
  @Nullable
  public CobolDataGlobalClause getDataGlobalClause() {
    return findChildByClass(CobolDataGlobalClause.class);
  }

  @Override
  @Nullable
  public CobolDataJustifiedClause getDataJustifiedClause() {
    return findChildByClass(CobolDataJustifiedClause.class);
  }

  @Override
  @Nullable
  public CobolDataOccursClause getDataOccursClause() {
    return findChildByClass(CobolDataOccursClause.class);
  }

  @Override
  @Nullable
  public CobolDataPictureClause getDataPictureClause() {
    return findChildByClass(CobolDataPictureClause.class);
  }

  @Override
  @Nullable
  public CobolDataRedefinesClause getDataRedefinesClause() {
    return findChildByClass(CobolDataRedefinesClause.class);
  }

  @Override
  @Nullable
  public CobolDataSignClause getDataSignClause() {
    return findChildByClass(CobolDataSignClause.class);
  }

  @Override
  @Nullable
  public CobolDataSynchronizedClause getDataSynchronizedClause() {
    return findChildByClass(CobolDataSynchronizedClause.class);
  }

  @Override
  @Nullable
  public CobolDataUsageClause getDataUsageClause() {
    return findChildByClass(CobolDataUsageClause.class);
  }

  @Override
  @Nullable
  public CobolDataValueClause getDataValueClause() {
    return findChildByClass(CobolDataValueClause.class);
  }

}
