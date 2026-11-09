package com.transsnet.palmpay.core.base;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27360a;

    public p(Object obj) {
        this.f27360a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.c(this.f27360a, ((p) obj).f27360a);
    }

    public final int hashCode() {
        Object obj = this.f27360a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(data=" + this.f27360a + ")";
    }
}
