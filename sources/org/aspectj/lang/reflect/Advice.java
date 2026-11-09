package org.aspectj.lang.reflect;

import Sg.a;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public interface Advice {
    AjType getDeclaringType();

    AjType<?>[] getExceptionTypes();

    Type[] getGenericParameterTypes();

    a getKind();

    String getName();

    AjType<?>[] getParameterTypes();

    PointcutExpression getPointcutExpression();
}
