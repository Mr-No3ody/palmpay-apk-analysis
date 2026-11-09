package androidx.camera.core.processing;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f14416b;

    public /* synthetic */ j(l lVar, int i7) {
        this.f14415a = i7;
        this.f14416b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14415a) {
            case 0:
                this.f14416b.a();
                break;
            case 1:
                this.f14416b.b();
                break;
            default:
                l lVar = this.f14416b;
                n nVar = lVar.f14425r;
                if (nVar != null) {
                    nVar.b();
                }
                if (lVar.f14424q == null) {
                    lVar.f14423p.c();
                }
                break;
        }
    }
}
