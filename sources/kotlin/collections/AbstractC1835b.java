package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: renamed from: kotlin.collections.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1835b implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f38921b;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f38920a;
        if (i7 == 0) {
            this.f38920a = 3;
            a();
            return this.f38920a == 1;
        }
        if (i7 == 1) {
            return true;
        }
        if (i7 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f38920a;
        if (i7 == 1) {
            this.f38920a = 0;
            return this.f38921b;
        }
        if (i7 != 2) {
            this.f38920a = 3;
            a();
            if (this.f38920a == 1) {
                this.f38920a = 0;
                return this.f38921b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
