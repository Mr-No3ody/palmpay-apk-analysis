package androidx.work.impl;

import E.AbstractC0198c;
import V0.C0697p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class H extends kotlin.jvm.internal.o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V0.B f18364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ J f18367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(V0.B b7, boolean z3, String str, J j6) {
        super(1);
        this.f18364a = b7;
        this.f18365b = z3;
        this.f18366c = str;
        this.f18367d = j6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String methodName;
        Throwable th = (Throwable) obj;
        if (th instanceof v) {
            this.f18364a.f9858c.compareAndSet(-256, ((v) th).f18735a);
        }
        if (this.f18365b && (methodName = this.f18366c) != null) {
            J j6 = this.f18367d;
            C0697p c0697p = j6.f18376e.f9934o;
            int iHashCode = j6.f18372a.hashCode();
            c0697p.getClass();
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            AbstractC0198c.r(methodName, iHashCode);
        }
        return Unit.f38893a;
    }
}
