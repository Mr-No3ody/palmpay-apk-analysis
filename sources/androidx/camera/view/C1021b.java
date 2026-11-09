package androidx.camera.view;

import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.view.impl.ZoomGestureDetector$OnZoomGestureListener;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import com.google.common.util.concurrent.ListenableFuture;
import com.horcrux.svg.d0;

/* JADX INFO: renamed from: androidx.camera.view.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1021b implements RotationProvider$Listener, AsyncFunction, ZoomGestureDetector$OnZoomGestureListener, CallbackToFutureAdapter$Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f14919a;

    public /* synthetic */ C1021b(Object obj) {
        this.f14919a = obj;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        return ((i) this.f14919a).f14955d.g();
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(androidx.concurrent.futures.k kVar) {
        ((H) this.f14919a).f14896k.set(kVar);
        return "textureViewImpl_waitForNextFrame";
    }

    @Override // androidx.camera.view.RotationProvider$Listener
    public void onRotationChanged(int i7) {
        CameraInternal cameraInternalB;
        C1027h c1027h = (C1027h) this.f14919a;
        E.C c6 = c1027h.f14930g;
        if (c6.z(i7) && (cameraInternalB = c6.b()) != null) {
            c6.f1889o.f1914b = c6.g(cameraInternalB, false);
        }
        c1027h.f14927d.I(i7);
        androidx.camera.video.C c10 = c1027h.f14931h;
        if (c10.z(i7)) {
            c10.N();
        }
    }

    @Override // androidx.camera.view.impl.ZoomGestureDetector$OnZoomGestureListener
    public boolean onZoomEvent(androidx.camera.view.impl.d dVar) {
        AbstractC1024e abstractC1024e;
        int i7 = PreviewView.f14898B;
        PreviewView previewView = (PreviewView) this.f14919a;
        if (!(dVar instanceof androidx.camera.view.impl.c) || (abstractC1024e = previewView.f14907i) == null) {
            return true;
        }
        float f10 = ((androidx.camera.view.impl.c) dVar).f14958a;
        if (!abstractC1024e.h()) {
            p140j8.f.G("CameraController");
            return true;
        }
        if (!abstractC1024e.f14942s) {
            p140j8.f.G("CameraController");
            return true;
        }
        p140j8.f.G("CameraController");
        p140j8.f.b();
        ZoomState zoomState = (ZoomState) abstractC1024e.f14943u.d();
        if (zoomState == null) {
            return true;
        }
        abstractC1024e.l(Math.min(Math.max(zoomState.getZoomRatio() * (f10 > 1.0f ? d0.e(f10, 1.0f, 2.0f, 1.0f) : 1.0f - ((1.0f - f10) * 2.0f)), zoomState.getMinZoomRatio()), zoomState.getMaxZoomRatio()));
        return true;
    }
}
