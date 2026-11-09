package androidx.camera.core.processing;

import E.AbstractC0198c;
import E.C0216v;
import E.i0;
import E.m0;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.biometric.RunnableC0903g;
import androidx.camera.camera2.internal.RunnableC0930h;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.SurfaceOutput;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import com.google.common.util.concurrent.ListenableFuture;
import com.palmpay.lib.webview.cache.WebCacheConstant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p355xf.u;

/* JADX INFO: loaded from: classes.dex */
public final class f implements SurfaceProcessorInternal, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f14388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f14389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.d f14390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f14391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f14392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f14393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f14394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f14395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f14398k;

    public f(C0216v c0216v) {
        Map map = Collections.EMPTY_MAP;
        this.f14392e = new AtomicBoolean(false);
        this.f14393f = new float[16];
        this.f14394g = new float[16];
        this.f14395h = new LinkedHashMap();
        this.f14396i = 0;
        this.f14397j = false;
        this.f14398k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f14389b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f14391d = handler;
        this.f14390c = new androidx.camera.core.impl.utils.executor.d(handler);
        this.f14388a = new h();
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
        if (this.f14397j && this.f14396i == 0) {
            LinkedHashMap linkedHashMap = this.f14395h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((SurfaceOutput) it.next()).close();
            }
            Iterator it2 = this.f14398k.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).f14370c.d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            h hVar = this.f14388a;
            if (hVar.f14400a.getAndSet(false)) {
                H.j.c(hVar.f14402c);
                hVar.h();
            }
            this.f14389b.quit();
        }
    }

    public final void b(Runnable runnable, Runnable runnable2) {
        try {
            this.f14390c.execute(new Da.h(this, 21, runnable2, runnable));
        } catch (RejectedExecutionException unused) {
            p140j8.f.G("DefaultSurfaceProcessor");
            runnable2.run();
        }
    }

    public final void c(Exception exc) {
        ArrayList arrayList = this.f14398k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).f14370c.d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap d(Size size, float[] fArr, int i7) {
        float[] fArr2 = (float[]) fArr.clone();
        p059e1.a.S(i7, fArr2);
        p059e1.a.T(fArr2);
        Size sizeG = androidx.camera.core.impl.utils.o.g(size, i7);
        h hVar = this.f14388a;
        hVar.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeG.getHeight() * sizeG.getWidth() * 4);
        p118hf.a.g(byteBufferAllocateDirect.capacity() == (sizeG.getHeight() * sizeG.getWidth()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        p118hf.a.g(byteBufferAllocateDirect.isDirect(), "ByteBuffer is not direct.");
        int[] iArr = H.j.f3524a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        H.j.b("glGenTextures");
        int i10 = iArr2[0];
        GLES20.glActiveTexture(33985);
        H.j.b("glActiveTexture");
        GLES20.glBindTexture(3553, i10);
        H.j.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeG.getWidth(), sizeG.getHeight(), 0, 6407, 5121, null);
        H.j.b("glTexImage2D");
        GLES20.glTexParameteri(3553, WebCacheConstant.NET_READ_BUFFER_SIZE, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        H.j.b("glGenFramebuffers");
        int i11 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i11);
        H.j.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i10, 0);
        H.j.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        H.j.b("glActiveTexture");
        GLES20.glBindTexture(36197, hVar.f14412m);
        H.j.b("glBindTexture");
        hVar.f14408i = null;
        GLES20.glViewport(0, 0, sizeG.getWidth(), sizeG.getHeight());
        GLES20.glScissor(0, 0, sizeG.getWidth(), sizeG.getHeight());
        H.h hVar2 = hVar.f14410k;
        hVar2.getClass();
        if (hVar2 instanceof H.i) {
            GLES20.glUniformMatrix4fv(((H.i) hVar2).f3522f, 1, false, fArr2, 0);
            H.j.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        H.j.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeG.getWidth(), sizeG.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        H.j.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        H.j.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i11}, 0);
        H.j.b("glDeleteFramebuffers");
        int i12 = hVar.f14412m;
        GLES20.glActiveTexture(33984);
        H.j.b("glActiveTexture");
        GLES20.glBindTexture(36197, i12);
        H.j.b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeG.getWidth(), sizeG.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.e(bitmapCreateBitmap, byteBufferAllocateDirect, sizeG.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void e(u uVar) {
        ArrayList arrayList = this.f14398k;
        if (arrayList.isEmpty()) {
            return;
        }
        if (uVar == null) {
            c(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int i7 = -1;
                int i10 = -1;
                Bitmap bitmapD = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    int i11 = aVar.f14369b;
                    if (i7 != i11 || bitmapD == null) {
                        if (bitmapD != null) {
                            bitmapD.recycle();
                        }
                        bitmapD = d((Size) uVar.f43986b, (float[]) uVar.f43987c, i11);
                        i10 = -1;
                        i7 = i11;
                    }
                    int i12 = aVar.f14368a;
                    if (i10 != i12) {
                        byteArrayOutputStream.reset();
                        bitmapD.compress(Bitmap.CompressFormat.JPEG, i12, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                        i10 = i12;
                    }
                    Surface surface = (Surface) uVar.f43985a;
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.h(byteArray, surface);
                    aVar.f14370c.b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            c(e10);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f14392e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f14393f;
        surfaceTexture.getTransformMatrix(fArr);
        u uVar = null;
        for (Map.Entry entry : this.f14395h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            SurfaceOutput surfaceOutput = (SurfaceOutput) entry.getKey();
            float[] fArr2 = this.f14394g;
            surfaceOutput.updateTransformMatrix(fArr2, fArr);
            if (surfaceOutput.getFormat() == 34) {
                try {
                    this.f14388a.j(surfaceTexture.getTimestamp(), fArr2, surface);
                } catch (RuntimeException e10) {
                    p140j8.f.h("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            } else {
                p118hf.a.k(surfaceOutput.getFormat() == 256, "Unsupported format: " + surfaceOutput.getFormat());
                p118hf.a.k(uVar == null, "Only one JPEG output is supported.");
                uVar = new u(surface, surfaceOutput.getSize(), (float[]) fArr2.clone());
            }
        }
        try {
            e(uVar);
        } catch (RuntimeException e11) {
            c(e11);
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public final void onInputSurface(m0 m0Var) {
        if (this.f14392e.get()) {
            m0Var.d();
            return;
        }
        RunnableC0903g runnableC0903g = new RunnableC0903g(19, this, m0Var);
        Objects.requireNonNull(m0Var);
        b(runnableC0903g, new i0(m0Var, 1));
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public final void onOutputSurface(SurfaceOutput surfaceOutput) {
        if (this.f14392e.get()) {
            surfaceOutput.close();
            return;
        }
        RunnableC0903g runnableC0903g = new RunnableC0903g(18, this, surfaceOutput);
        Objects.requireNonNull(surfaceOutput);
        b(runnableC0903g, new W8.o(surfaceOutput, 16));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public final void release() {
        if (this.f14392e.getAndSet(true)) {
            return;
        }
        b(new W8.o(this, 17), new RunnableC0930h(0));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public final ListenableFuture snapshot(final int i7, final int i10) {
        return androidx.camera.core.impl.utils.futures.j.e(AbstractC0198c.y(new CallbackToFutureAdapter$Resolver() { // from class: androidx.camera.core.processing.e
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
            public final Object attachCompleter(androidx.concurrent.futures.k kVar) {
                f fVar = this.f14385a;
                fVar.b(new RunnableC0903g(20, fVar, new a(i7, i10, kVar)), new androidx.camera.core.impl.utils.futures.g(1, kVar));
                return "DefaultSurfaceProcessor#snapshot";
            }
        }));
    }
}
