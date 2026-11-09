package Q;

/* JADX INFO: loaded from: classes.dex */
public final class l extends m {
    @Override // Q.m
    public final void T(int i7, int i10, int i11, int i12) {
        int iR = this.f7571A0 + this.f7572B0;
        int iL = this.f7578w0 + this.f7579x0;
        if (this.f7569v0 > 0) {
            iR += this.f7568u0[0].r();
            iL += this.f7568u0[0].l();
        }
        int iMax = Math.max(this.f7464d0, iR);
        int iMax2 = Math.max(this.f7466e0, iL);
        if (i7 != 1073741824) {
            if (i7 == Integer.MIN_VALUE) {
                i10 = Math.min(iMax, i10);
            } else {
                i10 = i7 == 0 ? iMax : 0;
            }
        }
        if (i11 != 1073741824) {
            if (i11 == Integer.MIN_VALUE) {
                i12 = Math.min(iMax2, i12);
            } else {
                i12 = i11 == 0 ? iMax2 : 0;
            }
        }
        this.f7574D0 = i10;
        this.f7575E0 = i12;
        P(i10);
        M(i12);
        this.f7573C0 = this.f7569v0 > 0;
    }

    @Override // Q.e
    public final void b(androidx.constraintlayout.core.c cVar, boolean z3) {
        super.b(cVar, z3);
        if (this.f7569v0 > 0) {
            e eVar = this.f7568u0[0];
            eVar.E();
            eVar.f7470g0 = 0.5f;
            eVar.f7468f0 = 0.5f;
            eVar.e(2, this, 2, 0);
            eVar.e(4, this, 4, 0);
            eVar.e(3, this, 3, 0);
            eVar.e(5, this, 5, 0);
        }
    }
}
