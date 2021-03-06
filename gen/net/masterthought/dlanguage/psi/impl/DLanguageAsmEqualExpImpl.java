// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static net.masterthought.dlanguage.psi.DLanguageTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.masterthought.dlanguage.psi.*;

public class DLanguageAsmEqualExpImpl extends ASTWrapperPsiElement implements DLanguageAsmEqualExp {

  public DLanguageAsmEqualExpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitAsmEqualExp(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLanguageAsmEqualExp getAsmEqualExp() {
    return findChildByClass(DLanguageAsmEqualExp.class);
  }

  @Override
  @NotNull
  public DLanguageAsmRelExp getAsmRelExp() {
    return findNotNullChildByClass(DLanguageAsmRelExp.class);
  }

  @Override
  @Nullable
  public PsiElement getOpEqEq() {
    return findChildByType(OP_EQ_EQ);
  }

  @Override
  @Nullable
  public PsiElement getOpNotEq() {
    return findChildByType(OP_NOT_EQ);
  }

}
