package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.view.animation.Interpolator;
import androidx.camera.camera2.internal.F;
import com.airbnb.lottie.model.content.ContentModel;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p039cb.c f20185a = p039cb.c.d("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p039cb.c f20186b = p039cb.c.d("d", "a");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p039cb.c f20187c = p039cb.c.d("ty", "nm");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:224:0x045b  */
    /* JADX WARN: Code duplicated, block: B:246:0x049e  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e5  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r2v67, types: [int[]] */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v4 */
    /* JADX WARN: Type inference failed for: r38v5 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v55 */
    public static com.airbnb.lottie.model.layer.e a(com.airbnb.lottie.parser.moshi.b bVar, com.airbnb.lottie.k kVar) {
        String str;
        boolean z3;
        int i7;
        String str2;
        String str3;
        boolean z8;
        com.airbnb.lottie.model.animatable.b bVar2;
        com.airbnb.lottie.model.animatable.b bVar3;
        com.airbnb.lottie.model.animatable.b bVar4;
        ?? r10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        bVar.b();
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        boolean z10 = false;
        boolean z11 = true;
        long jH = 0;
        long jH2 = -1;
        float fG = 1.0f;
        String strI = "UNSET";
        float fG2 = 0.0f;
        float fG3 = 0.0f;
        float fG4 = 0.0f;
        float fG5 = 0.0f;
        int iC = 0;
        int i10 = 0;
        boolean z12 = false;
        int iC2 = 0;
        int color = 0;
        boolean zF = false;
        int i11 = 1;
        ?? r38 = 1;
        String strI2 = null;
        com.airbnb.lottie.model.animatable.d dVar = null;
        p1.c cVar = null;
        E2.a aVar = null;
        com.airbnb.lottie.model.animatable.a aVar2 = null;
        androidx.work.impl.model.b bVar5 = null;
        com.airbnb.lottie.model.animatable.b bVarW = null;
        float fG6 = 0.0f;
        String strI3 = null;
        while (bVar.e()) {
            switch (bVar.l(f20185a)) {
                case 0:
                    str = strI2;
                    z3 = z11;
                    strI = bVar.i();
                    z11 = z3;
                    strI2 = str;
                    break;
                case 1:
                    str = strI2;
                    z3 = z11;
                    jH = bVar.h();
                    z11 = z3;
                    strI2 = str;
                    break;
                case 2:
                    strI2 = bVar.i();
                    z11 = z11;
                    break;
                case 3:
                    str = strI2;
                    z3 = z11;
                    int iH = bVar.h();
                    i10 = 7;
                    if (iH < 6) {
                        i10 = F.l(7)[iH];
                    }
                    z11 = z3;
                    strI2 = str;
                    break;
                case 4:
                    str = strI2;
                    z3 = z11;
                    jH2 = bVar.h();
                    z11 = z3;
                    strI2 = str;
                    break;
                case 5:
                    str = strI2;
                    z3 = z11;
                    iC = (int) (com.airbnb.lottie.utils.i.c() * bVar.h());
                    z11 = z3;
                    strI2 = str;
                    break;
                case 6:
                    str = strI2;
                    z3 = z11;
                    iC2 = (int) (com.airbnb.lottie.utils.i.c() * bVar.h());
                    z11 = z3;
                    strI2 = str;
                    break;
                case 7:
                    str = strI2;
                    z3 = z11;
                    color = Color.parseColor(bVar.i());
                    z11 = z3;
                    strI2 = str;
                    break;
                case 8:
                    str = strI2;
                    z3 = z11;
                    dVar = AbstractC1321c.c(bVar, kVar);
                    z11 = z3;
                    strI2 = str;
                    break;
                case 9:
                    str = strI2;
                    int iH2 = bVar.h();
                    if (iH2 < F.l(6).length) {
                        i11 = F.l(6)[iH2];
                        int i12 = F.i(i11);
                        if (i12 == 3) {
                            kVar.a("Unsupported matte type: Luma");
                        } else if (i12 == 4) {
                            kVar.a("Unsupported matte type: Luma Inverted");
                        }
                        z3 = true;
                        kVar.f19889p++;
                        z11 = z3;
                        strI2 = str;
                    } else {
                        kVar.a("Unsupported matte type: " + iH2);
                        strI2 = str;
                        z11 = true;
                    }
                    break;
                case 10:
                    str = strI2;
                    bVar.a();
                    while (bVar.e()) {
                        bVar.b();
                        com.airbnb.lottie.model.animatable.a aVar3 = null;
                        com.airbnb.lottie.model.animatable.a aVarY = null;
                        boolean zF2 = false;
                        int i13 = 0;
                        while (bVar.e()) {
                            String strT = bVar.t();
                            strT.getClass();
                            switch (strT) {
                                case "o":
                                    aVarY = p002a.a.y(bVar, kVar);
                                    break;
                                case "pt":
                                    aVar3 = new com.airbnb.lottie.model.animatable.a(q.a(bVar, kVar, com.airbnb.lottie.utils.i.c(), y.f20197a, false), 5);
                                    break;
                                case "inv":
                                    zF2 = bVar.f();
                                    break;
                                case "mode":
                                    String strI4 = bVar.i();
                                    strI4.getClass();
                                    switch (strI4) {
                                        case "a":
                                            i7 = 1;
                                            break;
                                        case "i":
                                            kVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            i7 = 3;
                                            break;
                                        case "n":
                                            i7 = 4;
                                            break;
                                        case "s":
                                            i7 = 2;
                                            break;
                                        default:
                                            com.airbnb.lottie.utils.c.b("Unknown mask mode " + strT + ". Defaulting to Add.");
                                            i7 = 1;
                                            break;
                                    }
                                    i13 = i7;
                                    break;
                                default:
                                    bVar.n();
                                    break;
                            }
                        }
                        bVar.d();
                        arrayList.add(new com.airbnb.lottie.model.content.e(i13, aVar3, aVarY, zF2));
                    }
                    z10 = false;
                    kVar.f19889p += arrayList.size();
                    bVar.c();
                    strI2 = str;
                    z11 = true;
                    break;
                case 11:
                    str = strI2;
                    bVar.a();
                    while (bVar.e()) {
                        ContentModel contentModelA = g.a(bVar, kVar);
                        if (contentModelA != null) {
                            arrayList2.add(contentModelA);
                        }
                    }
                    bVar.c();
                    z10 = false;
                    strI2 = str;
                    z11 = true;
                    break;
                case 12:
                    boolean z13 = z10;
                    bVar.b();
                    while (bVar.e()) {
                        int iL = bVar.l(f20186b);
                        if (iL == 0) {
                            aVar2 = new com.airbnb.lottie.model.animatable.a(q.a(bVar, kVar, com.airbnb.lottie.utils.i.c(), h.f20148a, z13 ? 1 : 0), 6);
                            strI2 = strI2;
                            z11 = true;
                            z13 = false;
                        } else if (iL != z11) {
                            bVar.m();
                            bVar.n();
                        } else {
                            bVar.a();
                            if (bVar.e()) {
                                p039cb.c cVar2 = AbstractC1320b.f20132a;
                                bVar.b();
                                N2.a aVar4 = null;
                                Na.a aVar5 = null;
                                while (bVar.e()) {
                                    int iL2 = bVar.l(AbstractC1320b.f20132a);
                                    if (iL2 == 0) {
                                        str3 = strI2;
                                        bVar.b();
                                        com.airbnb.lottie.model.animatable.a aVar6 = null;
                                        com.airbnb.lottie.model.animatable.a aVarY2 = null;
                                        com.airbnb.lottie.model.animatable.a aVarY3 = null;
                                        int i14 = z13 ? 1 : 0;
                                        while (bVar.e()) {
                                            int iL3 = bVar.l(AbstractC1320b.f20133b);
                                            if (iL3 == 0) {
                                                aVar6 = p002a.a.y(bVar, kVar);
                                            } else if (iL3 == 1) {
                                                aVarY2 = p002a.a.y(bVar, kVar);
                                            } else if (iL3 == 2) {
                                                aVarY3 = p002a.a.y(bVar, kVar);
                                            } else if (iL3 != 3) {
                                                bVar.m();
                                                bVar.n();
                                            } else {
                                                int iH3 = bVar.h();
                                                if (iH3 != 1 && iH3 != 2) {
                                                    kVar.a("Unsupported text range units: " + iH3);
                                                } else if (iH3 == 1) {
                                                    i14 = 1;
                                                }
                                                i14 = 2;
                                            }
                                        }
                                        bVar.d();
                                        if (aVar6 == null && aVarY2 != null) {
                                            aVar6 = new com.airbnb.lottie.model.animatable.a(Collections.singletonList(new p243q1.a(Integer.valueOf(z13 ? 1 : 0))), 2);
                                        }
                                        aVar5 = new Na.a(aVar6, aVarY2, aVarY3, i14);
                                    } else if (iL2 != z11) {
                                        bVar.m();
                                        bVar.n();
                                    } else {
                                        bVar.b();
                                        com.airbnb.lottie.model.animatable.a aVarV = null;
                                        com.airbnb.lottie.model.animatable.a aVarV2 = null;
                                        com.airbnb.lottie.model.animatable.b bVarW2 = null;
                                        com.airbnb.lottie.model.animatable.b bVarW3 = null;
                                        com.airbnb.lottie.model.animatable.a aVarY4 = null;
                                        while (bVar.e()) {
                                            int iL4 = bVar.l(AbstractC1320b.f20134c);
                                            if (iL4 != 0) {
                                                String str4 = strI2;
                                                if (iL4 == 1) {
                                                    aVarV2 = p002a.a.v(bVar, kVar);
                                                } else if (iL4 == 2) {
                                                    bVarW2 = p002a.a.w(bVar, kVar, true);
                                                } else if (iL4 == 3) {
                                                    bVarW3 = p002a.a.w(bVar, kVar, true);
                                                    strI2 = str4;
                                                } else if (iL4 != 4) {
                                                    bVar.m();
                                                    bVar.n();
                                                } else {
                                                    aVarY4 = p002a.a.y(bVar, kVar);
                                                }
                                                strI2 = str4;
                                            } else {
                                                aVarV = p002a.a.v(bVar, kVar);
                                            }
                                        }
                                        str3 = strI2;
                                        bVar.d();
                                        N2.a aVar7 = new N2.a();
                                        aVar7.f6064a = aVarV;
                                        aVar7.f6065b = aVarV2;
                                        aVar7.f6066c = bVarW2;
                                        aVar7.f6067d = bVarW3;
                                        aVar7.f6068e = aVarY4;
                                        aVar4 = aVar7;
                                    }
                                    strI2 = str3;
                                    z11 = true;
                                }
                                str2 = strI2;
                                bVar.d();
                                bVar5 = new androidx.work.impl.model.b(2, aVar4, aVar5);
                            } else {
                                str2 = strI2;
                            }
                            while (bVar.e()) {
                                bVar.n();
                            }
                            bVar.c();
                            strI2 = str2;
                            z11 = true;
                        }
                    }
                    bVar.d();
                    z10 = false;
                    z11 = true;
                    break;
                case 13:
                    bVar.a();
                    ArrayList arrayList3 = new ArrayList();
                    while (bVar.e()) {
                        bVar.b();
                        while (bVar.e()) {
                            int iL5 = bVar.l(f20187c);
                            if (iL5 == 0) {
                                int iH4 = bVar.h();
                                if (iH4 == 29) {
                                    p039cb.c cVar3 = AbstractC1322d.f20137a;
                                    cVar = null;
                                    while (bVar.e()) {
                                        if (bVar.l(AbstractC1322d.f20137a) != 0) {
                                            bVar.m();
                                            bVar.n();
                                        } else {
                                            bVar.a();
                                            while (bVar.e()) {
                                                bVar.b();
                                                boolean z14 = z10;
                                                p1.c cVar4 = null;
                                                while (bVar.e()) {
                                                    int iL6 = bVar.l(AbstractC1322d.f20138b);
                                                    if (iL6 == 0) {
                                                        z14 = bVar.h() == 0 ? z11 : z10;
                                                    } else if (iL6 != z11) {
                                                        bVar.m();
                                                        bVar.n();
                                                    } else if (z14) {
                                                        cVar4 = new p1.c(p002a.a.w(bVar, kVar, z11), 17);
                                                    } else {
                                                        bVar.n();
                                                    }
                                                }
                                                bVar.d();
                                                if (cVar4 != null) {
                                                    cVar = cVar4;
                                                }
                                            }
                                            bVar.c();
                                        }
                                    }
                                } else {
                                    if (iH4 == 25) {
                                        i iVar = new i();
                                        while (bVar.e()) {
                                            if (bVar.l(i.f20150f) != 0) {
                                                bVar.m();
                                                bVar.n();
                                            } else {
                                                bVar.a();
                                                while (bVar.e()) {
                                                    bVar.b();
                                                    String strI5 = "";
                                                    while (bVar.e()) {
                                                        int iL7 = bVar.l(i.f20151g);
                                                        if (iL7 == 0) {
                                                            strI5 = bVar.i();
                                                        } else if (iL7 == z11) {
                                                            strI5.getClass();
                                                            switch (strI5.hashCode()) {
                                                                case 353103893:
                                                                    if (!strI5.equals("Distance")) {
                                                                        r10 = -1;
                                                                    } else {
                                                                        r10 = z10;
                                                                    }
                                                                    break;
                                                                case 397447147:
                                                                    if (!strI5.equals("Opacity")) {
                                                                        r10 = -1;
                                                                    } else {
                                                                        r10 = z11;
                                                                    }
                                                                    break;
                                                                case 1041377119:
                                                                    if (!strI5.equals("Direction")) {
                                                                        r10 = -1;
                                                                    } else {
                                                                        r10 = 2;
                                                                    }
                                                                    break;
                                                                case 1379387491:
                                                                    if (!strI5.equals("Shadow Color")) {
                                                                        r10 = -1;
                                                                    } else {
                                                                        r10 = 3;
                                                                    }
                                                                    break;
                                                                case 1383710113:
                                                                    if (!strI5.equals("Softness")) {
                                                                        r10 = -1;
                                                                    } else {
                                                                        r10 = 4;
                                                                    }
                                                                    break;
                                                                default:
                                                                    r10 = -1;
                                                                    break;
                                                            }
                                                            switch (r10) {
                                                                case 0:
                                                                    iVar.f20155d = p002a.a.w(bVar, kVar, z11);
                                                                    break;
                                                                case 1:
                                                                    iVar.f20153b = p002a.a.w(bVar, kVar, z10);
                                                                    break;
                                                                case 2:
                                                                    iVar.f20154c = p002a.a.w(bVar, kVar, z10);
                                                                    break;
                                                                case 3:
                                                                    iVar.f20152a = p002a.a.v(bVar, kVar);
                                                                    break;
                                                                case 4:
                                                                    iVar.f20156e = p002a.a.w(bVar, kVar, z11);
                                                                    break;
                                                                default:
                                                                    bVar.n();
                                                                    break;
                                                            }
                                                        } else {
                                                            bVar.m();
                                                            bVar.n();
                                                        }
                                                    }
                                                    bVar.d();
                                                }
                                                bVar.c();
                                            }
                                        }
                                        com.airbnb.lottie.model.animatable.a aVar8 = iVar.f20152a;
                                        if (aVar8 == null || (bVar2 = iVar.f20153b) == null || (bVar3 = iVar.f20154c) == null) {
                                            z8 = z10;
                                        } else {
                                            z8 = z10;
                                            com.airbnb.lottie.model.animatable.b bVar6 = iVar.f20155d;
                                            if (bVar6 != null && (bVar4 = iVar.f20156e) != null) {
                                                aVar = new E2.a(aVar8, bVar2, bVar3, bVar6, bVar4);
                                            }
                                        }
                                        aVar = null;
                                    }
                                    z10 = z8;
                                }
                            } else if (iL5 != z11) {
                                bVar.m();
                                bVar.n();
                            } else {
                                arrayList3.add(bVar.i());
                            }
                            z8 = z10;
                            z10 = z8;
                        }
                        bVar.d();
                    }
                    bVar.c();
                    kVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    break;
                case 14:
                    fG = (float) bVar.g();
                    break;
                case 15:
                    fG6 = (float) bVar.g();
                    break;
                case 16:
                    fG4 = (float) (bVar.g() * ((double) com.airbnb.lottie.utils.i.c()));
                    break;
                case 17:
                    fG5 = (float) (bVar.g() * ((double) com.airbnb.lottie.utils.i.c()));
                    break;
                case 18:
                    fG2 = (float) bVar.g();
                    break;
                case 19:
                    fG3 = (float) bVar.g();
                    break;
                case 20:
                    bVarW = p002a.a.w(bVar, kVar, z10);
                    break;
                case 21:
                    strI3 = bVar.i();
                    break;
                case 22:
                    zF = bVar.f();
                    break;
                case 23:
                    z12 = bVar.h() != z11 ? z10 : z11;
                    break;
                case 24:
                    int iH5 = bVar.h();
                    if (iH5 < F.l(18).length) {
                        r38 = F.l(18)[iH5];
                    } else {
                        kVar.a("Unsupported Blend Mode: " + iH5);
                        r38 = z11;
                    }
                    break;
                default:
                    bVar.m();
                    bVar.n();
                    str = strI2;
                    strI2 = str;
                    z11 = true;
                    break;
            }
        }
        String str5 = strI2;
        bVar.d();
        ArrayList arrayList4 = new ArrayList();
        if (fG2 > 0.0f) {
            arrayList4.add(new p243q1.a(kVar, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(fG2)));
        }
        if (fG3 <= 0.0f) {
            fG3 = kVar.f19886m;
        }
        arrayList4.add(new p243q1.a(kVar, fValueOf2, fValueOf2, (Interpolator) null, fG2, Float.valueOf(fG3)));
        arrayList4.add(new p243q1.a(kVar, fValueOf, fValueOf, (Interpolator) null, fG3, Float.valueOf(Float.MAX_VALUE)));
        if (strI.endsWith(".ai") || TransType.TRANS_TYPE_PURCHASE_EARN.equals(strI3)) {
            kVar.a("Convert your Illustrator layers to shape layers.");
        }
        boolean z15 = z12;
        if (z15) {
            if (dVar == null) {
                dVar = new com.airbnb.lottie.model.animatable.d();
            }
            com.airbnb.lottie.model.animatable.d dVar2 = dVar;
            dVar2.f19916m = z15;
            dVar = dVar2;
        }
        return new com.airbnb.lottie.model.layer.e(arrayList2, kVar, strI, jH, i10, jH2, str5, arrayList, dVar, iC, iC2, color, fG, fG6, fG4, fG5, aVar2, bVar5, arrayList4, i11, bVarW, zF, cVar, aVar, r38 == true ? 1 : 0);
    }
}
