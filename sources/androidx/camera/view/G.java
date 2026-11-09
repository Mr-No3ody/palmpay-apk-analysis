package androidx.camera.view;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class G implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f14889a;

    public G(H h7) {
        this.f14889a = h7;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        p140j8.f.G("TextureViewImpl");
        H h7 = this.f14889a;
        h7.f14891f = surfaceTexture;
        if (h7.f14892g == null) {
            h7.h();
            return;
        }
        h7.f14893h.getClass();
        Objects.toString(h7.f14893h);
        p140j8.f.G("TextureViewImpl");
        h7.f14893h.f2066l.a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        H h7 = this.f14889a;
        h7.f14891f = null;
        androidx.concurrent.futures.m mVar = h7.f14892g;
        if (mVar == null) {
            p140j8.f.G("TextureViewImpl");
            return true;
        }
        p279s5.d dVar = new p279s5.d(this, 25, surfaceTexture, false);
        mVar.addListener(new androidx.camera.core.impl.utils.futures.i(0, mVar, dVar), androidx.core.content.d.d(h7.f14890e.getContext()));
        h7.f14895j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        p140j8.f.G("TextureViewImpl");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) this.f14889a.f14896k.getAndSet(null);
        if (kVar != null) {
            kVar.b(null);
        }
    }
}
