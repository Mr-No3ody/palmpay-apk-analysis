package p364y6;

import D6.e;
import androidx.camera.view.PreviewView;
import com.palmpay.lib.liveness.ui.LivenessActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivenessActivity f44080b;

    public /* synthetic */ i(LivenessActivity livenessActivity, int i7) {
        this.f44079a = i7;
        this.f44080b = livenessActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LivenessActivity livenessActivity = this.f44080b;
        switch (this.f44079a) {
            case 0:
                int i7 = LivenessActivity.f23837Y;
                livenessActivity.k();
                return;
            case 1:
                int i10 = LivenessActivity.f23837Y;
                livenessActivity.getWindow().getDecorView().setBackgroundColor(-1);
                return;
            default:
                int i11 = LivenessActivity.f23837Y;
                e eVarG = livenessActivity.g();
                PreviewView previewView = livenessActivity.f23847b;
                if (previewView == null) {
                    Intrinsics.n("cameraPreview");
                    throw null;
                }
                int width = previewView.getWidth();
                PreviewView previewView2 = livenessActivity.f23847b;
                if (previewView2 == null) {
                    Intrinsics.n("cameraPreview");
                    throw null;
                }
                int height = previewView2.getHeight();
                eVarG.f1611M = width;
                eVarG.f1612Q = height;
                return;
        }
    }
}
