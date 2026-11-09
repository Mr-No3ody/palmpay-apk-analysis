package E;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f2042b;

    public /* synthetic */ i0(m0 m0Var, int i7) {
        this.f2041a = i7;
        this.f2042b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2041a) {
            case 0:
                this.f2042b.f2061g.cancel(true);
                break;
            default:
                this.f2042b.d();
                break;
        }
    }
}
