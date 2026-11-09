package R;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7885a = new b();

    public static boolean a(Q.e eVar) {
        Q.d[] dVarArr = eVar.f7453U;
        Q.d dVar = dVarArr[0];
        Q.d dVar2 = dVarArr[1];
        Q.e eVar2 = eVar.f7454V;
        Q.f fVar = eVar2 != null ? (Q.f) eVar2 : null;
        Q.d dVar3 = Q.d.f7428a;
        if (fVar != null) {
            Q.d dVar4 = fVar.f7453U[0];
        }
        if (fVar != null) {
            Q.d dVar5 = fVar.f7453U[1];
        }
        Q.d dVar6 = Q.d.f7430c;
        Q.d dVar7 = Q.d.f7429b;
        boolean z3 = dVar == dVar3 || eVar.B() || dVar == dVar7 || (dVar == dVar6 && eVar.f7490r == 0 && eVar.f7457Y == 0.0f && eVar.u(0)) || (dVar == dVar6 && eVar.f7490r == 1 && eVar.v(0, eVar.r()));
        boolean z8 = dVar2 == dVar3 || eVar.C() || dVar2 == dVar7 || (dVar2 == dVar6 && eVar.f7492s == 0 && eVar.f7457Y == 0.0f && eVar.u(1)) || (dVar2 == dVar6 && eVar.f7492s == 1 && eVar.v(1, eVar.l()));
        return (eVar.f7457Y > 0.0f && (z3 || z8)) || (z3 && z8);
    }

    public static m b(Q.e eVar, int i7, ArrayList arrayList, m mVar) {
        int i10;
        int i11 = i7 == 0 ? eVar.f7493s0 : eVar.f7494t0;
        if (i11 != -1 && (mVar == null || i11 != mVar.f7893b)) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                m mVar2 = (m) arrayList.get(i12);
                if (mVar2.f7893b == i11) {
                    if (mVar != null) {
                        mVar.c(i7, mVar2);
                        arrayList.remove(mVar);
                    }
                    mVar = mVar2;
                    break;
                }
            }
        } else if (i11 != -1) {
            return mVar;
        }
        if (mVar == null) {
            if (eVar instanceof Q.j) {
                Q.j jVar = (Q.j) eVar;
                int i13 = 0;
                while (true) {
                    if (i13 >= jVar.f7569v0) {
                        i10 = -1;
                        break;
                    }
                    Q.e eVar2 = jVar.f7568u0[i13];
                    if ((i7 == 0 && (i10 = eVar2.f7493s0) != -1) || (i7 == 1 && (i10 = eVar2.f7494t0) != -1)) {
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        m mVar3 = (m) arrayList.get(i14);
                        if (mVar3.f7893b == i10) {
                            mVar = mVar3;
                            break;
                        }
                    }
                }
            }
            if (mVar == null) {
                mVar = new m();
                mVar.f7892a = new ArrayList();
                mVar.f7895d = null;
                mVar.f7896e = -1;
                int i15 = m.f7891f;
                m.f7891f = i15 + 1;
                mVar.f7893b = i15;
                mVar.f7894c = i7;
            }
            arrayList.add(mVar);
        }
        ArrayList arrayList2 = mVar.f7892a;
        if (arrayList2.contains(eVar)) {
            return mVar;
        }
        arrayList2.add(eVar);
        if (eVar instanceof Q.i) {
            Q.i iVar = (Q.i) eVar;
            iVar.f7565x0.c(iVar.f7566y0 == 0 ? 1 : 0, mVar, arrayList);
        }
        int i16 = mVar.f7893b;
        if (i7 == 0) {
            eVar.f7493s0 = i16;
            eVar.f7442J.c(i7, mVar, arrayList);
            eVar.f7444L.c(i7, mVar, arrayList);
        } else {
            eVar.f7494t0 = i16;
            eVar.f7443K.c(i7, mVar, arrayList);
            eVar.f7446N.c(i7, mVar, arrayList);
            eVar.f7445M.c(i7, mVar, arrayList);
        }
        eVar.f7449Q.c(i7, mVar, arrayList);
        return mVar;
    }

    public static void c(int i7, Q.e eVar, BasicMeasure$Measurer basicMeasure$Measurer, boolean z3) {
        Q.c cVar;
        Q.c cVar2;
        char c6;
        Q.c cVar3;
        Q.c cVar4;
        if (eVar.f7480m) {
            return;
        }
        if (!(eVar instanceof Q.f) && eVar.A() && a(eVar)) {
            Q.f.W(eVar, basicMeasure$Measurer, new b());
        }
        Q.c cVarJ = eVar.j(2);
        Q.c cVarJ2 = eVar.j(4);
        int iD = cVarJ.d();
        int iD2 = cVarJ2.d();
        HashSet<Q.c> hashSet = cVarJ.f7419a;
        Q.d dVar = Q.d.f7430c;
        if (hashSet != null && cVarJ.f7421c) {
            for (Q.c cVar5 : hashSet) {
                Q.e eVar2 = cVar5.f7422d;
                int i10 = i7 + 1;
                boolean zA = a(eVar2);
                if (eVar2.A() && zA) {
                    c6 = 0;
                    Q.f.W(eVar2, basicMeasure$Measurer, new b());
                } else {
                    c6 = 0;
                }
                Q.c cVar6 = eVar2.f7442J;
                Q.c cVar7 = eVar2.f7444L;
                char c10 = ((cVar5 == cVar6 && (cVar4 = cVar7.f7424f) != null && cVar4.f7421c) || (cVar5 == cVar7 && (cVar3 = cVar6.f7424f) != null && cVar3.f7421c)) ? (char) 1 : c6;
                Q.d dVar2 = eVar2.f7453U[c6];
                if (dVar2 != dVar || zA) {
                    if (!eVar2.A()) {
                        if (cVar5 == cVar6 && cVar7.f7424f == null) {
                            int iE = cVar6.e() + iD;
                            eVar2.K(iE, eVar2.r() + iE);
                            c(i10, eVar2, basicMeasure$Measurer, z3);
                        } else if (cVar5 == cVar7 && cVar6.f7424f == null) {
                            int iE2 = iD - cVar7.e();
                            eVar2.K(iE2 - eVar2.r(), iE2);
                            c(i10, eVar2, basicMeasure$Measurer, z3);
                        } else if (c10 != 0 && !eVar2.y()) {
                            d(i10, eVar2, basicMeasure$Measurer, z3);
                        }
                    }
                } else if (dVar2 == dVar && eVar2.f7496v >= 0 && eVar2.f7495u >= 0 && (eVar2.i0 == 8 || (eVar2.f7490r == 0 && eVar2.f7457Y == 0.0f))) {
                    if (!eVar2.y() && !eVar2.f7439G && c10 != 0 && !eVar2.y()) {
                        e(i10, eVar, basicMeasure$Measurer, eVar2, z3);
                    }
                }
            }
        }
        if (eVar instanceof Q.i) {
            return;
        }
        HashSet<Q.c> hashSet2 = cVarJ2.f7419a;
        if (hashSet2 != null && cVarJ2.f7421c) {
            for (Q.c cVar8 : hashSet2) {
                Q.e eVar3 = cVar8.f7422d;
                int i11 = i7 + 1;
                boolean zA2 = a(eVar3);
                if (eVar3.A() && zA2) {
                    Q.f.W(eVar3, basicMeasure$Measurer, new b());
                }
                Q.c cVar9 = eVar3.f7442J;
                Q.c cVar10 = eVar3.f7444L;
                boolean z8 = (cVar8 == cVar9 && (cVar2 = cVar10.f7424f) != null && cVar2.f7421c) || (cVar8 == cVar10 && (cVar = cVar9.f7424f) != null && cVar.f7421c);
                Q.d dVar3 = eVar3.f7453U[0];
                if (dVar3 != dVar || zA2) {
                    if (!eVar3.A()) {
                        if (cVar8 == cVar9 && cVar10.f7424f == null) {
                            int iE3 = cVar9.e() + iD2;
                            eVar3.K(iE3, eVar3.r() + iE3);
                            c(i11, eVar3, basicMeasure$Measurer, z3);
                        } else if (cVar8 == cVar10 && cVar9.f7424f == null) {
                            int iE4 = iD2 - cVar10.e();
                            eVar3.K(iE4 - eVar3.r(), iE4);
                            c(i11, eVar3, basicMeasure$Measurer, z3);
                        } else if (z8 && !eVar3.y()) {
                            d(i11, eVar3, basicMeasure$Measurer, z3);
                        }
                    }
                } else if (dVar3 == dVar && eVar3.f7496v >= 0 && eVar3.f7495u >= 0) {
                    if (eVar3.i0 == 8 || (eVar3.f7490r == 0 && eVar3.f7457Y == 0.0f)) {
                        if (!eVar3.y() && !eVar3.f7439G && z8 && !eVar3.y()) {
                            e(i11, eVar, basicMeasure$Measurer, eVar3, z3);
                        }
                    }
                }
            }
        }
        eVar.f7480m = true;
    }

    public static void d(int i7, Q.e eVar, BasicMeasure$Measurer basicMeasure$Measurer, boolean z3) {
        float f10 = eVar.f7468f0;
        Q.c cVar = eVar.f7442J;
        int iD = cVar.f7424f.d();
        Q.c cVar2 = eVar.f7444L;
        int iD2 = cVar2.f7424f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iR = eVar.r();
        int i10 = (iD2 - iD) - iR;
        if (iD > iD2) {
            i10 = (iD - iD2) - iR;
        }
        int i11 = ((int) (i10 > 0 ? (f10 * i10) + 0.5f : f10 * i10)) + iD;
        int i12 = i11 + iR;
        if (iD > iD2) {
            i12 = i11 - iR;
        }
        eVar.K(i11, i12);
        c(i7 + 1, eVar, basicMeasure$Measurer, z3);
    }

    public static void e(int i7, Q.e eVar, BasicMeasure$Measurer basicMeasure$Measurer, Q.e eVar2, boolean z3) {
        float f10 = eVar2.f7468f0;
        Q.c cVar = eVar2.f7442J;
        int iE = cVar.e() + cVar.f7424f.d();
        Q.c cVar2 = eVar2.f7444L;
        int iD = cVar2.f7424f.d() - cVar2.e();
        if (iD >= iE) {
            int iR = eVar2.r();
            if (eVar2.i0 != 8) {
                int i10 = eVar2.f7490r;
                if (i10 == 2) {
                    iR = (int) (eVar2.f7468f0 * 0.5f * (eVar instanceof Q.f ? eVar.r() : eVar.f7454V.r()));
                } else if (i10 == 0) {
                    iR = iD - iE;
                }
                iR = Math.max(eVar2.f7495u, iR);
                int i11 = eVar2.f7496v;
                if (i11 > 0) {
                    iR = Math.min(i11, iR);
                }
            }
            int i12 = iE + ((int) ((f10 * ((iD - iE) - iR)) + 0.5f));
            eVar2.K(i12, iR + i12);
            c(i7 + 1, eVar2, basicMeasure$Measurer, z3);
        }
    }

    public static void f(int i7, Q.e eVar, BasicMeasure$Measurer basicMeasure$Measurer) {
        float f10 = eVar.f7470g0;
        Q.c cVar = eVar.f7443K;
        int iD = cVar.f7424f.d();
        Q.c cVar2 = eVar.f7445M;
        int iD2 = cVar2.f7424f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iL = eVar.l();
        int i10 = (iD2 - iD) - iL;
        if (iD > iD2) {
            i10 = (iD - iD2) - iL;
        }
        int i11 = (int) (i10 > 0 ? (f10 * i10) + 0.5f : f10 * i10);
        int i12 = iD + i11;
        int i13 = i12 + iL;
        if (iD > iD2) {
            i12 = iD - i11;
            i13 = i12 - iL;
        }
        eVar.L(i12, i13);
        i(i7 + 1, eVar, basicMeasure$Measurer);
    }

    public static void g(int i7, Q.e eVar, BasicMeasure$Measurer basicMeasure$Measurer, Q.e eVar2) {
        float f10 = eVar2.f7470g0;
        Q.c cVar = eVar2.f7443K;
        int iE = cVar.e() + cVar.f7424f.d();
        Q.c cVar2 = eVar2.f7445M;
        int iD = cVar2.f7424f.d() - cVar2.e();
        if (iD >= iE) {
            int iL = eVar2.l();
            if (eVar2.i0 != 8) {
                int i10 = eVar2.f7492s;
                if (i10 == 2) {
                    iL = (int) (f10 * 0.5f * (eVar instanceof Q.f ? eVar.l() : eVar.f7454V.l()));
                } else if (i10 == 0) {
                    iL = iD - iE;
                }
                iL = Math.max(eVar2.f7498x, iL);
                int i11 = eVar2.f7499y;
                if (i11 > 0) {
                    iL = Math.min(i11, iL);
                }
            }
            int i12 = iE + ((int) ((f10 * ((iD - iE) - iL)) + 0.5f));
            eVar2.L(i12, iL + i12);
            i(i7 + 1, eVar2, basicMeasure$Measurer);
        }
    }

    public static boolean h(Q.d dVar, Q.d dVar2, Q.d dVar3, Q.d dVar4) {
        Q.d dVar5 = Q.d.f7428a;
        Q.d dVar6 = Q.d.f7431d;
        Q.d dVar7 = Q.d.f7429b;
        return (dVar3 == dVar5 || dVar3 == dVar7 || (dVar3 == dVar6 && dVar != dVar7)) || (dVar4 == dVar5 || dVar4 == dVar7 || (dVar4 == dVar6 && dVar2 != dVar7));
    }

    public static void i(int i7, Q.e eVar, BasicMeasure$Measurer basicMeasure$Measurer) {
        boolean z3;
        Q.c cVar;
        Q.c cVar2;
        Q.c cVar3;
        Q.c cVar4;
        if (eVar.f7482n) {
            return;
        }
        if (!(eVar instanceof Q.f) && eVar.A() && a(eVar)) {
            Q.f.W(eVar, basicMeasure$Measurer, new b());
        }
        Q.c cVarJ = eVar.j(3);
        Q.c cVarJ2 = eVar.j(5);
        int iD = cVarJ.d();
        int iD2 = cVarJ2.d();
        HashSet<Q.c> hashSet = cVarJ.f7419a;
        Q.d dVar = Q.d.f7430c;
        if (hashSet != null && cVarJ.f7421c) {
            for (Q.c cVar5 : hashSet) {
                Q.e eVar2 = cVar5.f7422d;
                int i10 = i7 + 1;
                boolean zA = a(eVar2);
                if (eVar2.A() && zA) {
                    Q.f.W(eVar2, basicMeasure$Measurer, new b());
                }
                Q.c cVar6 = eVar2.f7443K;
                Q.c cVar7 = eVar2.f7445M;
                boolean z8 = (cVar5 == cVar6 && (cVar4 = cVar7.f7424f) != null && cVar4.f7421c) || (cVar5 == cVar7 && (cVar3 = cVar6.f7424f) != null && cVar3.f7421c);
                Q.d dVar2 = eVar2.f7453U[1];
                if (dVar2 != dVar || zA) {
                    if (!eVar2.A()) {
                        if (cVar5 == cVar6 && cVar7.f7424f == null) {
                            int iE = cVar6.e() + iD;
                            eVar2.L(iE, eVar2.l() + iE);
                            i(i10, eVar2, basicMeasure$Measurer);
                        } else if (cVar5 == cVar7 && cVar6.f7424f == null) {
                            int iE2 = iD - cVar7.e();
                            eVar2.L(iE2 - eVar2.l(), iE2);
                            i(i10, eVar2, basicMeasure$Measurer);
                        } else if (z8 && !eVar2.z()) {
                            f(i10, eVar2, basicMeasure$Measurer);
                        }
                    }
                } else if (dVar2 == dVar && eVar2.f7499y >= 0 && eVar2.f7498x >= 0 && (eVar2.i0 == 8 || (eVar2.f7492s == 0 && eVar2.f7457Y == 0.0f))) {
                    if (!eVar2.z() && !eVar2.f7439G && z8 && !eVar2.z()) {
                        g(i10, eVar, basicMeasure$Measurer, eVar2);
                    }
                }
            }
        }
        boolean z10 = true;
        z10 = true;
        z10 = true;
        if (eVar instanceof Q.i) {
            return;
        }
        HashSet<Q.c> hashSet2 = cVarJ2.f7419a;
        if (hashSet2 != null && cVarJ2.f7421c) {
            for (Q.c cVar8 : hashSet2) {
                Q.e eVar3 = cVar8.f7422d;
                int i11 = i7 + 1;
                boolean zA2 = a(eVar3);
                if (eVar3.A() && zA2) {
                    Q.f.W(eVar3, basicMeasure$Measurer, new b());
                }
                Q.c cVar9 = eVar3.f7443K;
                Q.c cVar10 = eVar3.f7445M;
                boolean z11 = (cVar8 == cVar9 && (cVar2 = cVar10.f7424f) != null && cVar2.f7421c) || (cVar8 == cVar10 && (cVar = cVar9.f7424f) != null && cVar.f7421c);
                Q.d dVar3 = eVar3.f7453U[1];
                if (dVar3 != dVar || zA2) {
                    if (!eVar3.A()) {
                        if (cVar8 == cVar9 && cVar10.f7424f == null) {
                            int iE3 = cVar9.e() + iD2;
                            eVar3.L(iE3, eVar3.l() + iE3);
                            i(i11, eVar3, basicMeasure$Measurer);
                        } else if (cVar8 == cVar10 && cVar9.f7424f == null) {
                            int iE4 = iD2 - cVar10.e();
                            eVar3.L(iE4 - eVar3.l(), iE4);
                            i(i11, eVar3, basicMeasure$Measurer);
                        } else if (z11 && !eVar3.z()) {
                            f(i11, eVar3, basicMeasure$Measurer);
                        }
                    }
                } else if (dVar3 == dVar && eVar3.f7499y >= 0 && eVar3.f7498x >= 0 && (eVar3.i0 == 8 || (eVar3.f7492s == 0 && eVar3.f7457Y == 0.0f))) {
                    if (!eVar3.z() && !eVar3.f7439G && z11 && !eVar3.z()) {
                        g(i11, eVar, basicMeasure$Measurer, eVar3);
                    }
                }
            }
        }
        Q.c cVarJ3 = eVar.j(6);
        if (cVarJ3.f7419a != null && cVarJ3.f7421c) {
            int iD3 = cVarJ3.d();
            for (Q.c cVar11 : cVarJ3.f7419a) {
                Q.e eVar4 = cVar11.f7422d;
                int i12 = i7 + 1;
                boolean zA3 = a(eVar4);
                if (eVar4.A() && zA3) {
                    Q.f.W(eVar4, basicMeasure$Measurer, new b());
                }
                if (eVar4.f7453U[z10 ? 1 : 0] != dVar || zA3) {
                    if (!eVar4.A()) {
                        Q.c cVar12 = eVar4.f7446N;
                        if (cVar11 == cVar12) {
                            int iE5 = cVar11.e() + iD3;
                            if (eVar4.f7437E) {
                                int i13 = iE5 - eVar4.c0;
                                int i14 = eVar4.f7456X + i13;
                                eVar4.b0 = i13;
                                eVar4.f7443K.l(i13);
                                eVar4.f7445M.l(i14);
                                cVar12.l(iE5);
                                z3 = z10 ? 1 : 0;
                                eVar4.f7478l = z3;
                            } else {
                                z3 = z10 ? 1 : 0;
                            }
                            i(i12, eVar4, basicMeasure$Measurer);
                        }
                        z10 = z3;
                    }
                }
                z3 = z10 ? 1 : 0;
                z10 = z3;
            }
        }
        eVar.f7482n = z10;
    }
}
