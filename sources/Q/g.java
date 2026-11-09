package Q;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7523a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f7526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f7527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f7528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f7529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7533k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7539q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f7540r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f7524b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7525c = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7534l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7535m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7536n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7537o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7538p = 0;

    public g(h hVar, int i7, c cVar, c cVar2, c cVar3, c cVar4, int i10) {
        this.f7540r = hVar;
        this.f7523a = i7;
        this.f7526d = cVar;
        this.f7527e = cVar2;
        this.f7528f = cVar3;
        this.f7529g = cVar4;
        this.f7530h = hVar.f7571A0;
        this.f7531i = hVar.f7578w0;
        this.f7532j = hVar.f7572B0;
        this.f7533k = hVar.f7579x0;
        this.f7539q = i10;
    }

    public final void a(e eVar) {
        int i7 = this.f7523a;
        d dVar = d.f7430c;
        h hVar = this.f7540r;
        if (i7 == 0) {
            int iW = hVar.W(eVar, this.f7539q);
            if (eVar.f7453U[0] == dVar) {
                this.f7538p++;
                iW = 0;
            }
            this.f7534l = iW + (eVar.i0 != 8 ? hVar.T0 : 0) + this.f7534l;
            int iV = hVar.V(eVar, this.f7539q);
            if (this.f7524b == null || this.f7525c < iV) {
                this.f7524b = eVar;
                this.f7525c = iV;
                this.f7535m = iV;
            }
        } else {
            int iW2 = hVar.W(eVar, this.f7539q);
            int iV2 = hVar.V(eVar, this.f7539q);
            if (eVar.f7453U[1] == dVar) {
                this.f7538p++;
                iV2 = 0;
            }
            this.f7535m = iV2 + (eVar.i0 != 8 ? hVar.f7553U0 : 0) + this.f7535m;
            if (this.f7524b == null || this.f7525c < iW2) {
                this.f7524b = eVar;
                this.f7525c = iW2;
                this.f7534l = iW2;
            }
        }
        this.f7537o++;
    }

    public final void b(int i7, boolean z3, boolean z8) {
        h hVar;
        int i10;
        e eVar;
        boolean z10;
        char c6;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        int i12;
        int i13 = this.f7537o;
        int i14 = 0;
        while (true) {
            hVar = this.f7540r;
            if (i14 >= i13 || (i12 = this.f7536n + i14) >= hVar.f1) {
                break;
            }
            e eVar2 = hVar.f7561e1[i12];
            if (eVar2 != null) {
                eVar2.E();
            }
            i14++;
        }
        if (i13 == 0 || this.f7524b == null) {
            return;
        }
        boolean z11 = z8 && i7 == 0;
        int i15 = -1;
        int i16 = -1;
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = this.f7536n + (z3 ? (i13 - 1) - i17 : i17);
            if (i18 >= hVar.f1) {
                break;
            }
            e eVar3 = hVar.f7561e1[i18];
            if (eVar3 != null && eVar3.i0 == 0) {
                if (i15 == -1) {
                    i15 = i17;
                }
                i16 = i17;
            }
        }
        if (this.f7523a != 0) {
            boolean z12 = z11;
            e eVar4 = this.f7524b;
            eVar4.f7479l0 = hVar.f7541H0;
            int i19 = this.f7530h;
            if (i7 > 0) {
                i19 += hVar.T0;
            }
            c cVar = eVar4.f7442J;
            c cVar2 = eVar4.f7444L;
            if (z3) {
                cVar2.a(this.f7528f, i19);
                if (z8) {
                    cVar.a(this.f7526d, this.f7532j);
                }
                if (i7 > 0) {
                    this.f7528f.f7422d.f7442J.a(cVar2, 0);
                }
            } else {
                cVar.a(this.f7526d, i19);
                if (z8) {
                    cVar2.a(this.f7528f, this.f7532j);
                }
                if (i7 > 0) {
                    this.f7526d.f7422d.f7444L.a(cVar, 0);
                }
            }
            e eVar5 = null;
            for (int i20 = 0; i20 < i13; i20++) {
                int i21 = this.f7536n + i20;
                if (i21 >= hVar.f1) {
                    return;
                }
                e eVar6 = hVar.f7561e1[i21];
                if (eVar6 != null) {
                    c cVar3 = eVar6.f7443K;
                    if (i20 == 0) {
                        eVar6.f(cVar3, this.f7527e, this.f7531i);
                        int i22 = hVar.f7542I0;
                        float f14 = hVar.f7548O0;
                        if (this.f7536n == 0) {
                            int i23 = hVar.f7544K0;
                            i10 = -1;
                            if (i23 != -1) {
                                f14 = hVar.f7550Q0;
                            }
                            i22 = i23;
                            eVar6.f7481m0 = i22;
                            eVar6.f7470g0 = f14;
                        } else {
                            i10 = -1;
                        }
                        if (z8 && (i23 = hVar.f7546M0) != i10) {
                            f14 = hVar.f7552S0;
                            i22 = i23;
                        }
                        eVar6.f7481m0 = i22;
                        eVar6.f7470g0 = f14;
                    }
                    if (i20 == i13 - 1) {
                        eVar6.f(eVar6.f7445M, this.f7529g, this.f7533k);
                    }
                    if (eVar5 != null) {
                        int i24 = hVar.f7553U0;
                        c cVar4 = eVar5.f7445M;
                        cVar3.a(cVar4, i24);
                        if (i20 == i15) {
                            int i25 = this.f7531i;
                            if (cVar3.h()) {
                                cVar3.f7426h = i25;
                            }
                        }
                        cVar4.a(cVar3, 0);
                        if (i20 == i16 + 1) {
                            int i26 = this.f7533k;
                            if (cVar4.h()) {
                                cVar4.f7426h = i26;
                            }
                        }
                    }
                    if (eVar6 != eVar4) {
                        c cVar5 = eVar6.f7444L;
                        c cVar6 = eVar6.f7442J;
                        if (z3) {
                            int i27 = hVar.f7554V0;
                            if (i27 == 0) {
                                cVar5.a(cVar2, 0);
                            } else if (i27 == 1) {
                                cVar6.a(cVar, 0);
                            } else if (i27 == 2) {
                                cVar6.a(cVar, 0);
                                cVar5.a(cVar2, 0);
                            }
                        } else {
                            int i28 = hVar.f7554V0;
                            if (i28 == 0) {
                                cVar6.a(cVar, 0);
                            } else if (i28 == 1) {
                                cVar5.a(cVar2, 0);
                            } else if (i28 == 2) {
                                if (z12) {
                                    cVar6.a(this.f7526d, this.f7530h);
                                    cVar5.a(this.f7528f, this.f7532j);
                                } else {
                                    cVar6.a(cVar, 0);
                                    cVar5.a(cVar2, 0);
                                }
                            }
                        }
                    }
                    eVar5 = eVar6;
                }
            }
            return;
        }
        e eVar7 = this.f7524b;
        eVar7.f7481m0 = hVar.f7542I0;
        int i29 = this.f7531i;
        if (i7 > 0) {
            i29 += hVar.f7553U0;
        }
        c cVar7 = this.f7527e;
        c cVar8 = eVar7.f7443K;
        cVar8.a(cVar7, i29);
        c cVar9 = eVar7.f7445M;
        if (z8) {
            cVar9.a(this.f7529g, this.f7533k);
        }
        if (i7 > 0) {
            this.f7527e.f7422d.f7445M.a(cVar8, 0);
        }
        if (hVar.f7555W0 != 3 || eVar7.f7437E) {
            eVar = eVar7;
            break;
        }
        int i30 = 0;
        while (true) {
            if (i30 < i13) {
                int i31 = this.f7536n + (z3 ? (i13 - 1) - i30 : i30);
                if (i31 < hVar.f1) {
                    eVar = hVar.f7561e1[i31];
                    if (eVar.f7437E) {
                        break;
                    } else {
                        i30++;
                    }
                }
            }
            eVar = eVar7;
            break;
        }
        int i32 = 0;
        e eVar8 = null;
        while (i32 < i13) {
            int i33 = z3 ? (i13 - 1) - i32 : i32;
            int i34 = this.f7536n + i33;
            if (i34 >= hVar.f1) {
                return;
            }
            e eVar9 = hVar.f7561e1[i34];
            if (eVar9 == null) {
                z10 = z11;
                c6 = 3;
            } else {
                c cVar10 = eVar9.f7442J;
                if (i32 == 0) {
                    eVar9.f(cVar10, this.f7526d, this.f7530h);
                }
                if (i33 == 0) {
                    int i35 = hVar.f7541H0;
                    if (z3) {
                        f10 = 1.0f;
                        f11 = 1.0f - hVar.f7547N0;
                    } else {
                        f10 = 1.0f;
                        f11 = hVar.f7547N0;
                    }
                    if (this.f7536n == 0) {
                        i11 = hVar.f7543J0;
                        z10 = z11;
                        if (i11 != -1) {
                            if (z3) {
                                f13 = hVar.f7549P0;
                                f11 = f10 - f13;
                            } else {
                                f12 = hVar.f7549P0;
                                f11 = f12;
                            }
                        }
                        eVar9.f7479l0 = i11;
                        eVar9.f7468f0 = f11;
                    } else {
                        z10 = z11;
                    }
                    if (!z8 || (i11 = hVar.f7545L0) == -1) {
                        i11 = i35;
                    } else if (z3) {
                        f13 = hVar.f7551R0;
                        f11 = f10 - f13;
                    } else {
                        f12 = hVar.f7551R0;
                        f11 = f12;
                    }
                    eVar9.f7479l0 = i11;
                    eVar9.f7468f0 = f11;
                } else {
                    z10 = z11;
                }
                if (i32 == i13 - 1) {
                    eVar9.f(eVar9.f7444L, this.f7528f, this.f7532j);
                }
                if (eVar8 != null) {
                    int i36 = hVar.T0;
                    c cVar11 = eVar8.f7444L;
                    cVar10.a(cVar11, i36);
                    if (i32 == i15) {
                        int i37 = this.f7530h;
                        if (cVar10.h()) {
                            cVar10.f7426h = i37;
                        }
                    }
                    cVar11.a(cVar10, 0);
                    if (i32 == i16 + 1) {
                        int i38 = this.f7532j;
                        if (cVar11.h()) {
                            cVar11.f7426h = i38;
                        }
                    }
                }
                if (eVar9 != eVar7) {
                    int i39 = hVar.f7555W0;
                    c6 = 3;
                    if (i39 == 3 && eVar.f7437E && eVar9 != eVar && eVar9.f7437E) {
                        eVar9.f7446N.a(eVar.f7446N, 0);
                    } else {
                        c cVar12 = eVar9.f7443K;
                        if (i39 != 0) {
                            c cVar13 = eVar9.f7445M;
                            if (i39 == 1) {
                                cVar13.a(cVar9, 0);
                            } else if (z10) {
                                cVar12.a(this.f7527e, this.f7531i);
                                cVar13.a(this.f7529g, this.f7533k);
                            } else {
                                cVar12.a(cVar8, 0);
                                cVar13.a(cVar9, 0);
                            }
                        } else {
                            cVar12.a(cVar8, 0);
                        }
                    }
                } else {
                    c6 = 3;
                }
                eVar8 = eVar9;
            }
            i32++;
            z11 = z10;
        }
    }

    public final int c() {
        return this.f7523a == 1 ? this.f7535m - this.f7540r.f7553U0 : this.f7535m;
    }

    public final int d() {
        return this.f7523a == 0 ? this.f7534l - this.f7540r.T0 : this.f7534l;
    }

    public final void e(int i7) {
        int i10 = this.f7538p;
        if (i10 == 0) {
            return;
        }
        int i11 = this.f7537o;
        int i12 = i7 / i10;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = this.f7536n;
            int i15 = i14 + i13;
            h hVar = this.f7540r;
            if (i15 >= hVar.f1) {
                break;
            }
            e eVar = hVar.f7561e1[i14 + i13];
            int i16 = this.f7523a;
            d dVar = d.f7428a;
            d dVar2 = d.f7430c;
            if (i16 == 0) {
                if (eVar != null) {
                    d[] dVarArr = eVar.f7453U;
                    if (dVarArr[0] == dVar2 && eVar.f7490r == 0) {
                        hVar.U(eVar, dVar, i12, dVarArr[1], eVar.l());
                    }
                }
            } else if (eVar != null) {
                d[] dVarArr2 = eVar.f7453U;
                if (dVarArr2[1] == dVar2 && eVar.f7492s == 0) {
                    int i17 = i12;
                    hVar.U(eVar, dVarArr2[0], eVar.r(), dVar, i17);
                    i12 = i17;
                }
            }
        }
        this.f7534l = 0;
        this.f7535m = 0;
        this.f7524b = null;
        this.f7525c = 0;
        int i18 = this.f7537o;
        for (int i19 = 0; i19 < i18; i19++) {
            int i20 = this.f7536n + i19;
            h hVar2 = this.f7540r;
            if (i20 >= hVar2.f1) {
                return;
            }
            e eVar2 = hVar2.f7561e1[i20];
            if (this.f7523a == 0) {
                int iR = eVar2.r();
                int i21 = hVar2.T0;
                if (eVar2.i0 == 8) {
                    i21 = 0;
                }
                this.f7534l = iR + i21 + this.f7534l;
                int iV = hVar2.V(eVar2, this.f7539q);
                if (this.f7524b == null || this.f7525c < iV) {
                    this.f7524b = eVar2;
                    this.f7525c = iV;
                    this.f7535m = iV;
                }
            } else {
                int iW = hVar2.W(eVar2, this.f7539q);
                int iV2 = hVar2.V(eVar2, this.f7539q);
                int i22 = hVar2.f7553U0;
                if (eVar2.i0 == 8) {
                    i22 = 0;
                }
                this.f7535m = iV2 + i22 + this.f7535m;
                if (this.f7524b == null || this.f7525c < iW) {
                    this.f7524b = eVar2;
                    this.f7525c = iW;
                    this.f7534l = iW;
                }
            }
        }
    }

    public final void f(int i7, c cVar, c cVar2, c cVar3, c cVar4, int i10, int i11, int i12, int i13, int i14) {
        this.f7523a = i7;
        this.f7526d = cVar;
        this.f7527e = cVar2;
        this.f7528f = cVar3;
        this.f7529g = cVar4;
        this.f7530h = i10;
        this.f7531i = i11;
        this.f7532j = i12;
        this.f7533k = i13;
        this.f7539q = i14;
    }
}
