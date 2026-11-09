package A7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ListIterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f63c;

    public a(b this$0, int i7) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f63c = this$0;
        this.f62b = i7;
        int i10 = this$0.f65b;
        if (i7 < 0 || i7 > i10) {
            throw new ArrayIndexOutOfBoundsException("index should be in range [0," + i10 + "] but now is " + this.f62b);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f61a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f61a) {
            case 0:
                return this.f62b < ((b) this.f63c).f65b;
            case 1:
                return this.f62b < ((c) this.f63c).f71d;
            default:
                return this.f62b < ((d) this.f63c).f75d;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f61a) {
            case 0:
                return this.f62b > 0;
            case 1:
                return this.f62b > 0;
            default:
                return this.f62b > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f61a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f62b;
                this.f62b = i7 + 1;
                return ((b) this.f63c).get(i7);
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f62b;
                this.f62b = i10 + 1;
                return ((c) this.f63c).get(i10);
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i11 = this.f62b;
                this.f62b = i11 + 1;
                return ((d) this.f63c).get(i11);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f61a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f62b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f61a) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f62b - 1;
                this.f62b = i7;
                return ((b) this.f63c).get(i7);
            case 1:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f62b - 1;
                this.f62b = i10;
                return ((c) this.f63c).get(i10);
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i11 = this.f62b - 1;
                this.f62b = i11;
                return ((d) this.f63c).get(i11);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f61a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f62b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f61a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f61a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar) {
        this(dVar, 0);
        this.f63c = dVar;
    }

    public a(d this$0, int i7) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f63c = this$0;
        this.f62b = i7;
        int i10 = this$0.f75d;
        if (i7 < 0 || i7 > i10) {
            throw new ArrayIndexOutOfBoundsException("index should be in range [0," + i10 + "] but now is " + this.f62b);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar) {
        this(cVar, 0);
        this.f63c = cVar;
    }

    public a(c this$0, int i7) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f63c = this$0;
        this.f62b = i7;
        int i10 = this$0.f71d;
        if (i7 < 0 || i7 > i10) {
            throw new ArrayIndexOutOfBoundsException("index should be in range [0," + i10 + "] but now is " + this.f62b);
        }
    }
}
