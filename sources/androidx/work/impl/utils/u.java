package androidx.work.impl.utils;

import V0.C;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p045d3.k f18731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f18732b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f18733c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18734d = new Object();

    static {
        C.d("WorkTimer");
    }

    public u(p045d3.k kVar) {
        this.f18731a = kVar;
    }

    public final void a(androidx.work.impl.model.e eVar) {
        synchronized (this.f18734d) {
            try {
                if (((t) this.f18732b.remove(eVar)) != null) {
                    C c6 = C.c();
                    Objects.toString(eVar);
                    c6.getClass();
                    this.f18733c.remove(eVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
