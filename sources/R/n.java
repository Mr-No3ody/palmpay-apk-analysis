package R;

import androidx.camera.camera2.internal.F;
import androidx.constraintlayout.core.widgets.analyzer.Dependency;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements Dependency {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q.e f7898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f7899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Q.d f7900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f7901e = new f(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7902f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7903g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f7904h = new e(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f7905i = new e(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7906j = 1;

    public n(Q.e eVar) {
        this.f7898b = eVar;
    }

    public static void a(e eVar, e eVar2, int i7) {
        eVar.f7883l.add(eVar2);
        eVar.f7877f = i7;
        eVar2.f7882k.add(eVar);
    }

    public static e g(Q.c cVar) {
        Q.c cVar2 = cVar.f7424f;
        if (cVar2 == null) {
            return null;
        }
        int i7 = F.i(cVar2.f7423e);
        Q.e eVar = cVar2.f7422d;
        if (i7 == 1) {
            return eVar.f7463d.f7904h;
        }
        if (i7 == 2) {
            return eVar.f7465e.f7904h;
        }
        if (i7 == 3) {
            return eVar.f7463d.f7905i;
        }
        if (i7 == 4) {
            return eVar.f7465e.f7905i;
        }
        if (i7 != 5) {
            return null;
        }
        return eVar.f7465e.f7889k;
    }

    public static e h(Q.c cVar, int i7) {
        Q.c cVar2 = cVar.f7424f;
        if (cVar2 == null) {
            return null;
        }
        Q.e eVar = cVar2.f7422d;
        n nVar = i7 == 0 ? eVar.f7463d : eVar.f7465e;
        int i10 = F.i(cVar2.f7423e);
        if (i10 == 1 || i10 == 2) {
            return nVar.f7904h;
        }
        if (i10 == 3 || i10 == 4) {
            return nVar.f7905i;
        }
        return null;
    }

    public final void b(e eVar, e eVar2, int i7, f fVar) {
        eVar.f7883l.add(eVar2);
        eVar.f7883l.add(this.f7901e);
        eVar.f7879h = i7;
        eVar.f7880i = fVar;
        eVar2.f7882k.add(eVar);
        fVar.f7882k.add(eVar);
    }

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public final int f(int i7, int i10) {
        if (i10 == 0) {
            Q.e eVar = this.f7898b;
            int i11 = eVar.f7496v;
            int iMax = Math.max(eVar.f7495u, i7);
            if (i11 > 0) {
                iMax = Math.min(i11, i7);
            }
            if (iMax != i7) {
                return iMax;
            }
        } else {
            Q.e eVar2 = this.f7898b;
            int i12 = eVar2.f7499y;
            int iMax2 = Math.max(eVar2.f7498x, i7);
            if (i12 > 0) {
                iMax2 = Math.min(i12, i7);
            }
            if (iMax2 != i7) {
                return iMax2;
            }
        }
        return i7;
    }

    public long i() {
        f fVar = this.f7901e;
        if (fVar.f7881j) {
            return fVar.f7878g;
        }
        return 0L;
    }

    public abstract boolean j();

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    public final void k(Q.c cVar, Q.c cVar2, int i7) {
        f fVar;
        float f10;
        int i10;
        e eVarG = g(cVar);
        e eVarG2 = g(cVar2);
        if (eVarG.f7881j && eVarG2.f7881j) {
            int iE = cVar.e() + eVarG.f7878g;
            int iE2 = eVarG2.f7878g - cVar2.e();
            int i11 = iE2 - iE;
            f fVar2 = this.f7901e;
            if (!fVar2.f7881j) {
                Q.d dVar = this.f7900d;
                Q.d dVar2 = Q.d.f7430c;
                if (dVar == dVar2) {
                    int i12 = this.f7897a;
                    if (i12 == 0) {
                        fVar2.c(f(i11, i7));
                    } else if (i12 == 1) {
                        fVar2.c(Math.min(f(fVar2.f7884m, i7), i11));
                    } else if (i12 == 2) {
                        Q.e eVar = this.f7898b;
                        Q.e eVar2 = eVar.f7454V;
                        if (eVar2 != null) {
                            f fVar3 = (i7 == 0 ? eVar2.f7463d : eVar2.f7465e).f7901e;
                            if (fVar3.f7881j) {
                                fVar2.c(f((int) ((fVar3.f7878g * (i7 == 0 ? eVar.f7497w : eVar.f7500z)) + 0.5f), i7));
                            }
                        }
                    } else if (i12 == 3) {
                        Q.e eVar3 = this.f7898b;
                        n nVar = eVar3.f7463d;
                        if (nVar.f7900d == dVar2 && nVar.f7897a == 3) {
                            l lVar = eVar3.f7465e;
                            if (lVar.f7900d != dVar2 || lVar.f7897a != 3) {
                                if (i7 == 0) {
                                    nVar = eVar3.f7465e;
                                }
                                fVar = nVar.f7901e;
                                if (fVar.f7881j) {
                                    f10 = eVar3.f7457Y;
                                    if (i7 == 1) {
                                        i10 = (int) ((fVar.f7878g / f10) + 0.5f);
                                    } else {
                                        i10 = (int) ((f10 * fVar.f7878g) + 0.5f);
                                    }
                                    fVar2.c(i10);
                                }
                            }
                        } else {
                            if (i7 == 0) {
                                nVar = eVar3.f7465e;
                            }
                            fVar = nVar.f7901e;
                            if (fVar.f7881j) {
                                f10 = eVar3.f7457Y;
                                if (i7 == 1) {
                                    i10 = (int) ((fVar.f7878g / f10) + 0.5f);
                                } else {
                                    i10 = (int) ((f10 * fVar.f7878g) + 0.5f);
                                }
                                fVar2.c(i10);
                            }
                        }
                    }
                }
            }
            if (fVar2.f7881j) {
                int i13 = fVar2.f7878g;
                e eVar4 = this.f7905i;
                e eVar5 = this.f7904h;
                if (i13 == i11) {
                    eVar5.c(iE);
                    eVar4.c(iE2);
                    return;
                }
                Q.e eVar6 = this.f7898b;
                float f11 = i7 == 0 ? eVar6.f7468f0 : eVar6.f7470g0;
                if (eVarG == eVarG2) {
                    iE = eVarG.f7878g;
                    iE2 = eVarG2.f7878g;
                    f11 = 0.5f;
                }
                eVar5.c((int) ((((iE2 - iE) - i13) * f11) + iE + 0.5f));
                eVar4.c(eVar5.f7878g + fVar2.f7878g);
            }
        }
    }
}
