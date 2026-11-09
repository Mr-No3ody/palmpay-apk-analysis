package com.google.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {
    private static final MapFieldLite<?, ?> EMPTY_MAP_FIELD;
    private boolean isMutable;

    static {
        MapFieldLite<?, ?> mapFieldLite = new MapFieldLite<>();
        EMPTY_MAP_FIELD = mapFieldLite;
        mapFieldLite.makeImmutable();
    }

    private MapFieldLite() {
        this.isMutable = true;
    }

    public static <K, V> int calculateHashCodeForMap(Map<K, V> a3) {
        int iCalculateHashCodeForObject = 0;
        for (Map.Entry<K, V> entry : a3.entrySet()) {
            iCalculateHashCodeForObject += calculateHashCodeForObject(entry.getValue()) ^ calculateHashCodeForObject(entry.getKey());
        }
        return iCalculateHashCodeForObject;
    }

    private static int calculateHashCodeForObject(Object a3) {
        if (a3 instanceof byte[]) {
            return Internal.hashCode((byte[]) a3);
        }
        if (a3 instanceof Internal.EnumLite) {
            throw new UnsupportedOperationException();
        }
        return a3.hashCode();
    }

    private static void checkForNullKeysAndValues(Map<?, ?> m7) {
        for (Object obj : m7.keySet()) {
            Internal.checkNotNull(obj);
            Internal.checkNotNull(m7.get(obj));
        }
    }

    private static Object copy(Object object) {
        if (!(object instanceof byte[])) {
            return object;
        }
        byte[] bArr = (byte[]) object;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static <K, V> MapFieldLite<K, V> emptyMapField() {
        return (MapFieldLite<K, V>) EMPTY_MAP_FIELD;
    }

    private void ensureMutable() {
        if (!isMutable()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean equals(Object a3, Object b7) {
        return ((a3 instanceof byte[]) && (b7 instanceof byte[])) ? Arrays.equals((byte[]) a3, (byte[]) b7) : a3.equals(b7);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        ensureMutable();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return calculateHashCodeForMap(this);
    }

    public boolean isMutable() {
        return this.isMutable;
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public void mergeFrom(MapFieldLite<K, V> other) {
        ensureMutable();
        if (other.isEmpty()) {
            return;
        }
        putAll(other);
    }

    public MapFieldLite<K, V> mutableCopy() {
        return isEmpty() ? new MapFieldLite<>() : new MapFieldLite<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k2, V v3) {
        ensureMutable();
        Internal.checkNotNull(k2);
        Internal.checkNotNull(v3);
        return (V) super.put(k2, v3);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> m7) {
        ensureMutable();
        checkForNullKeysAndValues(m7);
        super.putAll(m7);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        ensureMutable();
        return (V) super.remove(obj);
    }

    private MapFieldLite(Map<K, V> mapData) {
        super(mapData);
        this.isMutable = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> copy(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((map.size() * 4) / 3) + 1);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), copy(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static <K, V> boolean equals(Map<K, V> a3, Map<K, V> b7) {
        if (a3 == b7) {
            return true;
        }
        if (a3.size() != b7.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : a3.entrySet()) {
            if (!b7.containsKey(entry.getKey()) || !equals(entry.getValue(), b7.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public V put(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object object) {
        return (object instanceof Map) && equals((Map) this, (Map) object);
    }
}
