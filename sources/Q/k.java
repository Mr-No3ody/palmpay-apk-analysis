package Q;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f7570a = new boolean[3];

    /* JADX WARN: Code duplicated, block: B:190:0x0295  */
    /* JADX WARN: Code duplicated, block: B:207:0x02df  */
    /* JADX WARN: Code duplicated, block: B:209:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:211:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:213:0x0309  */
    /* JADX WARN: Code duplicated, block: B:235:0x0373  */
    /* JADX WARN: Code duplicated, block: B:237:0x038d  */
    /* JADX WARN: Code duplicated, block: B:239:0x0391  */
    /* JADX WARN: Code duplicated, block: B:243:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:254:0x0427  */
    /* JADX WARN: Code duplicated, block: B:410:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:413:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:414:0x06af  */
    /* JADX WARN: Code duplicated, block: B:417:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:418:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:420:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:422:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:425:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:427:0x06d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:437:0x06ec A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:74:0x0111  */
    public static void a(f fVar, androidx.constraintlayout.core.c cVar, ArrayList arrayList, int i7) {
        int i10;
        b[] bVarArr;
        int i11;
        int i12;
        float f10;
        boolean z3;
        boolean z8;
        boolean z10;
        c[] cVarArr;
        int i13;
        b[] bVarArr2;
        e eVar;
        androidx.constraintlayout.core.c cVar2;
        androidx.constraintlayout.core.g gVar;
        c cVar3;
        androidx.constraintlayout.core.g gVar2;
        int i14;
        c cVar4;
        androidx.constraintlayout.core.g gVar3;
        e eVar2;
        int i15;
        c[] cVarArr2;
        int i16;
        c cVar5;
        c cVar6;
        androidx.constraintlayout.core.g gVar4;
        c cVar7;
        androidx.constraintlayout.core.g gVar5;
        int size;
        ArrayList arrayList2;
        float f11;
        androidx.constraintlayout.core.g gVar6;
        androidx.constraintlayout.core.g gVar7;
        androidx.constraintlayout.core.g gVar8;
        androidx.constraintlayout.core.g gVar9;
        androidx.constraintlayout.core.b bVarL;
        float f12;
        boolean z11;
        c cVar8;
        e eVar3;
        int i17;
        int i18;
        int i19;
        e eVar4;
        float f13;
        f fVar2 = fVar;
        if (i7 == 0) {
            i10 = fVar2.f7504D0;
            bVarArr = fVar2.f7507G0;
            i11 = 0;
        } else {
            i10 = fVar2.f7505E0;
            bVarArr = fVar2.f7506F0;
            i11 = 2;
        }
        int i20 = i10;
        b[] bVarArr3 = bVarArr;
        int i21 = 0;
        while (i21 < i20) {
            b bVar = bVarArr3[i21];
            boolean z12 = bVar.f7418q;
            d dVar = d.f7430c;
            e eVar5 = bVar.f7402a;
            int i22 = 8;
            if (z12) {
                i12 = i21;
                f10 = 0.0f;
            } else {
                int i23 = bVar.f7413l;
                int i24 = i23 * 2;
                e eVar6 = eVar5;
                e eVar7 = eVar6;
                boolean z13 = false;
                f10 = 0.0f;
                while (!z13) {
                    bVar.f7410i++;
                    eVar6.f7487p0[i23] = null;
                    eVar6.f7485o0[i23] = null;
                    int i25 = eVar6.i0;
                    c[] cVarArr3 = eVar6.f7450R;
                    if (i25 != i22) {
                        eVar6.k(i23);
                        cVarArr3[i24].e();
                        int i26 = i24 + 1;
                        cVarArr3[i26].e();
                        cVarArr3[i24].e();
                        cVarArr3[i26].e();
                        if (bVar.f7403b == null) {
                            bVar.f7403b = eVar6;
                        }
                        bVar.f7405d = eVar6;
                        d dVar2 = eVar6.f7453U[i23];
                        if (dVar2 == dVar) {
                            int i27 = eVar6.t[i23];
                            i18 = i21;
                            if (i27 == 0 || i27 == 3 || i27 == 2) {
                                bVar.f7411j++;
                                float f14 = eVar6.f7483n0[i23];
                                if (f14 > 0.0f) {
                                    f13 = f14;
                                    bVar.f7412k += f13;
                                } else {
                                    f13 = f14;
                                }
                                i19 = i23;
                                if (eVar6.i0 != 8 && dVar2 == dVar && (i27 == 0 || i27 == 3)) {
                                    if (f13 < 0.0f) {
                                        bVar.f7415n = true;
                                    } else {
                                        bVar.f7416o = true;
                                    }
                                    if (bVar.f7409h == null) {
                                        bVar.f7409h = new ArrayList();
                                    }
                                    bVar.f7409h.add(eVar6);
                                }
                                if (bVar.f7407f == null) {
                                    bVar.f7407f = eVar6;
                                }
                                e eVar8 = bVar.f7408g;
                                if (eVar8 != null) {
                                    eVar8.f7485o0[i19] = eVar6;
                                }
                                bVar.f7408g = eVar6;
                            } else {
                                i19 = i23;
                            }
                            if (i19 == 0) {
                                if (eVar6.f7490r == 0 && eVar6.f7495u == 0) {
                                    int i28 = eVar6.f7496v;
                                }
                            } else if (eVar6.f7492s == 0 && eVar6.f7498x == 0) {
                                int i29 = eVar6.f7499y;
                            }
                        } else {
                            i18 = i21;
                            i19 = i23;
                        }
                    } else {
                        i18 = i21;
                        i19 = i23;
                    }
                    if (eVar7 != eVar6) {
                        eVar7.f7487p0[i19] = eVar6;
                    }
                    c cVar9 = cVarArr3[i24 + 1].f7424f;
                    if (cVar9 != null) {
                        eVar4 = cVar9.f7422d;
                        c cVar10 = eVar4.f7450R[i24].f7424f;
                        if (cVar10 == null || cVar10.f7422d != eVar6) {
                            eVar4 = null;
                        }
                    } else {
                        eVar4 = null;
                    }
                    if (eVar4 == null) {
                        eVar4 = eVar6;
                        z13 = true;
                    }
                    eVar7 = eVar6;
                    i23 = i19;
                    i22 = 8;
                    eVar6 = eVar4;
                    i21 = i18;
                }
                i12 = i21;
                int i30 = i23;
                e eVar9 = bVar.f7403b;
                if (eVar9 != null) {
                    eVar9.f7450R[i24].e();
                }
                e eVar10 = bVar.f7405d;
                if (eVar10 != null) {
                    eVar10.f7450R[i24 + 1].e();
                }
                bVar.f7404c = eVar6;
                if (i30 == 0 && bVar.f7414m) {
                    bVar.f7406e = eVar6;
                } else {
                    bVar.f7406e = eVar5;
                }
                bVar.f7417p = bVar.f7416o && bVar.f7415n;
            }
            bVar.f7418q = true;
            if (arrayList == 0 || arrayList.contains(eVar5)) {
                e eVar11 = bVar.f7404c;
                e eVar12 = bVar.f7403b;
                e eVar13 = bVar.f7405d;
                e eVar14 = bVar.f7406e;
                float f15 = bVar.f7412k;
                boolean z14 = fVar2.f7453U[i7] == d.f7429b;
                if (i7 == 0) {
                    int i31 = eVar14.f7479l0;
                    boolean z15 = i31 == 0;
                    z3 = i31 == 1;
                    z8 = i31 == 2;
                    z10 = z15;
                } else {
                    int i32 = eVar14.f7481m0;
                    boolean z16 = i32 == 0;
                    z3 = i32 == 1;
                    z8 = i32 == 2;
                    z10 = z16;
                }
                boolean z17 = false;
                while (true) {
                    cVarArr = fVar2.f7450R;
                    if (z17) {
                        break;
                    }
                    c cVar11 = eVar5.f7450R[i11];
                    int i33 = z8 ? 1 : 4;
                    int iE = cVar11.e();
                    boolean z18 = z8;
                    boolean z19 = eVar5.f7453U[i7] == dVar && eVar5.t[i7] == 0;
                    c cVar12 = cVar11.f7424f;
                    if (cVar12 != null && eVar5 != eVar5) {
                        iE = cVar12.e() + iE;
                    }
                    int i34 = iE;
                    if (z18 && eVar5 != eVar5 && eVar5 != eVar12) {
                        i33 = 8;
                    }
                    c cVar13 = cVar11.f7424f;
                    if (cVar13 != null) {
                        if (eVar5 == eVar12) {
                            cVar.f(cVar11.f7427i, cVar13.f7427i, i34, 6);
                        } else {
                            cVar.f(cVar11.f7427i, cVar13.f7427i, i34, 8);
                        }
                        if (z19 && !z18) {
                            i33 = 5;
                        }
                        cVar.e(cVar11.f7427i, cVar11.f7424f.f7427i, i34, (eVar5 == eVar12 && z18 && eVar5.f7452T[i7]) ? 5 : i33);
                    } else {
                        i20 = i20;
                        bVarArr3 = bVarArr3;
                    }
                    c[] cVarArr4 = eVar5.f7450R;
                    if (z14) {
                        if (eVar5.i0 == 8 || eVar5.f7453U[i7] != dVar) {
                            i17 = 0;
                        } else {
                            i17 = 0;
                            cVar.f(cVarArr4[i11 + 1].f7427i, cVarArr4[i11].f7427i, 0, 5);
                        }
                        cVar.f(cVarArr4[i11].f7427i, cVarArr[i11].f7427i, i17, 8);
                    }
                    c cVar14 = cVarArr4[i11 + 1].f7424f;
                    if (cVar14 != null) {
                        eVar3 = cVar14.f7422d;
                        c cVar15 = eVar3.f7450R[i11].f7424f;
                        if (cVar15 == null || cVar15.f7422d != eVar5) {
                            eVar3 = null;
                        }
                    } else {
                        eVar3 = null;
                    }
                    if (eVar3 != null) {
                        eVar5 = eVar3;
                    } else {
                        z17 = true;
                    }
                    i20 = i20;
                    z8 = z18;
                    bVarArr3 = bVarArr3;
                }
                boolean z20 = z8;
                i13 = i20;
                bVarArr2 = bVarArr3;
                if (eVar13 != null) {
                    int i35 = i11 + 1;
                    if (eVar11.f7450R[i35].f7424f != null) {
                        c cVar16 = eVar13.f7450R[i35];
                        if (eVar13.f7453U[i7] == dVar && eVar13.t[i7] == 0 && !z20) {
                            c cVar17 = cVar16.f7424f;
                            if (cVar17.f7422d == fVar2) {
                                cVar.e(cVar16.f7427i, cVar17.f7427i, -cVar16.e(), 5);
                            } else if (z20) {
                                cVar8 = cVar16.f7424f;
                                if (cVar8.f7422d == fVar2) {
                                    cVar.e(cVar16.f7427i, cVar8.f7427i, -cVar16.e(), 4);
                                }
                            }
                        } else if (z20) {
                            cVar8 = cVar16.f7424f;
                            if (cVar8.f7422d == fVar2) {
                                cVar.e(cVar16.f7427i, cVar8.f7427i, -cVar16.e(), 4);
                            }
                        }
                        cVar.g(cVar16.f7427i, eVar11.f7450R[i35].f7424f.f7427i, -cVar16.e(), 6);
                    }
                }
                if (z14 != 0) {
                    int i36 = i11 + 1;
                    androidx.constraintlayout.core.g gVar10 = cVarArr[i36].f7427i;
                    c cVar18 = eVar11.f7450R[i36];
                    cVar.f(gVar10, cVar18.f7427i, cVar18.e(), 8);
                }
                ArrayList arrayList3 = bVar.f7409h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (bVar.f7415n && !bVar.f7417p) {
                        f15 = bVar.f7411j;
                    }
                    e eVar15 = null;
                    float f16 = f10;
                    int i37 = 0;
                    while (i37 < size) {
                        e eVar16 = (e) arrayList3.get(i37);
                        float f17 = eVar16.f7483n0[i7];
                        c[] cVarArr5 = eVar16.f7450R;
                        if (f17 >= f10) {
                            arrayList2 = arrayList3;
                            if (f17 == f10) {
                                z11 = false;
                                cVar.e(cVarArr5[i11 + 1].f7427i, cVarArr5[i11].f7427i, 0, 8);
                                size = size;
                                i37 = i37;
                                f11 = f10;
                            } else {
                                if (eVar15 != null) {
                                    c[] cVarArr6 = eVar15.f7450R;
                                    gVar6 = cVarArr6[i11].f7427i;
                                    int i38 = i11 + 1;
                                    gVar7 = cVarArr6[i38].f7427i;
                                    gVar8 = cVarArr5[i11].f7427i;
                                    gVar9 = cVarArr5[i38].f7427i;
                                    bVarL = cVar.l();
                                    float f18 = f16;
                                    f12 = f10;
                                    bVarL.f15083b = f12;
                                    f11 = f12;
                                    if (f15 != f12 || f18 == f17) {
                                        bVarL.f15085d.put(gVar6, 1.0f);
                                        bVarL.f15085d.put(gVar7, -1.0f);
                                        bVarL.f15085d.put(gVar9, 1.0f);
                                        bVarL.f15085d.put(gVar8, -1.0f);
                                    } else if (f18 == f11) {
                                        bVarL.f15085d.put(gVar6, 1.0f);
                                        bVarL.f15085d.put(gVar7, -1.0f);
                                    } else if (f17 == f10) {
                                        bVarL.f15085d.put(gVar8, 1.0f);
                                        bVarL.f15085d.put(gVar9, -1.0f);
                                    } else {
                                        float f19 = (f18 / f15) / (f17 / f15);
                                        bVarL.f15085d.put(gVar6, 1.0f);
                                        bVarL.f15085d.put(gVar7, -1.0f);
                                        bVarL.f15085d.put(gVar9, f19);
                                        bVarL.f15085d.put(gVar8, -f19);
                                    }
                                    cVar.c(bVarL);
                                } else {
                                    i37 = i37;
                                    f11 = f10;
                                    f17 = f17;
                                }
                                f16 = f17;
                                eVar15 = eVar16;
                            }
                        } else {
                            if (bVar.f7417p) {
                                arrayList2 = arrayList3;
                                z11 = false;
                                cVar.e(cVarArr5[i11 + 1].f7427i, cVarArr5[i11].f7427i, 0, 4);
                            } else {
                                f17 = 1.0f;
                                arrayList2 = arrayList3;
                                if (f17 == f10) {
                                    z11 = false;
                                    cVar.e(cVarArr5[i11 + 1].f7427i, cVarArr5[i11].f7427i, 0, 8);
                                } else {
                                    if (eVar15 != null) {
                                        c[] cVarArr7 = eVar15.f7450R;
                                        gVar6 = cVarArr7[i11].f7427i;
                                        int i39 = i11 + 1;
                                        gVar7 = cVarArr7[i39].f7427i;
                                        gVar8 = cVarArr5[i11].f7427i;
                                        gVar9 = cVarArr5[i39].f7427i;
                                        bVarL = cVar.l();
                                        float f110 = f16;
                                        f12 = f10;
                                        bVarL.f15083b = f12;
                                        f11 = f12;
                                        if (f15 != f12) {
                                            bVarL.f15085d.put(gVar6, 1.0f);
                                            bVarL.f15085d.put(gVar7, -1.0f);
                                            bVarL.f15085d.put(gVar9, 1.0f);
                                            bVarL.f15085d.put(gVar8, -1.0f);
                                        } else {
                                            bVarL.f15085d.put(gVar6, 1.0f);
                                            bVarL.f15085d.put(gVar7, -1.0f);
                                            bVarL.f15085d.put(gVar9, 1.0f);
                                            bVarL.f15085d.put(gVar8, -1.0f);
                                        }
                                        cVar.c(bVarL);
                                    } else {
                                        i37 = i37;
                                        f11 = f10;
                                        f17 = f17;
                                    }
                                    f16 = f17;
                                    eVar15 = eVar16;
                                }
                            }
                            size = size;
                            i37 = i37;
                            f11 = f10;
                        }
                        i37++;
                        arrayList3 = arrayList2;
                        size = size;
                        f10 = f11;
                    }
                }
                if (eVar12 == null || !(eVar12 == eVar13 || z20)) {
                    eVar = eVar13;
                    if (!z10 || eVar12 == null) {
                        if (z3 && eVar12 != null) {
                            int i40 = bVar.f7411j;
                            boolean z21 = i40 > 0 && bVar.f7410i == i40;
                            e eVar17 = eVar12;
                            e eVar18 = eVar17;
                            while (eVar17 != null) {
                                e eVar19 = eVar17.f7487p0[i7];
                                while (eVar19 != null && eVar19.i0 == 8) {
                                    eVar19 = eVar19.f7487p0[i7];
                                }
                                if (eVar17 != eVar12 && eVar17 != eVar && eVar19 != null) {
                                    if (eVar19 == eVar) {
                                        eVar19 = null;
                                    }
                                    c[] cVarArr8 = eVar17.f7450R;
                                    c cVar19 = cVarArr8[i11];
                                    androidx.constraintlayout.core.g gVar11 = cVar19.f7427i;
                                    int i41 = i11 + 1;
                                    androidx.constraintlayout.core.g gVar12 = eVar18.f7450R[i41].f7427i;
                                    int iE2 = cVar19.e();
                                    int iE3 = cVarArr8[i41].e();
                                    if (eVar19 != null) {
                                        cVar3 = eVar19.f7450R[i11];
                                        gVar2 = cVar3.f7427i;
                                        c cVar20 = cVar3.f7424f;
                                        gVar = cVar20 != null ? cVar20.f7427i : null;
                                    } else {
                                        c cVar21 = eVar.f7450R[i11];
                                        androidx.constraintlayout.core.g gVar13 = cVar21 != null ? cVar21.f7427i : null;
                                        gVar = cVarArr8[i41].f7427i;
                                        cVar3 = cVar21;
                                        gVar2 = gVar13;
                                    }
                                    if (cVar3 != null) {
                                        iE3 += cVar3.e();
                                    }
                                    int iE4 = eVar18.f7450R[i41].e() + iE2;
                                    androidx.constraintlayout.core.g gVar14 = gVar2;
                                    int i42 = iE3;
                                    androidx.constraintlayout.core.g gVar15 = gVar;
                                    int i43 = z21 ? 8 : 4;
                                    if (gVar11 != null && gVar12 != null && gVar14 != null && gVar15 != null) {
                                        cVar.b(gVar11, gVar12, iE4, 0.5f, gVar14, gVar15, i42, i43);
                                    }
                                    eVar19 = eVar19;
                                }
                                if (eVar17.i0 != 8) {
                                    eVar18 = eVar17;
                                }
                                eVar17 = eVar19;
                            }
                            c cVar22 = eVar12.f7450R[i11];
                            c cVar23 = eVar5.f7450R[i11].f7424f;
                            int i44 = i11 + 1;
                            c cVar24 = eVar.f7450R[i44];
                            c cVar25 = eVar11.f7450R[i44].f7424f;
                            if (cVar23 == null) {
                                cVar2 = cVar;
                            } else {
                                if (eVar12 != eVar) {
                                    cVar.e(cVar22.f7427i, cVar23.f7427i, cVar22.e(), 5);
                                } else if (cVar25 != null) {
                                    cVar2 = cVar;
                                    cVar2.b(cVar22.f7427i, cVar23.f7427i, cVar22.e(), 0.5f, cVar24.f7427i, cVar25.f7427i, cVar24.e(), 5);
                                }
                                cVar2 = cVar;
                            }
                            if (cVar25 != null && eVar12 != eVar) {
                                cVar2.e(cVar24.f7427i, cVar25.f7427i, -cVar24.e(), 5);
                            }
                        }
                        if ((z10 || z3) && eVar12 != null && eVar12 != eVar) {
                            cVarArr2 = eVar12.f7450R;
                            c cVar26 = cVarArr2[i11];
                            if (eVar == null) {
                                eVar = eVar12;
                            }
                            i16 = i11 + 1;
                            c[] cVarArr9 = eVar.f7450R;
                            cVar5 = cVarArr9[i16];
                            cVar6 = cVar26.f7424f;
                            if (cVar6 != null) {
                                gVar4 = cVar6.f7427i;
                            } else {
                                gVar4 = null;
                            }
                            cVar7 = cVar5.f7424f;
                            if (cVar7 != null) {
                                gVar5 = cVar7.f7427i;
                            } else {
                                gVar5 = null;
                            }
                            if (eVar11 != eVar) {
                                c cVar27 = eVar11.f7450R[i16].f7424f;
                                gVar5 = cVar27 != null ? cVar27.f7427i : null;
                            }
                            if (eVar12 == eVar) {
                                cVar5 = cVarArr2[i16];
                            }
                            if (gVar4 == null && gVar5 != null) {
                                cVar2.b(cVar26.f7427i, gVar4, cVar26.e(), 0.5f, gVar5, cVar5.f7427i, cVarArr9[i16].e(), 5);
                            }
                        }
                    } else {
                        int i45 = bVar.f7411j;
                        boolean z22 = i45 > 0 && bVar.f7410i == i45;
                        e eVar20 = eVar12;
                        e eVar21 = eVar20;
                        while (eVar20 != null) {
                            e eVar22 = eVar20.f7487p0[i7];
                            while (true) {
                                if (eVar22 == null) {
                                    i14 = 8;
                                    break;
                                }
                                i14 = 8;
                                if (eVar22.i0 != 8) {
                                    break;
                                } else {
                                    eVar22 = eVar22.f7487p0[i7];
                                }
                            }
                            if (eVar22 != null || eVar20 == eVar) {
                                c[] cVarArr10 = eVar20.f7450R;
                                c cVar28 = cVarArr10[i11];
                                androidx.constraintlayout.core.g gVar16 = cVar28.f7427i;
                                c cVar29 = cVar28.f7424f;
                                androidx.constraintlayout.core.g gVar17 = cVar29 != null ? cVar29.f7427i : null;
                                if (eVar21 != eVar20) {
                                    gVar17 = eVar21.f7450R[i11 + 1].f7427i;
                                } else if (eVar20 == eVar12) {
                                    c cVar30 = eVar5.f7450R[i11].f7424f;
                                    gVar17 = cVar30 != null ? cVar30.f7427i : null;
                                }
                                int iE5 = cVar28.e();
                                int i46 = i11 + 1;
                                int iE6 = cVarArr10[i46].e();
                                if (eVar22 != null) {
                                    cVar4 = eVar22.f7450R[i11];
                                    gVar3 = cVar4.f7427i;
                                } else {
                                    cVar4 = eVar11.f7450R[i46].f7424f;
                                    gVar3 = cVar4 != null ? cVar4.f7427i : null;
                                }
                                androidx.constraintlayout.core.g gVar18 = cVarArr10[i46].f7427i;
                                if (cVar4 != null) {
                                    iE6 += cVar4.e();
                                }
                                int iE7 = eVar21.f7450R[i46].e() + iE5;
                                if (gVar16 == null || gVar17 == null || gVar3 == null || gVar18 == null) {
                                    eVar2 = eVar5;
                                    i15 = 8;
                                } else {
                                    if (eVar20 == eVar12) {
                                        iE7 = eVar12.f7450R[i11].e();
                                    }
                                    if (eVar20 == eVar) {
                                        iE6 = eVar.f7450R[i46].e();
                                    }
                                    eVar2 = eVar5;
                                    i15 = 8;
                                    cVar.b(gVar16, gVar17, iE7, 0.5f, gVar3, gVar18, iE6, z22 ? 8 : 5);
                                }
                            } else {
                                eVar2 = eVar5;
                                i15 = i14;
                            }
                            if (eVar20.i0 != i15) {
                                eVar21 = eVar20;
                            }
                            eVar20 = eVar22;
                            eVar21 = eVar21;
                            eVar5 = eVar2;
                        }
                    }
                } else {
                    c cVar31 = eVar5.f7450R[i11];
                    int i47 = i11 + 1;
                    c cVar32 = eVar11.f7450R[i47];
                    c cVar33 = cVar31.f7424f;
                    androidx.constraintlayout.core.g gVar19 = cVar33 != null ? cVar33.f7427i : null;
                    c cVar34 = cVar32.f7424f;
                    androidx.constraintlayout.core.g gVar20 = cVar34 != null ? cVar34.f7427i : null;
                    c cVar35 = eVar12.f7450R[i11];
                    if (eVar13 != null) {
                        cVar32 = eVar13.f7450R[i47];
                    }
                    if (gVar19 == null || gVar20 == null) {
                        eVar = eVar13;
                    } else {
                        float f20 = i7 == 0 ? eVar14.f7468f0 : eVar14.f7470g0;
                        int iE8 = cVar35.e();
                        int iE9 = cVar32.e();
                        androidx.constraintlayout.core.g gVar21 = cVar35.f7427i;
                        androidx.constraintlayout.core.g gVar22 = cVar32.f7427i;
                        androidx.constraintlayout.core.g gVar23 = gVar19;
                        eVar = eVar13;
                        cVar.b(gVar21, gVar23, iE8, f20, gVar20, gVar22, iE9, 7);
                    }
                }
                cVar2 = cVar;
                if (z10) {
                    cVarArr2 = eVar12.f7450R;
                    c cVar210 = cVarArr2[i11];
                    if (eVar == null) {
                        eVar = eVar12;
                    }
                    i16 = i11 + 1;
                    c[] cVarArr11 = eVar.f7450R;
                    cVar5 = cVarArr11[i16];
                    cVar6 = cVar210.f7424f;
                    if (cVar6 != null) {
                        gVar4 = cVar6.f7427i;
                    } else {
                        gVar4 = null;
                    }
                    cVar7 = cVar5.f7424f;
                    if (cVar7 != null) {
                        gVar5 = cVar7.f7427i;
                    } else {
                        gVar5 = null;
                    }
                    if (eVar11 != eVar) {
                        c cVar211 = eVar11.f7450R[i16].f7424f;
                        gVar5 = cVar211 != null ? cVar211.f7427i : null;
                    }
                    if (eVar12 == eVar) {
                        cVar5 = cVarArr2[i16];
                    }
                    if (gVar4 == null) {
                    }
                } else {
                    cVarArr2 = eVar12.f7450R;
                    c cVar212 = cVarArr2[i11];
                    if (eVar == null) {
                        eVar = eVar12;
                    }
                    i16 = i11 + 1;
                    c[] cVarArr12 = eVar.f7450R;
                    cVar5 = cVarArr12[i16];
                    cVar6 = cVar212.f7424f;
                    if (cVar6 != null) {
                        gVar4 = cVar6.f7427i;
                    } else {
                        gVar4 = null;
                    }
                    cVar7 = cVar5.f7424f;
                    if (cVar7 != null) {
                        gVar5 = cVar7.f7427i;
                    } else {
                        gVar5 = null;
                    }
                    if (eVar11 != eVar) {
                        c cVar213 = eVar11.f7450R[i16].f7424f;
                        gVar5 = cVar213 != null ? cVar213.f7427i : null;
                    }
                    if (eVar12 == eVar) {
                        cVar5 = cVarArr2[i16];
                    }
                    if (gVar4 == null) {
                    }
                }
            } else {
                i13 = i20;
                bVarArr2 = bVarArr3;
            }
            i21 = i12 + 1;
            fVar2 = fVar;
            i20 = i13;
            bVarArr3 = bVarArr2;
        }
    }

    public static void b(f fVar, androidx.constraintlayout.core.c cVar, e eVar) {
        eVar.f7484o = -1;
        eVar.f7486p = -1;
        d dVar = fVar.f7453U[0];
        d dVar2 = d.f7429b;
        d dVar3 = d.f7431d;
        if (dVar != dVar2 && eVar.f7453U[0] == dVar3) {
            c cVar2 = eVar.f7442J;
            int i7 = cVar2.f7425g;
            int iR = fVar.r();
            c cVar3 = eVar.f7444L;
            int i10 = iR - cVar3.f7425g;
            cVar2.f7427i = cVar.k(cVar2);
            cVar3.f7427i = cVar.k(cVar3);
            cVar.d(cVar2.f7427i, i7);
            cVar.d(cVar3.f7427i, i10);
            eVar.f7484o = 2;
            eVar.f7460a0 = i7;
            int i11 = i10 - i7;
            eVar.f7455W = i11;
            int i12 = eVar.f7464d0;
            if (i11 < i12) {
                eVar.f7455W = i12;
            }
        }
        if (fVar.f7453U[1] == dVar2 || eVar.f7453U[1] != dVar3) {
            return;
        }
        c cVar4 = eVar.f7443K;
        int i13 = cVar4.f7425g;
        int iL = fVar.l();
        c cVar5 = eVar.f7445M;
        int i14 = iL - cVar5.f7425g;
        cVar4.f7427i = cVar.k(cVar4);
        cVar5.f7427i = cVar.k(cVar5);
        cVar.d(cVar4.f7427i, i13);
        cVar.d(cVar5.f7427i, i14);
        if (eVar.c0 > 0 || eVar.i0 == 8) {
            c cVar6 = eVar.f7446N;
            cVar6.f7427i = cVar.k(cVar6);
            cVar.d(cVar6.f7427i, eVar.c0 + i13);
        }
        eVar.f7486p = 2;
        eVar.b0 = i13;
        int i15 = i14 - i13;
        eVar.f7456X = i15;
        int i16 = eVar.f7466e0;
        if (i15 < i16) {
            eVar.f7456X = i16;
        }
    }

    public static final boolean c(int i7, int i10) {
        return (i7 & i10) == i10;
    }
}
