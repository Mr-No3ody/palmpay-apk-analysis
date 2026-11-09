package Q;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h extends m {

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public e[] f7561e1;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f7541H0 = -1;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f7542I0 = -1;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f7543J0 = -1;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f7544K0 = -1;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public int f7545L0 = -1;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public int f7546M0 = -1;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public float f7547N0 = 0.5f;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public float f7548O0 = 0.5f;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public float f7549P0 = 0.5f;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public float f7550Q0 = 0.5f;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public float f7551R0 = 0.5f;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public float f7552S0 = 0.5f;
    public int T0 = 0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public int f7553U0 = 0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public int f7554V0 = 2;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public int f7555W0 = 2;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public int f7556X0 = 0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public int f7557Y0 = -1;
    public int Z0 = 0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final ArrayList f7558a1 = new ArrayList();

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public e[] f7559b1 = null;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public e[] f7560c1 = null;
    public int[] d1 = null;
    public int f1 = 0;

    /* JADX WARN: Code duplicated, block: B:396:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:398:0x06ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:399:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:400:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:403:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:405:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:406:0x06df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:407:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:408:0x06e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:410:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:413:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:414:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:77:0x0116  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Q.m
    public final void T(int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        e[] eVarArr;
        int i15;
        int i16;
        int i17;
        int[] iArr;
        int i18;
        g gVar;
        char c6;
        int iMin;
        int iMin2;
        int i19;
        boolean z3;
        int i20;
        int i21;
        int i22;
        int iCeil;
        int iCeil2;
        Object obj;
        e eVar;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = this.f7569v0;
        d dVar = d.f7429b;
        d dVar2 = d.f7430c;
        if (i27 > 0) {
            e eVar2 = this.f7454V;
            BasicMeasure$Measurer basicMeasure$Measurer = eVar2 != null ? ((f) eVar2).f7521y0 : null;
            if (basicMeasure$Measurer == null) {
                this.f7574D0 = 0;
                this.f7575E0 = 0;
                this.f7573C0 = false;
                return;
            }
            for (int i28 = 0; i28 < this.f7569v0; i28++) {
                e eVar3 = this.f7568u0[i28];
                if (eVar3 != null && !(eVar3 instanceof i)) {
                    d dVarK = eVar3.k(0);
                    d dVarK2 = eVar3.k(1);
                    if (dVarK != dVar2 || eVar3.f7490r == 1 || dVarK2 != dVar2 || eVar3.f7492s == 1) {
                        if (dVarK == dVar2) {
                            dVarK = dVar;
                        }
                        if (dVarK2 == dVar2) {
                            dVarK2 = dVar;
                        }
                        R.b bVar = this.f7576F0;
                        bVar.f7852a = dVarK;
                        bVar.f7853b = dVarK2;
                        bVar.f7854c = eVar3.r();
                        bVar.f7855d = eVar3.l();
                        basicMeasure$Measurer.measure(eVar3, bVar);
                        eVar3.P(bVar.f7856e);
                        eVar3.M(bVar.f7857f);
                        eVar3.J(bVar.f7858g);
                    }
                }
            }
        }
        int i29 = this.f7571A0;
        int i30 = this.f7572B0;
        int i31 = this.f7578w0;
        int i32 = this.f7579x0;
        int[] iArr2 = new int[2];
        int i33 = (i10 - i29) - i30;
        int i34 = this.Z0;
        if (i34 == 1) {
            i33 = (i12 - i31) - i32;
        }
        int i35 = i33;
        if (i34 == 0) {
            if (this.f7541H0 == -1) {
                this.f7541H0 = 0;
            }
            if (this.f7542I0 == -1) {
                this.f7542I0 = 0;
            }
        } else {
            if (this.f7541H0 == -1) {
                this.f7541H0 = 0;
            }
            if (this.f7542I0 == -1) {
                this.f7542I0 = 0;
            }
        }
        e[] eVarArr2 = this.f7568u0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        while (true) {
            i13 = this.f7569v0;
            if (i36 >= i13) {
                break;
            }
            if (this.f7568u0[i36].i0 == 8) {
                i37++;
            }
            i36++;
        }
        if (i37 > 0) {
            e[] eVarArr3 = new e[i13 - i37];
            int i39 = 0;
            int i40 = 0;
            while (i39 < this.f7569v0) {
                e eVar4 = this.f7568u0[i39];
                int i41 = i29;
                e[] eVarArr4 = eVarArr3;
                if (eVar4.i0 != 8) {
                    eVarArr4[i40] = eVar4;
                    i40++;
                }
                i39++;
                i29 = i41;
                eVarArr3 = eVarArr4;
            }
            i14 = i40;
            eVarArr = eVarArr3;
        } else {
            i14 = i13;
            eVarArr = eVarArr2;
        }
        int i42 = i29;
        this.f7561e1 = eVarArr;
        this.f1 = i14;
        int i43 = this.f7556X0;
        ArrayList arrayList = this.f7558a1;
        if (i43 == 0) {
            i15 = i30;
            i16 = i31;
            i17 = i32;
            iArr = iArr2;
            i18 = i42;
            int i44 = this.Z0;
            if (i14 != 0) {
                if (arrayList.size() == 0) {
                    gVar = new g(this, i44, this.f7442J, this.f7443K, this.f7444L, this.f7445M, i35);
                    arrayList.add(gVar);
                } else {
                    g gVar2 = (g) arrayList.get(0);
                    gVar2.f7525c = 0;
                    gVar2.f7524b = null;
                    gVar2.f7534l = 0;
                    gVar2.f7535m = 0;
                    gVar2.f7536n = 0;
                    gVar2.f7537o = 0;
                    gVar2.f7538p = 0;
                    gVar2.f(i44, this.f7442J, this.f7443K, this.f7444L, this.f7445M, this.f7571A0, this.f7578w0, this.f7572B0, this.f7579x0, i35);
                    gVar = gVar2;
                }
                for (int i45 = 0; i45 < i14; i45++) {
                    gVar.a(eVarArr[i45]);
                }
                i38 = 0;
                iArr[0] = gVar.d();
                c6 = 1;
                iArr[1] = gVar.c();
            }
            iMin = iArr[i38] + i18 + i15;
            iMin2 = iArr[c6] + i16 + i17;
            if (i7 == 1073741824) {
                if (i7 == Integer.MIN_VALUE) {
                    iMin = Math.min(iMin, i10);
                } else {
                    i19 = i11;
                    if (i7 != 0) {
                        iMin = i38;
                    }
                }
                if (i19 == 1073741824) {
                    iMin2 = i12;
                } else if (i19 == Integer.MIN_VALUE) {
                    iMin2 = Math.min(iMin2, i12);
                } else if (i19 != 0) {
                    iMin2 = i38;
                }
                this.f7574D0 = iMin;
                this.f7575E0 = iMin2;
                P(iMin);
                M(iMin2);
                if (this.f7569v0 > 0) {
                    z3 = c6;
                } else {
                    z3 = i38;
                }
                this.f7573C0 = z3;
            }
            iMin = i10;
            i19 = i11;
            if (i19 == 1073741824) {
                iMin2 = i12;
            } else if (i19 == Integer.MIN_VALUE) {
                iMin2 = Math.min(iMin2, i12);
            } else if (i19 != 0) {
                iMin2 = i38;
            }
            this.f7574D0 = iMin;
            this.f7575E0 = iMin2;
            P(iMin);
            M(iMin2);
            if (this.f7569v0 > 0) {
                z3 = c6;
            } else {
                z3 = i38;
            }
            this.f7573C0 = z3;
        }
        c cVar = this.f7443K;
        c cVar2 = this.f7442J;
        c cVar3 = this.f7444L;
        c cVar4 = this.f7445M;
        if (i43 == 1) {
            i15 = i30;
            i16 = i31;
            i17 = i32;
            iArr = iArr2;
            i18 = i42;
            int i46 = this.Z0;
            if (i14 != 0) {
                arrayList.clear();
                g gVar3 = new g(this, i46, this.f7442J, this.f7443K, this.f7444L, this.f7445M, i35);
                arrayList.add(gVar3);
                if (i46 == 0) {
                    i20 = 0;
                    int i47 = 0;
                    int i48 = 0;
                    while (i48 < i14) {
                        e eVar5 = eVarArr[i48];
                        int iW = W(eVar5, i35);
                        if (eVar5.f7453U[0] == dVar2) {
                            i20++;
                        }
                        int i49 = i20;
                        boolean z8 = (i47 == i35 || (this.T0 + i47) + iW > i35) && gVar3.f7524b != null;
                        if (!z8 && i48 > 0 && (i22 = this.f7557Y0) > 0 && i48 % i22 == 0) {
                            z8 = true;
                        }
                        if (z8) {
                            gVar3 = new g(this, i46, this.f7442J, this.f7443K, this.f7444L, this.f7445M, i35);
                            gVar3.f7536n = i48;
                            arrayList.add(gVar3);
                        } else {
                            if (i48 > 0) {
                                i47 = this.T0 + iW + i47;
                            }
                            gVar3.a(eVar5);
                            i48++;
                            i20 = i49;
                        }
                        i47 = iW;
                        gVar3.a(eVar5);
                        i48++;
                        i20 = i49;
                    }
                } else {
                    i20 = 0;
                    int i50 = 0;
                    int i51 = 0;
                    while (i51 < i14) {
                        e eVar6 = eVarArr[i51];
                        int iV = V(eVar6, i35);
                        if (eVar6.f7453U[1] == dVar2) {
                            i20++;
                        }
                        int i52 = i20;
                        boolean z10 = (i50 == i35 || (this.f7553U0 + i50) + iV > i35) && gVar3.f7524b != null;
                        if (!z10 && i51 > 0 && (i21 = this.f7557Y0) > 0 && i51 % i21 == 0) {
                            z10 = true;
                        }
                        if (z10) {
                            gVar3 = new g(this, i46, this.f7442J, this.f7443K, this.f7444L, this.f7445M, i35);
                            gVar3.f7536n = i51;
                            arrayList.add(gVar3);
                        } else {
                            if (i51 > 0) {
                                i50 = this.f7553U0 + iV + i50;
                            }
                            gVar3.a(eVar6);
                            i51++;
                            i20 = i52;
                        }
                        i50 = iV;
                        gVar3.a(eVar6);
                        i51++;
                        i20 = i52;
                    }
                }
                int size = arrayList.size();
                int i53 = this.f7571A0;
                int i54 = this.f7578w0;
                int i55 = this.f7572B0;
                int i56 = this.f7579x0;
                d[] dVarArr = this.f7453U;
                boolean z11 = dVarArr[0] == dVar || dVarArr[1] == dVar;
                if (i20 > 0 && z11) {
                    for (int i57 = 0; i57 < size; i57++) {
                        g gVar4 = (g) arrayList.get(i57);
                        if (i46 == 0) {
                            gVar4.e(i35 - gVar4.d());
                        } else {
                            gVar4.e(i35 - gVar4.c());
                        }
                    }
                }
                int i58 = i53;
                int i59 = i54;
                int i60 = i55;
                int i61 = i56;
                c cVar5 = cVar2;
                c cVar6 = cVar;
                int iMax = 0;
                int i62 = 0;
                c cVar7 = cVar3;
                c cVar8 = cVar4;
                for (int i63 = 0; i63 < size; i63++) {
                    g gVar5 = (g) arrayList.get(i63);
                    if (i46 == 0) {
                        if (i63 < size - 1) {
                            cVar8 = ((g) arrayList.get(i63 + 1)).f7524b.f7443K;
                            i61 = 0;
                        } else {
                            i61 = this.f7579x0;
                            cVar8 = cVar4;
                        }
                        c cVar9 = gVar5.f7524b.f7445M;
                        gVar5.f(i46, cVar5, cVar6, cVar7, cVar8, i58, i59, i60, i61, i35);
                        iMax = Math.max(iMax, gVar5.d());
                        int iC = gVar5.c() + i62;
                        if (i63 > 0) {
                            iC += this.f7553U0;
                        }
                        i62 = iC;
                        cVar6 = cVar9;
                        i59 = 0;
                    } else {
                        if (i63 < size - 1) {
                            cVar7 = ((g) arrayList.get(i63 + 1)).f7524b.f7442J;
                            i60 = 0;
                        } else {
                            i60 = this.f7572B0;
                            cVar7 = cVar3;
                        }
                        c cVar10 = gVar5.f7524b.f7444L;
                        gVar5.f(i46, cVar5, cVar6, cVar7, cVar8, i58, i59, i60, i61, i35);
                        int iD = gVar5.d() + iMax;
                        int iMax2 = Math.max(i62, gVar5.c());
                        if (i63 > 0) {
                            iD += this.T0;
                        }
                        i62 = iMax2;
                        iMax = iD;
                        cVar5 = cVar10;
                        i58 = 0;
                    }
                }
                iArr[0] = iMax;
                iArr[1] = i62;
            }
        } else if (i43 == 2) {
            i15 = i30;
            i16 = i31;
            i17 = i32;
            iArr = iArr2;
            i18 = i42;
            int i64 = this.Z0;
            if (i64 == 0) {
                int i65 = this.f7557Y0;
                if (i65 <= 0) {
                    int i66 = 0;
                    iCeil2 = 0;
                    for (int i67 = 0; i67 < i14; i67++) {
                        if (i67 > 0) {
                            i66 += this.T0;
                        }
                        e eVar7 = eVarArr[i67];
                        if (eVar7 != null) {
                            int iW2 = W(eVar7, i35) + i66;
                            if (iW2 > i35) {
                                break;
                            }
                            iCeil2++;
                            i66 = iW2;
                        }
                    }
                } else {
                    iCeil2 = i65;
                }
                iCeil = 0;
            } else {
                iCeil = this.f7557Y0;
                if (iCeil <= 0) {
                    int i68 = 0;
                    int i69 = 0;
                    for (int i70 = 0; i70 < i14; i70++) {
                        if (i70 > 0) {
                            i68 += this.f7553U0;
                        }
                        e eVar8 = eVarArr[i70];
                        if (eVar8 != null) {
                            int iV2 = V(eVar8, i35) + i68;
                            if (iV2 > i35) {
                                break;
                            }
                            i69++;
                            i68 = iV2;
                        }
                    }
                    iCeil = i69;
                }
                iCeil2 = 0;
            }
            if (this.d1 == null) {
                this.d1 = new int[2];
            }
            boolean z12 = (iCeil == 0 && i64 == 1) || (iCeil2 == 0 && i64 == 0);
            while (!z12) {
                if (i64 == 0) {
                    iCeil = (int) Math.ceil(i14 / iCeil2);
                } else {
                    iCeil2 = (int) Math.ceil(i14 / iCeil);
                }
                e[] eVarArr5 = this.f7560c1;
                if (eVarArr5 == null || eVarArr5.length < iCeil2) {
                    obj = null;
                    this.f7560c1 = new e[iCeil2];
                } else {
                    obj = null;
                    Arrays.fill(eVarArr5, (Object) null);
                }
                e[] eVarArr6 = this.f7559b1;
                if (eVarArr6 == null || eVarArr6.length < iCeil) {
                    this.f7559b1 = new e[iCeil];
                } else {
                    Arrays.fill(eVarArr6, obj);
                }
                for (int i71 = 0; i71 < iCeil2; i71++) {
                    for (int i72 = 0; i72 < iCeil; i72++) {
                        int i73 = (i72 * iCeil2) + i71;
                        if (i64 == 1) {
                            i73 = (i71 * iCeil) + i72;
                        }
                        if (i73 < eVarArr.length && (eVar = eVarArr[i73]) != null) {
                            int iW3 = W(eVar, i35);
                            e eVar9 = this.f7560c1[i71];
                            if (eVar9 == null || eVar9.r() < iW3) {
                                this.f7560c1[i71] = eVar;
                            }
                            int iV3 = V(eVar, i35);
                            e eVar10 = this.f7559b1[i72];
                            if (eVar10 == null || eVar10.l() < iV3) {
                                this.f7559b1[i72] = eVar;
                            }
                        }
                    }
                }
                int iW4 = 0;
                for (int i74 = 0; i74 < iCeil2; i74++) {
                    e eVar11 = this.f7560c1[i74];
                    if (eVar11 != null) {
                        if (i74 > 0) {
                            iW4 += this.T0;
                        }
                        iW4 = W(eVar11, i35) + iW4;
                    }
                }
                int iV4 = 0;
                for (int i75 = 0; i75 < iCeil; i75++) {
                    e eVar12 = this.f7559b1[i75];
                    if (eVar12 != null) {
                        if (i75 > 0) {
                            iV4 += this.f7553U0;
                        }
                        iV4 = V(eVar12, i35) + iV4;
                    }
                }
                iArr[0] = iW4;
                iArr[1] = iV4;
                if (i64 == 0) {
                    if (iW4 <= i35 || iCeil2 <= 1) {
                        z12 = true;
                    } else {
                        iCeil2--;
                    }
                } else if (iV4 <= i35 || iCeil <= 1) {
                    z12 = true;
                } else {
                    iCeil--;
                }
            }
            int[] iArr3 = this.d1;
            iArr3[0] = iCeil2;
            iArr3[1] = iCeil;
        } else if (i43 != 3) {
            i15 = i30;
            i16 = i31;
            i17 = i32;
            iArr = iArr2;
            i18 = i42;
        } else {
            int i76 = this.Z0;
            if (i14 == 0) {
                i15 = i30;
                i16 = i31;
                i17 = i32;
                iArr = iArr2;
                i18 = i42;
            } else {
                arrayList.clear();
                iArr = iArr2;
                i15 = i30;
                i16 = i31;
                i18 = i42;
                i17 = i32;
                g gVar6 = new g(this, i76, this.f7442J, this.f7443K, this.f7444L, this.f7445M, i35);
                arrayList.add(gVar6);
                if (i76 == 0) {
                    int i77 = 0;
                    int i78 = 0;
                    i23 = 0;
                    int i79 = 0;
                    while (i77 < i14) {
                        int i80 = i78 + 1;
                        e eVar13 = eVarArr[i77];
                        int iW5 = W(eVar13, i35);
                        int i81 = i76;
                        if (eVar13.f7453U[0] == dVar2) {
                            i23++;
                        }
                        int i82 = i23;
                        boolean z13 = (i79 == i35 || (this.T0 + i79) + iW5 > i35) && gVar6.f7524b != null;
                        if (!z13 && i77 > 0 && (i26 = this.f7557Y0) > 0 && i80 > i26) {
                            z13 = true;
                        }
                        if (z13) {
                            i25 = i77;
                            i76 = i81;
                            gVar6 = new g(this, i76, this.f7442J, this.f7443K, this.f7444L, this.f7445M, i35);
                            gVar6.f7536n = i25;
                            arrayList.add(gVar6);
                            i79 = iW5;
                            i78 = i80;
                        } else {
                            i25 = i77;
                            i76 = i81;
                            i79 = i25 > 0 ? this.T0 + iW5 + i79 : iW5;
                            i78 = 0;
                        }
                        gVar6.a(eVar13);
                        i77 = i25 + 1;
                        i23 = i82;
                    }
                } else {
                    int i83 = 0;
                    int i84 = 0;
                    int i85 = 0;
                    while (i85 < i14) {
                        e eVar14 = eVarArr[i85];
                        int iV5 = V(eVar14, i35);
                        if (eVar14.f7453U[1] == dVar2) {
                            i83++;
                        }
                        int i86 = i83;
                        boolean z14 = (i84 == i35 || (this.f7553U0 + i84) + iV5 > i35) && gVar6.f7524b != null;
                        if (!z14 && i85 > 0 && (i24 = this.f7557Y0) > 0 && i24 < 0) {
                            z14 = true;
                        }
                        if (z14) {
                            gVar6 = new g(this, i76, this.f7442J, this.f7443K, this.f7444L, this.f7445M, i35);
                            gVar6.f7536n = i85;
                            arrayList.add(gVar6);
                        } else {
                            if (i85 > 0) {
                                i84 = this.f7553U0 + iV5 + i84;
                            }
                            gVar6.a(eVar14);
                            i85++;
                            i83 = i86;
                        }
                        i84 = iV5;
                        gVar6.a(eVar14);
                        i85++;
                        i83 = i86;
                    }
                    i23 = i83;
                }
                int size2 = arrayList.size();
                int i87 = this.f7571A0;
                int i88 = this.f7578w0;
                int i89 = this.f7572B0;
                int i90 = this.f7579x0;
                d[] dVarArr2 = this.f7453U;
                boolean z15 = dVarArr2[0] == dVar || dVarArr2[1] == dVar;
                if (i23 > 0 && z15) {
                    for (int i91 = 0; i91 < size2; i91++) {
                        g gVar7 = (g) arrayList.get(i91);
                        if (i76 == 0) {
                            gVar7.e(i35 - gVar7.d());
                        } else {
                            gVar7.e(i35 - gVar7.c());
                        }
                    }
                }
                int i92 = i87;
                int i93 = i88;
                int i94 = i89;
                int i95 = i90;
                c cVar11 = cVar2;
                c cVar12 = cVar;
                int iMax3 = 0;
                int i96 = 0;
                c cVar13 = cVar3;
                c cVar14 = cVar4;
                for (int i97 = 0; i97 < size2; i97++) {
                    g gVar8 = (g) arrayList.get(i97);
                    if (i76 == 0) {
                        if (i97 < size2 - 1) {
                            cVar14 = ((g) arrayList.get(i97 + 1)).f7524b.f7443K;
                            i95 = 0;
                        } else {
                            i95 = this.f7579x0;
                            cVar14 = cVar4;
                        }
                        c cVar15 = gVar8.f7524b.f7445M;
                        gVar8.f(i76, cVar11, cVar12, cVar13, cVar14, i92, i93, i94, i95, i35);
                        iMax3 = Math.max(iMax3, gVar8.d());
                        int iC2 = gVar8.c() + i96;
                        if (i97 > 0) {
                            iC2 += this.f7553U0;
                        }
                        i96 = iC2;
                        cVar12 = cVar15;
                        i93 = 0;
                    } else {
                        if (i97 < size2 - 1) {
                            cVar13 = ((g) arrayList.get(i97 + 1)).f7524b.f7442J;
                            i94 = 0;
                        } else {
                            i94 = this.f7572B0;
                            cVar13 = cVar3;
                        }
                        c cVar16 = gVar8.f7524b.f7444L;
                        gVar8.f(i76, cVar11, cVar12, cVar13, cVar14, i92, i93, i94, i95, i35);
                        int iD2 = gVar8.d() + iMax3;
                        int iMax4 = Math.max(i96, gVar8.c());
                        if (i97 > 0) {
                            iD2 += this.T0;
                        }
                        i96 = iMax4;
                        iMax3 = iD2;
                        cVar11 = cVar16;
                        i92 = 0;
                    }
                }
                iArr[0] = iMax3;
                iArr[1] = i96;
            }
        }
        c6 = 1;
        iMin = iArr[i38] + i18 + i15;
        iMin2 = iArr[c6] + i16 + i17;
        if (i7 == 1073741824) {
            if (i7 == Integer.MIN_VALUE) {
                iMin = Math.min(iMin, i10);
            } else {
                i19 = i11;
                if (i7 != 0) {
                    iMin = i38;
                }
            }
            if (i19 == 1073741824) {
                iMin2 = i12;
            } else if (i19 == Integer.MIN_VALUE) {
                iMin2 = Math.min(iMin2, i12);
            } else if (i19 != 0) {
                iMin2 = i38;
            }
            this.f7574D0 = iMin;
            this.f7575E0 = iMin2;
            P(iMin);
            M(iMin2);
            if (this.f7569v0 > 0) {
                z3 = c6;
            } else {
                z3 = i38;
            }
            this.f7573C0 = z3;
        }
        iMin = i10;
        i19 = i11;
        if (i19 == 1073741824) {
            iMin2 = i12;
        } else if (i19 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i12);
        } else if (i19 != 0) {
            iMin2 = i38;
        }
        this.f7574D0 = iMin;
        this.f7575E0 = iMin2;
        P(iMin);
        M(iMin2);
        if (this.f7569v0 > 0) {
            z3 = c6;
        } else {
            z3 = i38;
        }
        this.f7573C0 = z3;
    }

    public final int V(e eVar, int i7) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.f7453U[1] == d.f7430c) {
            int i10 = eVar.f7492s;
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 2) {
                int i11 = (int) (eVar.f7500z * i7);
                if (i11 != eVar.l()) {
                    eVar.f7469g = true;
                    U(eVar, eVar.f7453U[0], eVar.r(), d.f7428a, i11);
                }
                return i11;
            }
            eVar2 = eVar;
            if (i10 == 1) {
                return eVar2.l();
            }
            if (i10 == 3) {
                return (int) ((eVar2.r() * eVar2.f7457Y) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.l();
    }

    public final int W(e eVar, int i7) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.f7453U[0] == d.f7430c) {
            int i10 = eVar.f7490r;
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 2) {
                int i11 = (int) (eVar.f7497w * i7);
                if (i11 != eVar.r()) {
                    eVar.f7469g = true;
                    U(eVar, d.f7428a, i11, eVar.f7453U[1], eVar.l());
                }
                return i11;
            }
            eVar2 = eVar;
            if (i10 == 1) {
                return eVar2.r();
            }
            if (i10 == 3) {
                return (int) ((eVar2.l() * eVar2.f7457Y) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.r();
    }

    @Override // Q.e
    public final void b(androidx.constraintlayout.core.c cVar, boolean z3) {
        e eVar;
        float f10;
        int i7;
        super.b(cVar, z3);
        e eVar2 = this.f7454V;
        boolean z8 = eVar2 != null && ((f) eVar2).f7522z0;
        int i10 = this.f7556X0;
        ArrayList arrayList = this.f7558a1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    ((g) arrayList.get(i11)).b(i11, z8, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        ((g) arrayList.get(i12)).b(i12, z8, i12 == size2 + (-1));
                        i12++;
                    }
                }
            } else if (this.d1 != null && this.f7560c1 != null && this.f7559b1 != null) {
                for (int i13 = 0; i13 < this.f1; i13++) {
                    this.f7561e1[i13].E();
                }
                int[] iArr = this.d1;
                int i14 = iArr[0];
                int i15 = iArr[1];
                float f11 = this.f7547N0;
                e eVar3 = null;
                int i16 = 0;
                while (i16 < i14) {
                    if (z8) {
                        i7 = (i14 - i16) - 1;
                        f10 = 1.0f - this.f7547N0;
                    } else {
                        f10 = f11;
                        i7 = i16;
                    }
                    e eVar4 = this.f7560c1[i7];
                    if (eVar4 != null && eVar4.i0 != 8) {
                        c cVar2 = eVar4.f7442J;
                        if (i16 == 0) {
                            eVar4.f(cVar2, this.f7442J, this.f7571A0);
                            eVar4.f7479l0 = this.f7541H0;
                            eVar4.f7468f0 = f10;
                        }
                        if (i16 == i14 - 1) {
                            eVar4.f(eVar4.f7444L, this.f7444L, this.f7572B0);
                        }
                        if (i16 > 0 && eVar3 != null) {
                            int i17 = this.T0;
                            c cVar3 = eVar3.f7444L;
                            eVar4.f(cVar2, cVar3, i17);
                            eVar3.f(cVar3, cVar2, 0);
                        }
                        eVar3 = eVar4;
                    }
                    i16++;
                    f11 = f10;
                }
                for (int i18 = 0; i18 < i15; i18++) {
                    e eVar5 = this.f7559b1[i18];
                    if (eVar5 != null && eVar5.i0 != 8) {
                        c cVar4 = eVar5.f7443K;
                        if (i18 == 0) {
                            eVar5.f(cVar4, this.f7443K, this.f7578w0);
                            eVar5.f7481m0 = this.f7542I0;
                            eVar5.f7470g0 = this.f7548O0;
                        }
                        if (i18 == i15 - 1) {
                            eVar5.f(eVar5.f7445M, this.f7445M, this.f7579x0);
                        }
                        if (i18 > 0 && eVar3 != null) {
                            int i19 = this.f7553U0;
                            c cVar5 = eVar3.f7445M;
                            eVar5.f(cVar4, cVar5, i19);
                            eVar3.f(cVar5, cVar4, 0);
                        }
                        eVar3 = eVar5;
                    }
                }
                for (int i20 = 0; i20 < i14; i20++) {
                    for (int i21 = 0; i21 < i15; i21++) {
                        int i22 = (i21 * i14) + i20;
                        if (this.Z0 == 1) {
                            i22 = (i20 * i15) + i21;
                        }
                        e[] eVarArr = this.f7561e1;
                        if (i22 < eVarArr.length && (eVar = eVarArr[i22]) != null && eVar.i0 != 8) {
                            e eVar6 = this.f7560c1[i20];
                            e eVar7 = this.f7559b1[i21];
                            if (eVar != eVar6) {
                                eVar.f(eVar.f7442J, eVar6.f7442J, 0);
                                eVar.f(eVar.f7444L, eVar6.f7444L, 0);
                            }
                            if (eVar != eVar7) {
                                eVar.f(eVar.f7443K, eVar7.f7443K, 0);
                                eVar.f(eVar.f7445M, eVar7.f7445M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((g) arrayList.get(0)).b(0, z8, true);
        }
        this.f7573C0 = false;
    }

    @Override // Q.j, Q.e
    public final void g(e eVar, HashMap map) {
        super.g(eVar, map);
        h hVar = (h) eVar;
        this.f7541H0 = hVar.f7541H0;
        this.f7542I0 = hVar.f7542I0;
        this.f7543J0 = hVar.f7543J0;
        this.f7544K0 = hVar.f7544K0;
        this.f7545L0 = hVar.f7545L0;
        this.f7546M0 = hVar.f7546M0;
        this.f7547N0 = hVar.f7547N0;
        this.f7548O0 = hVar.f7548O0;
        this.f7549P0 = hVar.f7549P0;
        this.f7550Q0 = hVar.f7550Q0;
        this.f7551R0 = hVar.f7551R0;
        this.f7552S0 = hVar.f7552S0;
        this.T0 = hVar.T0;
        this.f7553U0 = hVar.f7553U0;
        this.f7554V0 = hVar.f7554V0;
        this.f7555W0 = hVar.f7555W0;
        this.f7556X0 = hVar.f7556X0;
        this.f7557Y0 = hVar.f7557Y0;
        this.Z0 = hVar.Z0;
    }
}
