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

public class CobolStatementImpl extends ASTWrapperPsiElement implements CobolStatement {

  public CobolStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolAcceptStatement getAcceptStatement() {
    return findChildByClass(CobolAcceptStatement.class);
  }

  @Override
  @Nullable
  public CobolAddStatement getAddStatement() {
    return findChildByClass(CobolAddStatement.class);
  }

  @Override
  @Nullable
  public CobolAlterStatement getAlterStatement() {
    return findChildByClass(CobolAlterStatement.class);
  }

  @Override
  @Nullable
  public CobolCallStatement getCallStatement() {
    return findChildByClass(CobolCallStatement.class);
  }

  @Override
  @Nullable
  public CobolCancelStatement getCancelStatement() {
    return findChildByClass(CobolCancelStatement.class);
  }

  @Override
  @Nullable
  public CobolCloseStatement getCloseStatement() {
    return findChildByClass(CobolCloseStatement.class);
  }

  @Override
  @Nullable
  public CobolComputeStatement getComputeStatement() {
    return findChildByClass(CobolComputeStatement.class);
  }

  @Override
  @Nullable
  public CobolContinueStatement getContinueStatement() {
    return findChildByClass(CobolContinueStatement.class);
  }

  @Override
  @Nullable
  public CobolDeleteStatement getDeleteStatement() {
    return findChildByClass(CobolDeleteStatement.class);
  }

  @Override
  @Nullable
  public CobolDisplayStatement getDisplayStatement() {
    return findChildByClass(CobolDisplayStatement.class);
  }

  @Override
  @Nullable
  public CobolDivideStatement getDivideStatement() {
    return findChildByClass(CobolDivideStatement.class);
  }

  @Override
  @Nullable
  public CobolEntryStatement getEntryStatement() {
    return findChildByClass(CobolEntryStatement.class);
  }

  @Override
  @Nullable
  public CobolEvaluateStatement getEvaluateStatement() {
    return findChildByClass(CobolEvaluateStatement.class);
  }

  @Override
  @Nullable
  public CobolExitProgramStatement getExitProgramStatement() {
    return findChildByClass(CobolExitProgramStatement.class);
  }

  @Override
  @Nullable
  public CobolGobackStatement getGobackStatement() {
    return findChildByClass(CobolGobackStatement.class);
  }

  @Override
  @Nullable
  public CobolGotoStatement getGotoStatement() {
    return findChildByClass(CobolGotoStatement.class);
  }

  @Override
  @Nullable
  public CobolIfStatement getIfStatement() {
    return findChildByClass(CobolIfStatement.class);
  }

  @Override
  @Nullable
  public CobolInitializeStatement getInitializeStatement() {
    return findChildByClass(CobolInitializeStatement.class);
  }

  @Override
  @Nullable
  public CobolInspectStatement getInspectStatement() {
    return findChildByClass(CobolInspectStatement.class);
  }

  @Override
  @Nullable
  public CobolMergeStatement getMergeStatement() {
    return findChildByClass(CobolMergeStatement.class);
  }

  @Override
  @Nullable
  public CobolMoveStatement getMoveStatement() {
    return findChildByClass(CobolMoveStatement.class);
  }

  @Override
  @Nullable
  public CobolMultiplyStatement getMultiplyStatement() {
    return findChildByClass(CobolMultiplyStatement.class);
  }

  @Override
  @Nullable
  public CobolOpenStatement getOpenStatement() {
    return findChildByClass(CobolOpenStatement.class);
  }

  @Override
  @Nullable
  public CobolPerformStatement getPerformStatement() {
    return findChildByClass(CobolPerformStatement.class);
  }

  @Override
  @Nullable
  public CobolReadStatement getReadStatement() {
    return findChildByClass(CobolReadStatement.class);
  }

  @Override
  @Nullable
  public CobolReleaseStatement getReleaseStatement() {
    return findChildByClass(CobolReleaseStatement.class);
  }

  @Override
  @Nullable
  public CobolReturnStatement getReturnStatement() {
    return findChildByClass(CobolReturnStatement.class);
  }

  @Override
  @Nullable
  public CobolRewriteStatement getRewriteStatement() {
    return findChildByClass(CobolRewriteStatement.class);
  }

  @Override
  @Nullable
  public CobolSearchStatement getSearchStatement() {
    return findChildByClass(CobolSearchStatement.class);
  }

  @Override
  @Nullable
  public CobolSetStatement getSetStatement() {
    return findChildByClass(CobolSetStatement.class);
  }

  @Override
  @Nullable
  public CobolSortStatement getSortStatement() {
    return findChildByClass(CobolSortStatement.class);
  }

  @Override
  @Nullable
  public CobolStartStatement getStartStatement() {
    return findChildByClass(CobolStartStatement.class);
  }

  @Override
  @Nullable
  public CobolStopStatement getStopStatement() {
    return findChildByClass(CobolStopStatement.class);
  }

  @Override
  @Nullable
  public CobolStringStatement getStringStatement() {
    return findChildByClass(CobolStringStatement.class);
  }

  @Override
  @Nullable
  public CobolSubtractStatement getSubtractStatement() {
    return findChildByClass(CobolSubtractStatement.class);
  }

  @Override
  @Nullable
  public CobolUnstringStatement getUnstringStatement() {
    return findChildByClass(CobolUnstringStatement.class);
  }

  @Override
  @Nullable
  public CobolWriteStatement getWriteStatement() {
    return findChildByClass(CobolWriteStatement.class);
  }

}
