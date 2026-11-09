package Af;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.AbstractC1836c;
import kotlin.collections.AbstractC1840g;
import kotlin.collections.C1846m;
import kotlin.collections.C1849p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AbstractC1840g implements List, RandomAccess, Serializable, KMutableList {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final a f322d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f323e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f326c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        d dVar = new d(0);
        dVar.f326c = true;
        f323e = dVar;
    }

    public d() {
        this(0, 1, null);
    }

    @Override // kotlin.collections.AbstractC1840g
    public final int a() {
        return this.f325b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i7 = this.f325b;
        ((AbstractList) this).modCount++;
        g(i7, 1);
        this.f324a[i7] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        f();
        int size = elements.size();
        d(this.f325b, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.AbstractC1840g
    public final Object b(int i7) {
        f();
        AbstractC1836c.f38922a.checkElementIndex$kotlin_stdlib(i7, this.f325b);
        return h(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        i(0, this.f325b);
    }

    public final void d(int i7, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        g(i7, i10);
        Iterator it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f324a[i7 + i11] = it.next();
        }
    }

    public final void e(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        g(i7, 1);
        this.f324a[i7] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (G8.a.f(this.f324a, 0, this.f325b, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.f326c) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i7, int i10) {
        int i11 = this.f325b + i10;
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f324a;
        if (i11 > objArr.length) {
            int iNewCapacity$kotlin_stdlib = AbstractC1836c.f38922a.newCapacity$kotlin_stdlib(objArr.length, i11);
            Object[] objArr2 = this.f324a;
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, iNewCapacity$kotlin_stdlib);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f324a = objArrCopyOf;
        }
        Object[] objArr3 = this.f324a;
        C1846m.f(objArr3, i7 + i10, objArr3, i7, this.f325b);
        this.f325b += i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        AbstractC1836c.f38922a.checkElementIndex$kotlin_stdlib(i7, this.f325b);
        return this.f324a[i7];
    }

    public final Object h(int i7) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f324a;
        Object obj = objArr[i7];
        C1846m.f(objArr, i7, objArr, i7 + 1, this.f325b);
        Object[] objArr2 = this.f324a;
        int i10 = this.f325b - 1;
        Intrinsics.checkNotNullParameter(objArr2, "<this>");
        objArr2[i10] = null;
        this.f325b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f324a;
        int i7 = this.f325b;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i7; i10++) {
            Object obj = objArr[i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i7, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f324a;
        C1846m.f(objArr, i7, objArr, i7 + i10, this.f325b);
        Object[] objArr2 = this.f324a;
        int i11 = this.f325b;
        G8.a.J(i11 - i10, i11, objArr2);
        this.f325b -= i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i7 = 0; i7 < this.f325b; i7++) {
            if (Intrinsics.c(this.f324a[i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f325b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i7, int i10, Collection collection, boolean z3) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i7 + i11;
            if (collection.contains(this.f324a[i13]) == z3) {
                Object[] objArr = this.f324a;
                i11++;
                objArr[i12 + i7] = objArr[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        Object[] objArr2 = this.f324a;
        C1846m.f(objArr2, i7 + i12, objArr2, i10 + i7, this.f325b);
        Object[] objArr3 = this.f324a;
        int i15 = this.f325b;
        G8.a.J(i15 - i14, i15, objArr3);
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f325b -= i14;
        return i14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i7 = this.f325b - 1; i7 >= 0; i7--) {
            if (Intrinsics.c(this.f324a[i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        f();
        return j(0, this.f325b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        f();
        return j(0, this.f325b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        f();
        AbstractC1836c.f38922a.checkElementIndex$kotlin_stdlib(i7, this.f325b);
        Object[] objArr = this.f324a;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i10) {
        AbstractC1836c.f38922a.checkRangeIndexes$kotlin_stdlib(i7, i10, this.f325b);
        return new c(this.f324a, i7, i10 - i7, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i7 = this.f325b;
        if (length < i7) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f324a, 0, i7, array.getClass());
            Intrinsics.checkNotNullExpressionValue(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        C1846m.f(this.f324a, 0, array, 0, i7);
        C1849p.d(this.f325b, array);
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return G8.a.g(this.f324a, 0, this.f325b, this);
    }

    public /* synthetic */ d(int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 10 : i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        AbstractC1836c.f38922a.checkPositionIndex$kotlin_stdlib(i7, this.f325b);
        return new b(this, i7);
    }

    public d(int i7) {
        if (i7 >= 0) {
            this.f324a = new Object[i7];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        f();
        AbstractC1836c.f38922a.checkPositionIndex$kotlin_stdlib(i7, this.f325b);
        int size = elements.size();
        d(i7, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return C1846m.h(0, this.f325b, this.f324a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        f();
        AbstractC1836c.f38922a.checkPositionIndex$kotlin_stdlib(i7, this.f325b);
        ((AbstractList) this).modCount++;
        g(i7, 1);
        this.f324a[i7] = obj;
    }
}
