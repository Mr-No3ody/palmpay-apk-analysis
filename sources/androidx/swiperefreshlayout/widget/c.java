package androidx.swiperefreshlayout.widget;

import Uc.C0652d0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.horcrux.svg.d0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LinearInterpolator f17890g = new LinearInterpolator();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p331w0.b f17891i = new p331w0.b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f17892j = {-16777216};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f17893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f17894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Resources f17895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ValueAnimator f17896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f17897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17898f;

    public c(Context context) {
        context.getClass();
        this.f17895c = context.getResources();
        b bVar = new b();
        this.f17893a = bVar;
        bVar.f17878i = f17892j;
        bVar.a(0);
        bVar.f17877h = 2.5f;
        bVar.f17871b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(this, bVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f17890g);
        valueAnimatorOfFloat.addListener(new C0652d0(2, this, bVar));
        this.f17896d = valueAnimatorOfFloat;
    }

    public static void d(float f10, b bVar) {
        if (f10 <= 0.75f) {
            bVar.f17889u = bVar.f17878i[bVar.f17879j];
            return;
        }
        float f11 = (f10 - 0.75f) / 0.25f;
        int[] iArr = bVar.f17878i;
        int i7 = bVar.f17879j;
        int i10 = iArr[i7];
        int i11 = iArr[(i7 + 1) % iArr.length];
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        bVar.f17889u = ((i12 + ((int) ((((i11 >> 24) & 255) - i12) * f11))) << 24) | ((i13 + ((int) ((((i11 >> 16) & 255) - i13) * f11))) << 16) | ((i14 + ((int) ((((i11 >> 8) & 255) - i14) * f11))) << 8) | (i15 + ((int) (f11 * ((i11 & 255) - i15))));
    }

    public final void a(float f10, b bVar, boolean z3) {
        float interpolation;
        float interpolation2;
        if (this.f17898f) {
            d(f10, bVar);
            float fFloor = (float) (Math.floor(bVar.f17882m / 0.8f) + 1.0d);
            float f11 = bVar.f17880k;
            float f12 = bVar.f17881l;
            bVar.f17874e = (((f12 - 0.01f) - f11) * f10) + f11;
            bVar.f17875f = f12;
            float f13 = bVar.f17882m;
            bVar.f17876g = d0.e(fFloor, f13, f10, f13);
            return;
        }
        if (f10 != 1.0f || z3) {
            float f14 = bVar.f17882m;
            p331w0.b bVar2 = f17891i;
            if (f10 < 0.5f) {
                interpolation = bVar.f17880k;
                interpolation2 = (bVar2.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f15 = bVar.f17880k + 0.79f;
                interpolation = f15 - (((1.0f - bVar2.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f15;
            }
            float f16 = (0.20999998f * f10) + f14;
            float f17 = (f10 + this.f17897e) * 216.0f;
            bVar.f17874e = interpolation;
            bVar.f17875f = interpolation2;
            bVar.f17876g = f16;
            this.f17894b = f17;
        }
    }

    public final void b(float f10, float f11, float f12, float f13) {
        float f14 = this.f17895c.getDisplayMetrics().density;
        float f15 = f11 * f14;
        b bVar = this.f17893a;
        bVar.f17877h = f15;
        bVar.f17871b.setStrokeWidth(f15);
        bVar.f17886q = f10 * f14;
        bVar.a(0);
        bVar.f17887r = (int) (f12 * f14);
        bVar.f17888s = (int) (f13 * f14);
    }

    public final void c(int i7) {
        if (i7 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f17894b, bounds.exactCenterX(), bounds.exactCenterY());
        b bVar = this.f17893a;
        RectF rectF = bVar.f17870a;
        float f10 = bVar.f17886q;
        float fMin = (bVar.f17877h / 2.0f) + f10;
        if (f10 <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((bVar.f17887r * bVar.f17885p) / 2.0f, bVar.f17877h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f11 = bVar.f17874e;
        float f12 = bVar.f17876g;
        float f13 = (f11 + f12) * 360.0f;
        float f14 = ((bVar.f17875f + f12) * 360.0f) - f13;
        Paint paint = bVar.f17871b;
        paint.setColor(bVar.f17889u);
        paint.setAlpha(bVar.t);
        float f15 = bVar.f17877h / 2.0f;
        rectF.inset(f15, f15);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, bVar.f17873d);
        float f16 = -f15;
        rectF.inset(f16, f16);
        canvas.drawArc(rectF, f13, f14, false, paint);
        if (bVar.f17883n) {
            Path path = bVar.f17884o;
            if (path == null) {
                Path path2 = new Path();
                bVar.f17884o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f17 = (bVar.f17887r * bVar.f17885p) / 2.0f;
            bVar.f17884o.moveTo(0.0f, 0.0f);
            bVar.f17884o.lineTo(bVar.f17887r * bVar.f17885p, 0.0f);
            Path path3 = bVar.f17884o;
            float f18 = bVar.f17887r;
            float f19 = bVar.f17885p;
            path3.lineTo((f18 * f19) / 2.0f, bVar.f17888s * f19);
            bVar.f17884o.offset((rectF.centerX() + fMin2) - f17, (bVar.f17877h / 2.0f) + rectF.centerY());
            bVar.f17884o.close();
            Paint paint2 = bVar.f17872c;
            paint2.setColor(bVar.f17889u);
            paint2.setAlpha(bVar.t);
            canvas.save();
            canvas.rotate(f13 + f14, rectF.centerX(), rectF.centerY());
            canvas.drawPath(bVar.f17884o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f17893a.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f17896d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f17893a.t = i7;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17893a.f17871b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f17896d.cancel();
        b bVar = this.f17893a;
        float f10 = bVar.f17874e;
        bVar.f17880k = f10;
        float f11 = bVar.f17875f;
        bVar.f17881l = f11;
        bVar.f17882m = bVar.f17876g;
        if (f11 != f10) {
            this.f17898f = true;
            this.f17896d.setDuration(666L);
            this.f17896d.start();
            return;
        }
        bVar.a(0);
        bVar.f17880k = 0.0f;
        bVar.f17881l = 0.0f;
        bVar.f17882m = 0.0f;
        bVar.f17874e = 0.0f;
        bVar.f17875f = 0.0f;
        bVar.f17876g = 0.0f;
        this.f17896d.setDuration(1332L);
        this.f17896d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f17896d.cancel();
        this.f17894b = 0.0f;
        b bVar = this.f17893a;
        if (bVar.f17883n) {
            bVar.f17883n = false;
        }
        bVar.a(0);
        bVar.f17880k = 0.0f;
        bVar.f17881l = 0.0f;
        bVar.f17882m = 0.0f;
        bVar.f17874e = 0.0f;
        bVar.f17875f = 0.0f;
        bVar.f17876g = 0.0f;
        invalidateSelf();
    }
}
