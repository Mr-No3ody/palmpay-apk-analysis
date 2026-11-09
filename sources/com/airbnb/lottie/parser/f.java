package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ValueParser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f20140b = new f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f20141c = new f(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f20142d = new f(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f20143e = new f(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f20144f = new f(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f20145g = new f(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20146a;

    public /* synthetic */ f(int i7) {
        this.f20146a = i7;
    }

    @Override // com.airbnb.lottie.parser.ValueParser
    public final Object parse(com.airbnb.lottie.parser.moshi.a aVar, float f10) {
        switch (this.f20146a) {
            case 0:
                boolean z3 = aVar.j() == 1;
                if (z3) {
                    aVar.a();
                }
                double dG = aVar.g();
                double dG2 = aVar.g();
                double dG3 = aVar.g();
                double dG4 = aVar.j() == 7 ? aVar.g() : 1.0d;
                if (z3) {
                    aVar.c();
                }
                if (dG <= 1.0d && dG2 <= 1.0d && dG3 <= 1.0d) {
                    dG *= 255.0d;
                    dG2 *= 255.0d;
                    dG3 *= 255.0d;
                    if (dG4 <= 1.0d) {
                        dG4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dG4, (int) dG, (int) dG2, (int) dG3));
            case 1:
                return Float.valueOf(o.d(aVar) * f10);
            case 2:
                return Integer.valueOf(Math.round(o.d(aVar) * f10));
            case 3:
                return o.b(aVar, f10);
            case 4:
                int iJ = aVar.j();
                if (iJ == 1) {
                    return o.b(aVar, f10);
                }
                if (iJ == 3) {
                    return o.b(aVar, f10);
                }
                if (iJ != 7) {
                    throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(com.airbnb.lottie.model.layer.d.w(iJ)));
                }
                PointF pointF = new PointF(((float) aVar.g()) * f10, ((float) aVar.g()) * f10);
                while (aVar.e()) {
                    aVar.n();
                }
                return pointF;
            default:
                boolean z8 = aVar.j() == 1;
                if (z8) {
                    aVar.a();
                }
                float fG = (float) aVar.g();
                float fG2 = (float) aVar.g();
                while (aVar.e()) {
                    aVar.n();
                }
                if (z8) {
                    aVar.c();
                }
                return new p243q1.d((fG / 100.0f) * f10, (fG2 / 100.0f) * f10);
        }
    }
}
