package androidx.camera.video;

import E.l0;
import android.view.Surface;
import androidx.camera.core.SurfaceRequest$TransformationInfoListener;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements SurfaceRequest$TransformationInfoListener, Encoder.SurfaceInput.OnSurfaceUpdateListener, CallbackToFutureAdapter$Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f14806a;

    public /* synthetic */ o(s sVar) {
        this.f14806a = sVar;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(androidx.concurrent.futures.k kVar) {
        s sVar = this.f14806a;
        sVar.f14855s.setEncoderCallback(new p(sVar, kVar), sVar.f14840d);
        return "videoEncodingFuture";
    }

    @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener
    public void onSurfaceUpdate(Surface surface) {
        this.f14806a.g(surface);
    }

    @Override // androidx.camera.core.SurfaceRequest$TransformationInfoListener
    public void onTransformationInfoUpdate(l0 l0Var) {
        this.f14806a.getClass();
    }
}
