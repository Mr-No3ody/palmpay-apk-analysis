package com.adjust.sdk.sig;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterator, q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f19449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19450b;

    public f(Object[] objArr) {
        this.f19449a = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19450b < this.f19449a.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f19449a;
            int i7 = this.f19450b;
            this.f19450b = i7 + 1;
            return objArr[i7];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f19450b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
