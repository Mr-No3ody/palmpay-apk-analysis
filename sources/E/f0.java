package E;

import androidx.camera.core.SurfaceRequest$TransformationInfoListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurfaceRequest$TransformationInfoListener f2025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0205j f2026c;

    public /* synthetic */ f0(SurfaceRequest$TransformationInfoListener surfaceRequest$TransformationInfoListener, C0205j c0205j, int i7) {
        this.f2024a = i7;
        this.f2025b = surfaceRequest$TransformationInfoListener;
        this.f2026c = c0205j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2024a) {
            case 0:
                this.f2025b.onTransformationInfoUpdate(this.f2026c);
                break;
            default:
                this.f2025b.onTransformationInfoUpdate(this.f2026c);
                break;
        }
    }
}
