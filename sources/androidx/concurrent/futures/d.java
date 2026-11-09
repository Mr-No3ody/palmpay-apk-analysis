package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f15044b = new d(new c("Failure occurred while trying to finish a future.", 0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f15045a;

    public d(Throwable th) {
        this.f15045a = (Throwable) j.checkNotNull(th);
    }
}
