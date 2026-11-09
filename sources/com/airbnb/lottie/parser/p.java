package com.airbnb.lottie.parser;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static M.o f20181b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f20180a = new LinearInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p039cb.c f20182c = p039cb.c.d("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p039cb.c f20183d = p039cb.c.d("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator pathInterpolator;
        pointF.x = com.airbnb.lottie.utils.g.b(pointF.x, -1.0f, 1.0f);
        pointF.y = com.airbnb.lottie.utils.g.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.airbnb.lottie.utils.g.b(pointF2.x, -1.0f, 1.0f);
        float fB = com.airbnb.lottie.utils.g.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        float f10 = pointF.x;
        float f11 = pointF.y;
        float f12 = pointF2.x;
        Matrix matrix = com.airbnb.lottie.utils.i.f20269a;
        int i7 = f10 != 0.0f ? (int) (527 * f10) : 17;
        if (f11 != 0.0f) {
            i7 = (int) (i7 * 31 * f11);
        }
        if (f12 != 0.0f) {
            i7 = (int) (i7 * 31 * f12);
        }
        if (fB != 0.0f) {
            i7 = (int) (i7 * 31 * fB);
        }
        synchronized (p.class) {
            if (f20181b == null) {
                f20181b = new M.o();
            }
            weakReference = (WeakReference) f20181b.b(i7);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        try {
            WeakReference weakReference2 = new WeakReference(pathInterpolator);
            synchronized (p.class) {
                f20181b.d(i7, weakReference2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return pathInterpolator;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0200  */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    public static p243q1.a b(com.airbnb.lottie.parser.moshi.a aVar, com.airbnb.lottie.k kVar, float f10, ValueParser valueParser, boolean z3, boolean z8) throws IOException {
        Object obj;
        Interpolator interpolatorA;
        Object obj2;
        Interpolator interpolatorA2;
        Interpolator interpolatorA3;
        Interpolator interpolatorA4;
        p243q1.a aVar2;
        p039cb.c cVar;
        PointF pointF;
        LinearInterpolator linearInterpolator = f20180a;
        p039cb.c cVar2 = f20182c;
        if (!z3 || !z8) {
            p039cb.c cVar3 = cVar2;
            if (!z3) {
                return new p243q1.a(valueParser.parse(aVar, f10));
            }
            aVar.b();
            PointF pointFB = null;
            Object obj3 = null;
            float fG = 0.0f;
            boolean z10 = false;
            PointF pointFB2 = null;
            PointF pointFB3 = null;
            PointF pointFB4 = null;
            Object obj4 = null;
            while (aVar.e()) {
                p039cb.c cVar4 = cVar3;
                switch (aVar.l(cVar4)) {
                    case 0:
                        fG = (float) aVar.g();
                        break;
                    case 1:
                        obj4 = valueParser.parse(aVar, f10);
                        break;
                    case 2:
                        obj3 = valueParser.parse(aVar, f10);
                        break;
                    case 3:
                        pointFB3 = o.b(aVar, 1.0f);
                        break;
                    case 4:
                        pointFB = o.b(aVar, 1.0f);
                        break;
                    case 5:
                        z10 = aVar.h() == 1;
                        break;
                    case 6:
                        pointFB2 = o.b(aVar, f10);
                        break;
                    case 7:
                        pointFB4 = o.b(aVar, f10);
                        break;
                    default:
                        aVar.n();
                        break;
                }
                cVar3 = cVar4;
            }
            aVar.d();
            if (!z10) {
                if (pointFB3 == null || pointFB == null) {
                    obj = obj3;
                } else {
                    Object obj5 = obj3;
                    interpolatorA = a(pointFB3, pointFB);
                    obj = obj5;
                }
                p243q1.a aVar3 = new p243q1.a(kVar, obj4, obj, interpolatorA, fG, (Float) null);
                aVar3.f41434o = pointFB2;
                aVar3.f41435p = pointFB4;
                return aVar3;
            }
            obj = obj4;
            interpolatorA = linearInterpolator;
            p243q1.a aVar4 = new p243q1.a(kVar, obj4, obj, interpolatorA, fG, (Float) null);
            aVar4.f41434o = pointFB2;
            aVar4.f41435p = pointFB4;
            return aVar4;
        }
        aVar.b();
        PointF pointF2 = null;
        PointF pointFB5 = null;
        PointF pointFB6 = null;
        boolean z11 = false;
        PointF pointFB7 = null;
        PointF pointFB8 = null;
        PointF pointF3 = null;
        Object obj6 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        float fG2 = 0.0f;
        Object obj7 = null;
        while (aVar.e()) {
            int iL = aVar.l(cVar2);
            p039cb.c cVar5 = f20183d;
            linearInterpolator = linearInterpolator;
            switch (iL) {
                case 0:
                    fG2 = (float) aVar.g();
                    pointF4 = pointF4;
                    obj6 = obj6;
                    cVar2 = cVar2;
                    break;
                case 1:
                    cVar2 = cVar2;
                    obj6 = valueParser.parse(aVar, f10);
                    cVar2 = cVar2;
                    break;
                case 2:
                    cVar2 = cVar2;
                    obj7 = valueParser.parse(aVar, f10);
                    cVar2 = cVar2;
                    break;
                case 3:
                    boolean z12 = z11;
                    PointF pointF6 = pointF4;
                    if (aVar.j() == 3) {
                        aVar.b();
                        float fG3 = 0.0f;
                        float fG4 = 0.0f;
                        float fG5 = 0.0f;
                        float fG6 = 0.0f;
                        while (aVar.e()) {
                            int iL2 = aVar.l(cVar5);
                            if (iL2 != 0) {
                                if (iL2 != 1) {
                                    aVar.n();
                                } else if (aVar.j() == 7) {
                                    fG6 = (float) aVar.g();
                                    fG4 = fG6;
                                } else {
                                    aVar.a();
                                    fG4 = (float) aVar.g();
                                    fG6 = aVar.j() == 7 ? (float) aVar.g() : fG4;
                                    aVar.c();
                                }
                            } else if (aVar.j() == 7) {
                                fG5 = (float) aVar.g();
                                fG3 = fG5;
                            } else {
                                aVar.a();
                                fG3 = (float) aVar.g();
                                fG5 = aVar.j() == 7 ? (float) aVar.g() : fG3;
                                aVar.c();
                            }
                        }
                        PointF pointF7 = new PointF(fG3, fG4);
                        pointF4 = new PointF(fG5, fG6);
                        aVar.d();
                        pointF3 = pointF7;
                    } else {
                        pointFB7 = o.b(aVar, f10);
                        pointF4 = pointF6;
                    }
                    z11 = z12;
                    obj6 = obj6;
                    cVar2 = cVar2;
                    break;
                case 4:
                    boolean z13 = z11;
                    if (aVar.j() == 3) {
                        aVar.b();
                        float fG7 = 0.0f;
                        float fG8 = 0.0f;
                        float fG9 = 0.0f;
                        float fG10 = 0.0f;
                        while (aVar.e()) {
                            Object obj8 = obj6;
                            int iL3 = aVar.l(cVar5);
                            if (iL3 != 0) {
                                cVar = cVar2;
                                if (iL3 != 1) {
                                    aVar.n();
                                } else if (aVar.j() == 7) {
                                    fG10 = (float) aVar.g();
                                    pointF4 = pointF4;
                                    fG8 = fG10;
                                } else {
                                    pointF = pointF4;
                                    aVar.a();
                                    fG8 = (float) aVar.g();
                                    fG10 = aVar.j() == 7 ? (float) aVar.g() : fG8;
                                    aVar.c();
                                    pointF4 = pointF;
                                }
                            } else {
                                cVar = cVar2;
                                pointF = pointF4;
                                if (aVar.j() == 7) {
                                    fG9 = (float) aVar.g();
                                    pointF4 = pointF;
                                    fG7 = fG9;
                                } else {
                                    aVar.a();
                                    fG7 = (float) aVar.g();
                                    fG9 = aVar.j() == 7 ? (float) aVar.g() : fG7;
                                    aVar.c();
                                    pointF4 = pointF;
                                }
                            }
                            obj6 = obj8;
                            cVar2 = cVar;
                        }
                        cVar2 = cVar2;
                        PointF pointF8 = new PointF(fG7, fG8);
                        pointF2 = new PointF(fG9, fG10);
                        aVar.d();
                        pointF5 = pointF8;
                    } else {
                        cVar2 = cVar2;
                        pointFB8 = o.b(aVar, f10);
                    }
                    z11 = z13;
                    cVar2 = cVar2;
                    break;
                case 5:
                    z11 = aVar.h() == 1;
                    linearInterpolator = linearInterpolator;
                    break;
                case 6:
                    pointFB5 = o.b(aVar, f10);
                    linearInterpolator = linearInterpolator;
                    break;
                case 7:
                    pointFB6 = o.b(aVar, f10);
                    linearInterpolator = linearInterpolator;
                    break;
                default:
                    aVar.n();
                    linearInterpolator = linearInterpolator;
                    break;
            }
        }
        LinearInterpolator linearInterpolator2 = linearInterpolator;
        boolean z14 = z11;
        Object obj9 = obj6;
        PointF pointF9 = pointF4;
        aVar.d();
        if (z14) {
            interpolatorA2 = linearInterpolator2;
            obj2 = obj9;
        } else {
            if (pointFB7 == null || pointFB8 == null) {
                if (pointF3 == null || pointF9 == null || pointF5 == null || pointF2 == null) {
                    obj2 = obj7;
                    interpolatorA2 = linearInterpolator2;
                } else {
                    interpolatorA3 = a(pointF3, pointF5);
                    interpolatorA4 = a(pointF9, pointF2);
                    obj2 = obj7;
                    interpolatorA2 = null;
                }
                if (interpolatorA3 != null || interpolatorA4 == null) {
                    aVar2 = new p243q1.a(kVar, obj9, obj2, interpolatorA2, fG2, (Float) null);
                } else {
                    aVar2 = new p243q1.a(kVar, obj9, obj2, interpolatorA3, interpolatorA4, fG2);
                }
                aVar2.f41434o = pointFB5;
                aVar2.f41435p = pointFB6;
                return aVar2;
            }
            interpolatorA2 = a(pointFB7, pointFB8);
            obj2 = obj7;
        }
        interpolatorA4 = null;
        interpolatorA3 = null;
        if (interpolatorA3 != null) {
            aVar2 = new p243q1.a(kVar, obj9, obj2, interpolatorA2, fG2, (Float) null);
        } else {
            aVar2 = new p243q1.a(kVar, obj9, obj2, interpolatorA2, fG2, (Float) null);
        }
        aVar2.f41434o = pointFB5;
        aVar2.f41435p = pointFB6;
        return aVar2;
    }
}
