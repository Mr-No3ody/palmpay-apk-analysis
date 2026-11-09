package org.aspectj.lang;

import Tg.a;

/* JADX INFO: loaded from: classes4.dex */
public interface ProceedingJoinPoint extends JoinPoint {
    Object proceed() throws Throwable;

    Object proceed(Object[] objArr) throws Throwable;

    void set$AroundClosure(a aVar);
}
