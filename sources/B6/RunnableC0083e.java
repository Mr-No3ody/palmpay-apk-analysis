package B6;

import androidx.camera.view.PreviewView;
import com.palmpay.lib.liveness.v2.LivenessActivityV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: B6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0083e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivenessActivityV2 f473b;

    public /* synthetic */ RunnableC0083e(LivenessActivityV2 livenessActivityV2, int i7) {
        this.f472a = i7;
        this.f473b = livenessActivityV2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LivenessActivityV2 livenessActivityV2 = this.f473b;
        switch (this.f472a) {
            case 0:
                int i7 = LivenessActivityV2.f23926Z;
                livenessActivityV2.i();
                return;
            case 1:
                int i10 = LivenessActivityV2.f23926Z;
                livenessActivityV2.getWindow().getDecorView().setBackgroundColor(-1);
                return;
            default:
                int i11 = LivenessActivityV2.f23926Z;
                b0 b0VarG = livenessActivityV2.g();
                PreviewView previewView = livenessActivityV2.f23937b;
                if (previewView == null) {
                    Intrinsics.n("cameraPreview");
                    throw null;
                }
                int width = previewView.getWidth();
                PreviewView previewView2 = livenessActivityV2.f23937b;
                if (previewView2 == null) {
                    Intrinsics.n("cameraPreview");
                    throw null;
                }
                int height = previewView2.getHeight();
                N n10 = b0VarG.f458i;
                n10.f408i = width;
                n10.f409j = height;
                int i12 = n10.f404e;
                if (i12 == -1 || n10.f407h) {
                    n10.f407h = false;
                    if (i12 == -1) {
                        n10.f404e = 0;
                        n10.f405f = -1;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
