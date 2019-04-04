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

public class CobolDataDescriptionEntryImpl extends ASTWrapperPsiElement implements CobolDataDescriptionEntry {

  public CobolDataDescriptionEntryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitDataDescriptionEntry(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolConditionName getConditionName() {
    return findChildByClass(CobolConditionName.class);
  }

  @Override
  @Nullable
  public CobolConditionValueClause getConditionValueClause() {
    return findChildByClass(CobolConditionValueClause.class);
  }

  @Override
  @NotNull
  public List<CobolDataDescriptionEntryClause> getDataDescriptionEntryClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolDataDescriptionEntryClause.class);
  }

  @Override
  @Nullable
  public CobolDataName getDataName() {
    return findChildByClass(CobolDataName.class);
  }

  @Override
  @Nullable
  public CobolLevelNumber getLevelNumber() {
    return findChildByClass(CobolLevelNumber.class);
  }

  @Override
  @Nullable
  public CobolRenamesClause getRenamesClause() {
    return findChildByClass(CobolRenamesClause.class);
  }

}
