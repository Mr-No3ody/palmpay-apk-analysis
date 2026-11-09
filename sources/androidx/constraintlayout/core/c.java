package androidx.constraintlayout.core;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f15087p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f15088q = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f15091c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b[] f15094f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.camera.video.internal.c f15100l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f15103o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15089a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15090b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15092d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15093e = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15095g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean[] f15096h = new boolean[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15097i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15098j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15099k = 32;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g[] f15101m = new g[f15088q];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15102n = 0;

    public c() {
        this.f15094f = null;
        this.f15094f = new b[32];
        s();
        androidx.camera.video.internal.c cVar = new androidx.camera.video.internal.c(4, false);
        new e();
        cVar.f14621b = new e();
        cVar.f14623d = new e();
        cVar.f14622c = new g[32];
        this.f15100l = cVar;
        f fVar = new f(cVar);
        fVar.f15106f = new g[128];
        fVar.f15107g = new g[128];
        fVar.f15108h = 0;
        fVar.f15109i = new p1.d(fVar, 27);
        this.f15091c = fVar;
        this.f15103o = new b(cVar);
    }

    public static int n(Object obj) {
        g gVar = ((Q.c) obj).f7427i;
        if (gVar != null) {
            return (int) (gVar.f15114e + 0.5f);
        }
        return 0;
    }

    public final g a(int i7) {
        g gVar = (g) ((e) this.f15100l.f14623d).acquire();
        if (gVar == null) {
            gVar = new g(i7);
            gVar.t = i7;
        } else {
            gVar.c();
            gVar.t = i7;
        }
        int i10 = this.f15102n;
        int i11 = f15088q;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f15088q = i12;
            this.f15101m = (g[]) Arrays.copyOf(this.f15101m, i12);
        }
        g[] gVarArr = this.f15101m;
        int i13 = this.f15102n;
        this.f15102n = i13 + 1;
        gVarArr[i13] = gVar;
        return gVar;
    }

    public final void b(g gVar, g gVar2, int i7, float f10, g gVar3, g gVar4, int i10, int i11) {
        b bVarL = l();
        if (gVar2 == gVar3) {
            bVarL.f15085d.put(gVar, 1.0f);
            bVarL.f15085d.put(gVar4, 1.0f);
            bVarL.f15085d.put(gVar2, -2.0f);
        } else if (f10 == 0.5f) {
            bVarL.f15085d.put(gVar, 1.0f);
            bVarL.f15085d.put(gVar2, -1.0f);
            bVarL.f15085d.put(gVar3, -1.0f);
            bVarL.f15085d.put(gVar4, 1.0f);
            if (i7 > 0 || i10 > 0) {
                bVarL.f15083b = (-i7) + i10;
            }
        } else if (f10 <= 0.0f) {
            bVarL.f15085d.put(gVar, -1.0f);
            bVarL.f15085d.put(gVar2, 1.0f);
            bVarL.f15083b = i7;
        } else if (f10 >= 1.0f) {
            bVarL.f15085d.put(gVar4, -1.0f);
            bVarL.f15085d.put(gVar3, 1.0f);
            bVarL.f15083b = -i10;
        } else {
            float f11 = 1.0f - f10;
            bVarL.f15085d.put(gVar, f11 * 1.0f);
            bVarL.f15085d.put(gVar2, f11 * (-1.0f));
            bVarL.f15085d.put(gVar3, (-1.0f) * f10);
            bVarL.f15085d.put(gVar4, 1.0f * f10);
            if (i7 > 0 || i10 > 0) {
                bVarL.f15083b = (i10 * f10) + ((-i7) * f11);
            }
        }
        if (i11 != 8) {
            bVarL.a(this, i11);
        }
        c(bVarL);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0111  */
    public final void c(b bVar) {
        boolean z3;
        boolean z8;
        g gVarD;
        if (this.f15098j + 1 >= this.f15099k || this.f15097i + 1 >= this.f15093e) {
            o();
        }
        if (bVar.f15086e) {
            z3 = false;
        } else {
            bVar.updateFromSystem(this);
            if (bVar.isEmpty()) {
                return;
            }
            float f10 = bVar.f15083b;
            if (f10 < 0.0f) {
                bVar.f15083b = f10 * (-1.0f);
                bVar.f15085d.invert();
            }
            int currentSize = bVar.f15085d.getCurrentSize();
            float f11 = 0.0f;
            float f12 = 0.0f;
            g gVar = null;
            g gVar2 = null;
            boolean z10 = false;
            boolean z11 = false;
            for (int i7 = 0; i7 < currentSize; i7++) {
                float variableValue = bVar.f15085d.getVariableValue(i7);
                g variable = bVar.f15085d.getVariable(i7);
                if (variable.t == 1) {
                    if (gVar == null) {
                        if (variable.f15120p <= 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f11 = variableValue;
                        gVar = variable;
                    } else {
                        if (f11 > variableValue) {
                            if (variable.f15120p > 1) {
                                z10 = false;
                            }
                            f11 = variableValue;
                            gVar = variable;
                        } else if (z10 || variable.f15120p > 1) {
                        }
                        z10 = true;
                        f11 = variableValue;
                        gVar = variable;
                    }
                } else if (gVar == null && variableValue < 0.0f) {
                    if (gVar2 == null) {
                        if (variable.f15120p <= 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        f12 = variableValue;
                        gVar2 = variable;
                    } else {
                        if (f12 > variableValue) {
                            if (variable.f15120p > 1) {
                                z11 = false;
                            }
                            f12 = variableValue;
                            gVar2 = variable;
                        } else if (z11 || variable.f15120p > 1) {
                        }
                        z11 = true;
                        f12 = variableValue;
                        gVar2 = variable;
                    }
                }
            }
            if (gVar == null) {
                gVar = gVar2;
            }
            if (gVar == null) {
                z8 = true;
            } else {
                bVar.e(gVar);
                z8 = false;
            }
            if (bVar.f15085d.getCurrentSize() == 0) {
                bVar.f15086e = true;
            }
            if (z8) {
                if (this.f15097i + 1 >= this.f15093e) {
                    o();
                }
                g gVarA = a(3);
                int i10 = this.f15090b + 1;
                this.f15090b = i10;
                this.f15097i++;
                gVarA.f15111b = i10;
                androidx.camera.video.internal.c cVar = this.f15100l;
                ((g[]) cVar.f14622c)[i10] = gVarA;
                bVar.f15082a = gVarA;
                int i11 = this.f15098j;
                h(bVar);
                if (this.f15098j == i11 + 1) {
                    this.f15103o.initFromRow(bVar);
                    r(this.f15103o);
                    if (gVarA.f15112c == -1) {
                        if (bVar.f15082a == gVarA && (gVarD = bVar.d(null, gVarA)) != null) {
                            bVar.e(gVarD);
                        }
                        if (!bVar.f15086e) {
                            bVar.f15082a.e(this, bVar);
                        }
                        ((e) cVar.f14621b).release(bVar);
                        this.f15098j--;
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            g gVar3 = bVar.f15082a;
            if (gVar3 == null) {
                return;
            }
            if (gVar3.t != 1 && bVar.f15083b < 0.0f) {
                return;
            }
        }
        if (z3) {
            return;
        }
        h(bVar);
    }

    public final void d(g gVar, int i7) {
        int i10 = gVar.f15112c;
        if (i10 == -1) {
            gVar.d(this, i7);
            for (int i11 = 0; i11 < this.f15090b + 1; i11++) {
                g gVar2 = ((g[]) this.f15100l.f14622c)[i11];
            }
            return;
        }
        if (i10 == -1) {
            b bVarL = l();
            bVarL.f15082a = gVar;
            float f10 = i7;
            gVar.f15114e = f10;
            bVarL.f15083b = f10;
            bVarL.f15086e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f15094f[i10];
        if (bVar.f15086e) {
            bVar.f15083b = i7;
            return;
        }
        if (bVar.f15085d.getCurrentSize() == 0) {
            bVar.f15086e = true;
            bVar.f15083b = i7;
            return;
        }
        b bVarL2 = l();
        if (i7 < 0) {
            bVarL2.f15083b = i7 * (-1);
            bVarL2.f15085d.put(gVar, 1.0f);
        } else {
            bVarL2.f15083b = i7;
            bVarL2.f15085d.put(gVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(g gVar, g gVar2, int i7, int i10) {
        if (i10 == 8 && gVar2.f15115f && gVar.f15112c == -1) {
            gVar.d(this, gVar2.f15114e + i7);
            return;
        }
        b bVarL = l();
        boolean z3 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z3 = true;
            }
            bVarL.f15083b = i7;
        }
        if (z3) {
            bVarL.f15085d.put(gVar, 1.0f);
            bVarL.f15085d.put(gVar2, -1.0f);
        } else {
            bVarL.f15085d.put(gVar, -1.0f);
            bVarL.f15085d.put(gVar2, 1.0f);
        }
        if (i10 != 8) {
            bVarL.a(this, i10);
        }
        c(bVarL);
    }

    public final void f(g gVar, g gVar2, int i7, int i10) {
        b bVarL = l();
        g gVarM = m();
        gVarM.f15113d = 0;
        bVarL.b(gVar, gVar2, gVarM, i7);
        if (i10 != 8) {
            bVarL.f15085d.put(j(i10), (int) (bVarL.f15085d.get(gVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(g gVar, g gVar2, int i7, int i10) {
        b bVarL = l();
        g gVarM = m();
        gVarM.f15113d = 0;
        bVarL.c(gVar, gVar2, gVarM, i7);
        if (i10 != 8) {
            bVarL.f15085d.put(j(i10), (int) (bVarL.f15085d.get(gVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i7;
        if (bVar.f15086e) {
            bVar.f15082a.d(this, bVar.f15083b);
        } else {
            b[] bVarArr = this.f15094f;
            int i10 = this.f15098j;
            bVarArr[i10] = bVar;
            g gVar = bVar.f15082a;
            gVar.f15112c = i10;
            this.f15098j = i10 + 1;
            gVar.e(this, bVar);
        }
        if (this.f15089a) {
            int i11 = 0;
            while (i11 < this.f15098j) {
                if (this.f15094f[i11] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f15094f[i11];
                if (bVar2 != null && bVar2.f15086e) {
                    bVar2.f15082a.d(this, bVar2.f15083b);
                    ((e) this.f15100l.f14621b).release(bVar2);
                    this.f15094f[i11] = null;
                    int i12 = i11 + 1;
                    int i13 = i12;
                    while (true) {
                        i7 = this.f15098j;
                        if (i12 >= i7) {
                            break;
                        }
                        b[] bVarArr2 = this.f15094f;
                        int i14 = i12 - 1;
                        b bVar3 = bVarArr2[i12];
                        bVarArr2[i14] = bVar3;
                        g gVar2 = bVar3.f15082a;
                        if (gVar2.f15112c == i12) {
                            gVar2.f15112c = i14;
                        }
                        i13 = i12;
                        i12++;
                    }
                    if (i13 < i7) {
                        this.f15094f[i13] = null;
                    }
                    this.f15098j = i7 - 1;
                    i11--;
                }
                i11++;
            }
            this.f15089a = false;
        }
    }

    public final void i() {
        for (int i7 = 0; i7 < this.f15098j; i7++) {
            b bVar = this.f15094f[i7];
            bVar.f15082a.f15114e = bVar.f15083b;
        }
    }

    public final g j(int i7) {
        if (this.f15097i + 1 >= this.f15093e) {
            o();
        }
        g gVarA = a(4);
        int i10 = this.f15090b + 1;
        this.f15090b = i10;
        this.f15097i++;
        gVarA.f15111b = i10;
        gVarA.f15113d = i7;
        ((g[]) this.f15100l.f14622c)[i10] = gVarA;
        this.f15091c.addError(gVarA);
        return gVarA;
    }

    public final g k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f15097i + 1 >= this.f15093e) {
            o();
        }
        if (!(obj instanceof Q.c)) {
            return null;
        }
        Q.c cVar = (Q.c) obj;
        g gVar = cVar.f7427i;
        if (gVar == null) {
            cVar.k();
            gVar = cVar.f7427i;
        }
        int i7 = gVar.f15111b;
        androidx.camera.video.internal.c cVar2 = this.f15100l;
        if (i7 != -1 && i7 <= this.f15090b && ((g[]) cVar2.f14622c)[i7] != null) {
            return gVar;
        }
        if (i7 != -1) {
            gVar.c();
        }
        int i10 = this.f15090b + 1;
        this.f15090b = i10;
        this.f15097i++;
        gVar.f15111b = i10;
        gVar.t = 1;
        ((g[]) cVar2.f14622c)[i10] = gVar;
        return gVar;
    }

    public final b l() {
        androidx.camera.video.internal.c cVar = this.f15100l;
        b bVar = (b) ((e) cVar.f14621b).acquire();
        if (bVar == null) {
            return new b(cVar);
        }
        bVar.f15082a = null;
        bVar.f15085d.clear();
        bVar.f15083b = 0.0f;
        bVar.f15086e = false;
        return bVar;
    }

    public final g m() {
        if (this.f15097i + 1 >= this.f15093e) {
            o();
        }
        g gVarA = a(3);
        int i7 = this.f15090b + 1;
        this.f15090b = i7;
        this.f15097i++;
        gVarA.f15111b = i7;
        ((g[]) this.f15100l.f14622c)[i7] = gVarA;
        return gVarA;
    }

    public final void o() {
        int i7 = this.f15092d * 2;
        this.f15092d = i7;
        this.f15094f = (b[]) Arrays.copyOf(this.f15094f, i7);
        androidx.camera.video.internal.c cVar = this.f15100l;
        cVar.f14622c = (g[]) Arrays.copyOf((g[]) cVar.f14622c, this.f15092d);
        int i10 = this.f15092d;
        this.f15096h = new boolean[i10];
        this.f15093e = i10;
        this.f15099k = i10;
    }

    public final void p() {
        f fVar = this.f15091c;
        if (fVar.isEmpty()) {
            i();
            return;
        }
        if (!this.f15095g) {
            q(fVar);
            return;
        }
        for (int i7 = 0; i7 < this.f15098j; i7++) {
            if (!this.f15094f[i7].f15086e) {
                q(fVar);
                return;
            }
        }
        i();
    }

    public final void q(f fVar) {
        for (int i7 = 0; i7 < this.f15098j; i7++) {
            b bVar = this.f15094f[i7];
            int i10 = 1;
            if (bVar.f15082a.t != 1) {
                float f10 = 0.0f;
                if (bVar.f15083b < 0.0f) {
                    boolean z3 = false;
                    int i11 = 0;
                    while (!z3) {
                        i11 += i10;
                        float f11 = Float.MAX_VALUE;
                        int i12 = -1;
                        int i13 = -1;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < this.f15098j) {
                            b bVar2 = this.f15094f[i14];
                            if (bVar2.f15082a.t != i10 && !bVar2.f15086e && bVar2.f15083b < f10) {
                                int currentSize = bVar2.f15085d.getCurrentSize();
                                int i16 = 0;
                                while (i16 < currentSize) {
                                    g variable = bVar2.f15085d.getVariable(i16);
                                    float f12 = bVar2.f15085d.get(variable);
                                    if (f12 > f10) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f13 = variable.f15116g[i17] / f12;
                                            if ((f13 < f11 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i13 = variable.f15111b;
                                                i12 = i14;
                                                f11 = f13;
                                            }
                                        }
                                    }
                                    i16++;
                                    f10 = 0.0f;
                                }
                            }
                            i14++;
                            f10 = 0.0f;
                            i10 = 1;
                        }
                        if (i12 != -1) {
                            b bVar3 = this.f15094f[i12];
                            bVar3.f15082a.f15112c = -1;
                            bVar3.e(((g[]) this.f15100l.f14622c)[i13]);
                            g gVar = bVar3.f15082a;
                            gVar.f15112c = i12;
                            gVar.e(this, bVar3);
                        } else {
                            z3 = true;
                        }
                        if (i11 > this.f15097i / 2) {
                            z3 = true;
                        }
                        f10 = 0.0f;
                        i10 = 1;
                    }
                    break;
                }
            }
        }
        r(fVar);
        i();
    }

    public final void r(b bVar) {
        for (int i7 = 0; i7 < this.f15097i; i7++) {
            this.f15096h[i7] = false;
        }
        boolean z3 = false;
        int i10 = 0;
        while (!z3) {
            i10++;
            if (i10 >= this.f15097i * 2) {
                return;
            }
            g gVar = bVar.f15082a;
            if (gVar != null) {
                this.f15096h[gVar.f15111b] = true;
            }
            g pivotCandidate = bVar.getPivotCandidate(this, this.f15096h);
            if (pivotCandidate != null) {
                boolean[] zArr = this.f15096h;
                int i11 = pivotCandidate.f15111b;
                if (zArr[i11]) {
                    return;
                } else {
                    zArr[i11] = true;
                }
            }
            if (pivotCandidate != null) {
                float f10 = Float.MAX_VALUE;
                int i12 = -1;
                for (int i13 = 0; i13 < this.f15098j; i13++) {
                    b bVar2 = this.f15094f[i13];
                    if (bVar2.f15082a.t != 1 && !bVar2.f15086e && bVar2.f15085d.contains(pivotCandidate)) {
                        float f11 = bVar2.f15085d.get(pivotCandidate);
                        if (f11 < 0.0f) {
                            float f12 = (-bVar2.f15083b) / f11;
                            if (f12 < f10) {
                                i12 = i13;
                                f10 = f12;
                            }
                        }
                    }
                }
                if (i12 > -1) {
                    b bVar3 = this.f15094f[i12];
                    bVar3.f15082a.f15112c = -1;
                    bVar3.e(pivotCandidate);
                    g gVar2 = bVar3.f15082a;
                    gVar2.f15112c = i12;
                    gVar2.e(this, bVar3);
                }
            } else {
                z3 = true;
            }
        }
    }

    public final void s() {
        for (int i7 = 0; i7 < this.f15098j; i7++) {
            b bVar = this.f15094f[i7];
            if (bVar != null) {
                ((e) this.f15100l.f14621b).release(bVar);
            }
            this.f15094f[i7] = null;
        }
    }

    public final void t() {
        androidx.camera.video.internal.c cVar;
        int i7 = 0;
        while (true) {
            cVar = this.f15100l;
            g[] gVarArr = (g[]) cVar.f14622c;
            if (i7 >= gVarArr.length) {
                break;
            }
            g gVar = gVarArr[i7];
            if (gVar != null) {
                gVar.c();
            }
            i7++;
        }
        ((e) cVar.f14623d).releaseAll(this.f15101m, this.f15102n);
        this.f15102n = 0;
        Arrays.fill((g[]) cVar.f14622c, (Object) null);
        this.f15090b = 0;
        this.f15091c.clear();
        this.f15097i = 1;
        for (int i10 = 0; i10 < this.f15098j; i10++) {
            b bVar = this.f15094f[i10];
        }
        s();
        this.f15098j = 0;
        this.f15103o = new b(cVar);
    }
}
