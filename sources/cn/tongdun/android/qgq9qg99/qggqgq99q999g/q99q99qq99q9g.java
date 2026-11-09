package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class q99q99qq99q9g {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private EGLConfig f19105q999ggg99999qqggqqg9qg;
    private EGLContext qgq9qg99;
    private EGLDisplay qqggggg9g9q99q9gq;

    public q99q99qq99q9g(EGLContext eGLContext, int i7) {
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.qqggggg9g9q99q9gq = eGLDisplay;
        this.qgq9qg99 = EGL14.EGL_NO_CONTEXT;
        this.f19105q999ggg99999qqggqqg9qg = null;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException(q999ggg99999qqggqqg9qg("36222b4c612d3e3724253d79733631747525", 50));
        }
        EGLContext eGLContext2 = EGL14.EGL_NO_CONTEXT;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.qqggggg9g9q99q9gq = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException(q999ggg99999qqggqqg9qg("0634202c21266a7b3460682d3e7b4a2d24522a3b6b22352c332237", 61));
        }
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[2], 0, new int[2], 1)) {
            this.qqggggg9g9q99q9gq = null;
            throw new RuntimeException(q999ggg99999qqggqqg9qg("061a0e020f0844551a4e4806061c1c090c04121e4464030a7c04", 19));
        }
        EGLConfig eGLConfigQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(2, 3);
        if (eGLConfigQ999ggg99999qqggqqg9qg != null) {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.qqggggg9g9q99q9gq, eGLConfigQ999ggg99999qqggqqg9qg, eGLContext2, new int[]{12440, 3, 12344}, 0);
            if (EGL14.eglGetError() == 12288) {
                this.f19105q999ggg99999qqggqqg9qg = eGLConfigQ999ggg99999qqggqqg9qg;
                this.qgq9qg99 = eGLContextEglCreateContext;
            }
        }
        if (this.qgq9qg99 == EGL14.EGL_NO_CONTEXT) {
            EGLConfig eGLConfigQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg(2, 2);
            if (eGLConfigQ999ggg99999qqggqqg9qg2 == null) {
                throw new RuntimeException(q999ggg99999qqggqqg9qg("266a5e525f5814054a1e175e565b15101002574d4c44525f581434535a5e7d50595e5f", 67));
            }
            EGLContext eGLContextEglCreateContext2 = EGL14.eglCreateContext(this.qqggggg9g9q99q9gq, eGLConfigQ999ggg99999qqggqqg9qg2, eGLContext2, new int[]{12440, 2, 12344}, 0);
            int iEglGetError = EGL14.eglGetError();
            if (iEglGetError != 12288) {
                throw new RuntimeException(q999ggg99999qqggqqg9qg("165d54706e485b4a4e79735e454e425311453a5d54331a485f424217454f17", 77) + Integer.toHexString(iEglGetError));
            }
            this.f19105q999ggg99999qqggqqg9qg = eGLConfigQ999ggg99999qqggqqg9qg2;
            this.qgq9qg99 = eGLContextEglCreateContext2;
        }
        EGL14.eglQueryContext(this.qqggggg9g9q99q9gq, this.qgq9qg99, 12440, new int[1], 0);
    }

    private EGLConfig q999ggg99999qqggqqg9qg(int i7, int i10) {
        int[] iArr = new int[13];
        iArr[0] = 12324;
        iArr[1] = 8;
        iArr[2] = 12323;
        iArr[3] = 8;
        iArr[4] = 12322;
        iArr[5] = 8;
        iArr[6] = 12321;
        iArr[7] = 8;
        iArr[8] = 12352;
        iArr[9] = i10 >= 3 ? 68 : 4;
        iArr[10] = 12344;
        iArr[11] = 0;
        iArr[12] = 12344;
        if ((i7 & 1) != 0) {
            iArr[10] = 12610;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.qqggggg9g9q99q9gq, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        return null;
    }

    public final void finalize() throws Throwable {
        try {
            EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        } finally {
            super.finalize();
        }
    }

    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 18);
            byte b10 = (byte) (bArr[0] ^ 115);
            bArr[0] = b10;
            for (int i12 = 1; i12 < length; i12++) {
                b10 = (byte) ((b10 ^ bArr[i12]) ^ b7);
                bArr[i12] = b10;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public final void q999ggg99999qqggqqg9qg() {
        EGLDisplay eGLDisplay = this.qqggggg9g9q99q9gq;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGLContext eGLContext = this.qgq9qg99;
            if (eGLContext != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.qqggggg9g9q99q9gq, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.qqggggg9g9q99q9gq);
        }
        this.qqggggg9g9q99q9gq = EGL14.EGL_NO_DISPLAY;
        this.qgq9qg99 = EGL14.EGL_NO_CONTEXT;
        this.f19105q999ggg99999qqggqqg9qg = null;
    }

    public final void q999ggg99999qqggqqg9qg(EGLSurface eGLSurface) {
        if (!EGL14.eglMakeCurrent(this.qqggggg9g9q99q9gq, eGLSurface, eGLSurface, this.qgq9qg99)) {
            throw new RuntimeException(q999ggg99999qqggqqg9qg("1649406a6741456d7d4c4b5c40511f0d4c434e424a", 89));
        }
    }
}
