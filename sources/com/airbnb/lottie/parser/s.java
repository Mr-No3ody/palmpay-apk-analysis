package com.airbnb.lottie.parser;

import android.graphics.Rect;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p039cb.c f20188a = p039cb.c.d("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p039cb.c f20189b = p039cb.c.d("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p039cb.c f20190c = p039cb.c.d("list");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p039cb.c f20191d = p039cb.c.d("cm", "tm", "dr");

    public static com.airbnb.lottie.k a(com.airbnb.lottie.parser.moshi.b bVar) throws Kf.d, EOFException {
        float f10;
        ArrayList arrayList;
        float f11;
        float fC = com.airbnb.lottie.utils.i.c();
        M.j jVar = new M.j();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        M.o oVar = new M.o();
        com.airbnb.lottie.k kVar = new com.airbnb.lottie.k();
        bVar.b();
        float fG = 0.0f;
        int iG = 0;
        int iG2 = 0;
        float fG2 = 0.0f;
        float fG3 = 0.0f;
        while (bVar.e()) {
            switch (bVar.l(f20188a)) {
                case 0:
                    f10 = fC;
                    iG = (int) bVar.g();
                    break;
                case 1:
                    f10 = fC;
                    iG2 = (int) bVar.g();
                    break;
                case 2:
                    f10 = fC;
                    fG2 = (float) bVar.g();
                    break;
                case 3:
                    f10 = fC;
                    fG = ((float) bVar.g()) - 0.01f;
                    break;
                case 4:
                    f10 = fC;
                    fG3 = (float) bVar.g();
                    break;
                case 5:
                    f10 = fC;
                    arrayList = arrayList3;
                    f11 = fG;
                    String[] strArrSplit = bVar.i().split("\\.");
                    int i7 = Integer.parseInt(strArrSplit[0]);
                    int i10 = Integer.parseInt(strArrSplit[1]);
                    int i11 = Integer.parseInt(strArrSplit[2]);
                    if (i7 < 4 || (i7 <= 4 && (i10 < 4 || (i10 <= 4 && i11 < 0)))) {
                        kVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fG = f11;
                    arrayList3 = arrayList;
                    break;
                case 6:
                    f10 = fC;
                    arrayList = arrayList3;
                    f11 = fG;
                    bVar.a();
                    int i12 = 0;
                    while (bVar.e()) {
                        com.airbnb.lottie.model.layer.e eVarA = r.a(bVar, kVar);
                        if (eVarA.f20055e == 3) {
                            i12++;
                        }
                        arrayList2.add(eVarA);
                        jVar.e(eVarA.f20054d, eVarA);
                        if (i12 > 4) {
                            com.airbnb.lottie.utils.c.b("You have " + i12 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    bVar.c();
                    fG = f11;
                    arrayList3 = arrayList;
                    break;
                case 7:
                    f10 = fC;
                    arrayList = arrayList3;
                    f11 = fG;
                    bVar.a();
                    while (bVar.e()) {
                        ArrayList arrayList4 = new ArrayList();
                        M.j jVar2 = new M.j();
                        bVar.b();
                        String strI = null;
                        String strI2 = null;
                        String strI3 = null;
                        int iH = 0;
                        int iH2 = 0;
                        while (bVar.e()) {
                            int iL = bVar.l(f20189b);
                            if (iL == 0) {
                                strI = bVar.i();
                            } else if (iL == 1) {
                                bVar.a();
                                while (bVar.e()) {
                                    com.airbnb.lottie.model.layer.e eVarA2 = r.a(bVar, kVar);
                                    jVar2.e(eVarA2.f20054d, eVarA2);
                                    arrayList4.add(eVarA2);
                                }
                                bVar.c();
                            } else if (iL == 2) {
                                iH = bVar.h();
                            } else if (iL == 3) {
                                iH2 = bVar.h();
                            } else if (iL == 4) {
                                strI2 = bVar.i();
                            } else if (iL != 5) {
                                bVar.m();
                                bVar.n();
                            } else {
                                strI3 = bVar.i();
                            }
                        }
                        bVar.d();
                        if (strI2 != null) {
                            map2.put(strI, new com.airbnb.lottie.A(iH, strI, iH2, strI2, strI3));
                        } else {
                            map.put(strI, arrayList4);
                        }
                    }
                    bVar.c();
                    fG = f11;
                    arrayList3 = arrayList;
                    break;
                case 8:
                    f10 = fC;
                    f11 = fG;
                    bVar.b();
                    while (bVar.e()) {
                        if (bVar.l(f20190c) != 0) {
                            bVar.m();
                            bVar.n();
                        } else {
                            bVar.a();
                            while (bVar.e()) {
                                p039cb.c cVar = k.f20159a;
                                bVar.b();
                                String strI4 = null;
                                String strI5 = null;
                                String strI6 = null;
                                while (bVar.e()) {
                                    int iL2 = bVar.l(k.f20159a);
                                    if (iL2 != 0) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (iL2 == 1) {
                                            strI5 = bVar.i();
                                        } else if (iL2 == 2) {
                                            strI6 = bVar.i();
                                        } else if (iL2 != 3) {
                                            bVar.m();
                                            bVar.n();
                                        } else {
                                            bVar.g();
                                        }
                                        arrayList3 = arrayList5;
                                    } else {
                                        strI4 = bVar.i();
                                    }
                                }
                                bVar.d();
                                map3.put(strI5, new p212o1.c(strI4, strI5, strI6));
                                arrayList3 = arrayList3;
                            }
                            bVar.c();
                        }
                    }
                    arrayList = arrayList3;
                    bVar.d();
                    fG = f11;
                    arrayList3 = arrayList;
                    break;
                case 9:
                    f10 = fC;
                    f11 = fG;
                    bVar.a();
                    while (bVar.e()) {
                        p039cb.c cVar2 = j.f20157a;
                        ArrayList arrayList6 = new ArrayList();
                        bVar.b();
                        double dG = 0.0d;
                        String strI7 = null;
                        String strI8 = null;
                        char cCharAt = 0;
                        while (bVar.e()) {
                            int iL3 = bVar.l(j.f20157a);
                            if (iL3 == 0) {
                                cCharAt = bVar.i().charAt(0);
                            } else if (iL3 == 1) {
                                bVar.g();
                            } else if (iL3 == 2) {
                                dG = bVar.g();
                            } else if (iL3 == 3) {
                                strI7 = bVar.i();
                            } else if (iL3 == 4) {
                                strI8 = bVar.i();
                            } else if (iL3 != 5) {
                                bVar.m();
                                bVar.n();
                            } else {
                                bVar.b();
                                while (bVar.e()) {
                                    if (bVar.l(j.f20158b) != 0) {
                                        bVar.m();
                                        bVar.n();
                                    } else {
                                        bVar.a();
                                        while (bVar.e()) {
                                            arrayList6.add((com.airbnb.lottie.model.content.l) g.a(bVar, kVar));
                                        }
                                        bVar.c();
                                    }
                                }
                                bVar.d();
                            }
                        }
                        bVar.d();
                        p212o1.d dVar = new p212o1.d(arrayList6, cCharAt, dG, strI7, strI8);
                        oVar.d(dVar.hashCode(), dVar);
                    }
                    bVar.c();
                    arrayList = arrayList3;
                    fG = f11;
                    arrayList3 = arrayList;
                    break;
                case 10:
                    bVar.a();
                    while (bVar.e()) {
                        bVar.b();
                        String strI9 = null;
                        float fG4 = 0.0f;
                        float fG5 = 0.0f;
                        while (bVar.e()) {
                            int iL4 = bVar.l(f20191d);
                            if (iL4 != 0) {
                                float f12 = fC;
                                if (iL4 == 1) {
                                    fG4 = (float) bVar.g();
                                } else if (iL4 != 2) {
                                    bVar.m();
                                    bVar.n();
                                } else {
                                    fG5 = (float) bVar.g();
                                }
                                fC = f12;
                            } else {
                                strI9 = bVar.i();
                            }
                        }
                        float f13 = fC;
                        bVar.d();
                        arrayList3.add(new p212o1.g(strI9, fG4, fG5));
                        fG = fG;
                        fC = f13;
                    }
                    f10 = fC;
                    f11 = fG;
                    bVar.c();
                    arrayList = arrayList3;
                    fG = f11;
                    arrayList3 = arrayList;
                    break;
                default:
                    bVar.m();
                    bVar.n();
                    f10 = fC;
                    arrayList = arrayList3;
                    f11 = fG;
                    fG = f11;
                    arrayList3 = arrayList;
                    break;
            }
            fC = f10;
        }
        float f14 = fC;
        Rect rect = new Rect(0, 0, (int) (iG * f14), (int) (iG2 * f14));
        float fC2 = com.airbnb.lottie.utils.i.c();
        kVar.f19884k = rect;
        kVar.f19885l = fG2;
        kVar.f19886m = fG;
        kVar.f19887n = fG3;
        kVar.f19883j = arrayList2;
        kVar.f19882i = jVar;
        kVar.f19876c = map;
        kVar.f19877d = map2;
        kVar.f19878e = fC2;
        kVar.f19881h = oVar;
        kVar.f19879f = map3;
        kVar.f19880g = arrayList3;
        return kVar;
    }
}
