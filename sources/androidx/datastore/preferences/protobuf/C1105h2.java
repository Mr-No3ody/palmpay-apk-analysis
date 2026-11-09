package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1105h2 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f16648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f16649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1093e2 f16650c;

    public C1105h2(C1093e2 c1093e2, Comparable comparable, Object obj) {
        this.f16650c = c1093e2;
        this.f16648a = comparable;
        this.f16649b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f16648a.compareTo(((C1105h2) obj).f16648a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f16648a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f16649b;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f16648a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f16649b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f16648a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f16649b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f16650c.b();
        Object obj2 = this.f16649b;
        this.f16649b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f16648a + "=" + this.f16649b;
    }
}
