package R;

import androidx.camera.camera2.internal.F;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.analyzer.Dependency;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f7886k = new int[2];

    public static void l(int[] iArr, int i7, int i10, int i11, int i12, float f10, int i13) {
        int i14 = i10 - i7;
        int i15 = i12 - i11;
        if (i13 != -1) {
            if (i13 == 0) {
                iArr[0] = (int) ((i15 * f10) + 0.5f);
                iArr[1] = i15;
                return;
            } else {
                if (i13 != 1) {
                    return;
                }
                iArr[0] = i14;
                iArr[1] = (int) ((i14 * f10) + 0.5f);
                return;
            }
        }
        int i16 = (int) ((i15 * f10) + 0.5f);
        int i17 = (int) ((i14 / f10) + 0.5f);
        if (i16 <= i14) {
            iArr[0] = i16;
            iArr[1] = i15;
        } else if (i17 <= i15) {
            iArr[0] = i14;
            iArr[1] = i17;
        }
    }

    @Override // R.n
    public final void c() {
        Q.e eVar;
        Q.e eVar2;
        Q.d dVar;
        Q.e eVar3;
        Q.e eVar4;
        Q.d dVar2;
        Q.e eVar5 = this.f7898b;
        boolean z3 = eVar5.f7459a;
        f fVar = this.f7901e;
        if (z3) {
            fVar.c(eVar5.r());
        }
        boolean z8 = fVar.f7881j;
        Q.d dVar3 = Q.d.f7431d;
        Q.d dVar4 = Q.d.f7430c;
        Q.d dVar5 = Q.d.f7428a;
        e eVar6 = this.f7905i;
        e eVar7 = this.f7904h;
        if (!z8) {
            Q.e eVar8 = this.f7898b;
            Q.d dVar6 = eVar8.f7453U[0];
            this.f7900d = dVar6;
            if (dVar6 != dVar4) {
                if (dVar6 == dVar3 && (eVar4 = eVar8.f7454V) != null && ((dVar2 = eVar4.f7453U[0]) == dVar5 || dVar2 == dVar3)) {
                    int iR = (eVar4.r() - this.f7898b.f7442J.e()) - this.f7898b.f7444L.e();
                    n.a(eVar7, eVar4.f7463d.f7904h, this.f7898b.f7442J.e());
                    n.a(eVar6, eVar4.f7463d.f7905i, -this.f7898b.f7444L.e());
                    fVar.c(iR);
                    return;
                }
                if (dVar6 == dVar5) {
                    fVar.c(eVar8.r());
                }
            }
        } else if (this.f7900d == dVar3 && (eVar2 = (eVar = this.f7898b).f7454V) != null && ((dVar = eVar2.f7453U[0]) == dVar5 || dVar == dVar3)) {
            n.a(eVar7, eVar2.f7463d.f7904h, eVar.f7442J.e());
            n.a(eVar6, eVar2.f7463d.f7905i, -this.f7898b.f7444L.e());
            return;
        }
        if (fVar.f7881j) {
            Q.e eVar9 = this.f7898b;
            if (eVar9.f7459a) {
                Q.c[] cVarArr = eVar9.f7450R;
                Q.c cVar = cVarArr[0];
                Q.c cVar2 = cVar.f7424f;
                if (cVar2 != null && cVarArr[1].f7424f != null) {
                    if (eVar9.y()) {
                        eVar7.f7877f = this.f7898b.f7450R[0].e();
                        eVar6.f7877f = -this.f7898b.f7450R[1].e();
                        return;
                    }
                    e eVarG = n.g(this.f7898b.f7450R[0]);
                    if (eVarG != null) {
                        n.a(eVar7, eVarG, this.f7898b.f7450R[0].e());
                    }
                    e eVarG2 = n.g(this.f7898b.f7450R[1]);
                    if (eVarG2 != null) {
                        n.a(eVar6, eVarG2, -this.f7898b.f7450R[1].e());
                    }
                    eVar7.f7873b = true;
                    eVar6.f7873b = true;
                    return;
                }
                if (cVar2 != null) {
                    e eVarG3 = n.g(cVar);
                    if (eVarG3 != null) {
                        n.a(eVar7, eVarG3, this.f7898b.f7450R[0].e());
                        n.a(eVar6, eVar7, fVar.f7878g);
                        return;
                    }
                    return;
                }
                Q.c cVar3 = cVarArr[1];
                if (cVar3.f7424f != null) {
                    e eVarG4 = n.g(cVar3);
                    if (eVarG4 != null) {
                        n.a(eVar6, eVarG4, -this.f7898b.f7450R[1].e());
                        n.a(eVar7, eVar6, -fVar.f7878g);
                        return;
                    }
                    return;
                }
                if ((eVar9 instanceof Helper) || eVar9.f7454V == null || eVar9.j(7).f7424f != null) {
                    return;
                }
                Q.e eVar10 = this.f7898b;
                n.a(eVar7, eVar10.f7454V.f7463d.f7904h, eVar10.s());
                n.a(eVar6, eVar7, fVar.f7878g);
                return;
            }
        }
        if (this.f7900d == dVar4) {
            Q.e eVar11 = this.f7898b;
            int i7 = eVar11.f7490r;
            if (i7 == 2) {
                Q.e eVar12 = eVar11.f7454V;
                if (eVar12 != null) {
                    f fVar2 = eVar12.f7465e.f7901e;
                    fVar.f7883l.add(fVar2);
                    fVar2.f7882k.add(fVar);
                    fVar.f7873b = true;
                    fVar.f7882k.add(eVar7);
                    fVar.f7882k.add(eVar6);
                }
            } else if (i7 == 3) {
                if (eVar11.f7492s == 3) {
                    eVar7.f7872a = this;
                    eVar6.f7872a = this;
                    l lVar = eVar11.f7465e;
                    lVar.f7904h.f7872a = this;
                    lVar.f7905i.f7872a = this;
                    fVar.f7872a = this;
                    if (eVar11.z()) {
                        fVar.f7883l.add(this.f7898b.f7465e.f7901e);
                        this.f7898b.f7465e.f7901e.f7882k.add(fVar);
                        l lVar2 = this.f7898b.f7465e;
                        lVar2.f7901e.f7872a = this;
                        fVar.f7883l.add(lVar2.f7904h);
                        fVar.f7883l.add(this.f7898b.f7465e.f7905i);
                        this.f7898b.f7465e.f7904h.f7882k.add(fVar);
                        this.f7898b.f7465e.f7905i.f7882k.add(fVar);
                    } else if (this.f7898b.y()) {
                        this.f7898b.f7465e.f7901e.f7883l.add(fVar);
                        fVar.f7882k.add(this.f7898b.f7465e.f7901e);
                    } else {
                        this.f7898b.f7465e.f7901e.f7883l.add(fVar);
                    }
                } else {
                    f fVar3 = eVar11.f7465e.f7901e;
                    fVar.f7883l.add(fVar3);
                    fVar3.f7882k.add(fVar);
                    this.f7898b.f7465e.f7904h.f7882k.add(fVar);
                    this.f7898b.f7465e.f7905i.f7882k.add(fVar);
                    fVar.f7873b = true;
                    fVar.f7882k.add(eVar7);
                    fVar.f7882k.add(eVar6);
                    eVar7.f7883l.add(fVar);
                    eVar6.f7883l.add(fVar);
                }
            }
        }
        Q.e eVar13 = this.f7898b;
        Q.c[] cVarArr2 = eVar13.f7450R;
        Q.c cVar4 = cVarArr2[0];
        Q.c cVar5 = cVar4.f7424f;
        if (cVar5 != null && cVarArr2[1].f7424f != null) {
            if (eVar13.y()) {
                eVar7.f7877f = this.f7898b.f7450R[0].e();
                eVar6.f7877f = -this.f7898b.f7450R[1].e();
                return;
            }
            e eVarG5 = n.g(this.f7898b.f7450R[0]);
            e eVarG6 = n.g(this.f7898b.f7450R[1]);
            if (eVarG5 != null) {
                eVarG5.a(this);
            }
            if (eVarG6 != null) {
                eVarG6.a(this);
            }
            this.f7906j = 4;
            return;
        }
        if (cVar5 != null) {
            e eVarG7 = n.g(cVar4);
            if (eVarG7 != null) {
                n.a(eVar7, eVarG7, this.f7898b.f7450R[0].e());
                b(eVar6, eVar7, 1, fVar);
                return;
            }
            return;
        }
        Q.c cVar6 = cVarArr2[1];
        if (cVar6.f7424f != null) {
            e eVarG8 = n.g(cVar6);
            if (eVarG8 != null) {
                n.a(eVar6, eVarG8, -this.f7898b.f7450R[1].e());
                b(eVar7, eVar6, -1, fVar);
                return;
            }
            return;
        }
        if ((eVar13 instanceof Helper) || (eVar3 = eVar13.f7454V) == null) {
            return;
        }
        n.a(eVar7, eVar3.f7463d.f7904h, eVar13.s());
        b(eVar6, eVar7, 1, fVar);
    }

    @Override // R.n
    public final void d() {
        e eVar = this.f7904h;
        if (eVar.f7881j) {
            this.f7898b.f7460a0 = eVar.f7878g;
        }
    }

    @Override // R.n
    public final void e() {
        this.f7899c = null;
        this.f7904h.b();
        this.f7905i.b();
        this.f7901e.b();
        this.f7903g = false;
    }

    @Override // R.n
    public final boolean j() {
        return this.f7900d != Q.d.f7430c || this.f7898b.f7490r == 0;
    }

    public final void m() {
        this.f7903g = false;
        e eVar = this.f7904h;
        eVar.b();
        eVar.f7881j = false;
        e eVar2 = this.f7905i;
        eVar2.b();
        eVar2.f7881j = false;
        this.f7901e.f7881j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f7898b.f7477k0;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x026a  */
    /* JADX WARN: Code duplicated, block: B:118:0x027a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public final void update(Dependency dependency) {
        float f10;
        int iF;
        int i7;
        int iF2;
        float f11;
        float f12;
        float f13;
        int i10;
        if (F.i(this.f7906j) == 3) {
            Q.e eVar = this.f7898b;
            k(eVar.f7442J, eVar.f7444L, 0);
            return;
        }
        f fVar = this.f7901e;
        boolean z3 = fVar.f7881j;
        Q.d dVar = Q.d.f7430c;
        e eVar2 = this.f7904h;
        e eVar3 = this.f7905i;
        if (z3 || this.f7900d != dVar) {
            f10 = 0.5f;
        } else {
            Q.e eVar4 = this.f7898b;
            int i11 = eVar4.f7490r;
            if (i11 == 2) {
                f10 = 0.5f;
                Q.e eVar5 = eVar4.f7454V;
                if (eVar5 != null) {
                    f fVar2 = eVar5.f7463d.f7901e;
                    if (fVar2.f7881j) {
                        fVar.c((int) ((fVar2.f7878g * eVar4.f7497w) + 0.5f));
                    }
                }
            } else if (i11 == 3) {
                int i12 = eVar4.f7492s;
                if (i12 == 0 || i12 == 3) {
                    l lVar = eVar4.f7465e;
                    e eVar6 = lVar.f7904h;
                    e eVar7 = lVar.f7905i;
                    boolean z8 = eVar4.f7442J.f7424f != null;
                    boolean z10 = eVar4.f7443K.f7424f != null;
                    boolean z11 = eVar4.f7444L.f7424f != null;
                    boolean z12 = eVar4.f7445M.f7424f != null;
                    f10 = 0.5f;
                    int i13 = eVar4.f7458Z;
                    if (z8 && z10 && z11 && z12) {
                        float f14 = eVar4.f7457Y;
                        boolean z13 = eVar6.f7881j;
                        int[] iArr = f7886k;
                        if (z13 && eVar7.f7881j) {
                            if (eVar2.f7874c && eVar3.f7874c) {
                                l(iArr, ((e) eVar2.f7883l.get(0)).f7878g + eVar2.f7877f, ((e) eVar3.f7883l.get(0)).f7878g - eVar3.f7877f, eVar6.f7878g + eVar6.f7877f, eVar7.f7878g - eVar7.f7877f, f14, i13);
                                fVar.c(iArr[0]);
                                this.f7898b.f7465e.f7901e.c(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z14 = eVar2.f7881j;
                        ArrayList arrayList = eVar6.f7883l;
                        if (z14 && eVar3.f7881j) {
                            if (!eVar6.f7874c || !eVar7.f7874c) {
                                return;
                            }
                            l(iArr, eVar2.f7878g + eVar2.f7877f, eVar3.f7878g - eVar3.f7877f, ((e) arrayList.get(0)).f7878g + eVar6.f7877f, ((e) eVar7.f7883l.get(0)).f7878g - eVar7.f7877f, f14, i13);
                            fVar.c(iArr[0]);
                            this.f7898b.f7465e.f7901e.c(iArr[1]);
                        }
                        if (!eVar2.f7874c || !eVar3.f7874c || !eVar6.f7874c || !eVar7.f7874c) {
                            return;
                        }
                        l(iArr, ((e) eVar2.f7883l.get(0)).f7878g + eVar2.f7877f, ((e) eVar3.f7883l.get(0)).f7878g - eVar3.f7877f, ((e) arrayList.get(0)).f7878g + eVar6.f7877f, ((e) eVar7.f7883l.get(0)).f7878g - eVar7.f7877f, f14, i13);
                        fVar.c(iArr[0]);
                        this.f7898b.f7465e.f7901e.c(iArr[1]);
                    } else if (z8 && z11) {
                        if (!eVar2.f7874c || !eVar3.f7874c) {
                            return;
                        }
                        float f15 = eVar4.f7457Y;
                        int i14 = ((e) eVar2.f7883l.get(0)).f7878g + eVar2.f7877f;
                        int i15 = ((e) eVar3.f7883l.get(0)).f7878g - eVar3.f7877f;
                        if (i13 == -1 || i13 == 0) {
                            int iF3 = f(i15 - i14, 0);
                            int i16 = (int) ((iF3 * f15) + 0.5f);
                            int iF4 = f(i16, 1);
                            if (i16 != iF4) {
                                iF3 = (int) ((iF4 / f15) + 0.5f);
                            }
                            fVar.c(iF3);
                            this.f7898b.f7465e.f7901e.c(iF4);
                        } else if (i13 == 1) {
                            int iF5 = f(i15 - i14, 0);
                            int i17 = (int) ((iF5 / f15) + 0.5f);
                            int iF6 = f(i17, 1);
                            if (i17 != iF6) {
                                iF5 = (int) ((iF6 * f15) + 0.5f);
                            }
                            fVar.c(iF5);
                            this.f7898b.f7465e.f7901e.c(iF6);
                        }
                    } else if (z10 && z12) {
                        if (!eVar6.f7874c || !eVar7.f7874c) {
                            return;
                        }
                        float f16 = eVar4.f7457Y;
                        int i18 = ((e) eVar6.f7883l.get(0)).f7878g + eVar6.f7877f;
                        int i19 = ((e) eVar7.f7883l.get(0)).f7878g - eVar7.f7877f;
                        if (i13 == -1) {
                            iF = f(i19 - i18, 1);
                            i7 = (int) ((iF / f16) + 0.5f);
                            iF2 = f(i7, 0);
                            if (i7 != iF2) {
                                iF = (int) ((iF2 * f16) + 0.5f);
                            }
                            fVar.c(iF2);
                            this.f7898b.f7465e.f7901e.c(iF);
                        } else if (i13 == 0) {
                            int iF7 = f(i19 - i18, 1);
                            int i20 = (int) ((iF7 * f16) + 0.5f);
                            int iF8 = f(i20, 0);
                            if (i20 != iF8) {
                                iF7 = (int) ((iF8 / f16) + 0.5f);
                            }
                            fVar.c(iF8);
                            this.f7898b.f7465e.f7901e.c(iF7);
                        } else if (i13 == 1) {
                            iF = f(i19 - i18, 1);
                            i7 = (int) ((iF / f16) + 0.5f);
                            iF2 = f(i7, 0);
                            if (i7 != iF2) {
                                iF = (int) ((iF2 * f16) + 0.5f);
                            }
                            fVar.c(iF2);
                            this.f7898b.f7465e.f7901e.c(iF);
                        }
                    }
                } else {
                    int i21 = eVar4.f7458Z;
                    if (i21 != -1) {
                        if (i21 == 0) {
                            f13 = eVar4.f7465e.f7901e.f7878g / eVar4.f7457Y;
                            i10 = (int) (f13 + 0.5f);
                        } else if (i21 != 1) {
                            i10 = 0;
                        } else {
                            f11 = eVar4.f7465e.f7901e.f7878g;
                            f12 = eVar4.f7457Y;
                        }
                        fVar.c(i10);
                        f10 = 0.5f;
                    } else {
                        f11 = eVar4.f7465e.f7901e.f7878g;
                        f12 = eVar4.f7457Y;
                    }
                    f13 = f11 * f12;
                    i10 = (int) (f13 + 0.5f);
                    fVar.c(i10);
                    f10 = 0.5f;
                }
            } else {
                f10 = 0.5f;
            }
        }
        if (eVar2.f7874c && eVar3.f7874c) {
            if (eVar2.f7881j && eVar3.f7881j && fVar.f7881j) {
                return;
            }
            if (!fVar.f7881j && this.f7900d == dVar) {
                Q.e eVar8 = this.f7898b;
                if (eVar8.f7490r == 0 && !eVar8.y()) {
                    e eVar9 = (e) eVar2.f7883l.get(0);
                    e eVar10 = (e) eVar3.f7883l.get(0);
                    int i22 = eVar9.f7878g + eVar2.f7877f;
                    int i23 = eVar10.f7878g + eVar3.f7877f;
                    eVar2.c(i22);
                    eVar3.c(i23);
                    fVar.c(i23 - i22);
                    return;
                }
            }
            if (!fVar.f7881j && this.f7900d == dVar && this.f7897a == 1 && eVar2.f7883l.size() > 0 && eVar3.f7883l.size() > 0) {
                int iMin = Math.min((((e) eVar3.f7883l.get(0)).f7878g + eVar3.f7877f) - (((e) eVar2.f7883l.get(0)).f7878g + eVar2.f7877f), fVar.f7884m);
                Q.e eVar11 = this.f7898b;
                int i24 = eVar11.f7496v;
                int iMax = Math.max(eVar11.f7495u, iMin);
                if (i24 > 0) {
                    iMax = Math.min(i24, iMax);
                }
                fVar.c(iMax);
            }
            if (fVar.f7881j) {
                e eVar12 = (e) eVar2.f7883l.get(0);
                e eVar13 = (e) eVar3.f7883l.get(0);
                int i25 = eVar12.f7878g;
                int i26 = eVar2.f7877f + i25;
                int i27 = eVar13.f7878g;
                int i28 = eVar3.f7877f + i27;
                float f17 = this.f7898b.f7468f0;
                if (eVar12 == eVar13) {
                    f17 = f10;
                } else {
                    i25 = i26;
                    i27 = i28;
                }
                eVar2.c((int) ((((i27 - i25) - fVar.f7878g) * f17) + i25 + f10));
                eVar3.c(eVar2.f7878g + fVar.f7878g);
            }
        }
    }
}
