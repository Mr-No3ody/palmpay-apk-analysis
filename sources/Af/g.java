package Af;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Map.Entry, KMutableMap.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f344c;

    public g(e map, int i7) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f342a = map;
        this.f343b = i7;
        this.f344c = map.f336i;
    }

    public final void a() {
        if (this.f342a.f336i != this.f344c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Intrinsics.c(entry.getKey(), getKey()) && Intrinsics.c(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f342a.f329a[this.f343b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f342a.f330b;
        Intrinsics.e(objArr);
        return objArr[this.f343b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        e eVar = this.f342a;
        eVar.c();
        Object[] objArr = eVar.f330b;
        if (objArr == null) {
            int length = eVar.f329a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            eVar.f330b = objArr;
        }
        int i7 = this.f343b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
