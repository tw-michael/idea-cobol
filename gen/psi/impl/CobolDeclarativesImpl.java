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

public class CobolDeclarativesImpl extends ASTWrapperPsiElement implements CobolDeclaratives {

  public CobolDeclarativesImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitDeclaratives(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CobolParagraphs> getParagraphsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolParagraphs.class);
  }

  @Override
  @NotNull
  public List<CobolSectionHeader> getSectionHeaderList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolSectionHeader.class);
  }

  @Override
  @NotNull
  public List<CobolUseStatement> getUseStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolUseStatement.class);
  }

}
