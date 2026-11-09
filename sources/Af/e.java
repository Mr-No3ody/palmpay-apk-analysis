package Af;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.AbstractC1836c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Map, Serializable, KMutableMap {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final e f327A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final a f328w = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f335g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f337j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j f338o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k f339p;
    public i t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f340v;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int computeHashSize(int i7) {
            if (i7 < 1) {
                i7 = 1;
            }
            return Integer.highestOneBit(i7 * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int computeShift(int i7) {
            return Integer.numberOfLeadingZeros(i7) + 1;
        }

        @NotNull
        public final e getEmpty$kotlin_stdlib() {
            return e.f327A;
        }

        private a() {
        }
    }

    static {
        e eVar = new e(0);
        eVar.f340v = true;
        f327A = eVar;
    }

    public e() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iJ = j(obj);
            int i7 = this.f333e * 2;
            int length = this.f332d.length / 2;
            if (i7 > length) {
                i7 = length;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f332d;
                int i11 = iArr[iJ];
                if (i11 <= 0) {
                    int i12 = this.f334f;
                    Object[] objArr = this.f329a;
                    if (i12 >= objArr.length) {
                        g(1);
                        break;
                    }
                    int i13 = i12 + 1;
                    this.f334f = i13;
                    objArr[i12] = obj;
                    this.f331c[i12] = iJ;
                    iArr[iJ] = i13;
                    this.f337j++;
                    this.f336i++;
                    if (i10 > this.f333e) {
                        this.f333e = i10;
                    }
                    return i12;
                }
                if (Intrinsics.c(this.f329a[i11 - 1], obj)) {
                    return -i11;
                }
                i10++;
                if (i10 > i7) {
                    k(this.f332d.length * 2);
                    break;
                }
                iJ = iJ == 0 ? this.f332d.length - 1 : iJ - 1;
            }
        }
    }

    public final e b() {
        c();
        this.f340v = true;
        if (this.f337j > 0) {
            return this;
        }
        e eVar = f327A;
        Intrinsics.f(eVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return eVar;
    }

    public final void c() {
        if (this.f340v) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i7 = this.f334f - 1;
        if (i7 >= 0) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f331c;
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    this.f332d[i11] = 0;
                    iArr[i10] = -1;
                }
                if (i10 == i7) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        G8.a.J(0, this.f334f, this.f329a);
        Object[] objArr = this.f330b;
        if (objArr != null) {
            G8.a.J(0, this.f334f, objArr);
        }
        this.f337j = 0;
        this.f334f = 0;
        this.f336i++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z3) {
        int i7;
        Object[] objArr = this.f330b;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i7 = this.f334f;
            if (i10 >= i7) {
                break;
            }
            int[] iArr = this.f331c;
            int i12 = iArr[i10];
            if (i12 >= 0) {
                Object[] objArr2 = this.f329a;
                objArr2[i11] = objArr2[i10];
                if (objArr != null) {
                    objArr[i11] = objArr[i10];
                }
                if (z3) {
                    iArr[i11] = i12;
                    this.f332d[i12] = i11 + 1;
                }
                i11++;
            }
            i10++;
        }
        G8.a.J(i11, i7, this.f329a);
        if (objArr != null) {
            G8.a.J(i11, this.f334f, objArr);
        }
        this.f334f = i11;
    }

    public final boolean e(Collection m7) {
        Intrinsics.checkNotNullParameter(m7, "m");
        for (Object obj : m7) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        i iVar = this.t;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this);
        this.t = iVar2;
        return iVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f337j == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int iH = h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = this.f330b;
        Intrinsics.e(objArr);
        return Intrinsics.c(objArr[iH], entry.getValue());
    }

    public final void g(int i7) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f329a;
        int length = objArr.length;
        int i10 = this.f334f;
        int i11 = length - i10;
        int i12 = i10 - this.f337j;
        if (i11 < i7 && i11 + i12 >= i7 && i12 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i13 = i10 + i7;
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        if (i13 > objArr.length) {
            int iNewCapacity$kotlin_stdlib = AbstractC1836c.f38922a.newCapacity$kotlin_stdlib(objArr.length, i13);
            Object[] objArr2 = this.f329a;
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, iNewCapacity$kotlin_stdlib);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
            this.f329a = objArrCopyOf2;
            Object[] objArr3 = this.f330b;
            if (objArr3 != null) {
                Intrinsics.checkNotNullParameter(objArr3, "<this>");
                objArrCopyOf = Arrays.copyOf(objArr3, iNewCapacity$kotlin_stdlib);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f330b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f331c, iNewCapacity$kotlin_stdlib);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f331c = iArrCopyOf;
            int iComputeHashSize = f328w.computeHashSize(iNewCapacity$kotlin_stdlib);
            if (iComputeHashSize > this.f332d.length) {
                k(iComputeHashSize);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f330b;
        Intrinsics.e(objArr);
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i7 = this.f333e;
        while (true) {
            int i10 = this.f332d[iJ];
            if (i10 == 0) {
                return -1;
            }
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (Intrinsics.c(this.f329a[i11], obj)) {
                    return i11;
                }
            }
            i7--;
            if (i7 < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f332d.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        Intrinsics.checkNotNullParameter(this, "map");
        f fVar = new f(this, 0);
        int i7 = 0;
        while (fVar.hasNext()) {
            int i10 = fVar.f345a;
            e eVar = (e) fVar.f348d;
            if (i10 >= eVar.f334f) {
                throw new NoSuchElementException();
            }
            fVar.f345a = i10 + 1;
            fVar.f346b = i10;
            Object obj = eVar.f329a[i10];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = eVar.f330b;
            Intrinsics.e(objArr);
            Object obj2 = objArr[fVar.f346b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            fVar.e();
            i7 += iHashCode ^ iHashCode2;
        }
        return i7;
    }

    public final int i(Object obj) {
        int i7 = this.f334f;
        while (true) {
            i7--;
            if (i7 < 0) {
                return -1;
            }
            if (this.f331c[i7] >= 0) {
                Object[] objArr = this.f330b;
                Intrinsics.e(objArr);
                if (Intrinsics.c(objArr[i7], obj)) {
                    return i7;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f337j == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f335g;
    }

    public final void k(int i7) {
        int[] iArr;
        this.f336i++;
        int i10 = 0;
        if (this.f334f > this.f337j) {
            d(false);
        }
        this.f332d = new int[i7];
        this.f335g = f328w.computeShift(i7);
        while (i10 < this.f334f) {
            int i11 = i10 + 1;
            int iJ = j(this.f329a[i10]);
            int i12 = this.f333e;
            while (true) {
                iArr = this.f332d;
                if (iArr[iJ] == 0) {
                    break;
                }
                i12--;
                if (i12 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iJ = iJ == 0 ? iArr.length - 1 : iJ - 1;
            }
            iArr[iJ] = i11;
            this.f331c[i10] = iJ;
            i10 = i11;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        j jVar = this.f338o;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this);
        this.f338o = jVar2;
        return jVar2;
    }

    public final void l(int i7) {
        Object[] objArr = this.f329a;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        objArr[i7] = null;
        Object[] objArr2 = this.f330b;
        if (objArr2 != null) {
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            objArr2[i7] = null;
        }
        int length = this.f331c[i7];
        int i10 = this.f333e * 2;
        int length2 = this.f332d.length / 2;
        if (i10 > length2) {
            i10 = length2;
        }
        int i11 = i10;
        int i12 = 0;
        int i13 = length;
        do {
            length = length == 0 ? this.f332d.length - 1 : length - 1;
            i12++;
            if (i12 > this.f333e) {
                this.f332d[i13] = 0;
            } else {
                int[] iArr = this.f332d;
                int i14 = iArr[length];
                if (i14 == 0) {
                    iArr[i13] = 0;
                } else {
                    if (i14 < 0) {
                        iArr[i13] = -1;
                    } else {
                        int i15 = i14 - 1;
                        int iJ = j(this.f329a[i15]) - length;
                        int[] iArr2 = this.f332d;
                        if ((iJ & (iArr2.length - 1)) >= i12) {
                            iArr2[i13] = i14;
                            this.f331c[i15] = i13;
                        }
                        i11--;
                    }
                    i13 = length;
                    i12 = 0;
                    i11--;
                }
            }
            this.f331c[i7] = -1;
            this.f337j--;
            this.f336i++;
        } while (i11 >= 0);
        this.f332d[i13] = -1;
        this.f331c[i7] = -1;
        this.f337j--;
        this.f336i++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f330b;
        if (objArr == null) {
            int length = this.f329a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f330b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i7 = (-iA) - 1;
        Object obj3 = objArr[i7];
        objArr[i7] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        c();
        Set<Map.Entry> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f330b;
            if (objArr == null) {
                int length = this.f329a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f330b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i7 = (-iA) - 1;
                if (!Intrinsics.c(entry.getValue(), objArr[i7])) {
                    objArr[i7] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f330b;
        Intrinsics.e(objArr);
        Object obj2 = objArr[iH];
        l(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f337j;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f337j * 3) + 2);
        sb2.append("{");
        Intrinsics.checkNotNullParameter(this, "map");
        f fVar = new f(this, 0);
        int i7 = 0;
        while (fVar.hasNext()) {
            if (i7 > 0) {
                sb2.append(", ");
            }
            Intrinsics.checkNotNullParameter(sb2, "sb");
            int i10 = fVar.f345a;
            e eVar = (e) fVar.f348d;
            if (i10 >= eVar.f334f) {
                throw new NoSuchElementException();
            }
            fVar.f345a = i10 + 1;
            fVar.f346b = i10;
            Object obj = eVar.f329a[i10];
            if (obj == eVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = eVar.f330b;
            Intrinsics.e(objArr);
            Object obj2 = objArr[fVar.f346b];
            if (obj2 == eVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            fVar.e();
            i7++;
        }
        sb2.append("}");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        k kVar = this.f339p;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this);
        this.f339p = kVar2;
        return kVar2;
    }

    public e(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i7];
        int[] iArr = new int[i7];
        a aVar = f328w;
        int iComputeHashSize = aVar.computeHashSize(i7);
        this.f329a = objArr;
        this.f330b = null;
        this.f331c = iArr;
        this.f332d = new int[iComputeHashSize];
        this.f333e = 2;
        this.f334f = 0;
        this.f335g = aVar.computeShift(iComputeHashSize);
    }
}
