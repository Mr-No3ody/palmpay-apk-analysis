package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: kotlin.collections.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1837d extends M.q implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1836c f38923d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1837d(AbstractC1836c abstractC1836c, int i7) {
        super(abstractC1836c, 1);
        this.f38923d = abstractC1836c;
        AbstractC1836c.f38922a.checkPositionIndex$kotlin_stdlib(i7, abstractC1836c.a());
        this.f5703b = i7;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5703b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5703b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f5703b - 1;
        this.f5703b = i7;
        return this.f38923d.get(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5703b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
