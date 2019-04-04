// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolSubscript extends PsiElement {

  @NotNull
  List<CobolIndexName> getIndexNameList();

  @NotNull
  List<CobolIntegerConstant> getIntegerConstantList();

  @NotNull
  List<CobolQualifiedDataName> getQualifiedDataNameList();

}
