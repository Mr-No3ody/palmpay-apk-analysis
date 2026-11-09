package M;

import C0.G;
import java.util.Arrays;
import kotlin.collections.C1846m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f5684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f5685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f5686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f5687d;

    public j(int i7) {
        if (i7 == 0) {
            this.f5685b = N.a.f6026b;
            this.f5686c = N.a.f6027c;
            return;
        }
        int i10 = i7 * 8;
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                i10 = i12;
                break;
            }
        }
        int i13 = i10 / 8;
        this.f5685b = new long[i13];
        this.f5686c = new Object[i13];
    }

    public final void a() {
        int i7 = this.f5687d;
        Object[] objArr = this.f5686c;
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = null;
        }
        this.f5687d = 0;
        this.f5684a = false;
    }

    public final Object b(long j6) {
        Object obj;
        int iB = N.a.b(this.f5685b, this.f5687d, j6);
        if (iB < 0 || (obj = this.f5686c[iB]) == k.f5688a) {
            return null;
        }
        return obj;
    }

    public final int c(long j6) {
        if (this.f5684a) {
            int i7 = this.f5687d;
            long[] jArr = this.f5685b;
            Object[] objArr = this.f5686c;
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                Object obj = objArr[i11];
                if (obj != k.f5688a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f5684a = false;
            this.f5687d = i10;
        }
        return N.a.b(this.f5685b, this.f5687d, j6);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.f(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        j jVar = (j) objClone;
        jVar.f5685b = (long[]) this.f5685b.clone();
        jVar.f5686c = (Object[]) this.f5686c.clone();
        return jVar;
    }

    public final long d(int i7) {
        int i10;
        if (i7 < 0 || i7 >= (i10 = this.f5687d)) {
            throw new IllegalArgumentException(G.m(i7, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f5684a) {
            long[] jArr = this.f5685b;
            Object[] objArr = this.f5686c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != k.f5688a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f5684a = false;
            this.f5687d = i11;
        }
        return this.f5685b[i7];
    }

    public final void e(long j6, Object obj) {
        int iB = N.a.b(this.f5685b, this.f5687d, j6);
        if (iB >= 0) {
            this.f5686c[iB] = obj;
            return;
        }
        int i7 = ~iB;
        int i10 = this.f5687d;
        Object obj2 = k.f5688a;
        if (i7 < i10) {
            Object[] objArr = this.f5686c;
            if (objArr[i7] == obj2) {
                this.f5685b[i7] = j6;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f5684a) {
            long[] jArr = this.f5685b;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.f5686c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f5684a = false;
                this.f5687d = i11;
                i7 = ~N.a.b(this.f5685b, i11, j6);
            }
        }
        int i13 = this.f5687d;
        if (i13 >= this.f5685b.length) {
            int i14 = (i13 + 1) * 8;
            for (int i15 = 4; i15 < 32; i15++) {
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
            }
            int i17 = i14 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f5685b, i17);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.f5685b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f5686c, i17);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f5686c = objArrCopyOf;
        }
        int i18 = this.f5687d - i7;
        if (i18 != 0) {
            long[] destination = this.f5685b;
            int i19 = i7 + 1;
            Intrinsics.checkNotNullParameter(destination, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            System.arraycopy(destination, i7, destination, i19, i18);
            Object[] objArr3 = this.f5686c;
            C1846m.f(objArr3, i19, objArr3, i7, this.f5687d);
        }
        this.f5685b[i7] = j6;
        this.f5686c[i7] = obj;
        this.f5687d++;
    }

    public final void f(long j6) {
        int iB = N.a.b(this.f5685b, this.f5687d, j6);
        if (iB >= 0) {
            Object[] objArr = this.f5686c;
            Object obj = objArr[iB];
            Object obj2 = k.f5688a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f5684a = true;
            }
        }
    }

    public final int g() {
        if (this.f5684a) {
            int i7 = this.f5687d;
            long[] jArr = this.f5685b;
            Object[] objArr = this.f5686c;
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                Object obj = objArr[i11];
                if (obj != k.f5688a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f5684a = false;
            this.f5687d = i10;
        }
        return this.f5687d;
    }

    public final Object h(int i7) {
        int i10;
        if (i7 < 0 || i7 >= (i10 = this.f5687d)) {
            throw new IllegalArgumentException(G.m(i7, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f5684a) {
            long[] jArr = this.f5685b;
            Object[] objArr = this.f5686c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != k.f5688a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f5684a = false;
            this.f5687d = i11;
        }
        return this.f5686c[i7];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f5687d * 28);
        sb2.append('{');
        int i7 = this.f5687d;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(d(i10));
            sb2.append('=');
            Object objH = h(i10);
            if (objH != sb2) {
                sb2.append(objH);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public j() {
        this(10);
    }
}
