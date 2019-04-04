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

public class CobolParagraphImpl extends ASTWrapperPsiElement implements CobolParagraph {

  public CobolParagraphImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitParagraph(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolAlteredGoto getAlteredGoto() {
    return findChildByClass(CobolAlteredGoto.class);
  }

  @Override
  @Nullable
  public CobolExitStatement getExitStatement() {
    return findChildByClass(CobolExitStatement.class);
  }

  @Override
  @NotNull
  public CobolParagraphName getParagraphName() {
    return findNotNullChildByClass(CobolParagraphName.class);
  }

  @Override
  @NotNull
  public List<CobolSentence> getSentenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolSentence.class);
  }

}
