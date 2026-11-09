package com.facebook.common.references;

/* JADX INFO: loaded from: classes.dex */
public final class a implements CloseableReference.LeakHandler {
    @Override // com.facebook.common.references.CloseableReference.LeakHandler
    public final void reportLeak(p277s2.a aVar, Throwable th) {
        Object objA = aVar.a();
        p229p2.a.u(CloseableReference.class, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(aVar)), objA == null ? null : objA.getClass().getName());
    }

    @Override // com.facebook.common.references.CloseableReference.LeakHandler
    public final boolean requiresStacktrace() {
        return false;
    }
}
