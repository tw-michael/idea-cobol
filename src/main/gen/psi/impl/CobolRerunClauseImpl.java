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

public class CobolRerunClauseImpl extends ASTWrapperPsiElement implements CobolRerunClause {

  public CobolRerunClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitRerunClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolAssignmentName getAssignmentName() {
    return findChildByClass(CobolAssignmentName.class);
  }

  @Override
  @Nullable
  public CobolFileName getFileName() {
    return findChildByClass(CobolFileName.class);
  }

  @Override
  @Nullable
  public CobolIntegerConstant getIntegerConstant() {
    return findChildByClass(CobolIntegerConstant.class);
  }

  @Override
  @Nullable
  public CobolRerun2 getRerun2() {
    return findChildByClass(CobolRerun2.class);
  }

}
