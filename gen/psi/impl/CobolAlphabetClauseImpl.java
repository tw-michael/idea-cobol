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
import null.null;

public class CobolAlphabetClauseImpl extends ASTWrapperPsiElement implements CobolAlphabetClause {

  public CobolAlphabetClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitAlphabetClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CobolAlphabetName getAlphabetName() {
    return findNotNullChildByClass(CobolAlphabetName.class);
  }

  @Override
  @Nullable
  public null getCobolWord() {
    return findChildByClass(null.class);
  }

  @Override
  @NotNull
  public List<CobolLiteral> getLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolLiteral.class);
  }

}
