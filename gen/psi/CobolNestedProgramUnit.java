// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolNestedProgramUnit extends PsiElement {

  @Nullable
  CobolDataDivision getDataDivision();

  @Nullable
  CobolEnvironmentDivision getEnvironmentDivision();

  @NotNull
  CobolNestedIdentificationDivision getNestedIdentificationDivision();

  @Nullable
  CobolProcedureDivision getProcedureDivision();

}
