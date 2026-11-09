package org.aspectj.lang.reflect;

import Sg.b;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes4.dex */
public interface DeclareAnnotation {
    Annotation getAnnotation();

    String getAnnotationAsText();

    AjType<?> getDeclaringType();

    b getKind();

    SignaturePattern getSignaturePattern();

    TypePattern getTypePattern();
}
