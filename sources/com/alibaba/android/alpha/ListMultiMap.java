package com.alibaba.android.alpha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ListMultiMap<K, V> {
    private HashMap<K, List<V>> mInnerMap = new HashMap<>();
    private int mSize = 0;

    public void clear() {
        this.mInnerMap.clear();
        this.mSize = 0;
    }

    public boolean contains(K k2, V v3) {
        List<V> list;
        if (!containsKey(k2) || (list = get(k2)) == null || list.isEmpty()) {
            return false;
        }
        return list.contains(v3);
    }

    public boolean containsKey(K k2) {
        return this.mInnerMap.containsKey(k2);
    }

    public boolean containsValue(V v3) {
        Iterator<Map.Entry<K, List<V>>> it = this.mInnerMap.entrySet().iterator();
        while (it.hasNext()) {
            List<V> value = it.next().getValue();
            if (value != null && value.contains(v3)) {
                return true;
            }
        }
        return false;
    }

    public List<V> get(K k2) {
        return this.mInnerMap.get(k2);
    }

    public boolean isEmpty() {
        return this.mSize <= 0;
    }

    public void put(K k2, V v3) {
        if (this.mInnerMap.containsKey(k2)) {
            this.mInnerMap.get(k2).add(v3);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(v3);
            this.mInnerMap.put(k2, arrayList);
        }
        this.mSize++;
    }

    public List<V> remove(K k2) {
        List<V> listRemove = this.mInnerMap.remove(k2);
        if (listRemove != null && !listRemove.isEmpty()) {
            this.mSize -= listRemove.size();
        }
        return listRemove;
    }

    public V removeValue(V v3) {
        Iterator<Map.Entry<K, List<V>>> it = this.mInnerMap.entrySet().iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            List<V> value = it.next().getValue();
            if (value != null && value.contains(v3)) {
                value.remove(v3);
                this.mSize--;
                z3 = true;
            }
        }
        if (z3) {
            return v3;
        }
        return null;
    }

    public int size() {
        return this.mSize;
    }

    public String toString() {
        return this.mInnerMap.toString();
    }

    public V remove(K k2, V v3) {
        List<V> list = this.mInnerMap.get(k2);
        if (list == null || list.isEmpty() || !list.remove(v3)) {
            return null;
        }
        this.mSize--;
        return v3;
    }
}
