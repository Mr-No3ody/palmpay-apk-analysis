package com.palmpay.image.webp;

import V7.g;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import com.didiglobal.booster.instrument.ShadowThread;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
public class XGLTextureView extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {
    public static final g t = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f23733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f23734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Renderer f23735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLConfigChooser f23737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EGLContextFactory f23738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EGLWindowSurfaceFactory f23739g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GLWrapper f23740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23741j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23742o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f23743p;

    public interface EGLConfigChooser {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    public interface EGLContextFactory {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    public interface EGLWindowSurfaceFactory {
        EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    public interface GLWrapper {
        GL wrap(GL gl);
    }

    public interface Renderer {
        void onDrawFrame(GL10 gl10);

        void onSurfaceChanged(GL10 gl10, int i7, int i10);

        void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig);
    }

    public XGLTextureView(Context context) {
        super(context);
        this.f23733a = new WeakReference(this);
        setSurfaceTextureListener(this);
    }

    public final void a() {
        if (this.f23734b != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public final void b(int i7, int i10) {
        f fVar = this.f23734b;
        fVar.getClass();
        g gVar = t;
        synchronized (gVar) {
            fVar.f23782j = i7;
            fVar.f23783o = i10;
            fVar.f23771A = true;
            fVar.t = true;
            fVar.f23785v = false;
            gVar.notifyAll();
            while (!fVar.f23775b && !fVar.f23785v && fVar.f23779f && fVar.f23780g && fVar.b()) {
                try {
                    t.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            f fVar = this.f23734b;
            if (fVar != null) {
                fVar.c();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f23741j;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f23743p;
    }

    public int getRenderMode() {
        int i7;
        f fVar = this.f23734b;
        fVar.getClass();
        synchronized (t) {
            i7 = fVar.f23784p;
        }
        return i7;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        int i7;
        super.onAttachedToWindow();
        if (this.f23736d && this.f23735c != null) {
            f fVar = this.f23734b;
            if (fVar != null) {
                synchronized (t) {
                    i7 = fVar.f23784p;
                }
            } else {
                i7 = 1;
            }
            f fVar2 = new f(this.f23733a);
            this.f23734b = fVar2;
            if (i7 != 1) {
                fVar2.d(i7);
            }
            ShadowThread.setThreadName(this.f23734b, "\u200bcom.palmpay.image.webp.XGLTextureView").start();
        }
        this.f23736d = false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        f fVar = this.f23734b;
        if (fVar != null) {
            fVar.c();
        }
        this.f23736d = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        getSurfaceTexture();
        b(i11 - i7, i12 - i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        f fVar = this.f23734b;
        fVar.getClass();
        g gVar = t;
        synchronized (gVar) {
            fVar.f23776c = true;
            gVar.notifyAll();
            while (fVar.f23778e && !fVar.f23775b) {
                try {
                    t.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        b(i7, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f fVar = this.f23734b;
        fVar.getClass();
        g gVar = t;
        synchronized (gVar) {
            fVar.f23776c = false;
            gVar.notifyAll();
            while (!fVar.f23778e && !fVar.f23775b) {
                try {
                    t.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        b(i7, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setDebugFlags(int i7) {
        this.f23741j = i7;
    }

    public void setEGLConfigChooser(EGLConfigChooser eGLConfigChooser) {
        a();
        this.f23737e = eGLConfigChooser;
    }

    public void setEGLContextClientVersion(int i7) {
        a();
        this.f23742o = i7;
    }

    public void setEGLContextFactory(EGLContextFactory eGLContextFactory) {
        a();
        this.f23738f = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        a();
        this.f23739g = eGLWindowSurfaceFactory;
    }

    public void setGLWrapper(GLWrapper gLWrapper) {
        this.f23740i = gLWrapper;
    }

    public void setPreserveEGLContextOnPause(boolean z3) {
        this.f23743p = z3;
    }

    public void setRenderMode(int i7) {
        this.f23734b.d(i7);
    }

    public void setRenderer(Renderer renderer) {
        a();
        if (this.f23737e == null) {
            this.f23737e = new p063e6.c(this, true);
        }
        if (this.f23738f == null) {
            this.f23738f = new c(this);
        }
        if (this.f23739g == null) {
            this.f23739g = new d();
        }
        this.f23735c = renderer;
        f fVar = new f(this.f23733a);
        this.f23734b = fVar;
        ShadowThread.setThreadName(fVar, "\u200bcom.palmpay.image.webp.XGLTextureView").start();
    }

    public void setEGLConfigChooser(boolean z3) {
        setEGLConfigChooser(new p063e6.c(this, z3));
    }

    public XGLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23733a = new WeakReference(this);
        setSurfaceTextureListener(this);
    }
}
