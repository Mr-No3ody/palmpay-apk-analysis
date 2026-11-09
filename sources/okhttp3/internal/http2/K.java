package okhttp3.internal.http2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f40800b = new int[10];

    static {
        new J(null);
    }

    public final int a() {
        if ((this.f40799a & 128) != 0) {
            return this.f40800b[7];
        }
        return 65535;
    }

    public final void b(K other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i7 = 0; i7 < 10; i7++) {
            if (((1 << i7) & other.f40799a) != 0) {
                c(i7, other.f40800b[i7]);
            }
        }
    }

    public final void c(int i7, int i10) {
        if (i7 >= 0) {
            int[] iArr = this.f40800b;
            if (i7 >= iArr.length) {
                return;
            }
            this.f40799a = (1 << i7) | this.f40799a;
            iArr[i7] = i10;
        }
    }
}
