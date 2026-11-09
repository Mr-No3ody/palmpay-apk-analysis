package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12657h;

    public final void a(int i7, int i10) {
        this.f12652c = i7;
        this.f12653d = i10;
        this.f12657h = true;
        if (this.f12656g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f12650a = i10;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f12651b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f12650a = i7;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f12651b = i10;
        }
    }
}
