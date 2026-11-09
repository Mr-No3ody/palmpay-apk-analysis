package com.adjust.sdk.sig;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class a2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f19421b;

    public a2(Class cls, Integer num) {
        this.f19420a = cls;
        this.f19421b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return g1.a(this.f19420a, a2Var.f19420a) && this.f19421b.equals(a2Var.f19421b);
    }

    public final int hashCode() {
        Object obj = this.f19420a;
        return this.f19421b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "(" + this.f19420a + ", " + this.f19421b + ')';
    }
}
