package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class L1 implements MapFieldSchema {
    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final Map forMapData(Object obj) {
        return (K1) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final I1 forMapMetadata(Object obj) {
        return ((J1) obj).f16509a;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final Map forMutableMapData(Object obj) {
        return (K1) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final int getSerializedSize(int i7, Object obj, Object obj2) {
        K1 k2 = (K1) obj;
        J1 j1 = (J1) obj2;
        int iD = 0;
        if (k2.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : k2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            j1.getClass();
            int iC = AbstractC1146v.C(i7);
            int iA = J1.a(j1.f16509a, key, value);
            iD += AbstractC1146v.D(iA) + iA + iC;
        }
        return iD;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final boolean isImmutable(Object obj) {
        return !((K1) obj).f16514a;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final Object mergeFrom(Object obj, Object obj2) {
        K1 k1C = (K1) obj;
        K1 k2 = (K1) obj2;
        if (!k2.isEmpty()) {
            if (!k1C.f16514a) {
                k1C = k1C.c();
            }
            k1C.b();
            if (!k2.isEmpty()) {
                k1C.putAll(k2);
            }
        }
        return k1C;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final Object newMapField(Object obj) {
        return K1.f16513b.c();
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final Object toImmutable(Object obj) {
        ((K1) obj).f16514a = false;
        return obj;
    }
}
