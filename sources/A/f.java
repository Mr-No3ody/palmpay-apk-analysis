package A;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f14a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f15b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f16c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17d = 0;

    public c a(Object obj) {
        c cVar = this.f14a;
        while (cVar != null && !cVar.f7a.equals(obj)) {
            cVar = cVar.f9c;
        }
        return cVar;
    }

    public Object b(Object obj, Object obj2) {
        c cVarA = a(obj);
        if (cVarA != null) {
            return cVarA.f8b;
        }
        c cVar = new c(obj, obj2);
        this.f17d++;
        c cVar2 = this.f15b;
        if (cVar2 == null) {
            this.f14a = cVar;
            this.f15b = cVar;
            return null;
        }
        cVar2.f9c = cVar;
        cVar.f10d = cVar2;
        this.f15b = cVar;
        return null;
    }

    public Object c(Object obj) {
        c cVarA = a(obj);
        if (cVarA == null) {
            return null;
        }
        this.f17d--;
        WeakHashMap weakHashMap = this.f16c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarA);
            }
        }
        c cVar = cVarA.f10d;
        if (cVar != null) {
            cVar.f9c = cVarA.f9c;
        } else {
            this.f14a = cVarA.f9c;
        }
        c cVar2 = cVarA.f9c;
        if (cVar2 != null) {
            cVar2.f10d = cVar;
        } else {
            this.f15b = cVar;
        }
        cVarA.f9c = null;
        cVarA.f10d = null;
        return cVarA.f8b;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f17d != fVar.f17d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f14a, this.f15b, 0);
        this.f16c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
