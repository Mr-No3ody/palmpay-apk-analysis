package M;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Collection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f5675a;

    public e(f fVar) {
        this.f5675a = fVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f5675a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5675a.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f5675a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f5675a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f5675a;
        int iA = fVar.a(obj);
        if (iA < 0) {
            return false;
        }
        fVar.h(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        f fVar = this.f5675a;
        int i7 = fVar.f5695c;
        int i10 = 0;
        boolean z3 = false;
        while (i10 < i7) {
            if (collection.contains(fVar.j(i10))) {
                fVar.h(i10);
                i10--;
                i7--;
                z3 = true;
            }
            i10++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        f fVar = this.f5675a;
        int i7 = fVar.f5695c;
        int i10 = 0;
        boolean z3 = false;
        while (i10 < i7) {
            if (!collection.contains(fVar.j(i10))) {
                fVar.h(i10);
                i10--;
                i7--;
                z3 = true;
            }
            i10++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f5675a.f5695c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        f fVar = this.f5675a;
        int i7 = fVar.f5695c;
        Object[] objArr = new Object[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = fVar.j(i10);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f5675a;
        int i7 = fVar.f5695c;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = fVar.j(i10);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
