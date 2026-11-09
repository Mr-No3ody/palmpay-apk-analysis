package A7;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements List, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f68a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Character f69b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Character f70c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f71d;

    public c(b list, Character ch2, Character ch3) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f68a = list;
        this.f69b = ch2;
        this.f70c = ch3;
        int i7 = list.f65b;
        if (ch2 != null && ch3 != null) {
            i7 += 2;
        } else if (ch2 != null || ch3 != null) {
            i7++;
        }
        this.f71d = i7;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return Intrinsics.c(this.f69b, obj) || Intrinsics.c(this.f70c, obj) || this.f68a.f64a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Character ch2;
        Character ch3 = this.f69b;
        if (i7 == 0 && ch3 != null) {
            return ch3;
        }
        if (i7 == this.f71d - 1 && (ch2 = this.f70c) != null) {
            return ch2;
        }
        b bVar = this.f68a;
        return ch3 != null ? bVar.get(i7 - 1) : bVar.get(i7);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        Character ch2 = this.f69b;
        if (ch2 != null && ch2.equals(obj)) {
            return 0;
        }
        int iIndexOf = this.f68a.indexOf(obj);
        if (iIndexOf == -1) {
            Character ch3 = this.f70c;
            if (ch3 != null && ch3.equals(obj)) {
                return this.f71d - 1;
            }
        } else if (ch2 != null) {
            return iIndexOf + 1;
        }
        return iIndexOf;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f71d <= 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        Character ch2 = this.f70c;
        if (ch2 != null && ch2.equals(obj)) {
            return this.f71d - 1;
        }
        int iLastIndexOf = this.f68a.lastIndexOf(obj);
        Character ch3 = this.f69b;
        if (iLastIndexOf != -1) {
            if (ch3 != null) {
                return iLastIndexOf + 1;
            }
        } else if (ch3 != null && ch3.equals(obj)) {
            return 0;
        }
        return iLastIndexOf;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new a(this);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f71d;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i7, int i10) {
        throw new IllegalStateException("Not Support");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1859i.b(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new a(this, i7);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return AbstractC1859i.c(this, array);
    }
}
