package C0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: classes.dex */
public final class M implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f963a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f965c;

    public M(N n10) {
        this.f965c = n10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f963a + 1 < this.f965c.t.e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f964b = true;
        M.o oVar = this.f965c.t;
        int i7 = this.f963a + 1;
        this.f963a = i7;
        Object objF = oVar.f(i7);
        Intrinsics.checkNotNullExpressionValue(objF, "nodes.valueAt(++index)");
        return (K) objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f964b) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        N n10 = this.f965c;
        int i7 = this.f963a;
        M.o oVar = n10.t;
        ((K) oVar.f(i7)).f955b = null;
        int i10 = this.f963a;
        Object[] objArr = oVar.f5698c;
        Object obj = objArr[i10];
        Object obj2 = M.k.f5690c;
        if (obj != obj2) {
            objArr[i10] = obj2;
            oVar.f5696a = true;
        }
        this.f963a = i10 - 1;
        this.f964b = false;
    }
}
