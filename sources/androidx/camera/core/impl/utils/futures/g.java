package androidx.camera.core.impl.utils.futures;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.k f14208b;

    public /* synthetic */ g(int i7, androidx.concurrent.futures.k kVar) {
        this.f14207a = i7;
        this.f14208b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14207a) {
            case 0:
                this.f14208b.b(null);
                break;
            default:
                this.f14208b.d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                break;
        }
    }
}
