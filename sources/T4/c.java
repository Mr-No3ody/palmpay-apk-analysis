package T4;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8941a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f8942b;

    public c(d dVar) {
        this.f8942b = dVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f8941a;
        d dVar = this.f8942b;
        return i7 < dVar.f8944a.size() || dVar.f8945b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f8941a;
        d dVar = this.f8942b;
        if (i7 >= dVar.f8944a.size()) {
            dVar.f8944a.add(dVar.f8945b.next());
            return next();
        }
        ArrayList arrayList = dVar.f8944a;
        int i10 = this.f8941a;
        this.f8941a = i10 + 1;
        return arrayList.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
