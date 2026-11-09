package androidx.camera.view;

import androidx.camera.core.ImageCapture$ScreenFlashListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15021b;

    public /* synthetic */ y(Object obj, int i7) {
        this.f15020a = i7;
        this.f15021b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15020a) {
            case 0:
                ((ImageCapture$ScreenFlashListener) this.f15021b).onCompleted();
                break;
            default:
                ((l) this.f15021b).onSurfaceNotInUse();
                break;
        }
    }
}
