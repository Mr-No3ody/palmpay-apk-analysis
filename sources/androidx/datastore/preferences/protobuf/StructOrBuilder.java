package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface StructOrBuilder extends MessageLiteOrBuilder {
    boolean containsFields(String key);

    @Deprecated
    Map<String, C2> getFields();

    int getFieldsCount();

    Map<String, C2> getFieldsMap();

    C2 getFieldsOrDefault(String key, C2 defaultValue);

    C2 getFieldsOrThrow(String key);
}
