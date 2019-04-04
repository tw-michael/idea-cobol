// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolIdentifier extends PsiElement {

  @Nullable
  CobolFileName getFileName();

  @Nullable
  CobolLeftmostCharacterPosition getLeftmostCharacterPosition();

  @Nullable
  CobolLength getLength();

  @Nullable
  CobolQualifiedDataName getQualifiedDataName();

  @NotNull
  List<CobolSubscript> getSubscriptList();

}
