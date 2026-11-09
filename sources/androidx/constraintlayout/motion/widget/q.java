package androidx.constraintlayout.motion.widget;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f15412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f15413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f15414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Path f15415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f15416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f15417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f15418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f15419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f15420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f15421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15422k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f15423l = new Rect();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f15424m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f15425n;

    public q(MotionLayout motionLayout) {
        this.f15425n = motionLayout;
        Paint paint = new Paint();
        this.f15416e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f15417f = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f15418g = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f15419h = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(motionLayout.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.f15421j = new float[8];
        Paint paint5 = new Paint();
        this.f15420i = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        this.f15414c = new float[100];
        this.f15413b = new int[50];
    }

    public final void a(Canvas canvas, int i7, int i10, m mVar) {
        Canvas canvas2;
        int width;
        int height;
        float f10;
        boolean z3;
        int[] iArr = this.f15413b;
        boolean z8 = false;
        int i11 = 4;
        if (i7 == 4) {
            int i12 = 0;
            boolean z10 = false;
            boolean z11 = false;
            while (i12 < this.f15422k) {
                int i13 = iArr[i12];
                if (i13 == 1) {
                    z3 = z10;
                    z3 = true;
                }
                if (i13 == 0) {
                    z11 = true;
                }
                i12++;
                z10 = z3;
                z11 = z11;
            }
            if (z10) {
                float[] fArr = this.f15412a;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f15418g);
            }
            if (z11) {
                b(canvas);
            }
        }
        if (i7 == 2) {
            float[] fArr2 = this.f15412a;
            canvas2 = canvas;
            canvas2.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], this.f15418g);
        } else {
            canvas2 = canvas;
        }
        if (i7 == 3) {
            b(canvas);
        }
        canvas2.drawLines(this.f15412a, this.f15416e);
        View view = mVar.f15382b;
        if (view != null) {
            width = view.getWidth();
            height = mVar.f15382b.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        int i14 = 1;
        while (i14 < i10 - 1) {
            if (i7 != i11 || iArr[i14 - 1] != 0) {
                int i15 = i14 * 2;
                float[] fArr3 = this.f15414c;
                float f11 = fArr3[i15];
                float f12 = fArr3[i15 + 1];
                this.f15415d.reset();
                this.f15415d.moveTo(f11, f12 + 10.0f);
                this.f15415d.lineTo(f11 + 10.0f, f12);
                this.f15415d.lineTo(f11, f12 - 10.0f);
                this.f15415d.lineTo(f11 - 10.0f, f12);
                this.f15415d.close();
                int i16 = i14 - 1;
                Paint paint = this.f15420i;
                if (i7 == i11) {
                    int i17 = iArr[i16];
                    if (i17 == 1) {
                        d(canvas2, f11 - 0.0f, f12 - 0.0f);
                    } else if (i17 == 0) {
                        c(canvas2, f11 - 0.0f, f12 - 0.0f);
                    } else {
                        if (i17 == 2) {
                            f10 = f12;
                            e(canvas2, f11 - 0.0f, f10 - 0.0f, width, height);
                        }
                        canvas2.drawPath(this.f15415d, paint);
                    }
                    f10 = f12;
                    canvas2.drawPath(this.f15415d, paint);
                } else {
                    f10 = f12;
                }
                if (i7 == 2) {
                    d(canvas2, f11 - 0.0f, f10 - 0.0f);
                }
                if (i7 == 3) {
                    c(canvas2, f11 - 0.0f, f10 - 0.0f);
                }
                if (i7 == 6) {
                    e(canvas2, f11 - 0.0f, f10 - 0.0f, width, height);
                }
                canvas2.drawPath(this.f15415d, paint);
            }
            i14++;
            z8 = z8;
            i11 = 4;
        }
        boolean z12 = z8;
        float[] fArr4 = this.f15412a;
        if (fArr4.length > 1) {
            float f13 = fArr4[z12 ? 1 : 0];
            float f14 = fArr4[1];
            Paint paint2 = this.f15417f;
            canvas2.drawCircle(f13, f14, 8.0f, paint2);
            float[] fArr5 = this.f15412a;
            canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint2);
        }
    }

    public final void b(Canvas canvas) {
        float[] fArr = this.f15412a;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[fArr.length - 2];
        float f13 = fArr[fArr.length - 1];
        float fMin = Math.min(f10, f12);
        float fMax = Math.max(f11, f13);
        float fMax2 = Math.max(f10, f12);
        float fMax3 = Math.max(f11, f13);
        Paint paint = this.f15418g;
        canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
        canvas.drawLine(Math.min(f10, f12), Math.min(f11, f13), Math.min(f10, f12), Math.max(f11, f13), paint);
    }

    public final void c(Canvas canvas, float f10, float f11) {
        float[] fArr = this.f15412a;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[fArr.length - 2];
        float f15 = fArr[fArr.length - 1];
        float fMin = Math.min(f12, f14);
        float fMax = Math.max(f13, f15);
        float fMin2 = f10 - Math.min(f12, f14);
        float fMax2 = Math.max(f13, f15) - f11;
        String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f14 - f12))) + 0.5d)) / 100.0f);
        Paint paint = this.f15419h;
        paint.getTextBounds(str, 0, str.length(), this.f15423l);
        Rect rect = this.f15423l;
        canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f11 - 20.0f, paint);
        float fMin3 = Math.min(f12, f14);
        Paint paint2 = this.f15418g;
        canvas.drawLine(f10, f11, fMin3, f11, paint2);
        String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f15 - f13))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str2, 0, str2.length(), this.f15423l);
        canvas.drawText(str2, f10 + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f10, f11, f10, Math.max(f13, f15), paint2);
    }

    public final void d(Canvas canvas, float f10, float f11) {
        float[] fArr = this.f15412a;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[fArr.length - 2];
        float f15 = fArr[fArr.length - 1];
        float fHypot = (float) Math.hypot(f12 - f14, f13 - f15);
        float f16 = f14 - f12;
        float f17 = f15 - f13;
        float f18 = (((f11 - f13) * f17) + ((f10 - f12) * f16)) / (fHypot * fHypot);
        float f19 = (f16 * f18) + f12;
        float f20 = (f18 * f17) + f13;
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f19, f20);
        float fHypot2 = (float) Math.hypot(f19 - f10, f20 - f11);
        String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
        Paint paint = this.f15419h;
        paint.getTextBounds(str, 0, str.length(), this.f15423l);
        canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f15423l.width() / 2), -20.0f, paint);
        canvas.drawLine(f10, f11, f19, f20, this.f15418g);
    }

    public final void e(Canvas canvas, float f10, float f11, int i7, int i10) {
        StringBuilder sb2 = new StringBuilder("");
        MotionLayout motionLayout = this.f15425n;
        sb2.append(((int) (((double) (((f10 - (i7 / 2)) * 100.0f) / (motionLayout.getWidth() - i7))) + 0.5d)) / 100.0f);
        String string = sb2.toString();
        Paint paint = this.f15419h;
        paint.getTextBounds(string, 0, string.length(), this.f15423l);
        Rect rect = this.f15423l;
        canvas.drawText(string, ((f10 / 2.0f) - (rect.width() / 2)) + 0.0f, f11 - 20.0f, paint);
        float fMin = Math.min(0.0f, 1.0f);
        Paint paint2 = this.f15418g;
        canvas.drawLine(f10, f11, fMin, f11, paint2);
        String str = "" + (((int) (((double) (((f11 - (i10 / 2)) * 100.0f) / (motionLayout.getHeight() - i10))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str, 0, str.length(), this.f15423l);
        canvas.drawText(str, f10 + 5.0f, 0.0f - ((f11 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f10, f11, f10, Math.max(0.0f, 1.0f), paint2);
    }
}
