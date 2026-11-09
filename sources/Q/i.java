package Q;

import androidx.camera.camera2.internal.F;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i extends e {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f7562u0 = -1.0f;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f7563v0 = -1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f7564w0 = -1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public c f7565x0 = this.f7443K;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f7566y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f7567z0;

    public i() {
        this.f7451S.clear();
        this.f7451S.add(this.f7565x0);
        int length = this.f7450R.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f7450R[i7] = this.f7565x0;
        }
    }

    @Override // Q.e
    public final boolean B() {
        return this.f7567z0;
    }

    @Override // Q.e
    public final boolean C() {
        return this.f7567z0;
    }

    @Override // Q.e
    public final void R(androidx.constraintlayout.core.c cVar, boolean z3) {
        if (this.f7454V == null) {
            return;
        }
        c cVar2 = this.f7565x0;
        cVar.getClass();
        int iN = androidx.constraintlayout.core.c.n(cVar2);
        if (this.f7566y0 == 1) {
            this.f7460a0 = iN;
            this.b0 = 0;
            M(this.f7454V.l());
            P(0);
            return;
        }
        this.f7460a0 = 0;
        this.b0 = iN;
        P(this.f7454V.r());
        M(0);
    }

    public final void S(int i7) {
        this.f7565x0.l(i7);
        this.f7567z0 = true;
    }

    public final void T(int i7) {
        if (this.f7566y0 == i7) {
            return;
        }
        this.f7566y0 = i7;
        ArrayList arrayList = this.f7451S;
        arrayList.clear();
        if (this.f7566y0 == 1) {
            this.f7565x0 = this.f7442J;
        } else {
            this.f7565x0 = this.f7443K;
        }
        arrayList.add(this.f7565x0);
        c[] cVarArr = this.f7450R;
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            cVarArr[i10] = this.f7565x0;
        }
    }

    @Override // Q.e
    public final void b(androidx.constraintlayout.core.c cVar, boolean z3) {
        f fVar = (f) this.f7454V;
        if (fVar == null) {
            return;
        }
        Object objJ = fVar.j(2);
        Object objJ2 = fVar.j(4);
        e eVar = this.f7454V;
        d dVar = d.f7429b;
        boolean z8 = eVar != null && eVar.f7453U[0] == dVar;
        if (this.f7566y0 == 0) {
            objJ = fVar.j(3);
            objJ2 = fVar.j(5);
            e eVar2 = this.f7454V;
            z8 = eVar2 != null && eVar2.f7453U[1] == dVar;
        }
        if (this.f7567z0) {
            c cVar2 = this.f7565x0;
            if (cVar2.f7421c) {
                androidx.constraintlayout.core.g gVarK = cVar.k(cVar2);
                cVar.d(gVarK, this.f7565x0.d());
                if (this.f7563v0 != -1) {
                    if (z8) {
                        cVar.f(cVar.k(objJ2), gVarK, 0, 5);
                    }
                } else if (this.f7564w0 != -1 && z8) {
                    androidx.constraintlayout.core.g gVarK2 = cVar.k(objJ2);
                    cVar.f(gVarK, cVar.k(objJ), 0, 5);
                    cVar.f(gVarK2, gVarK, 0, 5);
                }
                this.f7567z0 = false;
                return;
            }
        }
        if (this.f7563v0 != -1) {
            androidx.constraintlayout.core.g gVarK3 = cVar.k(this.f7565x0);
            cVar.e(gVarK3, cVar.k(objJ), this.f7563v0, 8);
            if (z8) {
                cVar.f(cVar.k(objJ2), gVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f7564w0 != -1) {
            androidx.constraintlayout.core.g gVarK4 = cVar.k(this.f7565x0);
            androidx.constraintlayout.core.g gVarK5 = cVar.k(objJ2);
            cVar.e(gVarK4, gVarK5, -this.f7564w0, 8);
            if (z8) {
                cVar.f(gVarK4, cVar.k(objJ), 0, 5);
                cVar.f(gVarK5, gVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f7562u0 != -1.0f) {
            androidx.constraintlayout.core.g gVarK6 = cVar.k(this.f7565x0);
            androidx.constraintlayout.core.g gVarK7 = cVar.k(objJ2);
            float f10 = this.f7562u0;
            androidx.constraintlayout.core.b bVarL = cVar.l();
            bVarL.f15085d.put(gVarK6, -1.0f);
            bVarL.f15085d.put(gVarK7, f10);
            cVar.c(bVarL);
        }
    }

    @Override // Q.e
    public final boolean c() {
        return true;
    }

    @Override // Q.e
    public final void g(e eVar, HashMap map) {
        super.g(eVar, map);
        i iVar = (i) eVar;
        this.f7562u0 = iVar.f7562u0;
        this.f7563v0 = iVar.f7563v0;
        this.f7564w0 = iVar.f7564w0;
        T(iVar.f7566y0);
    }

    @Override // Q.e
    public final c j(int i7) {
        int i10 = F.i(i7);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return null;
                    }
                }
            }
            if (this.f7566y0 == 0) {
                return this.f7565x0;
            }
            return null;
        }
        if (this.f7566y0 == 1) {
            return this.f7565x0;
        }
        return null;
    }
}
