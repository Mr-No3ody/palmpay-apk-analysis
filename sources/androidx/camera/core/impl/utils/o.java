package androidx.camera.core.impl.utils;

import C0.G;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RectF f14263a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix a(int i7, boolean z3, RectF rectF, RectF rectF2) {
        Matrix matrix = new Matrix();
        RectF rectF3 = f14263a;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i7);
        if (z3) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static boolean b(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean c(int i7) {
        if (i7 == 90 || i7 == 270) {
            return true;
        }
        if (i7 == 0 || i7 == 180) {
            return false;
        }
        throw new IllegalArgumentException(G.m(i7, "Invalid rotation degrees: "));
    }

    public static boolean d(Size size, boolean z3, Size size2) {
        float width;
        float width2;
        if (z3) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        return width >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= width2;
    }

    public static Size e(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static String f(Rect rect) {
        Locale locale = Locale.US;
        return rect + "(" + rect.width() + "x" + rect.height() + ")";
    }

    public static Size g(Size size, int i7) {
        p118hf.a.g(i7 % 90 == 0, "Invalid rotation degrees: " + i7);
        return c(h(i7)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static int h(int i7) {
        return ((i7 % MessageEvent.EVENT_CL_REPAYMENT_FAILED) + MessageEvent.EVENT_CL_REPAYMENT_FAILED) % MessageEvent.EVENT_CL_REPAYMENT_FAILED;
    }
}
