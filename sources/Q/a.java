package Q;

import C0.G;
import N8.q0;
import androidx.camera.video.u;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends j {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f7398w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f7399x0 = true;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f7400y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f7401z0 = false;

    @Override // Q.e
    public final boolean B() {
        return this.f7401z0;
    }

    @Override // Q.e
    public final boolean C() {
        return this.f7401z0;
    }

    public final boolean T() {
        int i7;
        int i10;
        int i11;
        boolean z3 = true;
        int i12 = 0;
        while (true) {
            i7 = this.f7569v0;
            if (i12 >= i7) {
                break;
            }
            e eVar = this.f7568u0[i12];
            if ((this.f7399x0 || eVar.c()) && ((((i10 = this.f7398w0) == 0 || i10 == 1) && !eVar.B()) || (((i11 = this.f7398w0) == 2 || i11 == 3) && !eVar.C()))) {
                z3 = false;
            }
            i12++;
        }
        if (!z3 || i7 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z8 = false;
        for (int i13 = 0; i13 < this.f7569v0; i13++) {
            e eVar2 = this.f7568u0[i13];
            if (this.f7399x0 || eVar2.c()) {
                if (!z8) {
                    int i14 = this.f7398w0;
                    if (i14 == 0) {
                        iMax = eVar2.j(2).d();
                    } else if (i14 == 1) {
                        iMax = eVar2.j(4).d();
                    } else if (i14 == 2) {
                        iMax = eVar2.j(3).d();
                    } else if (i14 == 3) {
                        iMax = eVar2.j(5).d();
                    }
                    z8 = true;
                }
                int i15 = this.f7398w0;
                if (i15 == 0) {
                    iMax = Math.min(iMax, eVar2.j(2).d());
                } else if (i15 == 1) {
                    iMax = Math.max(iMax, eVar2.j(4).d());
                } else if (i15 == 2) {
                    iMax = Math.min(iMax, eVar2.j(3).d());
                } else if (i15 == 3) {
                    iMax = Math.max(iMax, eVar2.j(5).d());
                }
            }
        }
        int i16 = iMax + this.f7400y0;
        int i17 = this.f7398w0;
        if (i17 == 0 || i17 == 1) {
            K(i16, i16);
        } else {
            L(i16, i16);
        }
        this.f7401z0 = true;
        return true;
    }

    public final int U() {
        int i7 = this.f7398w0;
        if (i7 == 0 || i7 == 1) {
            return 0;
        }
        return (i7 == 2 || i7 == 3) ? 1 : -1;
    }

    @Override // Q.e
    public final void b(androidx.constraintlayout.core.c cVar, boolean z3) {
        boolean z8;
        int i7;
        c[] cVarArr = this.f7450R;
        c cVar2 = this.f7442J;
        cVarArr[0] = cVar2;
        c cVar3 = this.f7443K;
        int i10 = 2;
        cVarArr[2] = cVar3;
        c cVar4 = this.f7444L;
        cVarArr[1] = cVar4;
        c cVar5 = this.f7445M;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.f7427i = cVar.k(cVar6);
        }
        int i11 = this.f7398w0;
        if (i11 < 0 || i11 >= 4) {
            return;
        }
        c cVar7 = cVarArr[i11];
        if (!this.f7401z0) {
            T();
        }
        if (this.f7401z0) {
            this.f7401z0 = false;
            int i12 = this.f7398w0;
            if (i12 == 0 || i12 == 1) {
                cVar.d(cVar2.f7427i, this.f7460a0);
                cVar.d(cVar4.f7427i, this.f7460a0);
                return;
            } else {
                if (i12 == 2 || i12 == 3) {
                    cVar.d(cVar3.f7427i, this.b0);
                    cVar.d(cVar5.f7427i, this.b0);
                    return;
                }
                return;
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 >= this.f7569v0) {
                z8 = false;
                break;
            }
            e eVar = this.f7568u0[i13];
            if (this.f7399x0 || eVar.c()) {
                int i14 = this.f7398w0;
                d dVar = d.f7430c;
                if (((i14 == 0 || i14 == 1) && eVar.f7453U[0] == dVar && eVar.f7442J.f7424f != null && eVar.f7444L.f7424f != null) || ((i14 == 2 || i14 == 3) && eVar.f7453U[1] == dVar && eVar.f7443K.f7424f != null && eVar.f7445M.f7424f != null)) {
                    z8 = true;
                    break;
                }
            }
            i13++;
        }
        boolean z10 = cVar2.g() || cVar4.g();
        boolean z11 = cVar3.g() || cVar5.g();
        int i15 = (z8 || !(((i7 = this.f7398w0) == 0 && z10) || ((i7 == 2 && z11) || ((i7 == 1 && z10) || (i7 == 3 && z11))))) ? 4 : 5;
        int i16 = 0;
        while (i16 < this.f7569v0) {
            e eVar2 = this.f7568u0[i16];
            if (this.f7399x0 || eVar2.c()) {
                androidx.constraintlayout.core.g gVarK = cVar.k(eVar2.f7450R[this.f7398w0]);
                int i17 = this.f7398w0;
                c cVar8 = eVar2.f7450R[i17];
                cVar8.f7427i = gVarK;
                c cVar9 = cVar8.f7424f;
                int i18 = (cVar9 == null || cVar9.f7422d != this) ? 0 : cVar8.f7425g;
                if (i17 == 0 || i17 == i10) {
                    androidx.constraintlayout.core.g gVar = cVar7.f7427i;
                    int i19 = this.f7400y0 - i18;
                    androidx.constraintlayout.core.b bVarL = cVar.l();
                    androidx.constraintlayout.core.g gVarM = cVar.m();
                    gVarM.f15113d = 0;
                    bVarL.c(gVar, gVarK, gVarM, i19);
                    cVar.c(bVarL);
                } else {
                    androidx.constraintlayout.core.g gVar2 = cVar7.f7427i;
                    int i20 = this.f7400y0 + i18;
                    androidx.constraintlayout.core.b bVarL2 = cVar.l();
                    androidx.constraintlayout.core.g gVarM2 = cVar.m();
                    gVarM2.f15113d = 0;
                    bVarL2.b(gVar2, gVarK, gVarM2, i20);
                    cVar.c(bVarL2);
                }
                cVar.e(cVar7.f7427i, gVarK, this.f7400y0 + i18, i15);
            }
            i16++;
            i10 = 2;
        }
        int i21 = this.f7398w0;
        if (i21 == 0) {
            cVar.e(cVar4.f7427i, cVar2.f7427i, 0, 8);
            cVar.e(cVar2.f7427i, this.f7454V.f7444L.f7427i, 0, 4);
            cVar.e(cVar2.f7427i, this.f7454V.f7442J.f7427i, 0, 0);
            return;
        }
        if (i21 == 1) {
            cVar.e(cVar2.f7427i, cVar4.f7427i, 0, 8);
            cVar.e(cVar2.f7427i, this.f7454V.f7442J.f7427i, 0, 4);
            cVar.e(cVar2.f7427i, this.f7454V.f7444L.f7427i, 0, 0);
        } else if (i21 == 2) {
            cVar.e(cVar5.f7427i, cVar3.f7427i, 0, 8);
            cVar.e(cVar3.f7427i, this.f7454V.f7445M.f7427i, 0, 4);
            cVar.e(cVar3.f7427i, this.f7454V.f7443K.f7427i, 0, 0);
        } else if (i21 == 3) {
            cVar.e(cVar3.f7427i, cVar5.f7427i, 0, 8);
            cVar.e(cVar3.f7427i, this.f7454V.f7443K.f7427i, 0, 4);
            cVar.e(cVar3.f7427i, this.f7454V.f7445M.f7427i, 0, 0);
        }
    }

    @Override // Q.e
    public final boolean c() {
        return true;
    }

    @Override // Q.j, Q.e
    public final void g(e eVar, HashMap map) {
        super.g(eVar, map);
        a aVar = (a) eVar;
        this.f7398w0 = aVar.f7398w0;
        this.f7399x0 = aVar.f7399x0;
        this.f7400y0 = aVar.f7400y0;
    }

    @Override // Q.e
    public final String toString() {
        String strR = G.r(new StringBuilder("[Barrier] "), this.f7477k0, " {");
        for (int i7 = 0; i7 < this.f7569v0; i7++) {
            e eVar = this.f7568u0[i7];
            if (i7 > 0) {
                strR = q0.j(strR, ", ");
            }
            StringBuilder sbS = u.s(strR);
            sbS.append(eVar.f7477k0);
            strR = sbS.toString();
        }
        return q0.j(strR, "}");
    }
}
