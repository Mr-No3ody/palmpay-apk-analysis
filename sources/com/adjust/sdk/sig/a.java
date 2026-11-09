package com.adjust.sdk.sig;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class a implements Iterator, q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f19419b;

    public a(d dVar) {
        this.f19419b = dVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19418a < this.f19419b.a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        d dVar = this.f19419b;
        int i7 = this.f19418a;
        this.f19418a = i7 + 1;
        return dVar.get(i7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
