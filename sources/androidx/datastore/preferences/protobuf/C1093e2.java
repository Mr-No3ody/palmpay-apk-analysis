package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1093e2 extends AbstractMap {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f16606g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f16607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f16608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile M.a f16610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f16611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile C1101g2 f16612f;

    public static C1093e2 f() {
        C1093e2 c1093e2 = new C1093e2();
        c1093e2.f16607a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        c1093e2.f16608b = map;
        c1093e2.f16611e = map;
        return c1093e2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i7;
        int i10;
        int i11;
        int iCompareTo;
        int size = this.f16607a.size();
        int i12 = size - 1;
        if (i12 < 0) {
            i7 = 0;
            while (i7 <= i12) {
                i11 = (i7 + i12) / 2;
                iCompareTo = comparable.compareTo(((C1105h2) this.f16607a.get(i11)).f16648a);
                if (iCompareTo < 0) {
                    i12 = i11 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i11;
                    }
                    i7 = i11 + 1;
                }
            }
            i10 = i7 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((C1105h2) this.f16607a.get(i12)).f16648a);
            if (iCompareTo2 > 0) {
                i10 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i12;
                }
                i7 = 0;
                while (i7 <= i12) {
                    i11 = (i7 + i12) / 2;
                    iCompareTo = comparable.compareTo(((C1105h2) this.f16607a.get(i11)).f16648a);
                    if (iCompareTo < 0) {
                        i12 = i11 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i11;
                        }
                        i7 = i11 + 1;
                    }
                }
                i10 = i7 + 1;
            }
        }
        return -i10;
    }

    public final void b() {
        if (this.f16609c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i7) {
        return (Map.Entry) this.f16607a.get(i7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f16607a.isEmpty()) {
            this.f16607a.clear();
        }
        if (this.f16608b.isEmpty()) {
            return;
        }
        this.f16608b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f16608b.containsKey(comparable);
    }

    public final Set d() {
        return this.f16608b.isEmpty() ? Collections.EMPTY_SET : this.f16608b.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f16608b.isEmpty() && !(this.f16608b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f16608b = treeMap;
            this.f16611e = treeMap.descendingMap();
        }
        return (SortedMap) this.f16608b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f16610d == null) {
            this.f16610d = new M.a(this, 1);
        }
        return this.f16610d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1093e2)) {
            return super.equals(obj);
        }
        C1093e2 c1093e2 = (C1093e2) obj;
        int size = size();
        if (size == c1093e2.size()) {
            int size2 = this.f16607a.size();
            if (size2 != c1093e2.f16607a.size()) {
                return ((AbstractSet) entrySet()).equals(c1093e2.entrySet());
            }
            for (int i7 = 0; i7 < size2; i7++) {
                if (c(i7).equals(c1093e2.c(i7))) {
                }
            }
            if (size2 != size) {
                return this.f16608b.equals(c1093e2.f16608b);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((C1105h2) this.f16607a.get(iA)).setValue(obj);
        }
        b();
        if (this.f16607a.isEmpty() && !(this.f16607a instanceof ArrayList)) {
            this.f16607a = new ArrayList(16);
        }
        int i7 = -(iA + 1);
        if (i7 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f16607a.size() == 16) {
            C1105h2 c1105h2 = (C1105h2) this.f16607a.remove(15);
            e().put(c1105h2.f16648a, c1105h2.f16649b);
        }
        this.f16607a.add(i7, new C1105h2(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((C1105h2) this.f16607a.get(iA)).f16649b : this.f16608b.get(comparable);
    }

    public final Object h(int i7) {
        b();
        Object obj = ((C1105h2) this.f16607a.remove(i7)).f16649b;
        if (!this.f16608b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f16607a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C1105h2(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f16607a.size();
        int iHashCode = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iHashCode += ((C1105h2) this.f16607a.get(i7)).hashCode();
        }
        return this.f16608b.size() > 0 ? this.f16608b.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f16608b.isEmpty()) {
            return null;
        }
        return this.f16608b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f16608b.size() + this.f16607a.size();
    }
}
