package psi

import com.intellij.psi.tree.IElementType

class CobolElementType(val debugName: String) : IElementType(debugName, CobolLanguage.INSTANCE)