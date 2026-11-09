package p042cg;

import java.util.concurrent.TimeUnit;
import p015ag.a;
import p015ag.u;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f19017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f19018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f19019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f19020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f19021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f19022f;

    static {
        String property;
        int i7 = u.f11966a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f19017a = property;
        f19018b = a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = u.f11966a;
        if (i10 < 2) {
            i10 = 2;
        }
        f19019c = a.k(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f19020d = a.k(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f19021e = TimeUnit.SECONDS.toNanos(a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f19022f = h.f19012a;
    }
}
