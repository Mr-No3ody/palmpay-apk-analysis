package p072eg;

import Pa.a0;
import p015ag.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f36317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f36318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f36319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f36320e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f36316a = a.k(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f36321f = a.k(16, 12, "kotlinx.coroutines.semaphore.segmentSize");

    static {
        int i7 = 1;
        f36317b = new a0("PERMIT", i7);
        f36318c = new a0("TAKEN", i7);
        f36319d = new a0("BROKEN", i7);
        f36320e = new a0("CANCELLED", i7);
    }
}
