package org.aspectj.runtime.reflect;

import Pa.C0505b;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.SourceLocation;
import p137j3.v;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements JoinPoint.StaticPart {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f40998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0505b f40999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41000c;

    public final String a(e eVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("method-execution".substring(7));
        stringBuffer.append("(");
        stringBuffer.append(this.f40998a.b(eVar));
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    @Override // org.aspectj.lang.JoinPoint.StaticPart
    public final int getId() {
        return this.f41000c;
    }

    @Override // org.aspectj.lang.JoinPoint.StaticPart
    public final String getKind() {
        return "method-execution";
    }

    @Override // org.aspectj.lang.JoinPoint.StaticPart
    public final Signature getSignature() {
        return this.f40998a;
    }

    @Override // org.aspectj.lang.JoinPoint.StaticPart
    public final SourceLocation getSourceLocation() {
        return this.f40999b;
    }

    @Override // org.aspectj.lang.JoinPoint.StaticPart
    public final String toLongString() {
        return a(e.f41008h);
    }

    @Override // org.aspectj.lang.JoinPoint.StaticPart
    public final String toShortString() {
        return a(e.f41006f);
    }

    @Override // org.aspectj.lang.JoinPoint.StaticPart
    public final String toString() {
        return a(e.f41007g);
    }
}
