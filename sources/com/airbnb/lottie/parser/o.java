package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.camera.camera2.internal.F;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p039cb.c f20179a = p039cb.c.d("x", "y");

    public static int a(com.airbnb.lottie.parser.moshi.a aVar) {
        aVar.a();
        int iG = (int) (aVar.g() * 255.0d);
        int iG2 = (int) (aVar.g() * 255.0d);
        int iG3 = (int) (aVar.g() * 255.0d);
        while (aVar.e()) {
            aVar.n();
        }
        aVar.c();
        return Color.argb(255, iG, iG2, iG3);
    }

    public static PointF b(com.airbnb.lottie.parser.moshi.a aVar, float f10) {
        int i7 = F.i(aVar.j());
        if (i7 == 0) {
            aVar.a();
            float fG = (float) aVar.g();
            float fG2 = (float) aVar.g();
            while (aVar.j() != 2) {
                aVar.n();
            }
            aVar.c();
            return new PointF(fG * f10, fG2 * f10);
        }
        if (i7 != 2) {
            if (i7 != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(com.airbnb.lottie.model.layer.d.w(aVar.j())));
            }
            float fG3 = (float) aVar.g();
            float fG4 = (float) aVar.g();
            while (aVar.e()) {
                aVar.n();
            }
            return new PointF(fG3 * f10, fG4 * f10);
        }
        aVar.b();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (aVar.e()) {
            int iL = aVar.l(f20179a);
            if (iL == 0) {
                fD = d(aVar);
            } else if (iL != 1) {
                aVar.m();
                aVar.n();
            } else {
                fD2 = d(aVar);
            }
        }
        aVar.d();
        return new PointF(fD * f10, fD2 * f10);
    }

    public static ArrayList c(com.airbnb.lottie.parser.moshi.a aVar, float f10) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.j() == 1) {
            aVar.a();
            arrayList.add(b(aVar, f10));
            aVar.c();
        }
        aVar.c();
        return arrayList;
    }

    public static float d(com.airbnb.lottie.parser.moshi.a aVar) {
        int iJ = aVar.j();
        int i7 = F.i(iJ);
        if (i7 != 0) {
            if (i7 == 6) {
                return (float) aVar.g();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(com.airbnb.lottie.model.layer.d.w(iJ)));
        }
        aVar.a();
        float fG = (float) aVar.g();
        while (aVar.e()) {
            aVar.n();
        }
        aVar.c();
        return fG;
    }
}
