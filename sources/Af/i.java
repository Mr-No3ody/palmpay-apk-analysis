package Af;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f349a;

    public i(e backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f349a = backing;
    }

    @Override // kotlin.collections.AbstractC1841h
    public final int a() {
        return this.f349a.f337j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // Af.a
    public final boolean b(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f349a.f(element);
    }

    @Override // Af.a
    public final boolean c(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        e eVar = this.f349a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(entry, "entry");
        eVar.c();
        int iH = eVar.h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = eVar.f330b;
        Intrinsics.e(objArr);
        if (!Intrinsics.c(objArr[iH], entry.getValue())) {
            return false;
        }
        eVar.l(iH);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f349a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f349a.e(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f349a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        e map = this.f349a;
        map.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new f(map, 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f349a.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f349a.c();
        return super.retainAll(elements);
    }
}
