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

public class CobolCompilationUnitImpl extends ASTWrapperPsiElement implements CobolCompilationUnit {

  public CobolCompilationUnitImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitCompilationUnit(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CobolCompilationUnit> getCompilationUnitList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolCompilationUnit.class);
  }

  @Override
  @NotNull
  public List<CobolEndProgramStatement> getEndProgramStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolEndProgramStatement.class);
  }

  @Override
  @NotNull
  public List<CobolNestedProgramUnit> getNestedProgramUnitList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolNestedProgramUnit.class);
  }

  @Override
  @NotNull
  public CobolProgramUnit getProgramUnit() {
    return findNotNullChildByClass(CobolProgramUnit.class);
  }

}
