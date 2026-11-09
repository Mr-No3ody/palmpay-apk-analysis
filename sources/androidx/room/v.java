package androidx.room;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f17791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f17792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f17793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17794d;

    static {
        new u(null);
    }

    public v(int i7) {
        this.f17791a = new long[i7];
        this.f17792b = new boolean[i7];
        this.f17793c = new int[i7];
    }

    public final int[] a() {
        synchronized (this) {
            try {
                if (!this.f17794d) {
                    return null;
                }
                long[] jArr = this.f17791a;
                int length = jArr.length;
                int i7 = 0;
                int i10 = 0;
                while (i7 < length) {
                    int i11 = i10 + 1;
                    int i12 = 1;
                    boolean z3 = jArr[i7] > 0;
                    boolean[] zArr = this.f17792b;
                    if (z3 != zArr[i10]) {
                        int[] iArr = this.f17793c;
                        if (!z3) {
                            i12 = 2;
                        }
                        iArr[i10] = i12;
                    } else {
                        this.f17793c[i10] = 0;
                    }
                    zArr[i10] = z3;
                    i7++;
                    i10 = i11;
                }
                this.f17794d = false;
                return (int[]) this.f17793c.clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
