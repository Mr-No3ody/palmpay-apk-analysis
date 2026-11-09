package Sf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.C1850q;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8873a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterator f8875c;

    public b(Iterator iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f8875c = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f8873a) {
            case 0:
                break;
            case 1:
                return this.f8874b > 0 && this.f8875c.hasNext();
            default:
                return this.f8875c.hasNext();
        }
        while (true) {
            int i7 = this.f8874b;
            it = this.f8875c;
            if (i7 > 0 && it.hasNext()) {
                it.next();
                this.f8874b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f8873a) {
            case 0:
                break;
            case 1:
                int i7 = this.f8874b;
                if (i7 == 0) {
                    throw new NoSuchElementException();
                }
                this.f8874b = i7 - 1;
                return this.f8875c.next();
            default:
                int i10 = this.f8874b;
                this.f8874b = i10 + 1;
                if (i10 >= 0) {
                    return new IndexedValue(i10, this.f8875c.next());
                }
                C1850q.k();
                throw null;
        }
        while (true) {
            int i11 = this.f8874b;
            it = this.f8875c;
            if (i11 > 0 && it.hasNext()) {
                it.next();
                this.f8874b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8873a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c cVar, byte b7) {
        this.f8874b = cVar.f8877b;
        this.f8875c = new b((c) cVar.f8878c);
    }

    public b(c cVar) {
        this.f8875c = cVar.f8878c.iterator();
        this.f8874b = cVar.f8877b;
    }
}
