package A7;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements List, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f72a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f73b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f74c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f75d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f76e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f77f;

    public d(List list, Object obj, Object obj2, Function0 firstReplacePosition, Function0 lastReplacePosition) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(firstReplacePosition, "firstReplacePosition");
        Intrinsics.checkNotNullParameter(lastReplacePosition, "lastReplacePosition");
        this.f72a = list;
        this.f73b = obj;
        this.f74c = obj2;
        this.f75d = list.size();
        this.f76e = -1;
        this.f77f = -1;
        if (obj != null) {
            this.f76e = ((Number) firstReplacePosition.invoke()).intValue();
        }
        if (obj2 != null) {
            this.f77f = ((Number) lastReplacePosition.invoke()).intValue();
        }
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
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (Intrinsics.c(it.next(), obj)) {
                return true;
            }
        }
        return false;
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
        Object obj;
        Object obj2;
        if (i7 != this.f76e || (obj2 = this.f73b) == null) {
            return (i7 != this.f77f || (obj = this.f74c) == null) ? this.f72a.get(i7) : obj;
        }
        return obj2;
    }

    public final Object getFirst() {
        return this.f73b;
    }

    public final Object getLast() {
        return this.f74c;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        Iterator it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (Intrinsics.c(it.next(), obj)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f75d <= 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.c(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
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
        return this.f75d;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i7, int i10) {
        throw new IllegalStateException("Not support");
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

    public /* synthetic */ d(List list, Function0 function0, Function0 function1, int i7) {
        this(list, (i7 & 2) != 0 ? null : (char) 0, (i7 & 4) != 0 ? null : (char) 0, function0, function1);
    }
}
