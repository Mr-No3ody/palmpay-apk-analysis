package M;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5669e;

    public b(int i7) {
        this.f5665a = i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5666b < this.f5665a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f5666b;
        switch (this.f5668d) {
            case 0:
                objF = ((f) this.f5669e).f(i7);
                break;
            case 1:
                objF = ((f) this.f5669e).j(i7);
                break;
            default:
                objF = ((g) this.f5669e).f5680b[i7];
                break;
        }
        this.f5666b++;
        this.f5667c = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5667c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i7 = this.f5666b - 1;
        this.f5666b = i7;
        switch (this.f5668d) {
            case 0:
                ((f) this.f5669e).h(i7);
                break;
            case 1:
                ((f) this.f5669e).h(i7);
                break;
            default:
                ((g) this.f5669e).a(i7);
                break;
        }
        this.f5665a--;
        this.f5667c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(g gVar) {
        this(gVar.f5681c);
        this.f5668d = 2;
        this.f5669e = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i7) {
        this(fVar.f5695c);
        this.f5668d = i7;
        switch (i7) {
            case 1:
                this.f5669e = fVar;
                this(fVar.f5695c);
                break;
            default:
                this.f5669e = fVar;
                break;
        }
    }
}
