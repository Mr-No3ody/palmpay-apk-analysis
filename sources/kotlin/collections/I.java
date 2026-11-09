package kotlin.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class I extends AbstractC1840g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38898a;

    public I(ArrayList delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f38898a = delegate;
    }

    @Override // kotlin.collections.AbstractC1840g
    public final int a() {
        return this.f38898a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        this.f38898a.add(w.u(i7, this), obj);
    }

    @Override // kotlin.collections.AbstractC1840g
    public final Object b(int i7) {
        return this.f38898a.remove(w.t(i7, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f38898a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return this.f38898a.get(w.t(i7, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new H(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new H(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        return this.f38898a.set(w.t(i7, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new H(this, i7);
    }
}
