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

public class CobolAccessModeClauseImpl extends ASTWrapperPsiElement implements CobolAccessModeClause {

  public CobolAccessModeClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitAccessModeClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolDynamicAccessMode getDynamicAccessMode() {
    return findChildByClass(CobolDynamicAccessMode.class);
  }

  @Override
  @Nullable
  public CobolRandomAccessMode getRandomAccessMode() {
    return findChildByClass(CobolRandomAccessMode.class);
  }

  @Override
  @Nullable
  public CobolSequentialAccessMode getSequentialAccessMode() {
    return findChildByClass(CobolSequentialAccessMode.class);
  }

}
