package p198n5;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f39835a = new d(100);

    @Override // p198n5.a
    public final synchronized void b(int i7, String str, String str2, Throwable th) {
        this.f39835a.add(new g(i7, System.currentTimeMillis(), str2));
    }

    @Override // com.growingio.android.sdk.track.log.ILogger
    public final String getType() {
        return "CacheLogger";
    }
}
