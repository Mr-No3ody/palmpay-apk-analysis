package androidx.constraintlayout.core;

import N8.q0;
import androidx.camera.video.u;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ArrayRow$ArrayRowVariables {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f15073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.camera.video.internal.c f15074c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15072a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15075d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f15076e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f15077f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f15078g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15079h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15080i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15081j = false;

    public a(b bVar, androidx.camera.video.internal.c cVar) {
        this.f15073b = bVar;
        this.f15074c = cVar;
    }

    @Override // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final void add(g gVar, float f10, boolean z3) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i7 = this.f15079h;
            b bVar = this.f15073b;
            if (i7 == -1) {
                this.f15079h = 0;
                this.f15078g[0] = f10;
                this.f15076e[0] = gVar.f15111b;
                this.f15077f[0] = -1;
                gVar.f15120p++;
                gVar.a(bVar);
                this.f15072a++;
                if (this.f15081j) {
                    return;
                }
                int i10 = this.f15080i + 1;
                this.f15080i = i10;
                int[] iArr = this.f15076e;
                if (i10 >= iArr.length) {
                    this.f15081j = true;
                    this.f15080i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i11 = -1;
            for (int i12 = 0; i7 != -1 && i12 < this.f15072a; i12++) {
                int i13 = this.f15076e[i7];
                int i14 = gVar.f15111b;
                if (i13 == i14) {
                    float[] fArr = this.f15078g;
                    float f11 = fArr[i7] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i7] = f11;
                    if (f11 == 0.0f) {
                        if (i7 == this.f15079h) {
                            this.f15079h = this.f15077f[i7];
                        } else {
                            int[] iArr2 = this.f15077f;
                            iArr2[i11] = iArr2[i7];
                        }
                        if (z3) {
                            gVar.b(bVar);
                        }
                        if (this.f15081j) {
                            this.f15080i = i7;
                        }
                        gVar.f15120p--;
                        this.f15072a--;
                        return;
                    }
                    return;
                }
                if (i13 < i14) {
                    i11 = i7;
                }
                i7 = this.f15077f[i7];
            }
            int length = this.f15080i;
            int i15 = length + 1;
            if (this.f15081j) {
                int[] iArr3 = this.f15076e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i15;
            }
            int[] iArr4 = this.f15076e;
            if (length >= iArr4.length && this.f15072a < iArr4.length) {
                int i16 = 0;
                while (true) {
                    int[] iArr5 = this.f15076e;
                    if (i16 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i16] == -1) {
                        length = i16;
                        break;
                    }
                    i16++;
                }
            }
            int[] iArr6 = this.f15076e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i17 = this.f15075d * 2;
                this.f15075d = i17;
                this.f15081j = false;
                this.f15080i = length - 1;
                this.f15078g = Arrays.copyOf(this.f15078g, i17);
                this.f15076e = Arrays.copyOf(this.f15076e, this.f15075d);
                this.f15077f = Arrays.copyOf(this.f15077f, this.f15075d);
            }
            this.f15076e[length] = gVar.f15111b;
            this.f15078g[length] = f10;
            if (i11 != -1) {
                int[] iArr7 = this.f15077f;
                iArr7[length] = iArr7[i11];
                iArr7[i11] = length;
            } else {
                this.f15077f[length] = this.f15079h;
                this.f15079h = length;
            }
            gVar.f15120p++;
            gVar.a(bVar);
            this.f15072a++;
            if (!this.f15081j) {
                this.f15080i++;
            }
            int i18 = this.f15080i;
            int[] iArr8 = this.f15076e;
            if (i18 >= iArr8.length) {
                this.f15081j = true;
                this.f15080i = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final void clear() {
        int i7 = this.f15079h;
        for (int i10 = 0; i7 != -1 && i10 < this.f15072a; i10++) {
            g gVar = ((g[]) this.f15074c.f14622c)[this.f15076e[i7]];
            if (gVar != null) {
                gVar.b(this.f15073b);
            }
            i7 = this.f15077f[i7];
        }
        this.f15079h = -1;
        this.f15080i = -1;
        this.f15081j = false;
        this.f15072a = 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final boolean contains(g gVar) {
        int i7 = this.f15079h;
        if (i7 == -1) {
            return false;
        }
        for (int i10 = 0; i7 != -1 && i10 < this.f15072a; i10++) {
            if (this.f15076e[i7] == gVar.f15111b) {
                return true;
            }
            i7 = this.f15077f[i7];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final void display() {
        int i7 = this.f15072a;
        System.out.print("{ ");
        for (int i10 = 0; i10 < i7; i10++) {
            g variable = getVariable(i10);
            if (variable != null) {
                System.out.print(variable + " = " + getVariableValue(i10) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final void divideByAmount(float f10) {
        int i7 = this.f15079h;
        for (int i10 = 0; i7 != -1 && i10 < this.f15072a; i10++) {
            float[] fArr = this.f15078g;
            fArr[i7] = fArr[i7] / f10;
            i7 = this.f15077f[i7];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final float get(g gVar) {
        int i7 = this.f15079h;
        for (int i10 = 0; i7 != -1 && i10 < this.f15072a; i10++) {
            if (this.f15076e[i7] == gVar.f15111b) {
                return this.f15078g[i7];
            }
            i7 = this.f15077f[i7];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final int getCurrentSize() {
        return this.f15072a;
    }

    @Override // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final g getVariable(int i7) {
        int i10 = this.f15079h;
        for (int i11 = 0; i10 != -1 && i11 < this.f15072a; i11++) {
            if (i11 == i7) {
                return ((g[]) this.f15074c.f14622c)[this.f15076e[i10]];
            }
            i10 = this.f15077f[i10];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final float getVariableValue(int i7) {
        int i10 = this.f15079h;
        for (int i11 = 0; i10 != -1 && i11 < this.f15072a; i11++) {
            if (i11 == i7) {
                return this.f15078g[i10];
            }
            i10 = this.f15077f[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final int indexOf(g gVar) {
        int i7 = this.f15079h;
        if (i7 == -1) {
            return -1;
        }
        for (int i10 = 0; i7 != -1 && i10 < this.f15072a; i10++) {
            if (this.f15076e[i7] == gVar.f15111b) {
                return i7;
            }
            i7 = this.f15077f[i7];
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final void invert() {
        int i7 = this.f15079h;
        for (int i10 = 0; i7 != -1 && i10 < this.f15072a; i10++) {
            float[] fArr = this.f15078g;
            fArr[i7] = fArr[i7] * (-1.0f);
            i7 = this.f15077f[i7];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final void put(g gVar, float f10) {
        if (f10 == 0.0f) {
            remove(gVar, true);
            return;
        }
        int i7 = this.f15079h;
        b bVar = this.f15073b;
        if (i7 == -1) {
            this.f15079h = 0;
            this.f15078g[0] = f10;
            this.f15076e[0] = gVar.f15111b;
            this.f15077f[0] = -1;
            gVar.f15120p++;
            gVar.a(bVar);
            this.f15072a++;
            if (this.f15081j) {
                return;
            }
            int i10 = this.f15080i + 1;
            this.f15080i = i10;
            int[] iArr = this.f15076e;
            if (i10 >= iArr.length) {
                this.f15081j = true;
                this.f15080i = iArr.length - 1;
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i7 != -1 && i12 < this.f15072a; i12++) {
            int i13 = this.f15076e[i7];
            int i14 = gVar.f15111b;
            if (i13 == i14) {
                this.f15078g[i7] = f10;
                return;
            }
            if (i13 < i14) {
                i11 = i7;
            }
            i7 = this.f15077f[i7];
        }
        int length = this.f15080i;
        int i15 = length + 1;
        if (this.f15081j) {
            int[] iArr2 = this.f15076e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i15;
        }
        int[] iArr3 = this.f15076e;
        if (length >= iArr3.length && this.f15072a < iArr3.length) {
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f15076e;
                if (i16 >= iArr4.length) {
                    break;
                }
                if (iArr4[i16] == -1) {
                    length = i16;
                    break;
                }
                i16++;
            }
        }
        int[] iArr5 = this.f15076e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i17 = this.f15075d * 2;
            this.f15075d = i17;
            this.f15081j = false;
            this.f15080i = length - 1;
            this.f15078g = Arrays.copyOf(this.f15078g, i17);
            this.f15076e = Arrays.copyOf(this.f15076e, this.f15075d);
            this.f15077f = Arrays.copyOf(this.f15077f, this.f15075d);
        }
        this.f15076e[length] = gVar.f15111b;
        this.f15078g[length] = f10;
        if (i11 != -1) {
            int[] iArr6 = this.f15077f;
            iArr6[length] = iArr6[i11];
            iArr6[i11] = length;
        } else {
            this.f15077f[length] = this.f15079h;
            this.f15079h = length;
        }
        gVar.f15120p++;
        gVar.a(bVar);
        int i18 = this.f15072a + 1;
        this.f15072a = i18;
        if (!this.f15081j) {
            this.f15080i++;
        }
        int[] iArr7 = this.f15076e;
        if (i18 >= iArr7.length) {
            this.f15081j = true;
        }
        if (this.f15080i >= iArr7.length) {
            this.f15081j = true;
            this.f15080i = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final float remove(g gVar, boolean z3) {
        int i7 = this.f15079h;
        if (i7 == -1) {
            return 0.0f;
        }
        int i10 = 0;
        int i11 = -1;
        while (i7 != -1 && i10 < this.f15072a) {
            if (this.f15076e[i7] == gVar.f15111b) {
                if (i7 == this.f15079h) {
                    this.f15079h = this.f15077f[i7];
                } else {
                    int[] iArr = this.f15077f;
                    iArr[i11] = iArr[i7];
                }
                if (z3) {
                    gVar.b(this.f15073b);
                }
                gVar.f15120p--;
                this.f15072a--;
                this.f15076e[i7] = -1;
                if (this.f15081j) {
                    this.f15080i = i7;
                }
                return this.f15078g[i7];
            }
            i10++;
            i11 = i7;
            i7 = this.f15077f[i7];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final int sizeInBytes() {
        return (this.f15076e.length * 12) + 36;
    }

    public final String toString() {
        int i7 = this.f15079h;
        String string = "";
        for (int i10 = 0; i7 != -1 && i10 < this.f15072a; i10++) {
            StringBuilder sbS = u.s(q0.j(string, " -> "));
            sbS.append(this.f15078g[i7]);
            sbS.append(" : ");
            StringBuilder sbS2 = u.s(sbS.toString());
            sbS2.append(((g[]) this.f15074c.f14622c)[this.f15076e[i7]]);
            string = sbS2.toString();
            i7 = this.f15077f[i7];
        }
        return string;
    }

    @Override // androidx.constraintlayout.core.ArrayRow$ArrayRowVariables
    public final float use(b bVar, boolean z3) {
        float f10 = get(bVar.f15082a);
        remove(bVar.f15082a, z3);
        ArrayRow$ArrayRowVariables arrayRow$ArrayRowVariables = bVar.f15085d;
        int currentSize = arrayRow$ArrayRowVariables.getCurrentSize();
        for (int i7 = 0; i7 < currentSize; i7++) {
            g variable = arrayRow$ArrayRowVariables.getVariable(i7);
            add(variable, arrayRow$ArrayRowVariables.get(variable) * f10, z3);
        }
        return f10;
    }
}
