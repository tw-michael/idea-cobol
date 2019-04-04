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

public class CobolIdentifierImpl extends ASTWrapperPsiElement implements CobolIdentifier {

  public CobolIdentifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitIdentifier(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolFileName getFileName() {
    return findChildByClass(CobolFileName.class);
  }

  @Override
  @Nullable
  public CobolLeftmostCharacterPosition getLeftmostCharacterPosition() {
    return findChildByClass(CobolLeftmostCharacterPosition.class);
  }

  @Override
  @Nullable
  public CobolLength getLength() {
    return findChildByClass(CobolLength.class);
  }

  @Override
  @Nullable
  public CobolQualifiedDataName getQualifiedDataName() {
    return findChildByClass(CobolQualifiedDataName.class);
  }

  @Override
  @NotNull
  public List<CobolSubscript> getSubscriptList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolSubscript.class);
  }

}
