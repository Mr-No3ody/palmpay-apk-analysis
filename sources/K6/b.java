package K6;

import E.A;
import E.C;
import E.b0;
import E.o0;
import E.p0;
import E.q0;
import android.content.Context;
import android.util.Size;
import androidx.camera.core.Preview$SurfaceProvider;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0980g0;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.E;
import com.palmpay.lib.scanplus.view.CameraXView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraXView f4939b;

    public /* synthetic */ b(CameraXView cameraXView, int i7) {
        this.f4938a = i7;
        this.f4939b = cameraXView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        p0 p0VarB;
        C c6;
        int i7 = 1;
        CameraXView this$0 = this.f4939b;
        switch (this.f4938a) {
            case 0:
                int i10 = CameraXView.t;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                A a3 = new A();
                C0971c c0971c = C0980g0.f14062e;
                C0992m0 c0992m0 = a3.f1886a;
                c0992m0.insertOption(c0971c, 1);
                c0992m0.insertOption(ImageOutputConfig.f13899D, new Size(this$0.getWidth(), this$0.getHeight()));
                C cBuild = a3.build();
                this$0.f23999c = cBuild;
                cBuild.G(this$0.f24003g, new Dg.a(this$0, 24));
                this$0.f23998b.addListener(new b(this$0, i7), androidx.core.content.d.d(this$0.getContext()));
                break;
            default:
                int i11 = CameraXView.t;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                androidx.camera.lifecycle.h hVar = (androidx.camera.lifecycle.h) this$0.f23998b.get();
                PreviewView previewView = this$0.f23997a;
                Preview$SurfaceProvider surfaceProvider = previewView.getSurfaceProvider();
                b0 b0Var = this$0.f24000d;
                b0Var.E(surfaceProvider);
                q0 viewPort = previewView.getViewPort();
                LifecycleCamera lifecycleCameraC = null;
                if (viewPort == null || (c6 = this$0.f23999c) == null) {
                    p0VarB = null;
                } else {
                    o0 o0Var = new o0();
                    o0Var.a(b0Var);
                    o0Var.a(c6);
                    o0Var.f2088a = viewPort;
                    p0VarB = o0Var.b();
                }
                if (p0VarB != null) {
                    Context context = this$0.getContext();
                    Intrinsics.f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    lifecycleCameraC = hVar.c((E) context, this$0.f24001e, p0VarB);
                }
                this$0.f24004i = lifecycleCameraC;
                break;
        }
    }
}
