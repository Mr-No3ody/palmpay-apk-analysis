package M;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C1846m;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Collection, Set, KMutableCollection, KMutableSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f5679a = N.a.f6025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f5680b = N.a.f6027c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5681c;

    public g(int i7) {
        if (i7 > 0) {
            k.b(this, i7);
        }
    }

    public final Object a(int i7) {
        int i10 = this.f5681c;
        Object[] objArr = this.f5680b;
        Object obj = objArr[i7];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f5679a;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i7 < i11) {
                int i12 = i7 + 1;
                C1846m.d(i7, i12, iArr, iArr, i10);
                Object[] objArr2 = this.f5680b;
                C1846m.f(objArr2, i7, objArr2, i12, i10);
            }
            this.f5680b[i11] = null;
        } else {
            k.b(this, i10 > 8 ? i10 + (i10 >> 1) : 8);
            if (i7 > 0) {
                C1846m.d(0, 0, iArr, this.f5679a, i7);
                C1846m.g(objArr, 0, this.f5680b, i7, 6);
            }
            if (i7 < i11) {
                int i13 = i7 + 1;
                C1846m.d(i7, i13, iArr, this.f5679a, i10);
                C1846m.f(objArr, i7, this.f5680b, i13, i10);
            }
        }
        if (i10 != this.f5681c) {
            throw new ConcurrentModificationException();
        }
        this.f5681c = i11;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i7;
        int iC;
        int i10 = this.f5681c;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            iC = k.c(this, null, 0);
            i7 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i7 = iHashCode;
            iC = k.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i11 = ~iC;
        int[] iArr = this.f5679a;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f5680b;
            k.b(this, i12);
            if (i10 != this.f5681c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f5679a;
            if (iArr2.length != 0) {
                C1846m.d(0, 0, iArr, iArr2, iArr.length);
                C1846m.g(objArr, 0, this.f5680b, objArr.length, 6);
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f5679a;
            int i13 = i11 + 1;
            C1846m.d(i13, i11, iArr3, iArr3, i10);
            Object[] objArr2 = this.f5680b;
            C1846m.f(objArr2, i13, objArr2, i11, i10);
        }
        int i14 = this.f5681c;
        if (i10 == i14) {
            int[] iArr4 = this.f5679a;
            if (i11 < iArr4.length) {
                iArr4[i11] = i7;
                this.f5680b[i11] = obj;
                this.f5681c = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size() + this.f5681c;
        int i7 = this.f5681c;
        int[] iArr = this.f5679a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f5680b;
            k.b(this, size);
            int i10 = this.f5681c;
            if (i10 > 0) {
                C1846m.d(0, 0, iArr, this.f5679a, i10);
                C1846m.g(objArr, 0, this.f5680b, this.f5681c, 6);
            }
        }
        if (this.f5681c != i7) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f5681c != 0) {
            int[] iArr = N.a.f6025a;
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            this.f5679a = iArr;
            Object[] objArr = N.a.f6027c;
            Intrinsics.checkNotNullParameter(objArr, "<set-?>");
            this.f5680b = objArr;
            this.f5681c = 0;
        }
        if (this.f5681c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int iC;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            iC = k.c(this, null, 0);
        } else {
            iC = k.c(this, obj, obj.hashCode());
        }
        return iC >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f5681c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i7 = this.f5681c;
            for (int i10 = 0; i10 < i7; i10++) {
                if (!((Set) obj).contains(this.f5680b[i10])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f5679a;
        int i7 = this.f5681c;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5681c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            iC = k.c(this, null, 0);
        } else {
            iC = k.c(this, obj, obj.hashCode());
        }
        if (iC < 0) {
            return false;
        }
        a(iC);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z3 = false;
        for (int i7 = this.f5681c - 1; -1 < i7; i7--) {
            if (!CollectionsKt.A(elements, this.f5680b[i7])) {
                a(i7);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f5681c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return C1846m.h(0, this.f5681c, this.f5680b);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f5681c * 14);
        sb2.append('{');
        int i7 = this.f5681c;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f5680b[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] result) {
        Intrinsics.checkNotNullParameter(result, "array");
        int i7 = this.f5681c;
        if (result.length < i7) {
            result = (Object[]) Array.newInstance(result.getClass().getComponentType(), i7);
        } else if (result.length > i7) {
            result[i7] = null;
        }
        C1846m.f(this.f5680b, 0, result, 0, this.f5681c);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }
}
