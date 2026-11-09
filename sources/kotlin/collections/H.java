package kotlin.collections;

import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class H implements ListIterator, KMutableListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListIterator f38896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f38897b;

    public H(I i7, int i10) {
        this.f38897b = i7;
        this.f38896a = i7.f38898a.listIterator(w.u(i10, i7));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f38896a;
        listIterator.add(obj);
        listIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f38896a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f38896a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f38896a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return C1850q.g(this.f38897b) - this.f38896a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f38896a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return C1850q.g(this.f38897b) - this.f38896a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f38896a.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f38896a.set(obj);
    }
}
