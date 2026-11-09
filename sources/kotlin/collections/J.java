package kotlin.collections;

import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class J implements ListIterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListIterator f38901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f38902b;

    public J(K k2, int i7) {
        this.f38902b = k2;
        this.f38901a = ((List) k2.f38904c).listIterator(w.u(i7, k2));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f38901a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f38901a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f38901a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return C1850q.g(this.f38902b) - this.f38901a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f38901a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return C1850q.g(this.f38902b) - this.f38901a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
