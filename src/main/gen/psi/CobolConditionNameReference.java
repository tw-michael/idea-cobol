// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolConditionNameReference extends PsiElement {

  @NotNull
  CobolConditionName getConditionName();

  @NotNull
  List<CobolDataName> getDataNameList();

  @Nullable
  CobolFileName getFileName();

  @NotNull
  List<CobolMnemonicName> getMnemonicNameList();

  @NotNull
  List<CobolSubscript> getSubscriptList();

}
