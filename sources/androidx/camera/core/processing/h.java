package androidx.camera.core.processing;

import E.C0216v;
import N8.q0;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.Surface;
import com.alibaba.android.arouter.utils.Consts;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Thread f14402c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EGLConfig f14406g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Surface f14408i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f14400a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f14401b = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLDisplay f14403d = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLContext f14404e = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f14405f = H.j.f3524a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EGLSurface f14407h = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f14409j = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public H.h f14410k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public H.g f14411l = H.g.f3513a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14412m = -1;

    public final void a(C0216v c0216v, H.a aVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f14403d = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f14403d, iArr, 0, iArr, 1)) {
            this.f14403d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (aVar != null) {
            String str = iArr[0] + Consts.DOT + iArr[1];
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            aVar.f3495b = str;
        }
        int i7 = c0216v.a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f14403d, new int[]{12324, i7, 12323, i7, 12322, i7, 12321, c0216v.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, c0216v.a() ? 64 : 4, 12610, c0216v.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f14403d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, c0216v.a() ? 3 : 2, 12344}, 0);
        H.j.a("eglCreateContext");
        this.f14406g = eGLConfig;
        this.f14404e = eGLContextEglCreateContext;
        EGL14.eglQueryContext(this.f14403d, eGLContextEglCreateContext, 12440, new int[1], 0);
    }

    public final H.d b(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f14403d;
            EGLConfig eGLConfig = this.f14406g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceH = H.j.h(eGLDisplay, eGLConfig, surface, this.f14405f);
            EGLDisplay eGLDisplay2 = this.f14403d;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceH, 12375, iArr, 0);
            int i7 = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceH, 12374, iArr2, 0);
            Size size = new Size(i7, iArr2[0]);
            return new H.d(eGLSurfaceH, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            e10.getMessage();
            p140j8.f.G("OpenGlRenderer");
            return null;
        }
    }

    public final void c() {
        EGLDisplay eGLDisplay = this.f14403d;
        EGLConfig eGLConfig = this.f14406g;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = H.j.f3524a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        H.j.a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface == null) {
            throw new IllegalStateException("surface was null");
        }
        this.f14407h = eGLSurfaceEglCreatePbufferSurface;
    }

    public final p058e0.a d(C0216v c0216v) {
        H.j.d(this.f14400a, false);
        try {
            a(c0216v, null);
            c();
            f(this.f14407h);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.f14403d, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new p058e0.a(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e10) {
            e10.getMessage();
            p140j8.f.G("OpenGlRenderer");
            return new p058e0.a("", "");
        } finally {
            h();
        }
    }

    public H.b e(C0216v c0216v) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = this.f14400a;
        H.j.d(atomicBoolean, false);
        H.a aVar = new H.a();
        aVar.f3494a = IdManager.DEFAULT_VERSION_NAME;
        aVar.f3495b = IdManager.DEFAULT_VERSION_NAME;
        aVar.f3496c = "";
        aVar.f3497d = "";
        try {
            if (c0216v.a()) {
                p058e0.a aVarD = d(c0216v);
                String str = (String) aVarD.f35983a;
                str.getClass();
                String str2 = (String) aVarD.f35984b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    p140j8.f.G("OpenGlRenderer");
                    c0216v = C0216v.f2122d;
                }
                int[] iArr = H.j.f3524a;
                if (c0216v.f2128a == 3) {
                    if (str2.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                        iArr = H.j.f3525b;
                    } else {
                        p140j8.f.G("GLUtils");
                    }
                }
                this.f14405f = iArr;
                aVar.f3496c = str;
                aVar.f3497d = str2;
            }
            a(c0216v, aVar);
            c();
            f(this.f14407h);
            String strI = H.j.i();
            if (strI == null) {
                throw new NullPointerException("Null glVersion");
            }
            aVar.f3494a = strI;
            this.f14409j = H.j.f(c0216v);
            int iG = H.j.g();
            this.f14412m = iG;
            k(iG);
            this.f14402c = Thread.currentThread();
            atomicBoolean.set(true);
            String strJ = aVar.f3494a == null ? " glVersion" : "";
            if (aVar.f3495b == null) {
                strJ = strJ.concat(" eglVersion");
            }
            if (aVar.f3496c == null) {
                strJ = q0.j(strJ, " glExtensions");
            }
            if (aVar.f3497d == null) {
                strJ = q0.j(strJ, " eglExtensions");
            }
            if (strJ.isEmpty()) {
                return new H.b(aVar.f3494a, aVar.f3495b, aVar.f3496c, aVar.f3497d);
            }
            throw new IllegalStateException("Missing required properties:".concat(strJ));
        } catch (IllegalArgumentException e10) {
            e = e10;
            h();
            throw e;
        } catch (IllegalStateException e11) {
            e = e11;
            h();
            throw e;
        }
    }

    public final void f(EGLSurface eGLSurface) {
        this.f14403d.getClass();
        this.f14404e.getClass();
        if (!EGL14.eglMakeCurrent(this.f14403d, eGLSurface, eGLSurface, this.f14404e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public final void g(Surface surface) {
        H.j.d(this.f14400a, true);
        H.j.c(this.f14402c);
        HashMap map = this.f14401b;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, H.j.f3533j);
    }

    public final void h() {
        Iterator it = this.f14409j.values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((H.h) it.next()).f3517a);
        }
        this.f14409j = Collections.EMPTY_MAP;
        this.f14410k = null;
        if (!Objects.equals(this.f14403d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f14403d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap map = this.f14401b;
            for (H.d dVar : map.values()) {
                if (!Objects.equals(dVar.f3509a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f14403d, dVar.f3509a)) {
                    try {
                        H.j.a("eglDestroySurface");
                    } catch (IllegalStateException e10) {
                        p140j8.f.h("GLUtils", e10.toString(), e10);
                    }
                }
            }
            map.clear();
            if (!Objects.equals(this.f14407h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f14403d, this.f14407h);
                this.f14407h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f14404e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f14403d, this.f14404e);
                this.f14404e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f14403d);
            this.f14403d = EGL14.EGL_NO_DISPLAY;
        }
        this.f14406g = null;
        this.f14412m = -1;
        this.f14411l = H.g.f3513a;
        this.f14408i = null;
        this.f14402c = null;
    }

    public final void i(Surface surface, boolean z3) {
        if (this.f14408i == surface) {
            this.f14408i = null;
            f(this.f14407h);
        }
        HashMap map = this.f14401b;
        H.d dVar = z3 ? (H.d) map.remove(surface) : (H.d) map.put(surface, H.j.f3533j);
        if (dVar == null || dVar == H.j.f3533j) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f14403d, dVar.f3509a);
        } catch (RuntimeException e10) {
            e10.getMessage();
            p140j8.f.G("OpenGlRenderer");
        }
    }

    public final void j(long j6, float[] fArr, Surface surface) {
        H.j.d(this.f14400a, true);
        H.j.c(this.f14402c);
        HashMap map = this.f14401b;
        p118hf.a.k(map.containsKey(surface), "The surface is not registered.");
        H.d dVarB = (H.d) map.get(surface);
        Objects.requireNonNull(dVarB);
        if (dVarB == H.j.f3533j) {
            dVarB = b(surface);
            if (dVarB == null) {
                return;
            } else {
                map.put(surface, dVarB);
            }
        }
        Surface surface2 = this.f14408i;
        EGLSurface eGLSurface = dVarB.f3509a;
        if (surface != surface2) {
            f(eGLSurface);
            this.f14408i = surface;
            int i7 = dVarB.f3510b;
            int i10 = dVarB.f3511c;
            GLES20.glViewport(0, 0, i7, i10);
            GLES20.glScissor(0, 0, i7, i10);
        }
        H.h hVar = this.f14410k;
        hVar.getClass();
        if (hVar instanceof H.i) {
            GLES20.glUniformMatrix4fv(((H.i) hVar).f3522f, 1, false, fArr, 0);
            H.j.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        H.j.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f14403d, eGLSurface, j6);
        if (EGL14.eglSwapBuffers(this.f14403d, eGLSurface)) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        p140j8.f.G("OpenGlRenderer");
        i(surface, false);
    }

    public final void k(int i7) {
        H.h hVar = (H.h) this.f14409j.get(this.f14411l);
        if (hVar == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.f14411l);
        }
        if (this.f14410k != hVar) {
            this.f14410k = hVar;
            hVar.b();
            Objects.toString(this.f14411l);
            Objects.toString(this.f14410k);
        }
        GLES20.glActiveTexture(33984);
        H.j.b("glActiveTexture");
        GLES20.glBindTexture(36197, i7);
        H.j.b("glBindTexture");
    }
}
