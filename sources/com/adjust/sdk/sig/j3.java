package com.adjust.sdk.sig;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class j3 implements u1, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0 f19471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f19472b = l3.f19480a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f19473c = this;

    public j3(g0 g0Var) {
        this.f19471a = g0Var;
    }

    @Override // com.adjust.sdk.sig.u1
    public final Object getValue() {
        Object objA;
        Object obj = this.f19472b;
        l3 l3Var = l3.f19480a;
        if (obj != l3Var) {
            return obj;
        }
        synchronized (this.f19473c) {
            objA = this.f19472b;
            if (objA == l3Var) {
                objA = this.f19471a.a();
                this.f19472b = objA;
                this.f19471a = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.f19472b != l3.f19480a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
