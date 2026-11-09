package p300u;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.FloatRange;
import com.horcrux.svg.d0;
import p241q.a;
import p241q.i;
import p241q.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f42667l = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f42668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f42669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f42670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f42671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f42672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f42673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f42674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f42675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f42676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f42677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f42678k;

    public b(Context context) {
        Paint paint = new Paint();
        this.f42668a = paint;
        this.f42674g = new Path();
        this.f42678k = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, j.DrawerArrowToggle, a.drawerArrowStyle, i.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = typedArrayObtainStyledAttributes.getColor(j.DrawerArrowToggle_color, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(j.DrawerArrowToggle_thickness, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f42677j = (float) (Math.cos(f42667l) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(j.DrawerArrowToggle_spinBars, true);
        if (this.f42673f != z3) {
            this.f42673f = z3;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(j.DrawerArrowToggle_gapBetweenBars, 0.0f));
        if (fRound != this.f42672e) {
            this.f42672e = fRound;
            invalidateSelf();
        }
        this.f42675h = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.DrawerArrowToggle_drawableSize, 0);
        this.f42670c = Math.round(typedArrayObtainStyledAttributes.getDimension(j.DrawerArrowToggle_barLength, 0.0f));
        this.f42669b = Math.round(typedArrayObtainStyledAttributes.getDimension(j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f42671d = typedArrayObtainStyledAttributes.getDimension(j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float a(float f10, float f11, float f12) {
        return d0.e(f11, f10, f12, f10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i7 = this.f42678k;
        boolean z3 = false;
        if (i7 != 0 && (i7 == 1 || (i7 == 3 ? getLayoutDirection() == 0 : getLayoutDirection() == 1))) {
            z3 = true;
        }
        float f10 = this.f42669b;
        float fSqrt = (float) Math.sqrt(f10 * f10 * 2.0f);
        float f11 = this.f42676i;
        float f12 = this.f42670c;
        float fA = a(f12, fSqrt, f11);
        float fA2 = a(f12, this.f42671d, this.f42676i);
        float fRound = Math.round(a(0.0f, this.f42677j, this.f42676i));
        float fA3 = a(0.0f, f42667l, this.f42676i);
        float fA4 = a(z3 ? 0.0f : -180.0f, z3 ? 180.0f : 0.0f, this.f42676i);
        double d2 = fA;
        double d10 = fA3;
        boolean z8 = z3;
        float fRound2 = Math.round(Math.cos(d10) * d2);
        float fRound3 = Math.round(Math.sin(d10) * d2);
        Path path = this.f42674g;
        path.rewind();
        float f13 = this.f42672e;
        Paint paint = this.f42668a;
        float fA5 = a(paint.getStrokeWidth() + f13, -this.f42677j, this.f42676i);
        float f14 = (-fA2) / 2.0f;
        path.moveTo(f14 + fRound, 0.0f);
        path.rLineTo(fA2 - (fRound * 2.0f), 0.0f);
        path.moveTo(f14, fA5);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f14, -fA5);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f15 = this.f42672e;
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + f15 + ((((int) (fHeight - (f15 * 2.0f))) / 4) * 2));
        if (this.f42673f) {
            canvas.rotate(fA4 * (z8 ? -1 : 1));
        } else if (z8) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f42675h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f42675h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Paint paint = this.f42668a;
        if (i7 != paint.getAlpha()) {
            paint.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f42668a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        if (this.f42676i != f10) {
            this.f42676i = f10;
            invalidateSelf();
        }
    }
}
