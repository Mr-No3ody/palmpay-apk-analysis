package androidx.camera.view;

import E.AbstractC0198c;
import E.m0;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class H extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextureView f14890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SurfaceTexture f14891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.concurrent.futures.m f14892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m0 f14893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SurfaceTexture f14895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AtomicReference f14896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l f14897l;

    @Override // androidx.camera.view.r
    public final View a() {
        return this.f14890e;
    }

    @Override // androidx.camera.view.r
    public final Bitmap b() {
        TextureView textureView = this.f14890e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f14890e.getBitmap();
    }

    @Override // androidx.camera.view.r
    public final void c() {
        if (!this.f14894i || this.f14895j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f14890e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f14895j;
        if (surfaceTexture != surfaceTexture2) {
            this.f14890e.setSurfaceTexture(surfaceTexture2);
            this.f14895j = null;
            this.f14894i = false;
        }
    }

    @Override // androidx.camera.view.r
    public final void d() {
        this.f14894i = true;
    }

    @Override // androidx.camera.view.r
    public final void e(m0 m0Var, l lVar) {
        Size size = m0Var.f2056b;
        this.f15005a = size;
        this.f14897l = lVar;
        FrameLayout frameLayout = this.f15006b;
        size.getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.f14890e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f15005a.getWidth(), this.f15005a.getHeight()));
        this.f14890e.setSurfaceTextureListener(new G(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.f14890e);
        m0 m0Var2 = this.f14893h;
        if (m0Var2 != null) {
            m0Var2.d();
        }
        this.f14893h = m0Var;
        Executor executorD = androidx.core.content.d.d(this.f14890e.getContext());
        m0Var.f2065k.a(new androidx.camera.video.internal.encoder.o(10, this, m0Var), executorD);
        h();
    }

    @Override // androidx.camera.view.r
    public final ListenableFuture g() {
        return AbstractC0198c.y(new C1021b(this));
    }

    public final void h() {
        SurfaceTexture surfaceTexture;
        Size size = this.f15005a;
        if (size == null || (surfaceTexture = this.f14891f) == null || this.f14893h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f15005a.getHeight());
        Surface surface = new Surface(this.f14891f);
        m0 m0Var = this.f14893h;
        androidx.concurrent.futures.m mVarY = AbstractC0198c.y(new U8.a(16, this, surface));
        this.f14892g = mVarY;
        mVarY.addListener(new Da.g(this, surface, mVarY, m0Var, 10), androidx.core.content.d.d(this.f14890e.getContext()));
        this.f15008d = true;
        f();
    }
}
