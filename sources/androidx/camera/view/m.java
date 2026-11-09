package androidx.camera.view;

import E.m0;
import android.graphics.Rect;
import android.util.Rational;
import androidx.camera.core.Preview$SurfaceProvider;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Preview$SurfaceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PreviewView f14991a;

    public m(PreviewView previewView) {
        this.f14991a = previewView;
    }

    @Override // androidx.camera.core.Preview$SurfaceProvider
    public final void onSurfaceRequested(m0 m0Var) {
        r f10;
        if (!p140j8.f.q()) {
            androidx.core.content.d.d(this.f14991a.getContext()).execute(new androidx.camera.video.internal.encoder.o(9, this, m0Var));
            return;
        }
        p140j8.f.G("PreviewView");
        CameraInternal cameraInternal = m0Var.f2059e;
        this.f14991a.f14910p = cameraInternal.getCameraInfoInternal();
        s sVar = this.f14991a.f14908j;
        Rect sensorRect = cameraInternal.getCameraControlInternal().getSensorRect();
        sVar.getClass();
        sVar.f1975a = new Rational(sensorRect.width(), sensorRect.height());
        synchronized (sVar) {
            sVar.f15011c = sensorRect;
        }
        m0Var.c(androidx.core.content.d.d(this.f14991a.getContext()), new l(this, cameraInternal, m0Var));
        PreviewView previewView = this.f14991a;
        r rVar = previewView.f14901b;
        o oVar = previewView.f14900a;
        if (!(rVar instanceof F) || PreviewView.c(m0Var, oVar)) {
            PreviewView previewView2 = this.f14991a;
            if (PreviewView.c(m0Var, previewView2.f14900a)) {
                PreviewView previewView3 = this.f14991a;
                H h7 = new H(previewView3, previewView3.f14903d);
                h7.f14894i = false;
                h7.f14896k = new AtomicReference();
                f10 = h7;
            } else {
                PreviewView previewView4 = this.f14991a;
                f10 = new F(previewView4, previewView4.f14903d);
            }
            previewView2.f14901b = f10;
        }
        CameraInfoInternal cameraInfoInternal = cameraInternal.getCameraInfoInternal();
        PreviewView previewView5 = this.f14991a;
        i iVar = new i(cameraInfoInternal, previewView5.f14905f, previewView5.f14901b);
        this.f14991a.f14906g.set(iVar);
        cameraInternal.getCameraState().addObserver(androidx.core.content.d.d(this.f14991a.getContext()), iVar);
        this.f14991a.f14901b.e(m0Var, new l(this, iVar, cameraInternal));
        PreviewView previewView6 = this.f14991a;
        if (previewView6.indexOfChild(previewView6.f14902c) == -1) {
            PreviewView previewView7 = this.f14991a;
            previewView7.addView(previewView7.f14902c);
        }
    }
}
