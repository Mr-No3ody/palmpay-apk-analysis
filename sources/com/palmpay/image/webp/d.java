package com.palmpay.image.webp;

import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements XGLTextureView.EGLWindowSurfaceFactory {
    @Override // com.palmpay.image.webp.XGLTextureView.EGLWindowSurfaceFactory
    public final EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
        try {
            return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
        } catch (IllegalArgumentException e10) {
            Log.e("GLTextureView", "eglCreateWindowSurface", e10);
            return null;
        }
    }

    @Override // com.palmpay.image.webp.XGLTextureView.EGLWindowSurfaceFactory
    public final void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        egl10.eglDestroySurface(eGLDisplay, eGLSurface);
    }
}
