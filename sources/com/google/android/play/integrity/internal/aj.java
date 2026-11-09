package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class aj implements an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f22763a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile an f22764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Object f22765c = f22763a;

    private aj(an anVar) {
        this.f22764b = anVar;
    }

    public static an b(an anVar) {
        return anVar instanceof aj ? anVar : new aj(anVar);
    }

    @Override // com.google.android.play.integrity.internal.an
    public final Object a() {
        Object objA;
        Object obj = this.f22765c;
        Object obj2 = f22763a;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f22765c;
                if (objA == obj2) {
                    objA = this.f22764b.a();
                    Object obj3 = this.f22765c;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f22765c = objA;
                    this.f22764b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
