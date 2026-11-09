package com.transsnet.palmpay.core.base;

import C0.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27358a;

    public n(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f27358a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.c(this.f27358a, ((n) obj).f27358a);
    }

    public final int hashCode() {
        return this.f27358a.hashCode();
    }

    public final String toString() {
        return G.r(new StringBuilder("Error(error="), this.f27358a, ")");
    }
}
