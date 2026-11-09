package Af;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractC1840g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements ListIterator, KMutableListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC1840g f316e;

    public b(d list, int i7) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f316e = list;
        this.f313b = i7;
        this.f314c = -1;
        this.f315d = ((AbstractList) list).modCount;
    }

    public void a() {
        if (((AbstractList) ((c) this.f316e).f321e).modCount != this.f315d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f312a) {
            case 0:
                a();
                int i7 = this.f313b;
                this.f313b = i7 + 1;
                c cVar = (c) this.f316e;
                cVar.add(i7, obj);
                this.f314c = -1;
                this.f315d = ((AbstractList) cVar).modCount;
                break;
            default:
                b();
                int i10 = this.f313b;
                this.f313b = i10 + 1;
                d dVar = (d) this.f316e;
                dVar.add(i10, obj);
                this.f314c = -1;
                this.f315d = ((AbstractList) dVar).modCount;
                break;
        }
    }

    public void b() {
        if (((AbstractList) ((d) this.f316e)).modCount != this.f315d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f312a) {
            case 0:
                return this.f313b < ((c) this.f316e).f319c;
            default:
                return this.f313b < ((d) this.f316e).f325b;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f312a) {
            case 0:
                return this.f313b > 0;
            default:
                return this.f313b > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f312a) {
            case 0:
                a();
                int i7 = this.f313b;
                c cVar = (c) this.f316e;
                if (i7 >= cVar.f319c) {
                    throw new NoSuchElementException();
                }
                this.f313b = i7 + 1;
                this.f314c = i7;
                return cVar.f317a[cVar.f318b + i7];
            default:
                b();
                int i10 = this.f313b;
                d dVar = (d) this.f316e;
                if (i10 >= dVar.f325b) {
                    throw new NoSuchElementException();
                }
                this.f313b = i10 + 1;
                this.f314c = i10;
                return dVar.f324a[i10];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f312a) {
            case 0:
                break;
        }
        return this.f313b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f312a) {
            case 0:
                a();
                int i7 = this.f313b;
                if (i7 <= 0) {
                    throw new NoSuchElementException();
                }
                int i10 = i7 - 1;
                this.f313b = i10;
                this.f314c = i10;
                c cVar = (c) this.f316e;
                return cVar.f317a[cVar.f318b + i10];
            default:
                b();
                int i11 = this.f313b;
                if (i11 <= 0) {
                    throw new NoSuchElementException();
                }
                int i12 = i11 - 1;
                this.f313b = i12;
                this.f314c = i12;
                return ((d) this.f316e).f324a[i12];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f312a) {
            case 0:
                break;
        }
        return this.f313b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f312a) {
            case 0:
                a();
                int i7 = this.f314c;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c cVar = (c) this.f316e;
                cVar.b(i7);
                this.f313b = this.f314c;
                this.f314c = -1;
                this.f315d = ((AbstractList) cVar).modCount;
                return;
            default:
                b();
                int i10 = this.f314c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                d dVar = (d) this.f316e;
                dVar.b(i10);
                this.f313b = this.f314c;
                this.f314c = -1;
                this.f315d = ((AbstractList) dVar).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f312a) {
            case 0:
                a();
                int i7 = this.f314c;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f316e).set(i7, obj);
                return;
            default:
                b();
                int i10 = this.f314c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((d) this.f316e).set(i10, obj);
                return;
        }
    }

    public b(c list, int i7) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f316e = list;
        this.f313b = i7;
        this.f314c = -1;
        this.f315d = ((AbstractList) list).modCount;
    }
}
