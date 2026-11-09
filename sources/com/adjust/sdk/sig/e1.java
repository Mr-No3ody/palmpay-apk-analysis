package com.adjust.sdk.sig;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements Iterator, q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19447d;

    public e1(int i7, int i10, int i11) {
        this.f19444a = i11;
        this.f19445b = i10;
        boolean z3 = i11 <= 0 ? i7 >= i10 : i7 <= i10;
        this.f19446c = z3;
        this.f19447d = z3 ? i7 : i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19446c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f19447d;
        if (i7 != this.f19445b) {
            this.f19447d = this.f19444a + i7;
        } else {
            if (!this.f19446c) {
                throw new NoSuchElementException();
            }
            this.f19446c = false;
        }
        return Integer.valueOf(i7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
