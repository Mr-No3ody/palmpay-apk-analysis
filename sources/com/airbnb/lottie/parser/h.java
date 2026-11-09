package com.airbnb.lottie.parser;

import android.graphics.PointF;
import androidx.camera.camera2.internal.F;

/* JADX INFO: loaded from: classes.dex */
public final class h implements ValueParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f20148a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p039cb.c f20149b = p039cb.c.d("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // com.airbnb.lottie.parser.ValueParser
    public final Object parse(com.airbnb.lottie.parser.moshi.a aVar, float f10) {
        String str;
        aVar.b();
        String strI = null;
        float fG = 0.0f;
        float fG2 = 0.0f;
        float fG3 = 0.0f;
        float fG4 = 0.0f;
        int iH = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zF = true;
        int i7 = 3;
        String strI2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (aVar.e()) {
            switch (aVar.l(f20149b)) {
                case 0:
                    strI = aVar.i();
                    continue;
                case 1:
                    str = strI;
                    strI2 = aVar.i();
                    break;
                case 2:
                    str = strI;
                    fG = (float) aVar.g();
                    break;
                case 3:
                    str = strI;
                    int iH2 = aVar.h();
                    i7 = (iH2 <= 2 && iH2 >= 0) ? F.l(3)[iH2] : 3;
                    break;
                case 4:
                    str = strI;
                    iH = aVar.h();
                    break;
                case 5:
                    str = strI;
                    fG2 = (float) aVar.g();
                    break;
                case 6:
                    str = strI;
                    fG3 = (float) aVar.g();
                    break;
                case 7:
                    str = strI;
                    iA = o.a(aVar);
                    break;
                case 8:
                    str = strI;
                    iA2 = o.a(aVar);
                    break;
                case 9:
                    str = strI;
                    fG4 = (float) aVar.g();
                    break;
                case 10:
                    str = strI;
                    zF = aVar.f();
                    break;
                case 11:
                    str = strI;
                    aVar.a();
                    pointF = new PointF(((float) aVar.g()) * f10, ((float) aVar.g()) * f10);
                    aVar.c();
                    break;
                case 12:
                    aVar.a();
                    str = strI;
                    pointF2 = new PointF(((float) aVar.g()) * f10, ((float) aVar.g()) * f10);
                    aVar.c();
                    break;
                default:
                    aVar.m();
                    aVar.n();
                    continue;
            }
            strI = str;
        }
        aVar.d();
        p212o1.b bVar = new p212o1.b();
        bVar.f39986a = strI;
        bVar.f39987b = strI2;
        bVar.f39988c = fG;
        bVar.f39989d = i7;
        bVar.f39990e = iH;
        bVar.f39991f = fG2;
        bVar.f39992g = fG3;
        bVar.f39993h = iA;
        bVar.f39994i = iA2;
        bVar.f39995j = fG4;
        bVar.f39996k = zF;
        bVar.f39997l = pointF;
        bVar.f39998m = pointF2;
        return bVar;
    }
}
