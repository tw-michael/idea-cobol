// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolSymbolicCharactersClause extends PsiElement {

  @Nullable
  CobolAlphabetName getAlphabetName();

  @NotNull
  List<CobolIntegerConstant> getIntegerConstantList();

  @NotNull
  List<CobolSymbolicCharacter> getSymbolicCharacterList();

}
