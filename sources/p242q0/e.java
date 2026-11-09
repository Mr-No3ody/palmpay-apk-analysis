package p242q0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41363b;

    public e(long j6, long j10) {
        if (j10 == 0) {
            this.f41362a = 0L;
            this.f41363b = 1L;
        } else {
            this.f41362a = j6;
            this.f41363b = j10;
        }
    }

    public final String toString() {
        return this.f41362a + "/" + this.f41363b;
    }
}
