package M;

import C0.G;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.C1846m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f5693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f5694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5695c;

    public n(int i7) {
        this.f5693a = i7 == 0 ? N.a.f6025a : new int[i7];
        this.f5694b = i7 == 0 ? N.a.f6027c : new Object[i7 << 1];
    }

    public final int a(Object obj) {
        int i7 = this.f5695c * 2;
        Object[] objArr = this.f5694b;
        if (obj == null) {
            for (int i10 = 1; i10 < i7; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i7; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i7) {
        int i10 = this.f5695c;
        int[] iArr = this.f5693a;
        if (iArr.length < i7) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f5693a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f5694b, i7 * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f5694b = objArrCopyOf;
        }
        if (this.f5695c != i10) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i7, Object obj) {
        int i10 = this.f5695c;
        if (i10 == 0) {
            return -1;
        }
        int iA = N.a.a(i10, i7, this.f5693a);
        if (iA < 0 || Intrinsics.c(obj, this.f5694b[iA << 1])) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f5693a[i11] == i7) {
            if (Intrinsics.c(obj, this.f5694b[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f5693a[i12] == i7; i12--) {
            if (Intrinsics.c(obj, this.f5694b[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public void clear() {
        if (this.f5695c > 0) {
            this.f5693a = N.a.f6025a;
            this.f5694b = N.a.f6027c;
            this.f5695c = 0;
        }
        if (this.f5695c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i7 = this.f5695c;
        if (i7 == 0) {
            return -1;
        }
        int iA = N.a.a(i7, 0, this.f5693a);
        if (iA < 0 || this.f5694b[iA << 1] == null) {
            return iA;
        }
        int i10 = iA + 1;
        while (i10 < i7 && this.f5693a[i10] == 0) {
            if (this.f5694b[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iA - 1; i11 >= 0 && this.f5693a[i11] == 0; i11--) {
            if (this.f5694b[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof n) {
                int i7 = this.f5695c;
                if (i7 != ((n) obj).f5695c) {
                    return false;
                }
                n nVar = (n) obj;
                for (int i10 = 0; i10 < i7; i10++) {
                    Object objF = f(i10);
                    Object objJ = j(i10);
                    Object obj2 = nVar.get(objF);
                    if (objJ == null) {
                        if (obj2 != null || !nVar.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objJ.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f5695c != ((Map) obj).size()) {
                return false;
            }
            int i11 = this.f5695c;
            for (int i12 = 0; i12 < i11; i12++) {
                Object objF2 = f(i12);
                Object objJ2 = j(i12);
                Object obj3 = ((Map) obj).get(objF2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objJ2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i7) {
        if (i7 < 0 || i7 >= this.f5695c) {
            throw new IllegalArgumentException(G.m(i7, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f5694b[i7 << 1];
    }

    public void g(f map) {
        Intrinsics.checkNotNullParameter(map, "map");
        int i7 = map.f5695c;
        b(this.f5695c + i7);
        if (this.f5695c != 0) {
            for (int i10 = 0; i10 < i7; i10++) {
                put(map.f(i10), map.j(i10));
            }
        } else if (i7 > 0) {
            C1846m.d(0, 0, map.f5693a, this.f5693a, i7);
            C1846m.f(map.f5694b, 0, this.f5694b, 0, i7 << 1);
            this.f5695c = i7;
        }
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f5694b[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f5694b[(iD << 1) + 1] : obj2;
    }

    public Object h(int i7) {
        int i10;
        if (i7 < 0 || i7 >= (i10 = this.f5695c)) {
            throw new IllegalArgumentException(G.m(i7, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f5694b;
        int i11 = i7 << 1;
        Object obj = objArr[i11 + 1];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i12 = i10 - 1;
        int[] iArr = this.f5693a;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i7 < i12) {
                int i13 = i7 + 1;
                C1846m.d(i7, i13, iArr, iArr, i10);
                Object[] objArr2 = this.f5694b;
                C1846m.f(objArr2, i11, objArr2, i13 << 1, i10 << 1);
            }
            Object[] objArr3 = this.f5694b;
            int i14 = i12 << 1;
            objArr3[i14] = null;
            objArr3[i14 + 1] = null;
        } else {
            int i15 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i15);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f5693a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f5694b, i15 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f5694b = objArrCopyOf;
            if (i10 != this.f5695c) {
                throw new ConcurrentModificationException();
            }
            if (i7 > 0) {
                C1846m.d(0, 0, iArr, this.f5693a, i7);
                C1846m.f(objArr, 0, this.f5694b, 0, i11);
            }
            if (i7 < i12) {
                int i16 = i7 + 1;
                C1846m.d(i7, i16, iArr, this.f5693a, i10);
                C1846m.f(objArr, i11, this.f5694b, i16 << 1, i10 << 1);
            }
        }
        if (i10 != this.f5695c) {
            throw new ConcurrentModificationException();
        }
        this.f5695c = i12;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f5693a;
        Object[] objArr = this.f5694b;
        int i7 = this.f5695c;
        int i10 = 1;
        int i11 = 0;
        int iHashCode = 0;
        while (i11 < i7) {
            Object obj = objArr[i10];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return iHashCode;
    }

    public Object i(int i7, Object obj) {
        if (i7 < 0 || i7 >= this.f5695c) {
            throw new IllegalArgumentException(G.m(i7, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i10 = (i7 << 1) + 1;
        Object[] objArr = this.f5694b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f5695c <= 0;
    }

    public final Object j(int i7) {
        if (i7 < 0 || i7 >= this.f5695c) {
            throw new IllegalArgumentException(G.m(i7, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f5694b[(i7 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i7 = this.f5695c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i10 = (iC << 1) + 1;
            Object[] objArr = this.f5694b;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~iC;
        int[] iArr = this.f5693a;
        if (i7 >= iArr.length) {
            int i12 = 8;
            if (i7 >= 8) {
                i12 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i12 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f5693a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f5694b, i12 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f5694b = objArrCopyOf;
            if (i7 != this.f5695c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i7) {
            int[] iArr2 = this.f5693a;
            int i13 = i11 + 1;
            C1846m.d(i13, i11, iArr2, iArr2, i7);
            Object[] objArr2 = this.f5694b;
            C1846m.f(objArr2, i13 << 1, objArr2, i11 << 1, this.f5695c << 1);
        }
        int i14 = this.f5695c;
        if (i7 == i14) {
            int[] iArr3 = this.f5693a;
            if (i11 < iArr3.length) {
                iArr3[i11] = iHashCode;
                Object[] objArr3 = this.f5694b;
                int i15 = i11 << 1;
                objArr3[i15] = obj;
                objArr3[i15 + 1] = obj2;
                this.f5695c = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return i(iD, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f5695c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f5695c * 28);
        sb2.append('{');
        int i7 = this.f5695c;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object objF = f(i10);
            if (objF != sb2) {
                sb2.append(objF);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objJ = j(i10);
            if (objJ != sb2) {
                sb2.append(objJ);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !Intrinsics.c(obj2, j(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !Intrinsics.c(obj2, j(iD))) {
            return false;
        }
        i(iD, obj3);
        return true;
    }
}
