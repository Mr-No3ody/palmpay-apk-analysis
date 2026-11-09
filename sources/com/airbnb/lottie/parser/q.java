package com.airbnb.lottie.parser;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p039cb.c f20184a = p039cb.c.d("k");

    public static ArrayList a(com.airbnb.lottie.parser.moshi.a aVar, com.airbnb.lottie.k kVar, float f10, ValueParser valueParser, boolean z3) {
        com.airbnb.lottie.parser.moshi.a aVar2;
        com.airbnb.lottie.k kVar2;
        float f11;
        ValueParser valueParser2;
        boolean z8;
        ArrayList arrayList = new ArrayList();
        if (aVar.j() == 6) {
            kVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        aVar.b();
        while (aVar.e()) {
            if (aVar.l(f20184a) != 0) {
                aVar.n();
            } else if (aVar.j() == 1) {
                aVar.a();
                if (aVar.j() == 7) {
                    com.airbnb.lottie.parser.moshi.a aVar3 = aVar;
                    com.airbnb.lottie.k kVar3 = kVar;
                    float f12 = f10;
                    ValueParser valueParser3 = valueParser;
                    boolean z10 = z3;
                    p243q1.a aVarB = p.b(aVar3, kVar3, f12, valueParser3, false, z10);
                    aVar2 = aVar3;
                    kVar2 = kVar3;
                    f11 = f12;
                    valueParser2 = valueParser3;
                    z8 = z10;
                    arrayList.add(aVarB);
                } else {
                    aVar2 = aVar;
                    kVar2 = kVar;
                    f11 = f10;
                    valueParser2 = valueParser;
                    z8 = z3;
                    while (aVar2.e()) {
                        arrayList.add(p.b(aVar2, kVar2, f11, valueParser2, true, z8));
                    }
                }
                aVar2.c();
                aVar = aVar2;
                kVar = kVar2;
                f10 = f11;
                valueParser = valueParser2;
                z3 = z8;
            } else {
                com.airbnb.lottie.parser.moshi.a aVar4 = aVar;
                arrayList.add(p.b(aVar4, kVar, f10, valueParser, false, z3));
                aVar = aVar4;
            }
        }
        aVar.d();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i7;
        Object obj;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            i7 = size - 1;
            if (i10 >= i7) {
                break;
            }
            p243q1.a aVar = (p243q1.a) arrayList.get(i10);
            i10++;
            p243q1.a aVar2 = (p243q1.a) arrayList.get(i10);
            aVar.f41427h = Float.valueOf(aVar2.f41426g);
            if (aVar.f41422c == null && (obj = aVar2.f41421b) != null) {
                aVar.f41422c = obj;
                if (aVar instanceof com.airbnb.lottie.animation.keyframe.k) {
                    ((com.airbnb.lottie.animation.keyframe.k) aVar).d();
                }
            }
        }
        p243q1.a aVar3 = (p243q1.a) arrayList.get(i7);
        if ((aVar3.f41421b == null || aVar3.f41422c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
