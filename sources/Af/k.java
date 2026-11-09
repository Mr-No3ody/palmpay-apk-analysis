package Af;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC1839f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends AbstractC1839f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f351a;

    public k(e backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f351a = backing;
    }

    @Override // kotlin.collections.AbstractC1839f
    public final int a() {
        return this.f351a.f337j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f351a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f351a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f351a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        e map = this.f351a;
        map.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new f(map, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f351a;
        eVar.c();
        int i7 = eVar.i(obj);
        if (i7 < 0) {
            return false;
        }
        eVar.l(i7);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f351a.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f351a.c();
        return super.retainAll(elements);
    }
}
