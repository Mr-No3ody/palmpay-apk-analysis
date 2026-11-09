package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.animatable.AnimatableValue;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.airbnb.lottie.parser.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1319a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p039cb.c f20131a = p039cb.c.d("k", "x", "y");

    public static F1.c a(com.airbnb.lottie.parser.moshi.b bVar, com.airbnb.lottie.k kVar) {
        ArrayList arrayList = new ArrayList();
        if (bVar.j() == 1) {
            bVar.a();
            while (bVar.e()) {
                com.airbnb.lottie.parser.moshi.b bVar2 = bVar;
                com.airbnb.lottie.k kVar2 = kVar;
                arrayList.add(new com.airbnb.lottie.animation.keyframe.k(kVar2, p.b(bVar2, kVar2, com.airbnb.lottie.utils.i.c(), f.f20143e, bVar.j() == 3, false)));
                bVar = bVar2;
                kVar = kVar2;
            }
            bVar.c();
            q.b(arrayList);
        } else {
            arrayList.add(new p243q1.a(o.b(bVar, com.airbnb.lottie.utils.i.c())));
        }
        return new F1.c(arrayList);
    }

    public static AnimatableValue b(com.airbnb.lottie.parser.moshi.b bVar, com.airbnb.lottie.k kVar) {
        bVar.b();
        F1.c cVarA = null;
        com.airbnb.lottie.model.animatable.b bVarW = null;
        boolean z3 = false;
        com.airbnb.lottie.model.animatable.b bVarW2 = null;
        while (bVar.j() != 4) {
            int iL = bVar.l(f20131a);
            if (iL == 0) {
                cVarA = a(bVar, kVar);
            } else if (iL != 1) {
                if (iL != 2) {
                    bVar.m();
                    bVar.n();
                } else if (bVar.j() == 6) {
                    bVar.n();
                    z3 = true;
                } else {
                    bVarW = p002a.a.w(bVar, kVar, true);
                }
            } else if (bVar.j() == 6) {
                bVar.n();
                z3 = true;
            } else {
                bVarW2 = p002a.a.w(bVar, kVar, true);
            }
        }
        bVar.d();
        if (z3) {
            kVar.a("Lottie doesn't support expressions.");
        }
        return cVarA != null ? cVarA : new com.airbnb.lottie.model.animatable.c(bVarW2, bVarW);
    }
}
