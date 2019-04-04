package psi

import CobolLanguage
import com.intellij.psi.tree.IElementType

class CobolTokenType(val debugName: String): IElementType(debugName, CobolLanguage.INSTANCE) {
    override fun toString() = "CobolTokenType.$debugName"
}