// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolPictureString extends PsiElement {

  @NotNull
  List<CobolIntegerConstant> getIntegerConstantList();

  @NotNull
  List<CobolPictureChars> getPictureCharsList();

  @Nullable
  CobolPictureCurrency getPictureCurrency();

  @Nullable
  CobolPicturePunctuation getPicturePunctuation();

}
