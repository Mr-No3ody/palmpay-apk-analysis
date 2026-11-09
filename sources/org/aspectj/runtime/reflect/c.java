package org.aspectj.runtime.reflect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.SourceLocation;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements ProceedingJoinPoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f41002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f41003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JoinPoint.StaticPart f41004d;

    public c(JoinPoint.StaticPart staticPart, Object obj, Object obj2, Object[] objArr) {
        this.f41004d = staticPart;
        this.f41001a = obj;
        this.f41002b = obj2;
        this.f41003c = objArr;
    }

    @Override // org.aspectj.lang.JoinPoint
    public final Object[] getArgs() {
        if (this.f41003c == null) {
            this.f41003c = new Object[0];
        }
        Object[] objArr = this.f41003c;
        Object[] objArr2 = new Object[objArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        return objArr2;
    }

    @Override // org.aspectj.lang.JoinPoint
    public final String getKind() {
        return this.f41004d.getKind();
    }

    @Override // org.aspectj.lang.JoinPoint
    public final Signature getSignature() {
        return this.f41004d.getSignature();
    }

    @Override // org.aspectj.lang.JoinPoint
    public final SourceLocation getSourceLocation() {
        return this.f41004d.getSourceLocation();
    }

    @Override // org.aspectj.lang.JoinPoint
    public final JoinPoint.StaticPart getStaticPart() {
        return this.f41004d;
    }

    @Override // org.aspectj.lang.JoinPoint
    public final Object getTarget() {
        return this.f41002b;
    }

    @Override // org.aspectj.lang.JoinPoint
    public final Object getThis() {
        return this.f41001a;
    }

    @Override // org.aspectj.lang.ProceedingJoinPoint
    public final Object proceed() {
        return null;
    }

    @Override // org.aspectj.lang.JoinPoint
    public final String toLongString() {
        return this.f41004d.toLongString();
    }

    @Override // org.aspectj.lang.JoinPoint
    public final String toShortString() {
        return this.f41004d.toShortString();
    }

    @Override // org.aspectj.lang.JoinPoint
    public final String toString() {
        return this.f41004d.toString();
    }

    @Override // org.aspectj.lang.ProceedingJoinPoint
    public final Object proceed(Object[] objArr) {
        return null;
    }

    @Override // org.aspectj.lang.ProceedingJoinPoint
    public final void set$AroundClosure(Tg.a aVar) {
    }
}
