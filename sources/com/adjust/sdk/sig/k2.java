package com.adjust.sdk.sig;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class k2 implements u1, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19474c = AtomicReferenceFieldUpdater.newUpdater(k2.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile g0 f19475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f19476b = l3.f19480a;

    public k2(g0 g0Var) {
        this.f19475a = g0Var;
    }

    @Override // com.adjust.sdk.sig.u1
    public final Object getValue() {
        Object obj = this.f19476b;
        l3 l3Var = l3.f19480a;
        if (obj != l3Var) {
            return obj;
        }
        g0 g0Var = this.f19475a;
        if (g0Var != null) {
            Object objA = g0Var.a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19474c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, l3Var, objA)) {
                if (atomicReferenceFieldUpdater.get(this) != l3Var) {
                }
            }
            this.f19475a = null;
            return objA;
        }
        return this.f19476b;
    }

    public final String toString() {
        return this.f19476b != l3.f19480a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
