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

public class CobolFileAndSortDescriptionEntryClauseImpl extends ASTWrapperPsiElement implements CobolFileAndSortDescriptionEntryClause {

  public CobolFileAndSortDescriptionEntryClauseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitFileAndSortDescriptionEntryClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolBlockContainsClause getBlockContainsClause() {
    return findChildByClass(CobolBlockContainsClause.class);
  }

  @Override
  @Nullable
  public CobolCodeSetClause getCodeSetClause() {
    return findChildByClass(CobolCodeSetClause.class);
  }

  @Override
  @Nullable
  public CobolDataRecordClause getDataRecordClause() {
    return findChildByClass(CobolDataRecordClause.class);
  }

  @Override
  @Nullable
  public CobolExternalClause getExternalClause() {
    return findChildByClass(CobolExternalClause.class);
  }

  @Override
  @Nullable
  public CobolGlobalClause getGlobalClause() {
    return findChildByClass(CobolGlobalClause.class);
  }

  @Override
  @Nullable
  public CobolLabelRecordsClause getLabelRecordsClause() {
    return findChildByClass(CobolLabelRecordsClause.class);
  }

  @Override
  @Nullable
  public CobolLinageClause getLinageClause() {
    return findChildByClass(CobolLinageClause.class);
  }

  @Override
  @Nullable
  public CobolRecordContainsClause getRecordContainsClause() {
    return findChildByClass(CobolRecordContainsClause.class);
  }

  @Override
  @Nullable
  public CobolRecordingModeClause getRecordingModeClause() {
    return findChildByClass(CobolRecordingModeClause.class);
  }

  @Override
  @Nullable
  public CobolReportClause getReportClause() {
    return findChildByClass(CobolReportClause.class);
  }

  @Override
  @Nullable
  public CobolValueOfClause getValueOfClause() {
    return findChildByClass(CobolValueOfClause.class);
  }

}
