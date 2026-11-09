package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import java.io.EOFException;
import java.util.List;

/* JADX INFO: renamed from: com.airbnb.lottie.parser.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1321c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p039cb.c f20135a = p039cb.c.d("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p039cb.c f20136b = p039cb.c.d("k");

    public static void a(com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.k kVar) {
        List list = (List) bVar.f1592b;
        if (list.isEmpty()) {
            list.add(new p243q1.a(kVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(kVar.f19886m)));
        } else if (((p243q1.a) list.get(0)).f41421b == null) {
            list.set(0, new p243q1.a(kVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(kVar.f19886m)));
        }
    }

    public static boolean b(com.airbnb.lottie.model.animatable.b bVar) {
        if (bVar != null) {
            return bVar.isStatic() && ((Float) ((p243q1.a) ((List) bVar.f1592b).get(0)).f41421b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0121  */
    public static com.airbnb.lottie.model.animatable.d c(com.airbnb.lottie.parser.moshi.b bVar, com.airbnb.lottie.k kVar) throws Kf.d, EOFException {
        com.airbnb.lottie.model.animatable.a aVar;
        boolean z3 = bVar.j() == 3;
        if (z3) {
            bVar.b();
        }
        F1.c cVarA = null;
        AnimatableValue animatableValueB = null;
        com.airbnb.lottie.model.animatable.b bVarW = null;
        com.airbnb.lottie.model.animatable.a aVar2 = null;
        com.airbnb.lottie.model.animatable.b bVarW2 = null;
        com.airbnb.lottie.model.animatable.b bVarW3 = null;
        com.airbnb.lottie.model.animatable.b bVarW4 = null;
        com.airbnb.lottie.model.animatable.b bVarW5 = null;
        com.airbnb.lottie.model.animatable.b bVarW6 = null;
        com.airbnb.lottie.model.animatable.a aVarY = null;
        com.airbnb.lottie.model.animatable.b bVarW7 = null;
        com.airbnb.lottie.model.animatable.b bVarW8 = null;
        while (bVar.e()) {
            switch (bVar.l(f20135a)) {
                case 0:
                    bVar.b();
                    while (bVar.e()) {
                        if (bVar.l(f20136b) != 0) {
                            bVar.m();
                            bVar.n();
                        } else {
                            cVarA = AbstractC1319a.a(bVar, kVar);
                        }
                    }
                    bVar.d();
                    break;
                case 1:
                    animatableValueB = AbstractC1319a.b(bVar, kVar);
                    break;
                case 2:
                    aVar2 = new com.airbnb.lottie.model.animatable.a(q.a(bVar, kVar, 1.0f, f.f20145g, false), 4);
                    break;
                case 3:
                    bVarW6 = p002a.a.w(bVar, kVar, false);
                    a(bVarW6, kVar);
                    break;
                case 4:
                    bVarW = p002a.a.w(bVar, kVar, false);
                    a(bVarW, kVar);
                    break;
                case 5:
                    aVarY = p002a.a.y(bVar, kVar);
                    break;
                case 6:
                    bVarW7 = p002a.a.w(bVar, kVar, false);
                    break;
                case 7:
                    bVarW8 = p002a.a.w(bVar, kVar, false);
                    break;
                case 8:
                    bVarW2 = p002a.a.w(bVar, kVar, false);
                    break;
                case 9:
                    bVarW3 = p002a.a.w(bVar, kVar, false);
                    break;
                case 10:
                    bVarW4 = p002a.a.w(bVar, kVar, false);
                    a(bVarW4, kVar);
                    break;
                case 11:
                    bVarW5 = p002a.a.w(bVar, kVar, false);
                    a(bVarW5, kVar);
                    break;
                default:
                    bVar.m();
                    bVar.n();
                    break;
            }
        }
        if (z3) {
            bVar.d();
        }
        if (cVarA == null || (cVarA.isStatic() && ((PointF) ((p243q1.a) cVarA.f2517a.get(0)).f41421b).equals(0.0f, 0.0f))) {
            cVarA = null;
        }
        AnimatableValue animatableValue = (animatableValueB == null || (!(animatableValueB instanceof com.airbnb.lottie.model.animatable.c) && animatableValueB.isStatic() && ((PointF) animatableValueB.getKeyframes().get(0).f41421b).equals(0.0f, 0.0f))) ? null : animatableValueB;
        com.airbnb.lottie.model.animatable.b bVar2 = b(bVarW) ? null : bVarW;
        if (aVar2 == null) {
            aVar = null;
        } else {
            if (aVar2.isStatic()) {
                p243q1.d dVar = (p243q1.d) ((p243q1.a) ((List) aVar2.f1592b).get(0)).f41421b;
                if (dVar.f41445a == 1.0f && dVar.f41446b == 1.0f) {
                    aVar = null;
                }
            }
            aVar = aVar2;
        }
        return new com.airbnb.lottie.model.animatable.d(cVarA, animatableValue, aVar, bVar2, aVarY, bVarW7, bVarW8, (bVarW2 == null || (bVarW2.isStatic() && ((Float) ((p243q1.a) ((List) bVarW2.f1592b).get(0)).f41421b).floatValue() == 0.0f)) ? null : bVarW2, (bVarW3 == null || (bVarW3.isStatic() && ((Float) ((p243q1.a) ((List) bVarW3.f1592b).get(0)).f41421b).floatValue() == 0.0f)) ? null : bVarW3, b(bVarW4) ? null : bVarW4, b(bVarW5) ? null : bVarW5, b(bVarW6) ? null : bVarW6);
    }
}
