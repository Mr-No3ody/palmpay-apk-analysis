package E;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class F implements ImageReaderProxy.OnImageAvailableListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ByteBuffer f1908A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ByteBuffer f1909B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ByteBuffer f1910C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Dg.a f1913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f1914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f1915c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f1917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f1918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f1919g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d0 f1920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageWriter f1921j;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ByteBuffer f1925w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f1916d = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Rect f1922o = new Rect();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Rect f1923p = new Rect();
    public Matrix t = new Matrix();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Matrix f1924v = new Matrix();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Object f1911H = new Object();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f1912L = true;

    public abstract ImageProxy a(ImageReaderProxy imageReaderProxy);

    public final ListenableFuture b(final ImageProxy imageProxy) throws Throwable {
        Object obj;
        final Executor executor;
        final Dg.a aVar;
        boolean z3;
        d0 d0Var;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        I i7;
        I iG;
        int i10 = this.f1917e ? this.f1914b : 0;
        Object obj2 = this.f1911H;
        synchronized (obj2) {
            try {
                try {
                    executor = this.f1919g;
                    aVar = this.f1913a;
                    z3 = this.f1917e && i10 != this.f1915c;
                    if (z3) {
                        g(imageProxy, i10);
                    }
                    if (this.f1917e) {
                        d(imageProxy);
                    }
                    try {
                        d0Var = this.f1920i;
                        try {
                            imageWriter = this.f1921j;
                            byteBuffer = this.f1925w;
                            try {
                                byteBuffer2 = this.f1908A;
                                byteBuffer3 = this.f1909B;
                                byteBuffer4 = this.f1910C;
                            } catch (Throwable th) {
                                th = th;
                                obj = obj2;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj = obj2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        if (aVar == null || executor == null || !this.f1912L) {
            return new androidx.camera.core.impl.utils.futures.l(new P0.c("No analyzer or executor currently set.", 4), 1);
        }
        if (d0Var == null) {
            i7 = null;
        } else {
            if (this.f1916d == 2) {
                iG = ImageProcessingUtil.d(imageProxy, d0Var, byteBuffer, i10, this.f1918f);
            } else {
                if (this.f1916d == 1) {
                    if (this.f1918f) {
                        ImageProcessingUtil.a(imageProxy);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        iG = ImageProcessingUtil.g(imageProxy, d0Var, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i10);
                    }
                }
                i7 = null;
            }
            i7 = iG;
        }
        boolean z8 = i7 == null;
        final ImageProxy imageProxy2 = z8 ? imageProxy : i7;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.f1911H) {
            if (z3 && !z8) {
                try {
                    f(imageProxy.getWidth(), imageProxy.getHeight(), imageProxy2.getWidth(), imageProxy2.getHeight());
                } catch (Throwable th6) {
                    throw th6;
                }
            }
            this.f1915c = i10;
            rect.set(this.f1923p);
            matrix.set(this.f1924v);
        }
        return AbstractC0198c.y(new CallbackToFutureAdapter$Resolver() { // from class: E.D
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
            public final Object attachCompleter(final androidx.concurrent.futures.k kVar) {
                final F f10 = this.f1894a;
                final ImageProxy imageProxy3 = imageProxy;
                final Matrix matrix2 = matrix;
                final Rect rect2 = rect;
                final Dg.a aVar2 = aVar;
                final ImageProxy imageProxy4 = imageProxy2;
                executor.execute(new Runnable() { // from class: E.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        F f11 = f10;
                        ImageProxy imageProxy5 = imageProxy3;
                        Matrix matrix3 = matrix2;
                        ImageProxy imageProxy6 = imageProxy4;
                        Rect rect3 = rect2;
                        Dg.a aVar3 = aVar2;
                        androidx.concurrent.futures.k kVar2 = kVar;
                        if (!f11.f1912L) {
                            kVar2.d(new P0.c("ImageAnalysis is detached", 4));
                            return;
                        }
                        e0 e0Var = new e0(imageProxy6, null, new C0201f(imageProxy5.getImageInfo().getTagBundle(), imageProxy5.getImageInfo().getTimestamp(), f11.f1917e ? 0 : f11.f1914b, matrix3));
                        if (!rect3.isEmpty()) {
                            e0Var.setCropRect(rect3);
                        }
                        aVar3.analyze(e0Var);
                        kVar2.b(null);
                    }
                });
                return "analyzeImage";
            }
        });
    }

    public abstract void c();

    public final void d(ImageProxy imageProxy) {
        if (this.f1916d != 1) {
            if (this.f1916d == 2 && this.f1925w == null) {
                this.f1925w = ByteBuffer.allocateDirect(imageProxy.getHeight() * imageProxy.getWidth() * 4);
                return;
            }
            return;
        }
        if (this.f1908A == null) {
            this.f1908A = ByteBuffer.allocateDirect(imageProxy.getHeight() * imageProxy.getWidth());
        }
        this.f1908A.position(0);
        if (this.f1909B == null) {
            this.f1909B = ByteBuffer.allocateDirect((imageProxy.getHeight() * imageProxy.getWidth()) / 4);
        }
        this.f1909B.position(0);
        if (this.f1910C == null) {
            this.f1910C = ByteBuffer.allocateDirect((imageProxy.getHeight() * imageProxy.getWidth()) / 4);
        }
        this.f1910C.position(0);
    }

    public abstract void e(ImageProxy imageProxy);

    public final void f(int i7, int i10, int i11, int i12) {
        int i13 = this.f1914b;
        Matrix matrix = new Matrix();
        if (i13 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i7, i10);
            RectF rectF2 = androidx.camera.core.impl.utils.o.f14263a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i13);
            RectF rectF3 = new RectF(0.0f, 0.0f, i11, i12);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f1922o);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f1923p = rect;
        this.f1924v.setConcat(this.t, matrix);
    }

    public final void g(ImageProxy imageProxy, int i7) {
        d0 d0Var = this.f1920i;
        if (d0Var == null) {
            return;
        }
        d0Var.a();
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int imageFormat = this.f1920i.getImageFormat();
        int maxImages = this.f1920i.getMaxImages();
        boolean z3 = i7 == 90 || i7 == 270;
        int i10 = z3 ? height : width;
        if (!z3) {
            width = height;
        }
        this.f1920i = new d0(io.fastkv.n.e(i10, width, imageFormat, maxImages));
        if (this.f1916d == 1) {
            ImageWriter imageWriter = this.f1921j;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.f1921j = ImageWriter.newInstance(this.f1920i.getSurface(), this.f1920i.getMaxImages());
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy imageProxyA = a(imageReaderProxy);
            if (imageProxyA != null) {
                e(imageProxyA);
            }
        } catch (IllegalStateException e10) {
            p140j8.f.h("ImageAnalysisAnalyzer", "Failed to acquire image.", e10);
        }
    }
}
