package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface Internal$BooleanList extends Internal$ProtobufList<Boolean> {
    void addBoolean(boolean element);

    boolean getBoolean(int index);

    @Override // androidx.datastore.preferences.protobuf.Internal$ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: merged with bridge method [inline-methods] */
    Internal$ProtobufList<Boolean> mutableCopyWithCapacity2(int capacity);

    @CanIgnoreReturnValue
    boolean setBoolean(int index, boolean element);
}
