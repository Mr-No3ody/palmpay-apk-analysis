package Ue;

import android.animation.ArgbEvaluator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.horcrux.svg.d0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.v;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f9762g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Ve.a indicatorOptions) {
        super(indicatorOptions);
        Intrinsics.g(indicatorOptions, "indicatorOptions");
        this.f9762g = new RectF();
    }

    @Override // Ue.c
    public final int a() {
        return ((int) this.f9757b) + 6;
    }

    public final void b(Canvas canvas, float f10, float f11, float f12) {
        float f13 = 3;
        canvas.drawCircle(f10 + f13, f11 + f13, f12, this.f9759d);
    }

    @Override // com.zhpan.indicator.drawer.IDrawer
    public final void onDraw(Canvas canvas) {
        Object objEvaluate;
        Intrinsics.g(canvas, "canvas");
        Ve.a aVar = this.f9761f;
        int i7 = aVar.f10332d;
        if (i7 > 1 || (aVar.f10341m && i7 == 1)) {
            float f10 = aVar.f10337i;
            Paint paint = this.f9759d;
            paint.setColor(aVar.f10333e);
            int i10 = aVar.f10332d;
            for (int i11 = 0; i11 < i10; i11++) {
                float f11 = 2;
                b(canvas, ((aVar.f10337i + aVar.f10335g) * i11) + (this.f9757b / f11), this.f9757b / f11, f10 / f11);
            }
            paint.setColor(aVar.f10334f);
            int i12 = aVar.f10331c;
            if (i12 == 0 || i12 == 2) {
                int i13 = aVar.f10339k;
                float f12 = this.f9757b;
                float f13 = aVar.f10337i;
                float f14 = 2;
                float f15 = aVar.f10335g;
                float f16 = ((f13 + f15) * i13) + (f12 / f14);
                b(canvas, (((((f13 + f15) * ((i13 + 1) % aVar.f10332d)) + (f12 / f14)) - f16) * aVar.f10340l) + f16, f12 / f14, aVar.f10338j / f14);
                return;
            }
            if (i12 == 3) {
                float f17 = aVar.f10337i;
                float f18 = aVar.f10340l;
                int i14 = aVar.f10339k;
                float f19 = aVar.f10335g;
                float f20 = f19 + f17;
                float f21 = 2;
                float f22 = ((f19 + f17) * i14) + (this.f9757b / f21);
                float f23 = (f18 - 0.5f) * f20 * 2.0f;
                if (f23 < 0.0f) {
                    f23 = 0.0f;
                }
                float f24 = f17 / f21;
                float f25 = 3;
                float f26 = ((f23 + f22) - f24) + f25;
                float f27 = f18 * f20 * 2.0f;
                if (f27 <= f20) {
                    f20 = f27;
                }
                RectF rectF = this.f9762g;
                rectF.set(f26, f25, f22 + f20 + f24 + f25, f17 + f25);
                canvas.drawRoundRect(rectF, f17, f17, paint);
                return;
            }
            if (i12 != 4) {
                if (i12 != 5) {
                    return;
                }
                if (this.f9760e == null) {
                    this.f9760e = new ArgbEvaluator();
                }
                int i15 = aVar.f10339k;
                float f28 = aVar.f10340l;
                float f29 = this.f9757b;
                float f30 = 2;
                float f31 = ((aVar.f10337i + aVar.f10335g) * i15) + (f29 / f30);
                float f32 = f29 / f30;
                ArgbEvaluator argbEvaluator = this.f9760e;
                if (argbEvaluator != null) {
                    Object objEvaluate2 = argbEvaluator.evaluate(f28, Integer.valueOf(aVar.f10334f), Integer.valueOf(aVar.f10333e));
                    if (objEvaluate2 == null) {
                        throw new v("null cannot be cast to non-null type kotlin.Int");
                    }
                    paint.setColor(((Integer) objEvaluate2).intValue());
                }
                b(canvas, f31, f32, aVar.f10337i / f30);
                ArgbEvaluator argbEvaluator2 = this.f9760e;
                if (argbEvaluator2 != null) {
                    Object objEvaluate3 = argbEvaluator2.evaluate(1 - f28, Integer.valueOf(aVar.f10334f), Integer.valueOf(aVar.f10333e));
                    if (objEvaluate3 == null) {
                        throw new v("null cannot be cast to non-null type kotlin.Int");
                    }
                    paint.setColor(((Integer) objEvaluate3).intValue());
                }
                b(canvas, i15 == aVar.f10332d - 1 ? ((aVar.f10337i + aVar.f10335g) * 0) + (this.f9757b / f30) : f31 + aVar.f10335g + aVar.f10337i, f32, aVar.f10338j / f30);
                return;
            }
            int i16 = aVar.f10339k;
            float f33 = aVar.f10340l;
            float f34 = this.f9757b;
            float f35 = 2;
            float f36 = ((aVar.f10337i + aVar.f10335g) * i16) + (f34 / f35);
            float f37 = f34 / f35;
            if (this.f9760e == null) {
                this.f9760e = new ArgbEvaluator();
            }
            if (f33 < 1) {
                ArgbEvaluator argbEvaluator3 = this.f9760e;
                if (argbEvaluator3 != null) {
                    Object objEvaluate4 = argbEvaluator3.evaluate(f33, Integer.valueOf(aVar.f10334f), Integer.valueOf(aVar.f10333e));
                    if (objEvaluate4 == null) {
                        throw new v("null cannot be cast to non-null type kotlin.Int");
                    }
                    paint.setColor(((Integer) objEvaluate4).intValue());
                }
                float f38 = aVar.f10338j / f35;
                b(canvas, f36, f37, f38 - ((f38 - (aVar.f10337i / f35)) * f33));
            }
            if (i16 == aVar.f10332d - 1) {
                ArgbEvaluator argbEvaluator4 = this.f9760e;
                objEvaluate = argbEvaluator4 != null ? argbEvaluator4.evaluate(f33, Integer.valueOf(aVar.f10333e), Integer.valueOf(aVar.f10334f)) : null;
                if (objEvaluate == null) {
                    throw new v("null cannot be cast to non-null type kotlin.Int");
                }
                paint.setColor(((Integer) objEvaluate).intValue());
                float f39 = this.f9757b / f35;
                float f40 = this.f9758c / f35;
                b(canvas, f39, f37, d0.e(f39, f40, f33, f40));
                return;
            }
            if (f33 > 0) {
                ArgbEvaluator argbEvaluator5 = this.f9760e;
                objEvaluate = argbEvaluator5 != null ? argbEvaluator5.evaluate(f33, Integer.valueOf(aVar.f10333e), Integer.valueOf(aVar.f10334f)) : null;
                if (objEvaluate == null) {
                    throw new v("null cannot be cast to non-null type kotlin.Int");
                }
                paint.setColor(((Integer) objEvaluate).intValue());
                float f41 = f36 + aVar.f10335g;
                float f42 = aVar.f10337i;
                float f43 = f41 + f42;
                float f44 = f42 / f35;
                b(canvas, f43, f37, (((aVar.f10338j / f35) - f44) * f33) + f44);
            }
        }
    }
}
