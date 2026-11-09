package p136j2;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f38192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f38193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f38194c;

    public final synchronized long a() {
        return this.f38193b;
    }

    public final synchronized void b(long j6, long j10) {
        if (this.f38192a) {
            this.f38193b += j6;
            this.f38194c += j10;
        }
    }

    public final synchronized void c() {
        this.f38192a = false;
        this.f38194c = -1L;
        this.f38193b = -1L;
    }
}
