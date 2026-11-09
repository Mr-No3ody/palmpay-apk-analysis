package G;

import Ae.n;
import B6.RunnableC0085g;
import E.AbstractC0198c;
import E.C0216v;
import E.U;
import E.i0;
import E.m0;
import H.j;
import W8.o;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.camera.camera2.internal.RunnableC0930h;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class f implements SurfaceProcessorInternal, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f2870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f2871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.d f2872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f2873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f2876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f2877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SurfaceTexture f2878i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SurfaceTexture f2879j;

    public f(C0216v c0216v, U u6, U u10) {
        Map map = Collections.EMPTY_MAP;
        this.f2874e = 0;
        this.f2875f = false;
        this.f2876g = new AtomicBoolean(false);
        this.f2877h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f2871b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f2873d = handler;
        this.f2872c = new androidx.camera.core.impl.utils.executor.d(handler);
        this.f2870a = new c(u6, u10);
        try {
            try {
                AbstractC0198c.y(new defpackage.a(this, c0216v)).get();
            } catch (InterruptedException | ExecutionException e10) {
                e = e10;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e11) {
            release();
            throw e11;
        }
    }

    public final void a() {
        if (this.f2875f && this.f2874e == 0) {
            LinkedHashMap linkedHashMap = this.f2877h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((SurfaceOutput) it.next()).close();
            }
            linkedHashMap.clear();
            c cVar = this.f2870a;
            if (cVar.f14400a.getAndSet(false)) {
                j.c(cVar.f14402c);
                cVar.h();
            }
            cVar.f2860n = -1;
            cVar.f2861o = -1;
            this.f2871b.quit();
        }
    }

    public final void b(Runnable runnable, Runnable runnable2) {
        try {
            this.f2872c.execute(new Da.h(this, 2, runnable2, runnable));
        } catch (RejectedExecutionException unused) {
            p140j8.f.G("DualSurfaceProcessor");
            runnable2.run();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f2876g.get() || (surfaceTexture2 = this.f2878i) == null || this.f2879j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f2879j.updateTexImage();
        for (Map.Entry entry : this.f2877h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            SurfaceOutput surfaceOutput = (SurfaceOutput) entry.getKey();
            if (surfaceOutput.getFormat() == 34) {
                try {
                    this.f2870a.l(surfaceTexture.getTimestamp(), surface, surfaceOutput, this.f2878i, this.f2879j);
                } catch (RuntimeException e10) {
                    p140j8.f.h("DualSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            }
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public final void onInputSurface(m0 m0Var) {
        if (this.f2876g.get()) {
            m0Var.d();
            return;
        }
        RunnableC0085g runnableC0085g = new RunnableC0085g(12, this, m0Var);
        Objects.requireNonNull(m0Var);
        b(runnableC0085g, new i0(m0Var, 1));
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public final void onOutputSurface(SurfaceOutput surfaceOutput) {
        if (this.f2876g.get()) {
            surfaceOutput.close();
            return;
        }
        RunnableC0085g runnableC0085g = new RunnableC0085g(13, this, surfaceOutput);
        Objects.requireNonNull(surfaceOutput);
        b(runnableC0085g, new o(surfaceOutput, 16));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public final void release() {
        if (this.f2876g.getAndSet(true)) {
            return;
        }
        b(new n(this, 14), new RunnableC0930h(0));
    }
}
