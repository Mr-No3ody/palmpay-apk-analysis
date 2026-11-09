package com.airbnb.lottie.model.content;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f19922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f19923b;

    public b(int[] iArr, float[] fArr) {
        this.f19922a = fArr;
        this.f19923b = iArr;
    }

    public final void a(b bVar) {
        int i7 = 0;
        while (true) {
            int[] iArr = bVar.f19923b;
            if (i7 >= iArr.length) {
                return;
            }
            this.f19922a[i7] = bVar.f19922a[i7];
            this.f19923b[i7] = iArr[i7];
            i7++;
        }
    }

    public final b b(float[] fArr) {
        int iG;
        int[] iArr = new int[fArr.length];
        for (int i7 = 0; i7 < fArr.length; i7++) {
            float f10 = fArr[i7];
            float[] fArr2 = this.f19922a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f10);
            int[] iArr2 = this.f19923b;
            if (iBinarySearch >= 0) {
                iG = iArr2[iBinarySearch];
            } else {
                int i10 = -(iBinarySearch + 1);
                if (i10 == 0) {
                    iG = iArr2[0];
                } else if (i10 == iArr2.length - 1) {
                    iG = iArr2[iArr2.length - 1];
                } else {
                    int i11 = i10 - 1;
                    float f11 = fArr2[i11];
                    iG = androidx.camera.core.impl.utils.n.g((f10 - f11) / (fArr2[i10] - f11), iArr2[i11], iArr2[i10]);
                }
            }
            iArr[i7] = iG;
        }
        return new b(iArr, fArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (Arrays.equals(this.f19922a, bVar.f19922a) && Arrays.equals(this.f19923b, bVar.f19923b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19923b) + (Arrays.hashCode(this.f19922a) * 31);
    }
}
