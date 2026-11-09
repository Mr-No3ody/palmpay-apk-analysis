package G2;

import N8.q0;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.camera.video.u;
import com.facebook.drawee.debug.listener.ImageLoadingTimeListener;
import com.facebook.drawee.drawable.ScalingUtils$ScaleType;
import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.account.bean.ResetPinVerifyTypeRsp;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable implements ImageLoadingTimeListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2965A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f2966B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f2967C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f2968H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f2969L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScalingUtils$ScaleType f2974e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2976g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2977i;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2982w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f2975f = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2978j = 80;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f2979o = new Paint(1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Matrix f2980p = new Matrix();
    public final Rect t = new Rect();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f2981v = new RectF();

    public a() {
        b();
    }

    public final void a(Canvas canvas, String str, String str2, int i7) {
        String strJ = q0.j(str, ": ");
        Paint paint = this.f2979o;
        float fMeasureText = paint.measureText(strJ);
        float fMeasureText2 = paint.measureText(str2);
        paint.setColor(1711276032);
        int i10 = this.f2967C;
        int i11 = this.f2968H;
        canvas.drawRect(i10 - 4, i11 + 8, i10 + fMeasureText + fMeasureText2 + 4.0f, i11 + this.f2966B + 8, paint);
        paint.setColor(-1);
        canvas.drawText(strJ, this.f2967C, this.f2968H, paint);
        paint.setColor(i7);
        canvas.drawText(str2, this.f2967C + fMeasureText, this.f2968H, paint);
        this.f2968H += this.f2966B;
    }

    public final void b() {
        this.f2971b = -1;
        this.f2972c = -1;
        this.f2973d = -1;
        this.f2975f = new HashMap();
        this.f2976g = -1;
        this.f2977i = -1;
        this.f2970a = ViewProps.NONE;
        invalidateSelf();
        this.f2969L = -1L;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Paint paint = this.f2979o;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(0);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        paint.setStyle(style);
        paint.setStrokeWidth(0.0f);
        paint.setColor(-1);
        this.f2967C = this.f2982w;
        this.f2968H = this.f2965A;
        a(canvas, ResetPinVerifyTypeRsp.VERIFY_TYPE_ID, this.f2970a, -1);
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        Locale locale = Locale.US;
        a(canvas, "D", iWidth + "x" + iHeight, -1);
        if (bounds.height() > 0) {
            a(canvas, "DAR", String.valueOf(Float.valueOf(bounds.width() / bounds.height())), -1);
        }
        int i7 = this.f2971b;
        int i10 = this.f2972c;
        ScalingUtils$ScaleType scalingUtils$ScaleType = this.f2974e;
        int iWidth2 = getBounds().width();
        int iHeight2 = getBounds().height();
        int i11 = -65536;
        if (iWidth2 > 0 && iHeight2 > 0 && i7 > 0 && i10 > 0) {
            if (scalingUtils$ScaleType != null) {
                Rect rect = this.t;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth2;
                rect.bottom = iHeight2;
                Matrix matrix = this.f2980p;
                matrix.reset();
                scalingUtils$ScaleType.getTransform(matrix, this.t, i7, i10, 0.0f, 0.0f);
                RectF rectF = this.f2981v;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i7;
                rectF.bottom = i10;
                matrix.mapRect(rectF);
                int iWidth3 = (int) rectF.width();
                int iHeight3 = (int) rectF.height();
                iWidth2 = Math.min(iWidth2, iWidth3);
                iHeight2 = Math.min(iHeight2, iHeight3);
            }
            float f10 = iWidth2;
            float f11 = f10 * 0.1f;
            float f12 = f10 * 0.5f;
            float f13 = iHeight2;
            float f14 = 0.1f * f13;
            float f15 = f13 * 0.5f;
            int iAbs = Math.abs(i7 - iWidth2);
            int iAbs2 = Math.abs(i10 - iHeight2);
            float f16 = iAbs;
            if (f16 < f11 && iAbs2 < f14) {
                i11 = -16711936;
            } else if (f16 < f12 && iAbs2 < f15) {
                i11 = -256;
            }
        }
        a(canvas, "I", this.f2971b + "x" + this.f2972c, i11);
        int i12 = this.f2972c;
        if (i12 > 0) {
            a(canvas, "IAR", String.valueOf(Float.valueOf(this.f2971b / i12)), -1);
        }
        a(canvas, "I", u.g(this.f2973d / 1024, " KiB"), -1);
        int i13 = this.f2976g;
        if (i13 > 0) {
            a(canvas, "anim", u.h(i13, "f ", this.f2977i, ", l "), -1);
        }
        ScalingUtils$ScaleType scalingUtils$ScaleType2 = this.f2974e;
        if (scalingUtils$ScaleType2 != null) {
            a(canvas, "scale", String.valueOf(scalingUtils$ScaleType2), -1);
        }
        long j6 = this.f2969L;
        if (j6 >= 0) {
            a(canvas, "t", j6 + " ms", -1);
        }
        for (Map.Entry entry : this.f2975f.entrySet()) {
            a(canvas, (String) entry.getKey(), (String) entry.getValue(), -1);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / 8, rect.height() / 9)));
        this.f2979o.setTextSize(iMin);
        int i7 = iMin + 8;
        this.f2966B = i7;
        int i10 = this.f2978j;
        if (i10 == 80) {
            this.f2966B = i7 * (-1);
        }
        this.f2982w = rect.left + 10;
        this.f2965A = i10 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    @Override // com.facebook.drawee.debug.listener.ImageLoadingTimeListener
    public final void onFinalImageSet(long j6) {
        this.f2969L = j6;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
