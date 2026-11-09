package androidx.constraintlayout.core;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15110a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15114e;
    public int t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15111b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15112c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15113d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15115f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f15116g = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f15117i = new float[9];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b[] f15118j = new b[16];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15119o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15120p = 0;

    public g(int i7) {
        this.t = i7;
    }

    public final void a(b bVar) {
        int i7 = 0;
        while (true) {
            int i10 = this.f15119o;
            if (i7 >= i10) {
                b[] bVarArr = this.f15118j;
                if (i10 >= bVarArr.length) {
                    this.f15118j = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f15118j;
                int i11 = this.f15119o;
                bVarArr2[i11] = bVar;
                this.f15119o = i11 + 1;
                return;
            }
            if (this.f15118j[i7] == bVar) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final void b(b bVar) {
        int i7 = this.f15119o;
        int i10 = 0;
        while (i10 < i7) {
            if (this.f15118j[i10] == bVar) {
                while (i10 < i7 - 1) {
                    b[] bVarArr = this.f15118j;
                    int i11 = i10 + 1;
                    bVarArr[i10] = bVarArr[i11];
                    i10 = i11;
                }
                this.f15119o--;
                return;
            }
            i10++;
        }
    }

    public final void c() {
        this.t = 5;
        this.f15113d = 0;
        this.f15111b = -1;
        this.f15112c = -1;
        this.f15114e = 0.0f;
        this.f15115f = false;
        int i7 = this.f15119o;
        for (int i10 = 0; i10 < i7; i10++) {
            this.f15118j[i10] = null;
        }
        this.f15119o = 0;
        this.f15120p = 0;
        this.f15110a = false;
        Arrays.fill(this.f15117i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f15111b - ((g) obj).f15111b;
    }

    public final void d(c cVar, float f10) {
        this.f15114e = f10;
        this.f15115f = true;
        int i7 = this.f15119o;
        this.f15112c = -1;
        for (int i10 = 0; i10 < i7; i10++) {
            this.f15118j[i10].updateFromFinalVariable(cVar, this, false);
        }
        this.f15119o = 0;
    }

    public final void e(c cVar, b bVar) {
        int i7 = this.f15119o;
        for (int i10 = 0; i10 < i7; i10++) {
            this.f15118j[i10].updateFromRow(cVar, bVar, false);
        }
        this.f15119o = 0;
    }

    public final String toString() {
        return "" + this.f15111b;
    }
}
