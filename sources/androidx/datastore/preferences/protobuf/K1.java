package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class K1 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K1 f16513b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16514a = true;

    static {
        K1 k2 = new K1();
        f16513b = k2;
        k2.f16514a = false;
    }

    public static int a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof Internal$EnumLite) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = AbstractC1154x1.f16808a;
        int length = bArr.length;
        for (byte b7 : bArr) {
            length = (length * 31) + b7;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    public final void b() {
        if (!this.f16514a) {
            throw new UnsupportedOperationException();
        }
    }

    public final K1 c() {
        if (isEmpty()) {
            return new K1();
        }
        K1 k2 = new K1(this);
        k2.f16514a = true;
        return k2;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z3;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (map.containsKey(entry.getKey())) {
                                Object value = entry.getValue();
                                Object obj2 = map.get(entry.getKey());
                                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                                }
                            }
                        } else {
                            z3 = true;
                        }
                    }
                }
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iA = 0;
        for (Map.Entry entry : entrySet()) {
            iA += a(entry.getValue()) ^ a(entry.getKey());
        }
        return iA;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        Charset charset = AbstractC1154x1.f16808a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        b();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC1154x1.f16808a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        return super.remove(obj);
    }
}
