package androidx.constraintlayout.core;

import Gb.Q;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g[] f15106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g[] f15107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p1.d f15109i;

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.LinearSystem$Row
    public final void addError(g gVar) {
        this.f15109i.f41178b = gVar;
        Arrays.fill(gVar.f15117i, 0.0f);
        gVar.f15117i[gVar.f15113d] = 1.0f;
        f(gVar);
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.LinearSystem$Row
    public final void clear() {
        this.f15108h = 0;
        this.f15083b = 0.0f;
    }

    public final void f(g gVar) {
        int i7;
        int i10 = this.f15108h + 1;
        g[] gVarArr = this.f15106f;
        if (i10 > gVarArr.length) {
            g[] gVarArr2 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length * 2);
            this.f15106f = gVarArr2;
            this.f15107g = (g[]) Arrays.copyOf(gVarArr2, gVarArr2.length * 2);
        }
        g[] gVarArr3 = this.f15106f;
        int i11 = this.f15108h;
        gVarArr3[i11] = gVar;
        int i12 = i11 + 1;
        this.f15108h = i12;
        if (i12 > 1 && gVarArr3[i11].f15111b > gVar.f15111b) {
            int i13 = 0;
            while (true) {
                i7 = this.f15108h;
                if (i13 >= i7) {
                    break;
                }
                this.f15107g[i13] = this.f15106f[i13];
                i13++;
            }
            Arrays.sort(this.f15107g, 0, i7, new Q(7));
            for (int i14 = 0; i14 < this.f15108h; i14++) {
                this.f15106f[i14] = this.f15107g[i14];
            }
        }
        gVar.f15110a = true;
        gVar.a(this);
    }

    public final void g(g gVar) {
        int i7 = 0;
        while (i7 < this.f15108h) {
            if (this.f15106f[i7] == gVar) {
                while (true) {
                    int i10 = this.f15108h;
                    if (i7 >= i10 - 1) {
                        this.f15108h = i10 - 1;
                        gVar.f15110a = false;
                        return;
                    } else {
                        g[] gVarArr = this.f15106f;
                        int i11 = i7 + 1;
                        gVarArr[i7] = gVarArr[i11];
                        i7 = i11;
                    }
                }
            } else {
                i7++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.LinearSystem$Row
    public final g getPivotCandidate(c cVar, boolean[] zArr) {
        int i7 = -1;
        for (int i10 = 0; i10 < this.f15108h; i10++) {
            g[] gVarArr = this.f15106f;
            g gVar = gVarArr[i10];
            if (!zArr[gVar.f15111b]) {
                p1.d dVar = this.f15109i;
                dVar.f41178b = gVar;
                int i11 = 8;
                if (i7 != -1) {
                    g gVar2 = gVarArr[i7];
                    dVar.getClass();
                    while (i11 >= 0) {
                        float f10 = gVar2.f15117i[i11];
                        float f11 = ((g) dVar.f41178b).f15117i[i11];
                        if (f11 != f10) {
                            if (f11 >= f10) {
                                break;
                            }
                            i7 = i10;
                            break;
                            break;
                        }
                        i11--;
                    }
                } else {
                    while (true) {
                        if (i11 < 0) {
                            dVar.getClass();
                            break;
                        }
                        float f12 = ((g) dVar.f41178b).f15117i[i11];
                        if (f12 > 0.0f) {
                            break;
                        }
                        if (f12 < 0.0f) {
                            i7 = i10;
                            break;
                        }
                        i11--;
                    }
                }
            }
        }
        if (i7 == -1) {
            return null;
        }
        return this.f15106f[i7];
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.LinearSystem$Row
    public final boolean isEmpty() {
        return this.f15108h == 0;
    }

    @Override // androidx.constraintlayout.core.b
    public final String toString() {
        String str = " goal -> (" + this.f15083b + ") : ";
        for (int i7 = 0; i7 < this.f15108h; i7++) {
            g gVar = this.f15106f[i7];
            p1.d dVar = this.f15109i;
            dVar.f41178b = gVar;
            str = str + dVar + " ";
        }
        return str;
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.LinearSystem$Row
    public final void updateFromRow(c cVar, b bVar, boolean z3) {
        g gVar = bVar.f15082a;
        if (gVar == null) {
            return;
        }
        ArrayRow$ArrayRowVariables arrayRow$ArrayRowVariables = bVar.f15085d;
        int currentSize = arrayRow$ArrayRowVariables.getCurrentSize();
        for (int i7 = 0; i7 < currentSize; i7++) {
            g variable = arrayRow$ArrayRowVariables.getVariable(i7);
            float variableValue = arrayRow$ArrayRowVariables.getVariableValue(i7);
            p1.d dVar = this.f15109i;
            dVar.f41178b = variable;
            boolean z8 = variable.f15110a;
            float[] fArr = gVar.f15117i;
            if (z8) {
                boolean z10 = true;
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr2 = ((g) dVar.f41178b).f15117i;
                    float f10 = (fArr[i10] * variableValue) + fArr2[i10];
                    fArr2[i10] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        ((g) dVar.f41178b).f15117i[i10] = 0.0f;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    ((f) dVar.f41179c).g((g) dVar.f41178b);
                }
            } else {
                for (int i11 = 0; i11 < 9; i11++) {
                    float f11 = fArr[i11];
                    if (f11 != 0.0f) {
                        float f12 = f11 * variableValue;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        ((g) dVar.f41178b).f15117i[i11] = f12;
                    } else {
                        ((g) dVar.f41178b).f15117i[i11] = 0.0f;
                    }
                }
                f(variable);
            }
            this.f15083b = (bVar.f15083b * variableValue) + this.f15083b;
        }
        g(gVar);
    }
}
