// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolIfStatement extends PsiElement {

  @NotNull
  CobolCondition getCondition();

  @NotNull
  List<CobolStatement> getStatementList();

}