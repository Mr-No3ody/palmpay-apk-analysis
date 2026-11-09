package com.palmpay.image.webp;

import android.util.Log;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f23765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EGL10 f23766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EGLDisplay f23767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLSurface f23768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLConfig f23769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EGLContext f23770f;

    public static String c(int i7, String str) {
        return str + " failed: " + i7;
    }

    public final boolean a() {
        if (this.f23766b == null) {
            throw new RuntimeException("egl not initialized");
        }
        if (this.f23767c == null) {
            throw new RuntimeException("eglDisplay not initialized");
        }
        if (this.f23769e == null) {
            throw new RuntimeException("mEglConfig not initialized");
        }
        b();
        XGLTextureView xGLTextureView = (XGLTextureView) this.f23765a.get();
        if (xGLTextureView != null) {
            this.f23768d = xGLTextureView.f23739g.createWindowSurface(this.f23766b, this.f23767c, this.f23769e, xGLTextureView.getSurfaceTexture());
        } else {
            this.f23768d = null;
        }
        EGLSurface eGLSurface = this.f23768d;
        if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
            if (this.f23766b.eglGetError() == 12299) {
                Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
            }
            return false;
        }
        if (this.f23766b.eglMakeCurrent(this.f23767c, eGLSurface, eGLSurface, this.f23770f)) {
            return true;
        }
        c(this.f23766b.eglGetError(), "eglMakeCurrent");
        return false;
    }

    public final void b() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f23768d;
        if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            return;
        }
        this.f23766b.eglMakeCurrent(this.f23767c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        XGLTextureView xGLTextureView = (XGLTextureView) this.f23765a.get();
        if (xGLTextureView != null) {
            xGLTextureView.f23739g.destroySurface(this.f23766b, this.f23767c, this.f23768d);
        }
        this.f23768d = null;
    }

    public final void d() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f23766b = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f23767c = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed");
        }
        if (!this.f23766b.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            throw new RuntimeException("eglInitialize failed");
        }
        XGLTextureView xGLTextureView = (XGLTextureView) this.f23765a.get();
        if (xGLTextureView == null) {
            this.f23769e = null;
            this.f23770f = null;
        } else {
            EGLConfig eGLConfigChooseConfig = xGLTextureView.f23737e.chooseConfig(this.f23766b, this.f23767c);
            this.f23769e = eGLConfigChooseConfig;
            this.f23770f = xGLTextureView.f23738f.createContext(this.f23766b, this.f23767c, eGLConfigChooseConfig);
        }
        EGLContext eGLContext = this.f23770f;
        if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
            this.f23770f = null;
            throw new RuntimeException(c(this.f23766b.eglGetError(), "createContext"));
        }
        this.f23768d = null;
    }
}
