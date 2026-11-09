package p066e9;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f36236a = new float[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f36237b = new float[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f36238c = new long[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f36239d;

    public final void a(float f10, float f11, long j6) {
        long[] jArr;
        int i7 = -1;
        int i10 = 0;
        while (true) {
            jArr = this.f36238c;
            if (i10 >= 4) {
                break;
            }
            long j10 = jArr[i10];
            if (j10 == 0) {
                break;
            }
            if (j10 < j6 - 200) {
                i7 = i10;
            }
            i10++;
        }
        if (i10 == 4 && i7 < 0) {
            i7 = 0;
        }
        if (i7 == i10) {
            i7--;
        }
        float[] fArr = this.f36236a;
        float[] fArr2 = this.f36237b;
        if (i7 >= 0) {
            int i11 = i7 + 1;
            int i12 = 3 - i7;
            System.arraycopy(fArr, i11, fArr, 0, i12);
            System.arraycopy(fArr2, i11, fArr2, 0, i12);
            System.arraycopy(jArr, i11, jArr, 0, i12);
            i10 -= i11;
        }
        fArr[i10] = f10;
        fArr2[i10] = f11;
        jArr[i10] = j6;
        int i13 = i10 + 1;
        if (i13 < 4) {
            jArr[i13] = 0;
        }
    }
}
