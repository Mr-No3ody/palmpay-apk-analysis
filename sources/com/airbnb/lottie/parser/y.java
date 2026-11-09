package com.airbnb.lottie.parser;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class y implements ValueParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f20197a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p039cb.c f20198b = p039cb.c.d("c", "v", "i", "o");

    @Override // com.airbnb.lottie.parser.ValueParser
    public final Object parse(com.airbnb.lottie.parser.moshi.a aVar, float f10) {
        if (aVar.j() == 1) {
            aVar.a();
        }
        aVar.b();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zF = false;
        while (aVar.e()) {
            int iL = aVar.l(f20198b);
            if (iL == 0) {
                zF = aVar.f();
            } else if (iL == 1) {
                arrayListC = o.c(aVar, f10);
            } else if (iL == 2) {
                arrayListC2 = o.c(aVar, f10);
            } else if (iL != 3) {
                aVar.m();
                aVar.n();
            } else {
                arrayListC3 = o.c(aVar, f10);
            }
        }
        aVar.d();
        if (aVar.j() == 2) {
            aVar.c();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new com.airbnb.lottie.model.content.j(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i7 = 1; i7 < size; i7++) {
            PointF pointF2 = (PointF) arrayListC.get(i7);
            int i10 = i7 - 1;
            arrayList.add(new p212o1.a(com.airbnb.lottie.utils.g.a((PointF) arrayListC.get(i10), (PointF) arrayListC3.get(i10)), com.airbnb.lottie.utils.g.a(pointF2, (PointF) arrayListC2.get(i7)), pointF2));
        }
        if (zF) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i11 = size - 1;
            arrayList.add(new p212o1.a(com.airbnb.lottie.utils.g.a((PointF) arrayListC.get(i11), (PointF) arrayListC3.get(i11)), com.airbnb.lottie.utils.g.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new com.airbnb.lottie.model.content.j(pointF, zF, arrayList);
    }
}
