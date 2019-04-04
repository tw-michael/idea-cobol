// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolPerformVaryingClause extends PsiElement {

  @NotNull
  List<CobolIdentifier> getIdentifierList();

  @NotNull
  List<CobolLiteral> getLiteralList();

  @NotNull
  CobolPerformUntilClause getPerformUntilClause();

  @NotNull
  CobolQualifiedDataName getQualifiedDataName();

}
