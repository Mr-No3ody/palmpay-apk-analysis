package androidx.work.impl.background.systemalarm;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f18424b;

    public /* synthetic */ e(f fVar, int i7) {
        this.f18423a = i7;
        this.f18424b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18423a) {
            case 0:
                f.a(this.f18424b);
                break;
            default:
                f.b(this.f18424b);
                break;
        }
    }
}
