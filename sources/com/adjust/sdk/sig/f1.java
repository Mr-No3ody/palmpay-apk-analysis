package com.adjust.sdk.sig;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f1 implements Iterable, q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19454c;

    static {
        new f1(1, 0);
    }

    public f1(int i7, int i10) {
        this.f19452a = i7;
        if (i7 < i10) {
            int i11 = i10 % 1;
            int i12 = i7 % 1;
            int i13 = ((i11 < 0 ? i11 + 1 : i11) - (i12 < 0 ? i12 + 1 : i12)) % 1;
            i10 -= i13 < 0 ? i13 + 1 : i13;
        }
        this.f19453b = i10;
        this.f19454c = 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f1)) {
            return false;
        }
        if (isEmpty() && ((f1) obj).isEmpty()) {
            return true;
        }
        f1 f1Var = (f1) obj;
        return this.f19452a == f1Var.f19452a && this.f19453b == f1Var.f19453b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f19452a * 31) + this.f19453b;
    }

    public final boolean isEmpty() {
        return this.f19452a > this.f19453b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e1(this.f19452a, this.f19453b, this.f19454c);
    }

    public final String toString() {
        return this.f19452a + ".." + this.f19453b;
    }
}
