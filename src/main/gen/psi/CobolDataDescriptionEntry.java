// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolDataDescriptionEntry extends PsiElement {

  @Nullable
  CobolConditionName getConditionName();

  @Nullable
  CobolConditionValueClause getConditionValueClause();

  @NotNull
  List<CobolDataDescriptionEntryClause> getDataDescriptionEntryClauseList();

  @Nullable
  CobolDataName getDataName();

  @Nullable
  CobolLevelNumber getLevelNumber();

  @Nullable
  CobolRenamesClause getRenamesClause();

}
