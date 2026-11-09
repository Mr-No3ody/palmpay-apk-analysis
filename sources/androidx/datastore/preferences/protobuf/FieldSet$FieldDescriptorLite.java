package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite;

/* JADX INFO: loaded from: classes.dex */
public interface FieldSet$FieldDescriptorLite<T extends FieldSet$FieldDescriptorLite<T>> extends Comparable<T> {
    Internal$EnumLiteMap<?> getEnumType();

    I2 getLiteJavaType();

    H2 getLiteType();

    int getNumber();

    MessageLite.Builder internalMergeFrom(MessageLite.Builder to, MessageLite from);

    boolean isPacked();

    boolean isRepeated();
}
