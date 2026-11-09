package com.palmpay.image.webp;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements XGLTextureView.EGLConfigChooser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f23762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XGLTextureView f23763b;

    public b(XGLTextureView xGLTextureView, int[] iArr) {
        this.f23763b = xGLTextureView;
        if (xGLTextureView.f23742o == 2) {
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i7 = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            iArr2[i7] = 12352;
            iArr2[length] = 4;
            iArr2[length + 1] = 12344;
            iArr = iArr2;
        }
        this.f23762a = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    @Override // com.palmpay.image.webp.XGLTextureView.EGLConfigChooser
    public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        int[] iArr = new int[1];
        if (!egl10.eglChooseConfig(eGLDisplay, this.f23762a, null, 0, iArr)) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        int i7 = iArr[0];
        if (i7 <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i7];
        if (!egl10.eglChooseConfig(eGLDisplay, this.f23762a, eGLConfigArr, i7, iArr)) {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        p063e6.b bVar = (p063e6.b) this;
        for (int i10 = 0; i10 < i7; i10++) {
            eGLConfig = eGLConfigArr[i10];
            int iA = bVar.a(egl10, eGLDisplay, eGLConfig, 12325);
            int iA2 = bVar.a(egl10, eGLDisplay, eGLConfig, 12326);
            if (iA >= bVar.f36174h && iA2 >= 0) {
                int iA3 = bVar.a(egl10, eGLDisplay, eGLConfig, 12324);
                int iA4 = bVar.a(egl10, eGLDisplay, eGLConfig, 12323);
                int iA5 = bVar.a(egl10, eGLDisplay, eGLConfig, 12322);
                int iA6 = bVar.a(egl10, eGLDisplay, eGLConfig, 12321);
                if (iA3 == bVar.f36170d && iA4 == bVar.f36171e && iA5 == bVar.f36172f && iA6 == bVar.f36173g) {
                    if (eGLConfig != null) {
                        return eGLConfig;
                    }
                    throw new IllegalArgumentException("No config chosen");
                }
            }
        }
        eGLConfig = null;
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw new IllegalArgumentException("No config chosen");
    }
}
