package p071ef;

import p239pf.c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f36291a;

    static {
        try {
            d dVar = a.f36290a;
            if (dVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f36291a = dVar;
        } catch (Throwable th) {
            throw c.a(th);
        }
    }

    public static d a() {
        d dVar = f36291a;
        if (dVar != null) {
            return dVar;
        }
        throw new NullPointerException("scheduler == null");
    }
}
