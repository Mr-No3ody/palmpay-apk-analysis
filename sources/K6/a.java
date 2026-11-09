package K6;

import android.graphics.Matrix;
import android.view.SurfaceView;
import com.didiglobal.booster.instrument.ShadowThread;
import com.palmpay.lib.scanplus.view.CameraView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraView f4937b;

    public /* synthetic */ a(CameraView cameraView, int i7) {
        this.f4936a = i7;
        this.f4937b = cameraView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CameraView this$0 = this.f4937b;
        switch (this.f4936a) {
            case 0:
                int i7 = CameraView.f23989i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ShadowThread.setThreadName(new ShadowThread(new a(this$0, 1), "\u200bcom.palmpay.lib.scanplus.view.CameraView"), "\u200bcom.palmpay.lib.scanplus.view.CameraView").start();
                break;
            case 1:
                CameraView.a(this$0);
                break;
            default:
                int i10 = CameraView.f23989i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                float[] fArr = new float[9];
                Matrix matrix = this$0.f23992c;
                if (matrix != null) {
                    matrix.getValues(fArr);
                }
                SurfaceView surfaceView = this$0.f23990a;
                surfaceView.setScaleX(fArr[0]);
                surfaceView.setScaleY(fArr[4]);
                surfaceView.invalidate();
                break;
        }
    }
}
