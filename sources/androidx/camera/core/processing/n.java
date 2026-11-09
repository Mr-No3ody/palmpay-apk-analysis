package androidx.camera.core.processing;

import E.AbstractC0198c;
import E.C0202g;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import androidx.biometric.RunnableC0903g;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.L;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class n implements SurfaceOutput {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Surface f14442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f14445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f14446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f14447g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Consumer f14448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Executor f14449j;
    public final androidx.concurrent.futures.m t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.concurrent.futures.k f14452v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Matrix f14453w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14441a = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14450o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14451p = false;

    public n(Surface surface, int i7, int i10, Size size, C0202g c0202g, C0202g c0202g2, Matrix matrix) {
        float[] fArr = new float[16];
        this.f14446f = fArr;
        float[] fArr2 = new float[16];
        this.f14447g = fArr2;
        this.f14442b = surface;
        this.f14443c = i7;
        this.f14444d = i10;
        this.f14445e = size;
        this.f14453w = matrix;
        a(fArr, new float[16], c0202g);
        a(fArr2, new float[16], c0202g2);
        this.t = AbstractC0198c.y(new L(this, 3));
    }

    public static void a(float[] fArr, float[] fArr2, C0202g c0202g) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (c0202g == null) {
            return;
        }
        p059e1.a.T(fArr);
        int i7 = c0202g.f2030d;
        p059e1.a.S(i7, fArr);
        boolean z3 = c0202g.f2031e;
        if (z3) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size size = c0202g.f2027a;
        Size sizeG = androidx.camera.core.impl.utils.o.g(size, i7);
        float f10 = 0;
        Matrix matrixA = androidx.camera.core.impl.utils.o.a(i7, z3, new RectF(f10, f10, size.getWidth(), size.getHeight()), new RectF(f10, f10, sizeG.getWidth(), sizeG.getHeight()));
        RectF rectF = new RectF(c0202g.f2028b);
        matrixA.mapRect(rectF);
        float width = rectF.left / sizeG.getWidth();
        float height = ((sizeG.getHeight() - rectF.height()) - rectF.top) / sizeG.getHeight();
        float fWidth = rectF.width() / sizeG.getWidth();
        float fHeight = rectF.height() / sizeG.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        android.opengl.Matrix.setIdentityM(fArr2, 0);
        p059e1.a.T(fArr2);
        CameraInternal cameraInternal = c0202g.f2029c;
        if (cameraInternal != null) {
            p118hf.a.k(cameraInternal.getHasTransform(), "Camera has no transform.");
            p059e1.a.S(cameraInternal.getCameraInfo().getSensorRotationDegrees(), fArr2);
            if (cameraInternal.isFrontFacing()) {
                android.opengl.Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr2, 0, fArr2, 0);
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    public final void b() {
        Executor executor;
        Consumer consumer;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f14441a) {
            try {
                if (this.f14449j == null || (consumer = this.f14448i) == null) {
                    this.f14450o = true;
                } else if (!this.f14451p) {
                    atomicReference.set(consumer);
                    executor = this.f14449j;
                    this.f14450o = false;
                }
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new RunnableC0903g(21, this, atomicReference));
            } catch (RejectedExecutionException unused) {
                p140j8.f.G("SurfaceOutputImpl");
            }
        }
    }

    @Override // androidx.camera.core.SurfaceOutput, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f14441a) {
            try {
                if (!this.f14451p) {
                    this.f14451p = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f14452v.b(null);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final int getFormat() {
        return this.f14444d;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final Matrix getSensorToBufferTransform() {
        return new Matrix(this.f14453w);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final Size getSize() {
        return this.f14445e;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final Surface getSurface(Executor executor, Consumer consumer) {
        boolean z3;
        synchronized (this.f14441a) {
            this.f14449j = executor;
            this.f14448i = consumer;
            z3 = this.f14450o;
        }
        if (z3) {
            b();
        }
        return this.f14442b;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final int getTargets() {
        return this.f14443c;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final void updateTransformMatrix(float[] fArr, float[] fArr2) {
        updateTransformMatrix(fArr, fArr2, true);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final void updateTransformMatrix(float[] fArr, float[] fArr2, boolean z3) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z3 ? this.f14446f : this.f14447g, 0);
    }
}
