package Xe;

import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends TreeMap {
    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null) {
            obj = d.w(obj.toString());
        }
        return super.containsKey(obj);
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj != null) {
            obj = d.w(obj.toString());
        }
        return (List) super.get(obj);
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return (List) super.put(d.w((String) obj), (List) obj2);
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj != null) {
            obj = d.w(obj.toString());
        }
        return (List) super.remove(obj);
    }
}
