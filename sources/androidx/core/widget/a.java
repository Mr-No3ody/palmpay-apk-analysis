package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f16341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f16342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f16346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16347i;

    public final float a(long j6) {
        long j10 = this.f16343e;
        if (j6 < j10) {
            return 0.0f;
        }
        long j11 = this.f16345g;
        if (j11 < 0 || j6 < j11) {
            return e.b((j6 - j10) / this.f16339a, 0.0f, 1.0f) * 0.5f;
        }
        float f10 = this.f16346h;
        return (e.b((j6 - j11) / this.f16347i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}
