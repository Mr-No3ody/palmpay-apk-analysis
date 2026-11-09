package androidx.camera.core.imagecapture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f13820b;

    public /* synthetic */ w(x xVar, int i7) {
        this.f13819a = i7;
        this.f13820b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13819a) {
            case 0:
                x xVar = this.f13820b;
                xVar.f13824d = null;
                xVar.b();
                break;
            default:
                this.f13820b.b();
                break;
        }
    }
}
