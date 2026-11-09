package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l2 extends AbstractC1134q1 implements StructOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public final boolean containsFields(String str) {
        str.getClass();
        return ((n2) this.f16750b).getFieldsMap().containsKey(str);
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public final Map getFields() {
        return getFieldsMap();
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public final int getFieldsCount() {
        return ((n2) this.f16750b).getFieldsMap().size();
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public final Map getFieldsMap() {
        return Collections.unmodifiableMap(((n2) this.f16750b).getFieldsMap());
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public final C2 getFieldsOrDefault(String str, C2 c6) {
        str.getClass();
        Map fieldsMap = ((n2) this.f16750b).getFieldsMap();
        return fieldsMap.containsKey(str) ? (C2) fieldsMap.get(str) : c6;
    }

    @Override // androidx.datastore.preferences.protobuf.StructOrBuilder
    public final C2 getFieldsOrThrow(String str) {
        str.getClass();
        Map fieldsMap = ((n2) this.f16750b).getFieldsMap();
        if (fieldsMap.containsKey(str)) {
            return (C2) fieldsMap.get(str);
        }
        throw new IllegalArgumentException();
    }
}
