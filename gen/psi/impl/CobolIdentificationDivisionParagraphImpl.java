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

public class CobolIdentificationDivisionParagraphImpl extends ASTWrapperPsiElement implements CobolIdentificationDivisionParagraph {

  public CobolIdentificationDivisionParagraphImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitIdentificationDivisionParagraph(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolAuthorParagraph getAuthorParagraph() {
    return findChildByClass(CobolAuthorParagraph.class);
  }

  @Override
  @Nullable
  public CobolDateCompiledParagraph getDateCompiledParagraph() {
    return findChildByClass(CobolDateCompiledParagraph.class);
  }

  @Override
  @Nullable
  public CobolDateWrittenParagraph getDateWrittenParagraph() {
    return findChildByClass(CobolDateWrittenParagraph.class);
  }

  @Override
  @Nullable
  public CobolInstallationParagraph getInstallationParagraph() {
    return findChildByClass(CobolInstallationParagraph.class);
  }

  @Override
  @Nullable
  public CobolSecurityParagraph getSecurityParagraph() {
    return findChildByClass(CobolSecurityParagraph.class);
  }

}
