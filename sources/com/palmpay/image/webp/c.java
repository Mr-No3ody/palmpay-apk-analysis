package com.palmpay.image.webp;

import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements XGLTextureView.EGLContextFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ XGLTextureView f23764a;

    public c(XGLTextureView xGLTextureView) {
        this.f23764a = xGLTextureView;
    }

    @Override // com.palmpay.image.webp.XGLTextureView.EGLContextFactory
    public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        int i7 = this.f23764a.f23742o;
        int[] iArr = {12440, i7, 12344};
        if (i7 == 0) {
            iArr = null;
        }
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr);
    }

    @Override // com.palmpay.image.webp.XGLTextureView.EGLContextFactory
    public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
            return;
        }
        Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
        throw new RuntimeException(e.c(egl10.eglGetError(), "eglDestroyContex"));
    }
}
