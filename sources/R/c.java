package R;

import N8.q0;
import androidx.constraintlayout.core.widgets.analyzer.Dependency;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f7862k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7863l;

    public c(Q.e eVar, int i7) {
        Q.e eVar2;
        super(eVar);
        this.f7862k = new ArrayList();
        this.f7902f = i7;
        Q.e eVar3 = this.f7898b;
        Q.e eVarN = eVar3.n(i7);
        while (true) {
            Q.e eVar4 = eVarN;
            eVar2 = eVar3;
            eVar3 = eVar4;
            if (eVar3 == null) {
                break;
            } else {
                eVarN = eVar3.n(this.f7902f);
            }
        }
        this.f7898b = eVar2;
        int i10 = this.f7902f;
        n nVar = i10 == 0 ? eVar2.f7463d : i10 == 1 ? eVar2.f7465e : null;
        ArrayList<n> arrayList = this.f7862k;
        arrayList.add(nVar);
        Q.e eVarM = eVar2.m(this.f7902f);
        while (eVarM != null) {
            int i11 = this.f7902f;
            arrayList.add(i11 == 0 ? eVarM.f7463d : i11 == 1 ? eVarM.f7465e : null);
            eVarM = eVarM.m(this.f7902f);
        }
        for (n nVar2 : arrayList) {
            int i12 = this.f7902f;
            if (i12 == 0) {
                nVar2.f7898b.f7461b = this;
            } else if (i12 == 1) {
                nVar2.f7898b.f7462c = this;
            }
        }
        if (this.f7902f == 0 && ((Q.f) this.f7898b.f7454V).f7522z0 && arrayList.size() > 1) {
            this.f7898b = ((n) q0.i(1, arrayList)).f7898b;
        }
        this.f7863l = this.f7902f == 0 ? this.f7898b.f7479l0 : this.f7898b.f7481m0;
    }

    @Override // R.n
    public final void c() {
        ArrayList arrayList = this.f7862k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n) it.next()).c();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        Q.e eVar = ((n) arrayList.get(0)).f7898b;
        Q.e eVar2 = ((n) arrayList.get(size - 1)).f7898b;
        int i7 = this.f7902f;
        e eVar3 = this.f7905i;
        e eVar4 = this.f7904h;
        if (i7 == 0) {
            Q.c cVar = eVar.f7442J;
            Q.c cVar2 = eVar2.f7444L;
            e eVarH = n.h(cVar, 0);
            int iE = cVar.e();
            Q.e eVarL = l();
            if (eVarL != null) {
                iE = eVarL.f7442J.e();
            }
            if (eVarH != null) {
                n.a(eVar4, eVarH, iE);
            }
            e eVarH2 = n.h(cVar2, 0);
            int iE2 = cVar2.e();
            Q.e eVarM = m();
            if (eVarM != null) {
                iE2 = eVarM.f7444L.e();
            }
            if (eVarH2 != null) {
                n.a(eVar3, eVarH2, -iE2);
            }
        } else {
            Q.c cVar3 = eVar.f7443K;
            Q.c cVar4 = eVar2.f7445M;
            e eVarH3 = n.h(cVar3, 1);
            int iE3 = cVar3.e();
            Q.e eVarL2 = l();
            if (eVarL2 != null) {
                iE3 = eVarL2.f7443K.e();
            }
            if (eVarH3 != null) {
                n.a(eVar4, eVarH3, iE3);
            }
            e eVarH4 = n.h(cVar4, 1);
            int iE4 = cVar4.e();
            Q.e eVarM2 = m();
            if (eVarM2 != null) {
                iE4 = eVarM2.f7445M.e();
            }
            if (eVarH4 != null) {
                n.a(eVar3, eVarH4, -iE4);
            }
        }
        eVar4.f7872a = this;
        eVar3.f7872a = this;
    }

    @Override // R.n
    public final void d() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f7862k;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((n) arrayList.get(i7)).d();
            i7++;
        }
    }

    @Override // R.n
    public final void e() {
        this.f7899c = null;
        Iterator it = this.f7862k.iterator();
        while (it.hasNext()) {
            ((n) it.next()).e();
        }
    }

    @Override // R.n
    public final long i() {
        ArrayList arrayList = this.f7862k;
        int size = arrayList.size();
        long jI = 0;
        for (int i7 = 0; i7 < size; i7++) {
            n nVar = (n) arrayList.get(i7);
            jI = ((long) nVar.f7905i.f7877f) + nVar.i() + jI + ((long) nVar.f7904h.f7877f);
        }
        return jI;
    }

    @Override // R.n
    public final boolean j() {
        ArrayList arrayList = this.f7862k;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!((n) arrayList.get(i7)).j()) {
                return false;
            }
        }
        return true;
    }

    public final Q.e l() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f7862k;
            if (i7 >= arrayList.size()) {
                return null;
            }
            Q.e eVar = ((n) arrayList.get(i7)).f7898b;
            if (eVar.i0 != 8) {
                return eVar;
            }
            i7++;
        }
    }

    public final Q.e m() {
        ArrayList arrayList = this.f7862k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Q.e eVar = ((n) arrayList.get(size)).f7898b;
            if (eVar.i0 != 8) {
                return eVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f7902f == 0 ? "horizontal : " : "vertical : ");
        for (n nVar : this.f7862k) {
            sb2.append("<");
            sb2.append(nVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:294:0x00f0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00df  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x015b  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public final void update(Dependency dependency) {
        int i7;
        Q.d dVar;
        boolean z3;
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        float f11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        float f12;
        e eVar = this.f7904h;
        if (eVar.f7881j) {
            e eVar2 = this.f7905i;
            if (eVar2.f7881j) {
                Q.e eVar3 = this.f7898b.f7454V;
                boolean z8 = eVar3 instanceof Q.f ? ((Q.f) eVar3).f7522z0 : false;
                int i23 = eVar2.f7878g - eVar.f7878g;
                ArrayList arrayList = this.f7862k;
                int size = arrayList.size();
                int i24 = 0;
                while (true) {
                    i7 = -1;
                    if (i24 >= size) {
                        i24 = -1;
                        break;
                    } else if (((n) arrayList.get(i24)).f7898b.i0 != 8) {
                        break;
                    } else {
                        i24++;
                    }
                }
                int i25 = size - 1;
                for (int i26 = i25; i26 >= 0; i26--) {
                    if (((n) arrayList.get(i26)).f7898b.i0 != 8) {
                        i7 = i26;
                        break;
                    }
                }
                int i27 = 0;
                while (true) {
                    dVar = Q.d.f7430c;
                    if (i27 >= 2) {
                        z3 = z8;
                        f10 = 0.0f;
                        i10 = 0;
                        i11 = 0;
                        i12 = 0;
                        break;
                    }
                    f10 = 0.0f;
                    int i28 = 0;
                    i12 = 0;
                    int i29 = 0;
                    int i30 = 0;
                    while (i28 < size) {
                        n nVar = (n) arrayList.get(i28);
                        Q.e eVar4 = nVar.f7898b;
                        boolean z10 = z8;
                        int i31 = i27;
                        if (eVar4.i0 != 8) {
                            i30++;
                            if (i28 > 0 && i28 >= i24) {
                                i12 += nVar.f7904h.f7877f;
                            }
                            f fVar = nVar.f7901e;
                            int i32 = fVar.f7878g;
                            boolean z11 = nVar.f7900d != dVar;
                            if (z11) {
                                int i33 = this.f7902f;
                                if (i33 == 0 && !eVar4.f7463d.f7901e.f7881j) {
                                    return;
                                }
                                if (i33 == 1 && !eVar4.f7465e.f7901e.f7881j) {
                                    return;
                                } else {
                                    i21 = i12;
                                }
                            } else {
                                i21 = i12;
                                if (nVar.f7897a == 1 && i31 == 0) {
                                    i22 = fVar.f7884m;
                                    i29++;
                                } else {
                                    if (fVar.f7881j) {
                                        i22 = i32;
                                    }
                                    if (z11) {
                                        i12 = i21 + i22;
                                    } else {
                                        i29++;
                                        f12 = eVar4.f7483n0[this.f7902f];
                                        if (f12 >= 0.0f) {
                                            f10 += f12;
                                        }
                                        i12 = i21;
                                    }
                                    if (i28 >= i25 && i28 < i7) {
                                        i12 += -nVar.f7905i.f7877f;
                                    }
                                }
                                z11 = true;
                                if (z11) {
                                    i29++;
                                    f12 = eVar4.f7483n0[this.f7902f];
                                    if (f12 >= 0.0f) {
                                        f10 += f12;
                                    }
                                    i12 = i21;
                                } else {
                                    i12 = i21 + i22;
                                }
                                if (i28 >= i25) {
                                }
                            }
                            i22 = i32;
                            if (z11) {
                                i29++;
                                f12 = eVar4.f7483n0[this.f7902f];
                                if (f12 >= 0.0f) {
                                    f10 += f12;
                                }
                                i12 = i21;
                            } else {
                                i12 = i21 + i22;
                            }
                            if (i28 >= i25) {
                            }
                        }
                        i28++;
                        z8 = z10;
                        i27 = i31;
                    }
                    z3 = z8;
                    int i34 = i27;
                    if (i12 < i23 || i29 == 0) {
                        i10 = i29;
                        i11 = i30;
                        break;
                    } else {
                        i27 = i34 + 1;
                        z8 = z3;
                    }
                }
                int i35 = eVar.f7878g;
                if (z3) {
                    i35 = eVar2.f7878g;
                }
                float f13 = 0.5f;
                if (i12 > i23) {
                    i35 = z3 ? i35 + ((int) (((i12 - i23) / 2.0f) + 0.5f)) : i35 - ((int) (((i12 - i23) / 2.0f) + 0.5f));
                }
                if (i10 > 0) {
                    float f14 = i23 - i12;
                    int i36 = (int) ((f14 / i10) + 0.5f);
                    int i37 = 0;
                    int i38 = 0;
                    while (i37 < size) {
                        float f15 = f13;
                        n nVar2 = (n) arrayList.get(i37);
                        int i39 = i35;
                        Q.e eVar5 = nVar2.f7898b;
                        int i40 = i10;
                        float f16 = f14;
                        if (eVar5.i0 != 8 && nVar2.f7900d == dVar) {
                            f fVar2 = nVar2.f7901e;
                            if (fVar2.f7881j) {
                                i18 = i36;
                            } else {
                                if (f10 > 0.0f) {
                                    i17 = (int) (((eVar5.f7483n0[this.f7902f] * f16) / f10) + f15);
                                    i18 = i36;
                                } else {
                                    i17 = i36;
                                    i18 = i17;
                                }
                                if (this.f7902f == 0) {
                                    i19 = eVar5.f7496v;
                                    i20 = eVar5.f7495u;
                                } else {
                                    i19 = eVar5.f7499y;
                                    i20 = eVar5.f7498x;
                                }
                                int iMax = Math.max(i20, nVar2.f7897a == 1 ? Math.min(i17, fVar2.f7884m) : i17);
                                if (i19 > 0) {
                                    iMax = Math.min(i19, iMax);
                                }
                                if (iMax != i17) {
                                    i38++;
                                    i17 = iMax;
                                }
                                fVar2.c(i17);
                            }
                        } else {
                            i18 = i36;
                        }
                        i37++;
                        i35 = i39;
                        f13 = f15;
                        i10 = i40;
                        f14 = f16;
                        i36 = i18;
                    }
                    i13 = i35;
                    f11 = f13;
                    int i41 = i10;
                    if (i38 > 0) {
                        i10 = i41 - i38;
                        i12 = 0;
                        for (int i42 = 0; i42 < size; i42++) {
                            n nVar3 = (n) arrayList.get(i42);
                            if (nVar3.f7898b.i0 != 8) {
                                if (i42 > 0 && i42 >= i24) {
                                    i12 += nVar3.f7904h.f7877f;
                                }
                                i12 += nVar3.f7901e.f7878g;
                                if (i42 < i25 && i42 < i7) {
                                    i12 += -nVar3.f7905i.f7877f;
                                }
                            }
                        }
                    } else {
                        i10 = i41;
                    }
                    i15 = 2;
                    if (this.f7863l == 2 && i38 == 0) {
                        i14 = 0;
                        this.f7863l = 0;
                    } else {
                        i14 = 0;
                    }
                } else {
                    i13 = i35;
                    f11 = 0.5f;
                    i14 = 0;
                    i15 = 2;
                }
                if (i12 > i23) {
                    this.f7863l = i15;
                }
                if (i11 > 0 && i10 == 0 && i24 == i7) {
                    this.f7863l = i15;
                }
                int i43 = this.f7863l;
                if (i43 == 1) {
                    int i44 = i11 > 1 ? (i23 - i12) / (i11 - 1) : i11 == 1 ? (i23 - i12) / 2 : i14;
                    if (i10 > 0) {
                        i44 = i14;
                    }
                    int i45 = i13;
                    for (int i46 = i14; i46 < size; i46++) {
                        n nVar4 = (n) arrayList.get(z3 ? size - (i46 + 1) : i46);
                        int i47 = nVar4.f7898b.i0;
                        e eVar6 = nVar4.f7905i;
                        e eVar7 = nVar4.f7904h;
                        if (i47 == 8) {
                            eVar7.c(i45);
                            eVar6.c(i45);
                        } else {
                            if (i46 > 0) {
                                i45 = z3 ? i45 - i44 : i45 + i44;
                            }
                            if (i46 > 0 && i46 >= i24) {
                                i45 = z3 ? i45 - eVar7.f7877f : i45 + eVar7.f7877f;
                            }
                            if (z3) {
                                eVar6.c(i45);
                            } else {
                                eVar7.c(i45);
                            }
                            f fVar3 = nVar4.f7901e;
                            int i48 = fVar3.f7878g;
                            if (nVar4.f7900d == dVar) {
                                i16 = i45;
                                if (nVar4.f7897a == 1) {
                                    i48 = fVar3.f7884m;
                                }
                            } else {
                                i16 = i45;
                            }
                            i45 = z3 ? i16 - i48 : i16 + i48;
                            if (z3) {
                                eVar7.c(i45);
                            } else {
                                eVar6.c(i45);
                            }
                            nVar4.f7903g = true;
                            if (i46 < i25 && i46 < i7) {
                                i45 = z3 ? i45 - (-eVar6.f7877f) : i45 + (-eVar6.f7877f);
                            }
                        }
                    }
                    return;
                }
                if (i43 == 0) {
                    int i49 = (i23 - i12) / (i11 + 1);
                    if (i10 > 0) {
                        i49 = i14;
                    }
                    int i50 = i13;
                    for (int i51 = i14; i51 < size; i51++) {
                        n nVar5 = (n) arrayList.get(z3 ? size - (i51 + 1) : i51);
                        int i52 = nVar5.f7898b.i0;
                        e eVar8 = nVar5.f7905i;
                        e eVar9 = nVar5.f7904h;
                        if (i52 == 8) {
                            eVar9.c(i50);
                            eVar8.c(i50);
                        } else {
                            int i53 = z3 ? i50 - i49 : i50 + i49;
                            if (i51 > 0 && i51 >= i24) {
                                i53 = z3 ? i53 - eVar9.f7877f : i53 + eVar9.f7877f;
                            }
                            if (z3) {
                                eVar8.c(i53);
                            } else {
                                eVar9.c(i53);
                            }
                            f fVar4 = nVar5.f7901e;
                            int iMin = fVar4.f7878g;
                            if (nVar5.f7900d == dVar && nVar5.f7897a == 1) {
                                iMin = Math.min(iMin, fVar4.f7884m);
                            }
                            i50 = z3 ? i53 - iMin : i53 + iMin;
                            if (z3) {
                                eVar9.c(i50);
                            } else {
                                eVar8.c(i50);
                            }
                            if (i51 < i25 && i51 < i7) {
                                i50 = z3 ? i50 - (-eVar8.f7877f) : i50 + (-eVar8.f7877f);
                            }
                        }
                    }
                    return;
                }
                if (i43 == 2) {
                    float f17 = this.f7902f == 0 ? this.f7898b.f7468f0 : this.f7898b.f7470g0;
                    if (z3) {
                        f17 = 1.0f - f17;
                    }
                    int i54 = (int) (((i23 - i12) * f17) + f11);
                    if (i54 < 0 || i10 > 0) {
                        i54 = i14;
                    }
                    int i55 = z3 ? i13 - i54 : i13 + i54;
                    for (int i56 = i14; i56 < size; i56++) {
                        n nVar6 = (n) arrayList.get(z3 ? size - (i56 + 1) : i56);
                        int i57 = nVar6.f7898b.i0;
                        e eVar10 = nVar6.f7905i;
                        e eVar11 = nVar6.f7904h;
                        if (i57 == 8) {
                            eVar11.c(i55);
                            eVar10.c(i55);
                        } else {
                            if (i56 > 0 && i56 >= i24) {
                                i55 = z3 ? i55 - eVar11.f7877f : i55 + eVar11.f7877f;
                            }
                            if (z3) {
                                eVar10.c(i55);
                            } else {
                                eVar11.c(i55);
                            }
                            f fVar5 = nVar6.f7901e;
                            int i58 = fVar5.f7878g;
                            if (nVar6.f7900d == dVar && nVar6.f7897a == 1) {
                                i58 = fVar5.f7884m;
                            }
                            i55 = z3 ? i55 - i58 : i55 + i58;
                            if (z3) {
                                eVar11.c(i55);
                            } else {
                                eVar10.c(i55);
                            }
                            if (i56 < i25 && i56 < i7) {
                                i55 = z3 ? i55 - (-eVar10.f7877f) : i55 + (-eVar10.f7877f);
                            }
                        }
                    }
                }
            }
        }
    }
}
