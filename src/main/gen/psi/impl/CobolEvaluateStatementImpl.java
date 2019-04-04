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

public class CobolEvaluateStatementImpl extends ASTWrapperPsiElement implements CobolEvaluateStatement {

  public CobolEvaluateStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitEvaluateStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CobolEvaluatePhrase> getEvaluatePhraseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolEvaluatePhrase.class);
  }

  @Override
  @NotNull
  public List<CobolEvaluateValue> getEvaluateValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolEvaluateValue.class);
  }

  @Override
  @NotNull
  public List<CobolStatementList> getStatementListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolStatementList.class);
  }

}
