package M;

import java.util.Arrays;
import kotlin.collections.C1846m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f5696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f5697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f5698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f5699d;

    public o(int i7) {
        if (i7 == 0) {
            this.f5697b = N.a.f6025a;
            this.f5698c = N.a.f6027c;
            return;
        }
        int i10 = i7 * 4;
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                i10 = i12;
                break;
            }
        }
        int i13 = i10 / 4;
        this.f5697b = new int[i13];
        this.f5698c = new Object[i13];
    }

    public final void a(int i7, Object obj) {
        int i10 = this.f5699d;
        if (i10 != 0 && i7 <= this.f5697b[i10 - 1]) {
            d(i7, obj);
            return;
        }
        if (this.f5696a && i10 >= this.f5697b.length) {
            k.a(this);
        }
        int i11 = this.f5699d;
        if (i11 >= this.f5697b.length) {
            int i12 = (i11 + 1) * 4;
            for (int i13 = 4; i13 < 32; i13++) {
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
            }
            int i15 = i12 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f5697b, i15);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f5697b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f5698c, i15);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f5698c = objArrCopyOf;
        }
        this.f5697b[i11] = i7;
        this.f5698c[i11] = obj;
        this.f5699d = i11 + 1;
    }

    public final Object b(int i7) {
        Object obj;
        Intrinsics.checkNotNullParameter(this, "<this>");
        int iA = N.a.a(this.f5699d, i7, this.f5697b);
        if (iA < 0 || (obj = this.f5698c[iA]) == k.f5690c) {
            return null;
        }
        return obj;
    }

    public final int c(int i7) {
        if (this.f5696a) {
            k.a(this);
        }
        return this.f5697b[i7];
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.f(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        o oVar = (o) objClone;
        oVar.f5697b = (int[]) this.f5697b.clone();
        oVar.f5698c = (Object[]) this.f5698c.clone();
        return oVar;
    }

    public final void d(int i7, Object obj) {
        int iA = N.a.a(this.f5699d, i7, this.f5697b);
        if (iA >= 0) {
            this.f5698c[iA] = obj;
            return;
        }
        int i10 = ~iA;
        int i11 = this.f5699d;
        if (i10 < i11) {
            Object[] objArr = this.f5698c;
            if (objArr[i10] == k.f5690c) {
                this.f5697b[i10] = i7;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f5696a && i11 >= this.f5697b.length) {
            k.a(this);
            i10 = ~N.a.a(this.f5699d, i7, this.f5697b);
        }
        int i12 = this.f5699d;
        if (i12 >= this.f5697b.length) {
            int i13 = (i12 + 1) * 4;
            for (int i14 = 4; i14 < 32; i14++) {
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
            }
            int i16 = i13 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f5697b, i16);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f5697b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f5698c, i16);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f5698c = objArrCopyOf;
        }
        int i17 = this.f5699d;
        if (i17 - i10 != 0) {
            int[] iArr = this.f5697b;
            int i18 = i10 + 1;
            C1846m.d(i18, i10, iArr, iArr, i17);
            Object[] objArr2 = this.f5698c;
            C1846m.f(objArr2, i18, objArr2, i10, this.f5699d);
        }
        this.f5697b[i10] = i7;
        this.f5698c[i10] = obj;
        this.f5699d++;
    }

    public final int e() {
        if (this.f5696a) {
            k.a(this);
        }
        return this.f5699d;
    }

    public final Object f(int i7) {
        if (this.f5696a) {
            k.a(this);
        }
        return this.f5698c[i7];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f5699d * 28);
        sb2.append('{');
        int i7 = this.f5699d;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(c(i10));
            sb2.append('=');
            Object objF = f(i10);
            if (objF != this) {
                sb2.append(objF);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }

    public o() {
        this(10);
    }
}
