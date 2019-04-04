// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolEvaluateStatement extends PsiElement {

  @NotNull
  List<CobolEvaluatePhrase> getEvaluatePhraseList();

  @NotNull
  List<CobolEvaluateValue> getEvaluateValueList();

  @NotNull
  List<CobolStatementList> getStatementListList();

}
