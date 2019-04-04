// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolValueOfClause extends PsiElement {

  @NotNull
  List<CobolLiteral> getLiteralList();

  @NotNull
  List<CobolQualifiedDataName> getQualifiedDataNameList();

  @NotNull
  List<CobolSystemName> getSystemNameList();

}
