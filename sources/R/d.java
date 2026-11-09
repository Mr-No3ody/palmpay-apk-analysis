package R;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer;
import androidx.constraintlayout.core.widgets.analyzer.Dependency;
import com.horcrux.svg.d0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q.f f7864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Q.f f7867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f7868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BasicMeasure$Measurer f7869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f7870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f7871h;

    public final void a(e eVar, int i7, ArrayList arrayList, k kVar) {
        n nVar = eVar.f7875d;
        if (nVar.f7899c == null) {
            Q.f fVar = this.f7864a;
            if (nVar == fVar.f7463d || nVar == fVar.f7465e) {
                return;
            }
            if (kVar == null) {
                kVar = new k();
                kVar.f7887a = null;
                kVar.f7888b = new ArrayList();
                kVar.f7887a = nVar;
                arrayList.add(kVar);
            }
            nVar.f7899c = kVar;
            kVar.f7888b.add(nVar);
            e eVar2 = nVar.f7904h;
            for (Dependency dependency : eVar2.f7882k) {
                if (dependency instanceof e) {
                    a((e) dependency, i7, arrayList, kVar);
                }
            }
            e eVar3 = nVar.f7905i;
            for (Dependency dependency2 : eVar3.f7882k) {
                if (dependency2 instanceof e) {
                    a((e) dependency2, i7, arrayList, kVar);
                }
            }
            if (i7 == 1 && (nVar instanceof l)) {
                for (Dependency dependency3 : ((l) nVar).f7889k.f7882k) {
                    if (dependency3 instanceof e) {
                        a((e) dependency3, i7, arrayList, kVar);
                    }
                }
            }
            Iterator it = eVar2.f7883l.iterator();
            while (it.hasNext()) {
                a((e) it.next(), i7, arrayList, kVar);
            }
            Iterator it2 = eVar3.f7883l.iterator();
            while (it2.hasNext()) {
                a((e) it2.next(), i7, arrayList, kVar);
            }
            if (i7 == 1 && (nVar instanceof l)) {
                Iterator it3 = ((l) nVar).f7889k.f7883l.iterator();
                while (it3.hasNext()) {
                    a((e) it3.next(), i7, arrayList, kVar);
                }
            }
        }
    }

    public final void b(Q.f fVar) {
        Q.d dVar;
        Q.d dVar2;
        float f10;
        Q.d dVar3;
        Q.d dVar4;
        Q.d dVar5;
        Q.d dVar6;
        Iterator it = fVar.f7517u0.iterator();
        while (it.hasNext()) {
            Q.e eVar = (Q.e) it.next();
            Q.d[] dVarArr = eVar.f7453U;
            Q.d dVar7 = dVarArr[0];
            Q.d dVar8 = dVarArr[1];
            if (eVar.i0 == 8) {
                eVar.f7459a = true;
            } else {
                float f11 = eVar.f7497w;
                Q.d dVar9 = Q.d.f7430c;
                if (f11 < 1.0f && dVar7 == dVar9) {
                    eVar.f7490r = 2;
                }
                float f12 = eVar.f7500z;
                if (f12 < 1.0f && dVar8 == dVar9) {
                    eVar.f7492s = 2;
                }
                float f13 = eVar.f7457Y;
                Q.d dVar10 = Q.d.f7429b;
                Q.d dVar11 = Q.d.f7428a;
                if (f13 > 0.0f) {
                    if (dVar7 == dVar9 && (dVar8 == dVar10 || dVar8 == dVar11)) {
                        eVar.f7490r = 3;
                    } else if (dVar8 == dVar9 && (dVar7 == dVar10 || dVar7 == dVar11)) {
                        eVar.f7492s = 3;
                    } else if (dVar7 == dVar9 && dVar8 == dVar9) {
                        if (eVar.f7490r == 0) {
                            eVar.f7490r = 3;
                        }
                        if (eVar.f7492s == 0) {
                            eVar.f7492s = 3;
                        }
                    }
                }
                Q.c cVar = eVar.f7444L;
                Q.c cVar2 = eVar.f7442J;
                if (dVar7 == dVar9 && eVar.f7490r == 1 && (cVar2.f7424f == null || cVar.f7424f == null)) {
                    dVar7 = dVar10;
                }
                Q.c cVar3 = eVar.f7445M;
                Q.c cVar4 = eVar.f7443K;
                if (dVar8 == dVar9 && eVar.f7492s == 1 && (cVar4.f7424f == null || cVar3.f7424f == null)) {
                    dVar8 = dVar10;
                }
                j jVar = eVar.f7463d;
                jVar.f7900d = dVar7;
                int i7 = eVar.f7490r;
                jVar.f7897a = i7;
                l lVar = eVar.f7465e;
                lVar.f7900d = dVar8;
                Iterator it2 = it;
                int i10 = eVar.f7492s;
                lVar.f7897a = i10;
                Q.d dVar12 = Q.d.f7431d;
                if ((dVar7 == dVar12 || dVar7 == dVar11 || dVar7 == dVar10) && (dVar8 == dVar12 || dVar8 == dVar11 || dVar8 == dVar10)) {
                    Q.d dVar13 = dVar8;
                    int iR = eVar.r();
                    if (dVar7 == dVar12) {
                        iR = (fVar.r() - cVar2.f7425g) - cVar.f7425g;
                        dVar7 = dVar11;
                    }
                    int i11 = iR;
                    int iL = eVar.l();
                    if (dVar13 == dVar12) {
                        iL = (fVar.l() - cVar4.f7425g) - cVar3.f7425g;
                        dVar13 = dVar11;
                    }
                    f(eVar, dVar7, i11, dVar13, iL);
                    eVar.f7463d.f7901e.c(eVar.r());
                    eVar.f7465e.f7901e.c(eVar.l());
                    eVar.f7459a = true;
                } else {
                    Q.c[] cVarArr = eVar.f7450R;
                    if (dVar7 != dVar9 || (dVar8 != dVar10 && dVar8 != dVar11)) {
                        dVar = dVar7;
                        dVar2 = dVar10;
                        f10 = f12;
                        dVar3 = dVar11;
                        dVar4 = dVar8;
                    } else if (i7 == 3) {
                        if (dVar8 == dVar10) {
                            f(eVar, dVar10, 0, dVar10, 0);
                        }
                        int iL2 = eVar.l();
                        f(eVar, dVar11, (int) ((iL2 * eVar.f7457Y) + 0.5f), dVar11, iL2);
                        eVar.f7463d.f7901e.c(eVar.r());
                        eVar.f7465e.f7901e.c(eVar.l());
                        eVar.f7459a = true;
                    } else {
                        dVar = dVar7;
                        dVar2 = dVar10;
                        dVar3 = dVar11;
                        if (i7 == 1) {
                            f(eVar, dVar2, 0, dVar8, 0);
                            eVar.f7463d.f7901e.f7884m = eVar.r();
                        } else {
                            f10 = f12;
                            dVar4 = dVar8;
                            if (i7 == 2) {
                                Q.d dVar14 = fVar.f7453U[0];
                                if (dVar14 == dVar3 || dVar14 == dVar12) {
                                    f(eVar, dVar3, (int) ((f11 * fVar.r()) + 0.5f), dVar4, eVar.l());
                                    eVar.f7463d.f7901e.c(eVar.r());
                                    eVar.f7465e.f7901e.c(eVar.l());
                                    eVar.f7459a = true;
                                }
                            } else if (cVarArr[0].f7424f == null || cVarArr[1].f7424f == null) {
                                f(eVar, dVar2, 0, dVar4, 0);
                                eVar.f7463d.f7901e.c(eVar.r());
                                eVar.f7465e.f7901e.c(eVar.l());
                                eVar.f7459a = true;
                            }
                        }
                    }
                    if (dVar4 != dVar9 || (dVar != dVar2 && dVar != dVar3)) {
                        Q.d dVar15 = dVar;
                        dVar5 = dVar2;
                        dVar6 = dVar15;
                    } else if (i10 == 3) {
                        if (dVar == dVar2) {
                            f(eVar, dVar2, 0, dVar2, 0);
                        }
                        int iR2 = eVar.r();
                        float f14 = eVar.f7457Y;
                        if (eVar.f7458Z == -1) {
                            f14 = 1.0f / f14;
                        }
                        f(eVar, dVar3, iR2, dVar3, (int) ((iR2 * f14) + 0.5f));
                        eVar.f7463d.f7901e.c(eVar.r());
                        eVar.f7465e.f7901e.c(eVar.l());
                        eVar.f7459a = true;
                    } else if (i10 == 1) {
                        f(eVar, dVar, 0, dVar2, 0);
                        eVar.f7465e.f7901e.f7884m = eVar.l();
                    } else {
                        Q.d dVar16 = dVar;
                        dVar5 = dVar2;
                        if (i10 == 2) {
                            Q.d dVar17 = fVar.f7453U[1];
                            if (dVar17 == dVar3 || dVar17 == dVar12) {
                                f(eVar, dVar16, eVar.r(), dVar3, (int) ((f10 * fVar.l()) + 0.5f));
                                eVar.f7463d.f7901e.c(eVar.r());
                                eVar.f7465e.f7901e.c(eVar.l());
                                eVar.f7459a = true;
                            } else {
                                dVar6 = dVar16;
                            }
                        } else {
                            dVar6 = dVar16;
                            if (cVarArr[2].f7424f == null || cVarArr[3].f7424f == null) {
                                f(eVar, dVar5, 0, dVar4, 0);
                                eVar.f7463d.f7901e.c(eVar.r());
                                eVar.f7465e.f7901e.c(eVar.l());
                                eVar.f7459a = true;
                            }
                        }
                    }
                    if (dVar6 == dVar9 && dVar4 == dVar9) {
                        if (i7 == 1 || i10 == 1) {
                            f(eVar, dVar5, 0, dVar5, 0);
                            eVar.f7463d.f7901e.f7884m = eVar.r();
                            eVar.f7465e.f7901e.f7884m = eVar.l();
                        } else if (i10 == 2 && i7 == 2) {
                            Q.d[] dVarArr2 = fVar.f7453U;
                            if (dVarArr2[0] == dVar3 && dVarArr2[1] == dVar3) {
                                f(eVar, dVar3, (int) ((f11 * fVar.r()) + 0.5f), dVar3, (int) ((f10 * fVar.l()) + 0.5f));
                                eVar.f7463d.f7901e.c(eVar.r());
                                eVar.f7465e.f7901e.c(eVar.l());
                                eVar.f7459a = true;
                            }
                        }
                    }
                }
                it = it2;
            }
        }
    }

    public final void c() {
        ArrayList<n> arrayList = this.f7868e;
        arrayList.clear();
        Q.f fVar = this.f7867d;
        fVar.f7463d.e();
        fVar.f7465e.e();
        arrayList.add(fVar.f7463d);
        arrayList.add(fVar.f7465e);
        HashSet hashSet = null;
        for (Q.e eVar : fVar.f7517u0) {
            if (eVar instanceof Q.i) {
                h hVar = new h(eVar);
                eVar.f7463d.e();
                eVar.f7465e.e();
                hVar.f7902f = ((Q.i) eVar).f7566y0;
                arrayList.add(hVar);
            } else {
                if (eVar.y()) {
                    if (eVar.f7461b == null) {
                        eVar.f7461b = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f7461b);
                } else {
                    arrayList.add(eVar.f7463d);
                }
                if (eVar.z()) {
                    if (eVar.f7462c == null) {
                        eVar.f7462c = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f7462c);
                } else {
                    arrayList.add(eVar.f7465e);
                }
                if (eVar instanceof Q.j) {
                    arrayList.add(new i(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n) it.next()).e();
        }
        for (n nVar : arrayList) {
            if (nVar.f7898b != fVar) {
                nVar.c();
            }
        }
        ArrayList arrayList2 = this.f7871h;
        arrayList2.clear();
        Q.f fVar2 = this.f7864a;
        e(fVar2.f7463d, 0, arrayList2);
        e(fVar2.f7465e, 1, arrayList2);
        this.f7865b = false;
    }

    public final int d(Q.f fVar, int i7) {
        ArrayList arrayList;
        int i10;
        int i11;
        long jI;
        float f10;
        long j6;
        ArrayList arrayList2 = this.f7871h;
        int size = arrayList2.size();
        int i12 = 0;
        long jMax = 0;
        while (i12 < size) {
            n nVar = ((k) arrayList2.get(i12)).f7887a;
            if (!(nVar instanceof c) ? !(i7 != 0 ? (nVar instanceof l) : (nVar instanceof j)) : ((c) nVar).f7902f != i7) {
                e eVar = (i7 == 0 ? fVar.f7463d : fVar.f7465e).f7904h;
                e eVar2 = (i7 == 0 ? fVar.f7463d : fVar.f7465e).f7905i;
                boolean zContains = nVar.f7904h.f7883l.contains(eVar);
                e eVar3 = nVar.f7905i;
                boolean zContains2 = eVar3.f7883l.contains(eVar2);
                long jI2 = nVar.i();
                e eVar4 = nVar.f7904h;
                if (zContains && zContains2) {
                    long jB = k.b(eVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i10 = size;
                    long jA = k.a(eVar3, 0L);
                    long j10 = jB - jI2;
                    int i13 = eVar3.f7877f;
                    arrayList = arrayList3;
                    i11 = i12;
                    if (j10 >= (-i13)) {
                        j10 += (long) i13;
                    }
                    long j11 = (-jA) - jI2;
                    long j12 = eVar4.f7877f;
                    long j13 = j11 - j12;
                    if (j13 >= j12) {
                        j13 -= j12;
                    }
                    Q.e eVar5 = nVar.f7898b;
                    if (i7 == 0) {
                        f10 = eVar5.f7468f0;
                    } else if (i7 == 1) {
                        f10 = eVar5.f7470g0;
                    } else {
                        eVar5.getClass();
                        f10 = -1.0f;
                    }
                    if (f10 > 0.0f) {
                        j6 = (long) ((j10 / (1.0f - f10)) + (j13 / f10));
                    } else {
                        j6 = 0;
                    }
                    float f11 = j6;
                    jI = (((long) eVar4.f7877f) + ((((long) ((f11 * f10) + 0.5f)) + jI2) + ((long) d0.e(1.0f, f10, f11, 0.5f)))) - ((long) eVar3.f7877f);
                } else {
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i12;
                    if (zContains) {
                        jI = Math.max(k.b(eVar4, eVar4.f7877f), ((long) eVar4.f7877f) + jI2);
                    } else if (zContains2) {
                        jI = Math.max(-k.a(eVar3, eVar3.f7877f), ((long) (-eVar3.f7877f)) + jI2);
                    } else {
                        jI = (nVar.i() + ((long) eVar4.f7877f)) - ((long) eVar3.f7877f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i10 = size;
                i11 = i12;
                jI = 0;
            }
            jMax = Math.max(jMax, jI);
            i12 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        return (int) jMax;
    }

    public final void e(n nVar, int i7, ArrayList arrayList) {
        e eVar;
        Iterator it = nVar.f7904h.f7882k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            eVar = nVar.f7905i;
            if (!zHasNext) {
                break;
            }
            Dependency dependency = (Dependency) it.next();
            if (dependency instanceof e) {
                a((e) dependency, i7, arrayList, null);
            } else if (dependency instanceof n) {
                a(((n) dependency).f7904h, i7, arrayList, null);
            }
        }
        for (Dependency dependency2 : eVar.f7882k) {
            if (dependency2 instanceof e) {
                a((e) dependency2, i7, arrayList, null);
            } else if (dependency2 instanceof n) {
                a(((n) dependency2).f7905i, i7, arrayList, null);
            }
        }
        if (i7 == 1) {
            for (Dependency dependency3 : ((l) nVar).f7889k.f7882k) {
                if (dependency3 instanceof e) {
                    a((e) dependency3, i7, arrayList, null);
                }
            }
        }
    }

    public final void f(Q.e eVar, Q.d dVar, int i7, Q.d dVar2, int i10) {
        b bVar = this.f7870g;
        bVar.f7852a = dVar;
        bVar.f7853b = dVar2;
        bVar.f7854c = i7;
        bVar.f7855d = i10;
        this.f7869f.measure(eVar, bVar);
        eVar.P(bVar.f7856e);
        eVar.M(bVar.f7857f);
        eVar.f7437E = bVar.f7859h;
        eVar.J(bVar.f7858g);
    }

    public final void g() {
        a aVar;
        for (Q.e eVar : this.f7864a.f7517u0) {
            if (!eVar.f7459a) {
                Q.d[] dVarArr = eVar.f7453U;
                boolean z3 = false;
                Q.d dVar = dVarArr[0];
                Q.d dVar2 = dVarArr[1];
                int i7 = eVar.f7490r;
                int i10 = eVar.f7492s;
                Q.d dVar3 = Q.d.f7429b;
                Q.d dVar4 = Q.d.f7430c;
                boolean z8 = dVar == dVar3 || (dVar == dVar4 && i7 == 1);
                if (dVar2 == dVar3 || (dVar2 == dVar4 && i10 == 1)) {
                    z3 = true;
                }
                f fVar = eVar.f7463d.f7901e;
                boolean z10 = fVar.f7881j;
                f fVar2 = eVar.f7465e.f7901e;
                boolean z11 = fVar2.f7881j;
                boolean z12 = z8;
                Q.d dVar5 = Q.d.f7428a;
                if (z10 && z11) {
                    f(eVar, dVar5, fVar.f7878g, dVar5, fVar2.f7878g);
                    eVar.f7459a = true;
                } else if (z10 && z3) {
                    f(eVar, dVar5, fVar.f7878g, dVar3, fVar2.f7878g);
                    if (dVar2 == dVar4) {
                        eVar.f7465e.f7901e.f7884m = eVar.l();
                    } else {
                        eVar.f7465e.f7901e.c(eVar.l());
                        eVar.f7459a = true;
                    }
                } else if (z11 && z12) {
                    f(eVar, dVar3, fVar.f7878g, dVar5, fVar2.f7878g);
                    if (dVar == dVar4) {
                        eVar.f7463d.f7901e.f7884m = eVar.r();
                    } else {
                        eVar.f7463d.f7901e.c(eVar.r());
                        eVar.f7459a = true;
                    }
                }
                if (eVar.f7459a && (aVar = eVar.f7465e.f7890l) != null) {
                    aVar.c(eVar.c0);
                }
            }
        }
    }
}
