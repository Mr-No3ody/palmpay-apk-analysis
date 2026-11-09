package R;

import androidx.camera.camera2.internal.F;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.analyzer.Dependency;

/* JADX INFO: loaded from: classes.dex */
public final class l extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f7889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f7890l;

    @Override // R.n
    public final void c() {
        Q.e eVar;
        Q.e eVar2;
        Q.e eVar3;
        Q.e eVar4;
        Q.e eVar5 = this.f7898b;
        boolean z3 = eVar5.f7459a;
        f fVar = this.f7901e;
        if (z3) {
            fVar.c(eVar5.l());
        }
        boolean z8 = fVar.f7881j;
        Q.d dVar = Q.d.f7431d;
        Q.d dVar2 = Q.d.f7428a;
        Q.d dVar3 = Q.d.f7430c;
        e eVar6 = this.f7905i;
        e eVar7 = this.f7904h;
        if (!z8) {
            Q.e eVar8 = this.f7898b;
            this.f7900d = eVar8.f7453U[1];
            if (eVar8.f7437E) {
                this.f7890l = new a(this);
            }
            Q.d dVar4 = this.f7900d;
            if (dVar4 != dVar3) {
                if (dVar4 == dVar && (eVar4 = this.f7898b.f7454V) != null && eVar4.f7453U[1] == dVar2) {
                    int iL = (eVar4.l() - this.f7898b.f7443K.e()) - this.f7898b.f7445M.e();
                    n.a(eVar7, eVar4.f7465e.f7904h, this.f7898b.f7443K.e());
                    n.a(eVar6, eVar4.f7465e.f7905i, -this.f7898b.f7445M.e());
                    fVar.c(iL);
                    return;
                }
                if (dVar4 == dVar2) {
                    fVar.c(this.f7898b.l());
                }
            }
        } else if (this.f7900d == dVar && (eVar2 = (eVar = this.f7898b).f7454V) != null && eVar2.f7453U[1] == dVar2) {
            n.a(eVar7, eVar2.f7465e.f7904h, eVar.f7443K.e());
            n.a(eVar6, eVar2.f7465e.f7905i, -this.f7898b.f7445M.e());
            return;
        }
        boolean z10 = fVar.f7881j;
        e eVar9 = this.f7889k;
        if (z10) {
            Q.e eVar10 = this.f7898b;
            if (eVar10.f7459a) {
                Q.c[] cVarArr = eVar10.f7450R;
                Q.c cVar = cVarArr[2];
                Q.c cVar2 = cVar.f7424f;
                if (cVar2 != null && cVarArr[3].f7424f != null) {
                    if (eVar10.z()) {
                        eVar7.f7877f = this.f7898b.f7450R[2].e();
                        eVar6.f7877f = -this.f7898b.f7450R[3].e();
                    } else {
                        e eVarG = n.g(this.f7898b.f7450R[2]);
                        if (eVarG != null) {
                            n.a(eVar7, eVarG, this.f7898b.f7450R[2].e());
                        }
                        e eVarG2 = n.g(this.f7898b.f7450R[3]);
                        if (eVarG2 != null) {
                            n.a(eVar6, eVarG2, -this.f7898b.f7450R[3].e());
                        }
                        eVar7.f7873b = true;
                        eVar6.f7873b = true;
                    }
                    Q.e eVar11 = this.f7898b;
                    if (eVar11.f7437E) {
                        n.a(eVar9, eVar7, eVar11.c0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    e eVarG3 = n.g(cVar);
                    if (eVarG3 != null) {
                        n.a(eVar7, eVarG3, this.f7898b.f7450R[2].e());
                        n.a(eVar6, eVar7, fVar.f7878g);
                        Q.e eVar12 = this.f7898b;
                        if (eVar12.f7437E) {
                            n.a(eVar9, eVar7, eVar12.c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Q.c cVar3 = cVarArr[3];
                if (cVar3.f7424f != null) {
                    e eVarG4 = n.g(cVar3);
                    if (eVarG4 != null) {
                        n.a(eVar6, eVarG4, -this.f7898b.f7450R[3].e());
                        n.a(eVar7, eVar6, -fVar.f7878g);
                    }
                    Q.e eVar13 = this.f7898b;
                    if (eVar13.f7437E) {
                        n.a(eVar9, eVar7, eVar13.c0);
                        return;
                    }
                    return;
                }
                Q.c cVar4 = cVarArr[4];
                if (cVar4.f7424f != null) {
                    e eVarG5 = n.g(cVar4);
                    if (eVarG5 != null) {
                        n.a(eVar9, eVarG5, 0);
                        n.a(eVar7, eVar9, -this.f7898b.c0);
                        n.a(eVar6, eVar7, fVar.f7878g);
                        return;
                    }
                    return;
                }
                if ((eVar10 instanceof Helper) || eVar10.f7454V == null || eVar10.j(7).f7424f != null) {
                    return;
                }
                Q.e eVar14 = this.f7898b;
                n.a(eVar7, eVar14.f7454V.f7465e.f7904h, eVar14.t());
                n.a(eVar6, eVar7, fVar.f7878g);
                Q.e eVar15 = this.f7898b;
                if (eVar15.f7437E) {
                    n.a(eVar9, eVar7, eVar15.c0);
                    return;
                }
                return;
            }
        }
        if (z10 || this.f7900d != dVar3) {
            fVar.a(this);
        } else {
            Q.e eVar16 = this.f7898b;
            int i7 = eVar16.f7492s;
            if (i7 == 2) {
                Q.e eVar17 = eVar16.f7454V;
                if (eVar17 != null) {
                    f fVar2 = eVar17.f7465e.f7901e;
                    fVar.f7883l.add(fVar2);
                    fVar2.f7882k.add(fVar);
                    fVar.f7873b = true;
                    fVar.f7882k.add(eVar7);
                    fVar.f7882k.add(eVar6);
                }
            } else if (i7 == 3 && !eVar16.z()) {
                Q.e eVar18 = this.f7898b;
                if (eVar18.f7490r != 3) {
                    f fVar3 = eVar18.f7463d.f7901e;
                    fVar.f7883l.add(fVar3);
                    fVar3.f7882k.add(fVar);
                    fVar.f7873b = true;
                    fVar.f7882k.add(eVar7);
                    fVar.f7882k.add(eVar6);
                }
            }
        }
        Q.e eVar19 = this.f7898b;
        Q.c[] cVarArr2 = eVar19.f7450R;
        Q.c cVar5 = cVarArr2[2];
        Q.c cVar6 = cVar5.f7424f;
        if (cVar6 != null && cVarArr2[3].f7424f != null) {
            if (eVar19.z()) {
                eVar7.f7877f = this.f7898b.f7450R[2].e();
                eVar6.f7877f = -this.f7898b.f7450R[3].e();
            } else {
                e eVarG6 = n.g(this.f7898b.f7450R[2]);
                e eVarG7 = n.g(this.f7898b.f7450R[3]);
                if (eVarG6 != null) {
                    eVarG6.a(this);
                }
                if (eVarG7 != null) {
                    eVarG7.a(this);
                }
                this.f7906j = 4;
            }
            if (this.f7898b.f7437E) {
                b(eVar9, eVar7, 1, this.f7890l);
            }
        } else if (cVar6 != null) {
            e eVarG8 = n.g(cVar5);
            if (eVarG8 != null) {
                n.a(eVar7, eVarG8, this.f7898b.f7450R[2].e());
                b(eVar6, eVar7, 1, fVar);
                if (this.f7898b.f7437E) {
                    b(eVar9, eVar7, 1, this.f7890l);
                }
                if (this.f7900d == dVar3) {
                    Q.e eVar20 = this.f7898b;
                    if (eVar20.f7457Y > 0.0f) {
                        j jVar = eVar20.f7463d;
                        if (jVar.f7900d == dVar3) {
                            jVar.f7901e.f7882k.add(fVar);
                            fVar.f7883l.add(this.f7898b.f7463d.f7901e);
                            fVar.f7872a = this;
                        }
                    }
                }
            }
        } else {
            Q.c cVar7 = cVarArr2[3];
            if (cVar7.f7424f != null) {
                e eVarG9 = n.g(cVar7);
                if (eVarG9 != null) {
                    n.a(eVar6, eVarG9, -this.f7898b.f7450R[3].e());
                    b(eVar7, eVar6, -1, fVar);
                    if (this.f7898b.f7437E) {
                        b(eVar9, eVar7, 1, this.f7890l);
                    }
                }
            } else {
                Q.c cVar8 = cVarArr2[4];
                if (cVar8.f7424f != null) {
                    e eVarG10 = n.g(cVar8);
                    if (eVarG10 != null) {
                        n.a(eVar9, eVarG10, 0);
                        b(eVar7, eVar9, -1, this.f7890l);
                        b(eVar6, eVar7, 1, fVar);
                    }
                } else if (!(eVar19 instanceof Helper) && (eVar3 = eVar19.f7454V) != null) {
                    n.a(eVar7, eVar3.f7465e.f7904h, eVar19.t());
                    b(eVar6, eVar7, 1, fVar);
                    if (this.f7898b.f7437E) {
                        b(eVar9, eVar7, 1, this.f7890l);
                    }
                    if (this.f7900d == dVar3) {
                        Q.e eVar21 = this.f7898b;
                        if (eVar21.f7457Y > 0.0f) {
                            j jVar2 = eVar21.f7463d;
                            if (jVar2.f7900d == dVar3) {
                                jVar2.f7901e.f7882k.add(fVar);
                                fVar.f7883l.add(this.f7898b.f7463d.f7901e);
                                fVar.f7872a = this;
                            }
                        }
                    }
                }
            }
        }
        if (fVar.f7883l.size() == 0) {
            fVar.f7874c = true;
        }
    }

    @Override // R.n
    public final void d() {
        e eVar = this.f7904h;
        if (eVar.f7881j) {
            this.f7898b.b0 = eVar.f7878g;
        }
    }

    @Override // R.n
    public final void e() {
        this.f7899c = null;
        this.f7904h.b();
        this.f7905i.b();
        this.f7889k.b();
        this.f7901e.b();
        this.f7903g = false;
    }

    @Override // R.n
    public final boolean j() {
        return this.f7900d != Q.d.f7430c || this.f7898b.f7492s == 0;
    }

    public final void l() {
        this.f7903g = false;
        e eVar = this.f7904h;
        eVar.b();
        eVar.f7881j = false;
        e eVar2 = this.f7905i;
        eVar2.b();
        eVar2.f7881j = false;
        e eVar3 = this.f7889k;
        eVar3.b();
        eVar3.f7881j = false;
        this.f7901e.f7881j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f7898b.f7477k0;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public final void update(Dependency dependency) {
        float f10;
        float f11;
        float f12;
        int i7;
        if (F.i(this.f7906j) == 3) {
            Q.e eVar = this.f7898b;
            k(eVar.f7443K, eVar.f7445M, 1);
            return;
        }
        f fVar = this.f7901e;
        boolean z3 = fVar.f7874c;
        Q.d dVar = Q.d.f7430c;
        if (z3 && !fVar.f7881j && this.f7900d == dVar) {
            Q.e eVar2 = this.f7898b;
            int i10 = eVar2.f7492s;
            if (i10 == 2) {
                Q.e eVar3 = eVar2.f7454V;
                if (eVar3 != null) {
                    f fVar2 = eVar3.f7465e.f7901e;
                    if (fVar2.f7881j) {
                        fVar.c((int) ((fVar2.f7878g * eVar2.f7500z) + 0.5f));
                    }
                }
            } else if (i10 == 3) {
                f fVar3 = eVar2.f7463d.f7901e;
                if (fVar3.f7881j) {
                    int i11 = eVar2.f7458Z;
                    if (i11 != -1) {
                        if (i11 == 0) {
                            f12 = fVar3.f7878g * eVar2.f7457Y;
                            i7 = (int) (f12 + 0.5f);
                        } else if (i11 != 1) {
                            i7 = 0;
                        } else {
                            f10 = fVar3.f7878g;
                            f11 = eVar2.f7457Y;
                        }
                        fVar.c(i7);
                    } else {
                        f10 = fVar3.f7878g;
                        f11 = eVar2.f7457Y;
                    }
                    f12 = f10 / f11;
                    i7 = (int) (f12 + 0.5f);
                    fVar.c(i7);
                }
            }
        }
        e eVar4 = this.f7904h;
        if (eVar4.f7874c) {
            e eVar5 = this.f7905i;
            if (eVar5.f7874c) {
                if (eVar4.f7881j && eVar5.f7881j && fVar.f7881j) {
                    return;
                }
                if (!fVar.f7881j && this.f7900d == dVar) {
                    Q.e eVar6 = this.f7898b;
                    if (eVar6.f7490r == 0 && !eVar6.z()) {
                        e eVar7 = (e) eVar4.f7883l.get(0);
                        e eVar8 = (e) eVar5.f7883l.get(0);
                        int i12 = eVar7.f7878g + eVar4.f7877f;
                        int i13 = eVar8.f7878g + eVar5.f7877f;
                        eVar4.c(i12);
                        eVar5.c(i13);
                        fVar.c(i13 - i12);
                        return;
                    }
                }
                if (!fVar.f7881j && this.f7900d == dVar && this.f7897a == 1 && eVar4.f7883l.size() > 0 && eVar5.f7883l.size() > 0) {
                    e eVar9 = (e) eVar4.f7883l.get(0);
                    int i14 = (((e) eVar5.f7883l.get(0)).f7878g + eVar5.f7877f) - (eVar9.f7878g + eVar4.f7877f);
                    int i15 = fVar.f7884m;
                    if (i14 < i15) {
                        fVar.c(i14);
                    } else {
                        fVar.c(i15);
                    }
                }
                if (fVar.f7881j && eVar4.f7883l.size() > 0 && eVar5.f7883l.size() > 0) {
                    e eVar10 = (e) eVar4.f7883l.get(0);
                    e eVar11 = (e) eVar5.f7883l.get(0);
                    int i16 = eVar10.f7878g;
                    int i17 = eVar4.f7877f + i16;
                    int i18 = eVar11.f7878g;
                    int i19 = eVar5.f7877f + i18;
                    float f13 = this.f7898b.f7470g0;
                    if (eVar10 == eVar11) {
                        f13 = 0.5f;
                    } else {
                        i16 = i17;
                        i18 = i19;
                    }
                    eVar4.c((int) ((((i18 - i16) - fVar.f7878g) * f13) + i16 + 0.5f));
                    eVar5.c(eVar4.f7878g + fVar.f7878g);
                }
            }
        }
    }
}
