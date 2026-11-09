package p176lg;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(with = g.class)
public final class e extends j implements List<j>, KMappedMarker {

    @NotNull
    public static final d Companion = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39373a;

    public e(List content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f39373a = content;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i7, j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection<? extends j> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j element = (j) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f39373a.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f39373a.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return Intrinsics.c(this.f39373a, obj);
    }

    @Override // java.util.List
    public final j get(int i7) {
        return (j) this.f39373a.get(i7);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f39373a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof j)) {
            return -1;
        }
        j element = (j) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f39373a.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f39373a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f39373a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof j)) {
            return -1;
        }
        j element = (j) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f39373a.lastIndexOf(element);
    }

    @Override // java.util.List
    public final ListIterator<j> listIterator() {
        return this.f39373a.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ j remove(int i7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<j> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ j set(int i7, j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f39373a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super j> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<j> subList(int i7, int i10) {
        return this.f39373a.subList(i7, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1859i.b(this);
    }

    public final String toString() {
        return CollectionsKt.J(this.f39373a, ",", "[", "]", null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<j> listIterator(int i7) {
        return this.f39373a.listIterator(i7);
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
