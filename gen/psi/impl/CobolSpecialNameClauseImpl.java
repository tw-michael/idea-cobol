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

public class CobolSpecialNameClauseImpl extends ASTWrapperPsiElement implements CobolSpecialNameClause {

  public CobolSpecialNameClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitSpecialNameClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolAlphabetClause getAlphabetClause() {
    return findChildByClass(CobolAlphabetClause.class);
  }

  @Override
  @Nullable
  public CobolClassClause getClassClause() {
    return findChildByClass(CobolClassClause.class);
  }

  @Override
  @Nullable
  public CobolCurrencySignClause getCurrencySignClause() {
    return findChildByClass(CobolCurrencySignClause.class);
  }

  @Override
  @Nullable
  public CobolDecimalPointClause getDecimalPointClause() {
    return findChildByClass(CobolDecimalPointClause.class);
  }

  @Override
  @Nullable
  public CobolEnvironmentNameIsMnemonicNameClause getEnvironmentNameIsMnemonicNameClause() {
    return findChildByClass(CobolEnvironmentNameIsMnemonicNameClause.class);
  }

  @Override
  @Nullable
  public CobolSymbolicCharactersClause getSymbolicCharactersClause() {
    return findChildByClass(CobolSymbolicCharactersClause.class);
  }

}
