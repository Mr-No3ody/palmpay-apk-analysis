package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f15057c = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Thread f15058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile i f15059b;

    public i() {
        j.ATOMIC_HELPER.e(this, Thread.currentThread());
    }
}
