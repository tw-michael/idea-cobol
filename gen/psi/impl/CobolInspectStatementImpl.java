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

public class CobolInspectStatementImpl extends ASTWrapperPsiElement implements CobolInspectStatement {

  public CobolInspectStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitInspectStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolConvertingPhrase getConvertingPhrase() {
    return findChildByClass(CobolConvertingPhrase.class);
  }

  @Override
  @NotNull
  public CobolQualifiedDataName getQualifiedDataName() {
    return findNotNullChildByClass(CobolQualifiedDataName.class);
  }

  @Override
  @Nullable
  public CobolReplacingPhrase getReplacingPhrase() {
    return findChildByClass(CobolReplacingPhrase.class);
  }

  @Override
  @Nullable
  public CobolTallyingPhrase getTallyingPhrase() {
    return findChildByClass(CobolTallyingPhrase.class);
  }

}
