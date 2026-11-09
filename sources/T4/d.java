package T4;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends AbstractList {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p264r5.a f8943c = p264r5.a.t(d.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P4.e f8945b;

    public d(ArrayList arrayList, P4.e eVar) {
        this.f8944a = arrayList;
        this.f8945b = eVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        ArrayList arrayList = this.f8944a;
        if (arrayList.size() > i7) {
            return arrayList.get(i7);
        }
        P4.e eVar = this.f8945b;
        if (!eVar.hasNext()) {
            throw new NoSuchElementException();
        }
        arrayList.add(eVar.next());
        return get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new c(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        p264r5.a aVar = f8943c;
        aVar.B("potentially expensive size() call");
        aVar.B("blowup running");
        while (true) {
            P4.e eVar = this.f8945b;
            boolean zHasNext = eVar.hasNext();
            ArrayList arrayList = this.f8944a;
            if (!zHasNext) {
                return arrayList.size();
            }
            arrayList.add(eVar.next());
        }
    }
}
