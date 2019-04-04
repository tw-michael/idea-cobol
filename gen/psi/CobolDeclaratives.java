// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolDeclaratives extends PsiElement {

  @NotNull
  List<CobolParagraphs> getParagraphsList();

  @NotNull
  List<CobolSectionHeader> getSectionHeaderList();

  @NotNull
  List<CobolUseStatement> getUseStatementList();

}
