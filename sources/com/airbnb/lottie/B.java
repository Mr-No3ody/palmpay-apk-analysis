package com.airbnb.lottie;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f19556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f19557b;

    public B(k kVar) {
        this.f19556a = kVar;
        this.f19557b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b7 = (B) obj;
        k kVar = this.f19556a;
        if (kVar != null && kVar.equals(b7.f19556a)) {
            return true;
        }
        Throwable th = this.f19557b;
        if (th == null || b7.f19557b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19556a, this.f19557b});
    }

    public B(Throwable th) {
        this.f19557b = th;
        this.f19556a = null;
    }
}
