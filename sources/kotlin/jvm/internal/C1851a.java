package kotlin.jvm.internal;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1851a implements FunctionBase, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38957b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38958c = 2;

    public C1851a(Object obj) {
        this.f38956a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1851a)) {
            return false;
        }
        C1851a c1851a = (C1851a) obj;
        return this.f38957b == c1851a.f38957b && this.f38958c == c1851a.f38958c && Intrinsics.c(this.f38956a, c1851a.f38956a) && AtomicReference.class.equals(AtomicReference.class);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public final int getArity() {
        return 2;
    }

    public final int hashCode() {
        Object obj = this.f38956a;
        return ((((((((((AtomicReference.class.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31) + 113762) * 31) - 869290769) * 31) + (this.f38957b ? 1231 : 1237)) * 31) + 2) * 31) + this.f38958c;
    }

    public final String toString() {
        G.f38952a.getClass();
        return H.a(this);
    }
}
