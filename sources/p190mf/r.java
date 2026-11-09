package p190mf;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f39710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f39713d;

    public r(Runnable runnable, Long l5, int i7) {
        this.f39710a = runnable;
        this.f39711b = l5.longValue();
        this.f39712c = i7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i7;
        r rVar = (r) obj;
        long j6 = rVar.f39711b;
        long j10 = this.f39711b;
        if (j10 < j6) {
            i7 = -1;
        } else {
            i7 = j10 > j6 ? 1 : 0;
        }
        if (i7 != 0) {
            return i7;
        }
        int i10 = this.f39712c;
        int i11 = rVar.f39712c;
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }
}
