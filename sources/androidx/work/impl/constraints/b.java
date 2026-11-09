package androidx.work.impl.constraints;

import N8.q0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18471a;

    public b(int i7) {
        this.f18471a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f18471a == ((b) obj).f18471a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18471a);
    }

    public final String toString() {
        return q0.m(new StringBuilder("ConstraintsNotMet(reason="), this.f18471a, ')');
    }
}
