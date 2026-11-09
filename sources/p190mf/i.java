package p190mf;

import df.h;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends df.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f39688d = new k("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f39689c = f39688d;

    @Override // df.i
    public final h a() {
        return new j(this.f39689c);
    }
}
