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

public class CobolEnvironmentNameIsMnemonicNameClauseImpl extends ASTWrapperPsiElement implements CobolEnvironmentNameIsMnemonicNameClause {

  public CobolEnvironmentNameIsMnemonicNameClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitEnvironmentNameIsMnemonicNameClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolEnvironmentName getEnvironmentName() {
    return findChildByClass(CobolEnvironmentName.class);
  }

  @Override
  @Nullable
  public CobolMnemonicName getMnemonicName() {
    return findChildByClass(CobolMnemonicName.class);
  }

  @Override
  @Nullable
  public CobolSpecialNamesParagraphStatusPhrase getSpecialNamesParagraphStatusPhrase() {
    return findChildByClass(CobolSpecialNamesParagraphStatusPhrase.class);
  }

}
