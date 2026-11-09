package M;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class f extends n implements Map {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f5676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f5677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f5678f;

    public f() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        a aVar = this.f5676d;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this, 0);
        this.f5676d = aVar2;
        return aVar2;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c cVar = this.f5677e;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f5677e = cVar2;
        return cVar2;
    }

    public final boolean l(Collection collection) {
        int i7 = this.f5695c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i7 != this.f5695c;
    }

    public final boolean m(Collection collection) {
        int i7 = this.f5695c;
        for (int i10 = i7 - 1; i10 >= 0; i10--) {
            if (!collection.contains(f(i10))) {
                h(i10);
            }
        }
        return i7 != this.f5695c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f5695c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        e eVar = this.f5678f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f5678f = eVar2;
        return eVar2;
    }

    public f(f fVar) {
        super(0);
        g(fVar);
    }
}
