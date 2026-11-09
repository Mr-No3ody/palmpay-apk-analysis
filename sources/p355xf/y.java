package p355xf;

import M.q;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C1847n;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements Collection, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f43990a;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        return C1847n.l(this.f43990a, ((x) obj).f43989a);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (obj instanceof x) {
                if (C1847n.l(this.f43990a, ((x) obj).f43989a)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return Intrinsics.c(this.f43990a, ((y) obj).f43990a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f43990a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f43990a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new q(this.f43990a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f43990a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC1859i.b(this);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f43990a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return AbstractC1859i.c(this, array);
    }
}
