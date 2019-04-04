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

public class CobolPerformFlavourImpl extends ASTWrapperPsiElement implements CobolPerformFlavour {

  public CobolPerformFlavourImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitPerformFlavour(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolPerformTimeClause getPerformTimeClause() {
    return findChildByClass(CobolPerformTimeClause.class);
  }

  @Override
  @Nullable
  public CobolPerformUntilClause getPerformUntilClause() {
    return findChildByClass(CobolPerformUntilClause.class);
  }

  @Override
  @Nullable
  public CobolPerformVaryingWithTestClause getPerformVaryingWithTestClause() {
    return findChildByClass(CobolPerformVaryingWithTestClause.class);
  }

}
