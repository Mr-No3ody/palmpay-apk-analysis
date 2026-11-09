package androidx.camera.core.processing;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f14414b;

    public /* synthetic */ i(m mVar, int i7) {
        this.f14413a = i7;
        this.f14414b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14413a) {
            case 0:
                m mVar = this.f14414b;
                mVar.getClass();
                org.chromium.support_lib_boundary.util.b.S().execute(new i(mVar, 1));
                break;
            default:
                m mVar2 = this.f14414b;
                if (!mVar2.f14439n) {
                    mVar2.e();
                }
                break;
        }
    }
}
