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

public class CobolSortStatementImpl extends ASTWrapperPsiElement implements CobolSortStatement {

  public CobolSortStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitSortStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolAlphabetName getAlphabetName() {
    return findChildByClass(CobolAlphabetName.class);
  }

  @Override
  @NotNull
  public List<CobolFileName> getFileNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolFileName.class);
  }

  @Override
  @NotNull
  public List<CobolProcedureName> getProcedureNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolProcedureName.class);
  }

  @Override
  @NotNull
  public List<CobolQualifiedDataName> getQualifiedDataNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolQualifiedDataName.class);
  }

}
