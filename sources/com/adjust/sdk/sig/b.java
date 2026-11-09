package com.adjust.sdk.sig;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a implements ListIterator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f19422c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i7) {
        super(dVar);
        this.f19422c = dVar;
        int iA = dVar.a();
        if (i7 < 0 || i7 > iA) {
            throw new IndexOutOfBoundsException(androidx.camera.video.u.h(i7, "index: ", iA, ", size: "));
        }
        this.f19418a = i7;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19418a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19418a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        d dVar = this.f19422c;
        int i7 = this.f19418a - 1;
        this.f19418a = i7;
        return dVar.get(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19418a - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
