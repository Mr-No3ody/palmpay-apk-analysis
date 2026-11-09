package androidx.camera.camera2.internal.compat;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f13443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13444c;

    public /* synthetic */ q(r rVar, String str, int i7) {
        this.f13442a = i7;
        this.f13443b = rVar;
        this.f13444c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13442a) {
            case 0:
                this.f13443b.f13479b.onCameraAvailable(this.f13444c);
                break;
            default:
                this.f13443b.f13479b.onCameraUnavailable(this.f13444c);
                break;
        }
    }
}
