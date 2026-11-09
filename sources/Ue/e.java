package Ue;

import android.animation.ArgbEvaluator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.horcrux.svg.d0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.v;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f9763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9764h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Ve.a indicatorOptions, int i7) {
        super(indicatorOptions);
        this.f9764h = i7;
        Intrinsics.g(indicatorOptions, "indicatorOptions");
        this.f9763g = new RectF();
    }

    public final void b(Canvas canvas, float f10, float f11) {
        switch (this.f9764h) {
            case 0:
                canvas.drawRect(this.f9763g, this.f9759d);
                break;
            default:
                canvas.drawRoundRect(this.f9763g, f10, f11, this.f9759d);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0253  */
    /* JADX WARN: Code duplicated, block: B:102:0x0265  */
    /* JADX WARN: Code duplicated, block: B:107:0x0282  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285  */
    /* JADX WARN: Code duplicated, block: B:109:0x0287  */
    /* JADX WARN: Code duplicated, block: B:111:0x028d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0292  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:140:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0249  */
    /* JADX WARN: Code duplicated, block: B:98:0x024f  */
    @Override // com.zhpan.indicator.drawer.IDrawer
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        ArgbEvaluator argbEvaluator;
        Object objEvaluate;
        ArgbEvaluator argbEvaluator2;
        Object objEvaluate2;
        float f10;
        Intrinsics.g(canvas, "canvas");
        Ve.a aVar = this.f9761f;
        int i11 = aVar.f10332d;
        int i12 = 1;
        if (i11 > 1 || (aVar.f10341m && i11 == 1)) {
            float f11 = aVar.f10337i;
            float f12 = aVar.f10338j;
            RectF rectF = this.f9763g;
            Paint paint = this.f9759d;
            float f13 = 0.0f;
            if (f11 == f12 && aVar.f10331c != 0) {
                for (int i13 = 0; i13 < i11; i13++) {
                    paint.setColor(aVar.f10333e);
                    float f14 = i13;
                    float f15 = this.f9757b;
                    float f16 = (f14 * aVar.f10335g) + (f14 * f15);
                    float f17 = this.f9758c;
                    float f18 = (f15 - f17) + f16;
                    rectF.set(f18, 0.0f, f17 + f18, aVar.a());
                    b(canvas, aVar.a(), aVar.a());
                }
                paint.setColor(aVar.f10334f);
                int i14 = aVar.f10331c;
                if (i14 == 2) {
                    int i15 = aVar.f10339k;
                    float f19 = aVar.f10335g;
                    float fA = aVar.a();
                    float f20 = i15;
                    float f21 = this.f9757b;
                    float f22 = ((f19 + f21) * aVar.f10340l) + (f20 * f19) + (f20 * f21);
                    rectF.set(f22, 0.0f, f21 + f22, fA);
                    b(canvas, fA, fA);
                    return;
                }
                if (i14 == 3) {
                    float fA2 = aVar.a();
                    float f23 = aVar.f10340l;
                    int i16 = aVar.f10339k;
                    float f24 = aVar.f10335g;
                    float f25 = aVar.f10337i;
                    float f26 = f24 + f25;
                    float f27 = 2;
                    float f28 = (i16 * f26) + (this.f9757b / f27);
                    float f29 = (f23 - 0.5f) * f26 * 2.0f;
                    if (f29 < 0.0f) {
                        f29 = 0.0f;
                    }
                    float f30 = f25 / f27;
                    float f31 = (f29 + f28) - f30;
                    float f32 = f23 * f26 * 2.0f;
                    if (f32 <= f26) {
                        f26 = f32;
                    }
                    rectF.set(f31, 0.0f, f28 + f26 + f30, fA2);
                    b(canvas, fA2, fA2);
                    return;
                }
                if (i14 != 5) {
                    return;
                }
                int i17 = aVar.f10339k;
                float f33 = aVar.f10340l;
                float f34 = i17;
                float f35 = (f34 * aVar.f10335g) + (this.f9758c * f34);
                if (this.f9760e == null) {
                    this.f9760e = new ArgbEvaluator();
                }
                if (f33 < 0.99d) {
                    ArgbEvaluator argbEvaluator3 = this.f9760e;
                    if (argbEvaluator3 != null) {
                        Object objEvaluate3 = argbEvaluator3.evaluate(f33, Integer.valueOf(aVar.f10334f), Integer.valueOf(aVar.f10333e));
                        if (objEvaluate3 == null) {
                            throw new v("null cannot be cast to non-null type kotlin.Int");
                        }
                        paint.setColor(((Integer) objEvaluate3).intValue());
                    }
                    rectF.set(f35, 0.0f, this.f9758c + f35, aVar.a());
                    b(canvas, aVar.a(), aVar.a());
                }
                float f36 = f35 + aVar.f10335g + aVar.f10337i;
                if (i17 == aVar.f10332d - 1) {
                    f36 = 0.0f;
                }
                ArgbEvaluator argbEvaluator4 = this.f9760e;
                if (argbEvaluator4 != null) {
                    Object objEvaluate4 = argbEvaluator4.evaluate(1 - f33, Integer.valueOf(aVar.f10334f), Integer.valueOf(aVar.f10333e));
                    if (objEvaluate4 == null) {
                        throw new v("null cannot be cast to non-null type kotlin.Int");
                    }
                    paint.setColor(((Integer) objEvaluate4).intValue());
                }
                rectF.set(f36, 0.0f, this.f9758c + f36, aVar.a());
                b(canvas, aVar.a(), aVar.a());
                return;
            }
            if (aVar.f10331c != 4) {
                int i18 = 0;
                float f37 = 0.0f;
                while (i18 < i11) {
                    int i19 = aVar.f10339k;
                    float f38 = i18 == i19 ? this.f9757b : this.f9758c;
                    paint.setColor(i18 == i19 ? aVar.f10334f : aVar.f10333e);
                    rectF.set(f37, 0.0f, f37 + f38, aVar.a());
                    b(canvas, aVar.a(), aVar.a());
                    f37 += f38 + aVar.f10335g;
                    i18++;
                }
                return;
            }
            int i20 = 0;
            while (i20 < i11) {
                int i21 = aVar.f10334f;
                float f39 = aVar.f10335g;
                float fA3 = aVar.a();
                int i22 = aVar.f10339k;
                float f40 = aVar.f10337i;
                float f41 = aVar.f10338j;
                int i23 = i12;
                if (this.f9760e == null) {
                    this.f9760e = new ArgbEvaluator();
                }
                if (i20 < i22) {
                    paint.setColor(aVar.f10333e);
                    if (i22 == aVar.f10332d - 1) {
                        float f42 = i20;
                        f10 = ((f41 - f40) * aVar.f10340l) + (f42 * f39) + (f42 * f40);
                    } else {
                        float f43 = i20;
                        f10 = (f43 * f40) + (f43 * f39);
                    }
                    rectF.set(f10, f13, f40 + f10, fA3);
                    b(canvas, fA3, fA3);
                    i11 = i11;
                    i7 = i23;
                } else if (i20 == i22) {
                    paint.setColor(i21);
                    float f44 = aVar.f10340l;
                    if (i22 == aVar.f10332d - 1) {
                        ArgbEvaluator argbEvaluator5 = this.f9760e;
                        i10 = i21;
                        if (argbEvaluator5 != null) {
                            Object objEvaluate5 = argbEvaluator5.evaluate(f44, Integer.valueOf(i10), Integer.valueOf(aVar.f10333e));
                            if (objEvaluate5 == null) {
                                throw new v("null cannot be cast to non-null type kotlin.Int");
                            }
                            paint.setColor(((Integer) objEvaluate5).intValue());
                        }
                        float f45 = ((aVar.f10335g + f40) * (aVar.f10332d - 1)) + f41;
                        rectF.set(d0.e(f41, f40, f44, f45 - f41), 0.0f, f45, fA3);
                        b(canvas, fA3, fA3);
                    } else {
                        i10 = i21;
                        f39 = f39;
                        float f46 = i23;
                        if (f44 < f46) {
                            ArgbEvaluator argbEvaluator6 = this.f9760e;
                            if (argbEvaluator6 != null) {
                                Object objEvaluate6 = argbEvaluator6.evaluate(f44, Integer.valueOf(i10), Integer.valueOf(aVar.f10333e));
                                if (objEvaluate6 == null) {
                                    throw new v("null cannot be cast to non-null type kotlin.Int");
                                }
                                paint.setColor(((Integer) objEvaluate6).intValue());
                            }
                            float f47 = i20;
                            float f48 = (f47 * f39) + (f47 * f40);
                            rectF.set(f48, 0.0f, d0.e(f46, f44, f41 - f40, f48 + f40), fA3);
                            b(canvas, fA3, fA3);
                        }
                        if (i22 == aVar.f10332d - 1) {
                            if (f44 > 0) {
                                argbEvaluator2 = this.f9760e;
                                if (argbEvaluator2 != null) {
                                    objEvaluate2 = argbEvaluator2.evaluate(1 - f44, Integer.valueOf(i10), Integer.valueOf(aVar.f10333e));
                                    if (objEvaluate2 != null) {
                                        throw new v("null cannot be cast to non-null type kotlin.Int");
                                    }
                                    paint.setColor(((Integer) objEvaluate2).intValue());
                                }
                                rectF.set(0.0f, 0.0f, d0.e(f41, f40, f44, f40 + 0.0f), fA3);
                                b(canvas, fA3, fA3);
                                i7 = 1;
                            } else {
                                i7 = 1;
                            }
                        } else if (f44 > 0) {
                            argbEvaluator = this.f9760e;
                            i7 = 1;
                            if (argbEvaluator != null) {
                                objEvaluate = argbEvaluator.evaluate(1 - f44, Integer.valueOf(i10), Integer.valueOf(aVar.f10333e));
                                if (objEvaluate != null) {
                                    throw new v("null cannot be cast to non-null type kotlin.Int");
                                }
                                paint.setColor(((Integer) objEvaluate).intValue());
                            }
                            float f49 = i20;
                            float f50 = f39 + f41 + (f49 * f39) + (f49 * f40) + f40;
                            rectF.set((f50 - f40) - ((f41 - f40) * f44), 0.0f, f50, fA3);
                            b(canvas, fA3, fA3);
                        } else {
                            i7 = 1;
                        }
                    }
                    i11 = i11;
                    if (i22 == aVar.f10332d - 1) {
                        if (f44 > 0) {
                            argbEvaluator2 = this.f9760e;
                            if (argbEvaluator2 != null) {
                                objEvaluate2 = argbEvaluator2.evaluate(1 - f44, Integer.valueOf(i10), Integer.valueOf(aVar.f10333e));
                                if (objEvaluate2 != null) {
                                    throw new v("null cannot be cast to non-null type kotlin.Int");
                                }
                                paint.setColor(((Integer) objEvaluate2).intValue());
                            }
                            rectF.set(0.0f, 0.0f, d0.e(f41, f40, f44, f40 + 0.0f), fA3);
                            b(canvas, fA3, fA3);
                            i7 = 1;
                        } else {
                            i7 = 1;
                        }
                    } else if (f44 > 0) {
                        argbEvaluator = this.f9760e;
                        i7 = 1;
                        if (argbEvaluator != null) {
                            objEvaluate = argbEvaluator.evaluate(1 - f44, Integer.valueOf(i10), Integer.valueOf(aVar.f10333e));
                            if (objEvaluate != null) {
                                throw new v("null cannot be cast to non-null type kotlin.Int");
                            }
                            paint.setColor(((Integer) objEvaluate).intValue());
                        }
                        float f410 = i20;
                        float f51 = f39 + f41 + (f410 * f39) + (f410 * f40) + f40;
                        rectF.set((f51 - f40) - ((f41 - f40) * f44), 0.0f, f51, fA3);
                        b(canvas, fA3, fA3);
                    } else {
                        i7 = 1;
                    }
                } else {
                    i11 = i11;
                    float f52 = f13;
                    i7 = i23;
                    if (i22 + 1 != i20 || aVar.f10340l == f52) {
                        paint.setColor(aVar.f10333e);
                        float f53 = i20;
                        float f54 = this.f9758c;
                        float f55 = (f41 - f54) + (f53 * f39) + (f53 * f54);
                        rectF.set(f55, 0.0f, f54 + f55, fA3);
                        b(canvas, fA3, fA3);
                    }
                }
                i20++;
                i12 = i7;
                i11 = i11;
                f13 = 0.0f;
            }
        }
    }
}
