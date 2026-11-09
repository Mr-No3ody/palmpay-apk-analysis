package com.adjust.sdk.sig;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements u1, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0 f19489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f19490b = l3.f19480a;

    public n3(g0 g0Var) {
        this.f19489a = g0Var;
    }

    @Override // com.adjust.sdk.sig.u1
    public final Object getValue() {
        if (this.f19490b == l3.f19480a) {
            this.f19490b = this.f19489a.a();
            this.f19489a = null;
        }
        return this.f19490b;
    }

    public final String toString() {
        return this.f19490b != l3.f19480a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
