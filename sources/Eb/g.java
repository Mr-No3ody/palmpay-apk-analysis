package Eb;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f2277b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f2278a;

    static {
        g gVar = new g();
        gVar.f2278a = new HashMap();
        f2277b = gVar;
    }

    public final synchronized f a(String str) {
        try {
            if (!this.f2278a.containsKey(str)) {
                this.f2278a.put(str, new f());
            }
        } catch (Throwable th) {
            throw th;
        }
        return (f) this.f2278a.get(str);
    }
}
