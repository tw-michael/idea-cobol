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

public class CobolBasisImpl extends ASTWrapperPsiElement implements CobolBasis {

  public CobolBasisImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitBasis(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolArithmeticExpression getArithmeticExpression() {
    return findChildByClass(CobolArithmeticExpression.class);
  }

  @Override
  @Nullable
  public CobolIdentifier getIdentifier() {
    return findChildByClass(CobolIdentifier.class);
  }

  @Override
  @Nullable
  public CobolLiteral getLiteral() {
    return findChildByClass(CobolLiteral.class);
  }

}
