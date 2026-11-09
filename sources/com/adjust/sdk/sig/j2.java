package com.adjust.sdk.sig;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class j2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f19470a;

    public j2(Throwable th) {
        this.f19470a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j2) && this.f19470a.equals(((j2) obj).f19470a);
    }

    public final int hashCode() {
        return this.f19470a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f19470a + ')';
    }
}
