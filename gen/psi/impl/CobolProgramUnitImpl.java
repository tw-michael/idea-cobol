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

public class CobolProgramUnitImpl extends ASTWrapperPsiElement implements CobolProgramUnit {

  public CobolProgramUnitImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitProgramUnit(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolDataDivision getDataDivision() {
    return findChildByClass(CobolDataDivision.class);
  }

  @Override
  @Nullable
  public CobolEnvironmentDivision getEnvironmentDivision() {
    return findChildByClass(CobolEnvironmentDivision.class);
  }

  @Override
  @NotNull
  public CobolIdentificationDivision getIdentificationDivision() {
    return findNotNullChildByClass(CobolIdentificationDivision.class);
  }

  @Override
  @Nullable
  public CobolProcedureDivision getProcedureDivision() {
    return findChildByClass(CobolProcedureDivision.class);
  }

}
