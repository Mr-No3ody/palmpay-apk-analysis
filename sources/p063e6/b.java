package p063e6;

import com.palmpay.image.webp.XGLTextureView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes3.dex */
public class b extends com.palmpay.image.webp.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f36169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f36172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f36173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f36174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ XGLTextureView f36175i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(XGLTextureView xGLTextureView, int i7, int i10) {
        super(xGLTextureView, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, i7, 12325, i10, 12326, 0, 12344});
        this.f36175i = xGLTextureView;
        this.f36169c = new int[1];
        this.f36170d = 8;
        this.f36171e = 8;
        this.f36172f = 8;
        this.f36173g = i7;
        this.f36174h = i10;
    }

    public final int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i7) {
        int[] iArr = this.f36169c;
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i7, iArr)) {
            return iArr[0];
        }
        return 0;
    }
}
