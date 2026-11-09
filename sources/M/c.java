package M;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Set {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f5670a;

    public c(f fVar) {
        this.f5670a = fVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f5670a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5670a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f5670a.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        f fVar = this.f5670a;
        try {
            return fVar.f5695c == set.size() && fVar.k(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        f fVar = this.f5670a;
        int iHashCode = 0;
        for (int i7 = fVar.f5695c - 1; i7 >= 0; i7--) {
            Object objF = fVar.f(i7);
            iHashCode += objF == null ? 0 : objF.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f5670a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f5670a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f5670a;
        int iD = fVar.d(obj);
        if (iD < 0) {
            return false;
        }
        fVar.h(iD);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f5670a.l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f5670a.m(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f5670a.f5695c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        f fVar = this.f5670a;
        int i7 = fVar.f5695c;
        Object[] objArr = new Object[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = fVar.f(i10);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f5670a;
        int i7 = fVar.f5695c;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = fVar.f(i10);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
