package Af;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.AbstractC1836c;
import kotlin.collections.AbstractC1840g;
import kotlin.collections.C1846m;
import kotlin.collections.C1849p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AbstractC1840g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f321e;

    public c(Object[] backing, int i7, int i10, c cVar, d root) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        Intrinsics.checkNotNullParameter(root, "root");
        this.f317a = backing;
        this.f318b = i7;
        this.f319c = i10;
        this.f320d = cVar;
        this.f321e = root;
        ((AbstractList) this).modCount = ((AbstractList) root).modCount;
    }

    @Override // kotlin.collections.AbstractC1840g
    public final int a() {
        f();
        return this.f319c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.f318b + this.f319c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        g();
        f();
        int size = elements.size();
        d(this.f318b + this.f319c, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.AbstractC1840g
    public final Object b(int i7) {
        g();
        f();
        AbstractC1836c.f38922a.checkElementIndex$kotlin_stdlib(i7, this.f319c);
        return h(this.f318b + i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.f318b, this.f319c);
    }

    public final void d(int i7, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        d dVar = this.f321e;
        c cVar = this.f320d;
        if (cVar != null) {
            cVar.d(i7, collection, i10);
        } else {
            d dVar2 = d.f323e;
            dVar.d(i7, collection, i10);
        }
        this.f317a = dVar.f324a;
        this.f319c += i10;
    }

    public final void e(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        d dVar = this.f321e;
        c cVar = this.f320d;
        if (cVar != null) {
            cVar.e(i7, obj);
        } else {
            d dVar2 = d.f323e;
            dVar.e(i7, obj);
        }
        this.f317a = dVar.f324a;
        this.f319c++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return G8.a.f(this.f317a, this.f318b, this.f319c, (List) obj);
        }
        return false;
    }

    public final void f() {
        if (((AbstractList) this.f321e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.f321e.f326c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        f();
        AbstractC1836c.f38922a.checkElementIndex$kotlin_stdlib(i7, this.f319c);
        return this.f317a[this.f318b + i7];
    }

    public final Object h(int i7) {
        Object objH;
        ((AbstractList) this).modCount++;
        c cVar = this.f320d;
        if (cVar != null) {
            objH = cVar.h(i7);
        } else {
            d dVar = d.f323e;
            objH = this.f321e.h(i7);
        }
        this.f319c--;
        return objH;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.f317a;
        int i7 = this.f319c;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i7; i10++) {
            Object obj = objArr[this.f318b + i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i7, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        c cVar = this.f320d;
        if (cVar != null) {
            cVar.i(i7, i10);
        } else {
            d dVar = d.f323e;
            this.f321e.i(i7, i10);
        }
        this.f319c -= i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i7 = 0; i7 < this.f319c; i7++) {
            if (Intrinsics.c(this.f317a[this.f318b + i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.f319c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i7, int i10, Collection collection, boolean z3) {
        int iJ;
        c cVar = this.f320d;
        if (cVar != null) {
            iJ = cVar.j(i7, i10, collection, z3);
        } else {
            d dVar = d.f323e;
            iJ = this.f321e.j(i7, i10, collection, z3);
        }
        if (iJ > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f319c -= iJ;
        return iJ;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i7 = this.f319c - 1; i7 >= 0; i7--) {
            if (Intrinsics.c(this.f317a[this.f318b + i7], obj)) {
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
        g();
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
        g();
        f();
        return j(this.f318b, this.f319c, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        g();
        f();
        return j(this.f318b, this.f319c, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        g();
        f();
        AbstractC1836c.f38922a.checkElementIndex$kotlin_stdlib(i7, this.f319c);
        Object[] objArr = this.f317a;
        int i10 = this.f318b;
        Object obj2 = objArr[i10 + i7];
        objArr[i10 + i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i10) {
        AbstractC1836c.f38922a.checkRangeIndexes$kotlin_stdlib(i7, i10, this.f319c);
        return new c(this.f317a, this.f318b + i7, i10 - i7, this, this.f321e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        f();
        int length = array.length;
        int i7 = this.f319c;
        int i10 = this.f318b;
        if (length < i7) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f317a, i10, i7 + i10, array.getClass());
            Intrinsics.checkNotNullExpressionValue(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        C1846m.f(this.f317a, 0, array, i10, i7 + i10);
        C1849p.d(this.f319c, array);
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return G8.a.g(this.f317a, this.f318b, this.f319c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        f();
        AbstractC1836c.f38922a.checkPositionIndex$kotlin_stdlib(i7, this.f319c);
        return new b(this, i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        g();
        f();
        AbstractC1836c.f38922a.checkPositionIndex$kotlin_stdlib(i7, this.f319c);
        e(this.f318b + i7, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        g();
        f();
        AbstractC1836c.f38922a.checkPositionIndex$kotlin_stdlib(i7, this.f319c);
        int size = elements.size();
        d(this.f318b + i7, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.f317a;
        int i7 = this.f319c;
        int i10 = this.f318b;
        return C1846m.h(i10, i7 + i10, objArr);
    }
}
