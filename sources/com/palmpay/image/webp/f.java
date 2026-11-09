package com.palmpay.image.webp;

import V7.g;
import android.opengl.GLDebugHelper;
import androidx.fragment.app.u0;
import com.didiglobal.booster.instrument.ShadowThread;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Thread {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f23771A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public e f23772B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final WeakReference f23773C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23780g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23782j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23783o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f23784p;
    public boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f23785v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f23786w;

    public f(WeakReference weakReference) {
        super("\u200bcom.palmpay.image.webp.XGLTextureView$GLThread");
        this.f23786w = new ArrayList();
        this.f23771A = true;
        this.f23782j = 0;
        this.f23783o = 0;
        this.t = true;
        this.f23784p = 1;
        this.f23773C = weakReference;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0210 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x010d A[Catch: all -> 0x0034, TryCatch #1 {, blocks: (B:5:0x0021, B:7:0x0025, B:18:0x0037, B:20:0x0040, B:83:0x0120, B:21:0x0050, B:23:0x0054, B:25:0x0060, B:26:0x0067, B:28:0x006b, B:30:0x006f, B:32:0x0073, B:33:0x0076, B:34:0x0080, B:36:0x0084, B:38:0x0088, B:40:0x0092, B:41:0x009b, B:43:0x00a1, B:71:0x00f7, B:73:0x00fb, B:75:0x00ff, B:76:0x0105, B:78:0x0109, B:80:0x010d, B:82:0x0119, B:155:0x0201, B:47:0x00ac, B:51:0x00b9, B:53:0x00bf, B:54:0x00c2, B:61:0x00d6, B:63:0x00dc, B:65:0x00e5, B:67:0x00ed, B:68:0x00f0, B:69:0x00f3, B:58:0x00c9, B:60:0x00d1), top: B:168:0x0021, outer: #5, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0118  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.io.Writer] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [int] */
    /* JADX WARN: Type inference failed for: r9v12 */
    public final void a() {
        boolean z3;
        boolean z8;
        Runnable runnable;
        boolean z10;
        WeakReference weakReference = this.f23773C;
        e eVar = new e();
        eVar.f23765a = weakReference;
        this.f23772B = eVar;
        this.f23779f = false;
        this.f23780g = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        int i7 = 0;
        int i10 = 0;
        boolean z18 = false;
        GL10 gl10 = null;
        Runnable runnable2 = null;
        while (true) {
            try {
                synchronized (XGLTextureView.t) {
                    while (true) {
                        if (this.f23774a) {
                            synchronized (XGLTextureView.t) {
                                f();
                                e();
                            }
                            return;
                        }
                        if (!this.f23786w.isEmpty()) {
                            runnable2 = (Runnable) this.f23786w.remove(0);
                            z3 = z11;
                            z8 = false;
                            runnable = null;
                            break;
                        }
                        if (this.f23781i) {
                            f();
                            e();
                            this.f23781i = false;
                            z13 = true;
                        }
                        if (z11) {
                            f();
                            e();
                            z11 = false;
                        }
                        if (!this.f23776c && !this.f23778e) {
                            if (this.f23780g) {
                                f();
                            }
                            this.f23778e = true;
                            this.f23777d = false;
                            XGLTextureView.t.notifyAll();
                        }
                        if (this.f23776c && this.f23778e) {
                            this.f23778e = false;
                            XGLTextureView.t.notifyAll();
                        }
                        if (z12) {
                            this.f23785v = true;
                            XGLTextureView.t.notifyAll();
                            z12 = false;
                            z18 = false;
                        }
                        if (b()) {
                            if (this.f23779f) {
                                z3 = z11;
                            } else {
                                if (z13) {
                                    z3 = z11;
                                    runnable = null;
                                    z13 = false;
                                } else {
                                    g gVar = XGLTextureView.t;
                                    f fVar = (f) gVar.f10099d;
                                    if (fVar == this || fVar == null) {
                                        z3 = z11;
                                        gVar.f10099d = this;
                                        gVar.notifyAll();
                                    } else {
                                        z3 = z11;
                                        if (!gVar.f10096a) {
                                            gVar.f10096a = true;
                                        }
                                        if (!gVar.f10098c) {
                                            if (fVar != null) {
                                                fVar.f23781i = true;
                                                gVar.notifyAll();
                                            }
                                        }
                                    }
                                    try {
                                        this.f23772B.d();
                                        this.f23779f = true;
                                        gVar.notifyAll();
                                        runnable = null;
                                        z14 = true;
                                    } catch (RuntimeException e10) {
                                        g gVar2 = XGLTextureView.t;
                                        if (((f) gVar2.f10099d) == this) {
                                            gVar2.f10099d = null;
                                        }
                                        gVar2.notifyAll();
                                        throw e10;
                                    }
                                }
                                if (this.f23779f && !this.f23780g) {
                                    this.f23780g = true;
                                    z15 = true;
                                    z16 = true;
                                    z17 = true;
                                }
                                if (this.f23780g) {
                                    if (this.f23771A) {
                                        i7 = this.f23782j;
                                        i10 = this.f23783o;
                                        z8 = false;
                                        this.f23771A = false;
                                        z15 = true;
                                        z17 = true;
                                        z18 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    this.t = z8;
                                    XGLTextureView.t.notifyAll();
                                    break;
                                }
                            }
                            runnable = null;
                            if (this.f23779f) {
                                this.f23780g = true;
                                z15 = true;
                                z16 = true;
                                z17 = true;
                            }
                            if (this.f23780g) {
                                if (this.f23771A) {
                                    i7 = this.f23782j;
                                    i10 = this.f23783o;
                                    z8 = false;
                                    this.f23771A = false;
                                    z15 = true;
                                    z17 = true;
                                    z18 = true;
                                } else {
                                    z8 = false;
                                }
                                this.t = z8;
                                XGLTextureView.t.notifyAll();
                                break;
                            }
                        } else {
                            z3 = z11;
                        }
                        XGLTextureView.t.wait();
                        z11 = z3;
                    }
                }
                if (runnable2 != null) {
                    runnable2.run();
                    runnable2 = runnable;
                } else {
                    if (z15) {
                        if (this.f23772B.a()) {
                            z15 = z8;
                        } else {
                            g gVar3 = XGLTextureView.t;
                            synchronized (gVar3) {
                                this.f23777d = true;
                                gVar3.notifyAll();
                            }
                        }
                        synchronized (XGLTextureView.t) {
                            f();
                            e();
                            throw th;
                        }
                    }
                    if (z16) {
                        e eVar2 = this.f23772B;
                        GL gl = eVar2.f23770f.getGL();
                        XGLTextureView xGLTextureView = (XGLTextureView) eVar2.f23765a.get();
                        if (xGLTextureView != null) {
                            XGLTextureView.GLWrapper gLWrapper = xGLTextureView.f23740i;
                            if (gLWrapper != null) {
                                gl = gLWrapper.wrap(gl);
                            }
                            int i11 = xGLTextureView.f23741j;
                            if ((i11 & 3) != 0) {
                                gl = GLDebugHelper.wrap(gl, (int) ((i11 & 1) != 0 ? 1 : z8), (Writer) ((i11 & 2) != 0 ? new u0(1) : runnable));
                            }
                        }
                        gl10 = (GL10) gl;
                        XGLTextureView.t.a(gl10);
                        z16 = z8;
                    }
                    if (z14) {
                        XGLTextureView xGLTextureView2 = (XGLTextureView) this.f23773C.get();
                        if (xGLTextureView2 != null) {
                            xGLTextureView2.f23735c.onSurfaceCreated(gl10, this.f23772B.f23769e);
                        }
                        z14 = z8;
                    }
                    if (z17) {
                        XGLTextureView xGLTextureView3 = (XGLTextureView) this.f23773C.get();
                        if (xGLTextureView3 != null) {
                            xGLTextureView3.f23735c.onSurfaceChanged(gl10, i7, i10);
                        }
                        z17 = z8;
                    }
                    XGLTextureView xGLTextureView4 = (XGLTextureView) this.f23773C.get();
                    if (xGLTextureView4 != null) {
                        xGLTextureView4.f23735c.onDrawFrame(gl10);
                    }
                    e eVar3 = this.f23772B;
                    int iEglGetError = !eVar3.f23766b.eglSwapBuffers(eVar3.f23767c, eVar3.f23768d) ? eVar3.f23766b.eglGetError() : 12288;
                    if (iEglGetError == 12288) {
                        z10 = true;
                    } else if (iEglGetError != 12302) {
                        e.c(iEglGetError, "eglSwapBuffers");
                        g gVar4 = XGLTextureView.t;
                        synchronized (gVar4) {
                            z10 = true;
                            this.f23777d = true;
                            gVar4.notifyAll();
                        }
                    } else {
                        z10 = true;
                        z3 = true;
                    }
                    if (z18) {
                        z12 = z10;
                    }
                    z11 = z3;
                }
                z11 = z3;
            } catch (Throwable th) {
                synchronized (XGLTextureView.t) {
                    f();
                    e();
                    throw th;
                }
            }
        }
    }

    public final boolean b() {
        if (!this.f23776c || this.f23777d || this.f23782j <= 0 || this.f23783o <= 0) {
            return false;
        }
        return this.t || this.f23784p == 1;
    }

    public final void c() {
        g gVar = XGLTextureView.t;
        synchronized (gVar) {
            this.f23774a = true;
            gVar.notifyAll();
            while (!this.f23775b) {
                try {
                    XGLTextureView.t.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final void d(int i7) {
        if (i7 < 0 || i7 > 1) {
            throw new IllegalArgumentException("renderMode");
        }
        g gVar = XGLTextureView.t;
        synchronized (gVar) {
            this.f23784p = i7;
            gVar.notifyAll();
        }
    }

    public final void e() {
        if (this.f23779f) {
            e eVar = this.f23772B;
            if (eVar.f23770f != null) {
                XGLTextureView xGLTextureView = (XGLTextureView) eVar.f23765a.get();
                if (xGLTextureView != null) {
                    xGLTextureView.f23738f.destroyContext(eVar.f23766b, eVar.f23767c, eVar.f23770f);
                }
                eVar.f23770f = null;
            }
            EGLDisplay eGLDisplay = eVar.f23767c;
            if (eGLDisplay != null) {
                eVar.f23766b.eglTerminate(eGLDisplay);
                eVar.f23767c = null;
            }
            this.f23779f = false;
            g gVar = XGLTextureView.t;
            if (((f) gVar.f10099d) == this) {
                gVar.f10099d = null;
            }
            gVar.notifyAll();
        }
    }

    public final void f() {
        if (this.f23780g) {
            this.f23780g = false;
            this.f23772B.b();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        setName(ShadowThread.makeThreadName("GLThread " + getId(), "\u200bcom.palmpay.image.webp.XGLTextureView$GLThread"));
        try {
            a();
            XGLTextureView.t.f(this);
        } catch (InterruptedException unused) {
            g gVar = XGLTextureView.t;
            XGLTextureView.t.f(this);
        } catch (Throwable th) {
            g gVar2 = XGLTextureView.t;
            XGLTextureView.t.f(this);
            throw th;
        }
    }
}
