// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolMultiplyStatement extends PsiElement {

  @NotNull
  List<CobolIdentifier> getIdentifierList();

  @NotNull
  List<CobolLiteral> getLiteralList();

  @NotNull
  List<CobolStatementList> getStatementListList();

}
