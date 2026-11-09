package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Size f14979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f14980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix f14982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p f14986h;

    public final Matrix a(Size size, int i7, Rect rect) {
        Matrix matrix = null;
        if (!f()) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        if (f()) {
            matrix = new Matrix(this.f14982d);
            matrix.postConcat(c(size, i7));
        }
        matrix.invert(matrix2);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix3);
        return matrix2;
    }

    public final Size b() {
        return androidx.camera.core.impl.utils.o.c(this.f14981c) ? new Size(this.f14980b.height(), this.f14980b.width()) : new Size(this.f14980b.width(), this.f14980b.height());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x007b  */
    /* JADX WARN: Code duplicated, block: B:19:0x007e  */
    public final Matrix c(Size size, int i7) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        p118hf.a.k(f(), null);
        if (androidx.camera.core.impl.utils.o.d(size, true, b())) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            Size sizeB = b();
            RectF rectF3 = new RectF(0.0f, 0.0f, sizeB.getWidth(), sizeB.getHeight());
            Matrix matrix = new Matrix();
            p pVar = this.f14986h;
            int iOrdinal = pVar.ordinal();
            if (iOrdinal == 0) {
                scaleToFit = Matrix.ScaleToFit.START;
            } else if (iOrdinal == 1) {
                scaleToFit = Matrix.ScaleToFit.CENTER;
            } else if (iOrdinal == 2) {
                scaleToFit = Matrix.ScaleToFit.END;
            } else if (iOrdinal == 3) {
                scaleToFit = Matrix.ScaleToFit.START;
            } else if (iOrdinal == 4) {
                scaleToFit = Matrix.ScaleToFit.CENTER;
            } else if (iOrdinal != 5) {
                p140j8.f.g("PreviewTransform", "Unexpected crop rect: " + pVar);
                scaleToFit = Matrix.ScaleToFit.FILL;
            } else {
                scaleToFit = Matrix.ScaleToFit.END;
            }
            if (pVar == p.FIT_CENTER || pVar == p.FIT_START || pVar == p.FIT_END) {
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            } else {
                matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                matrix.invert(matrix);
            }
            matrix.mapRect(rectF3);
            if (i7 == 1) {
                float width = size.getWidth() / 2.0f;
                float f10 = width + width;
                rectF = new RectF(f10 - rectF3.right, rectF3.top, f10 - rectF3.left, rectF3.bottom);
            } else {
                rectF = rectF3;
            }
        }
        Matrix matrixA = androidx.camera.core.impl.utils.o.a(this.f14981c, false, new RectF(this.f14980b), rectF);
        if (this.f14984f && this.f14985g) {
            if (androidx.camera.core.impl.utils.o.c(this.f14981c)) {
                matrixA.preScale(1.0f, -1.0f, this.f14980b.centerX(), this.f14980b.centerY());
                return matrixA;
            }
            matrixA.preScale(-1.0f, 1.0f, this.f14980b.centerX(), this.f14980b.centerY());
        }
        return matrixA;
    }

    public final Matrix d() {
        p118hf.a.k(f(), null);
        RectF rectF = new RectF(0.0f, 0.0f, this.f14979a.getWidth(), this.f14979a.getHeight());
        return androidx.camera.core.impl.utils.o.a(!this.f14985g ? this.f14981c : -com.facebook.imagepipeline.nativecode.b.V(this.f14983e), false, rectF, rectF);
    }

    public final RectF e(Size size, int i7) {
        p118hf.a.k(f(), null);
        Matrix matrixC = c(size, i7);
        RectF rectF = new RectF(0.0f, 0.0f, this.f14979a.getWidth(), this.f14979a.getHeight());
        matrixC.mapRect(rectF);
        return rectF;
    }

    public final boolean f() {
        return (this.f14980b == null || this.f14979a == null || !(!this.f14985g || this.f14983e != -1)) ? false : true;
    }
}
