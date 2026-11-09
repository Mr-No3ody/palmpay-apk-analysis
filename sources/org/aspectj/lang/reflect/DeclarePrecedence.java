package org.aspectj.lang.reflect;

/* JADX INFO: loaded from: classes4.dex */
public interface DeclarePrecedence {
    AjType getDeclaringType();

    TypePattern[] getPrecedenceOrder();
}
