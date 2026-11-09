package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface Internal$LongList extends Internal$ProtobufList<Long> {
    void addLong(long element);

    long getLong(int index);

    @Override // androidx.datastore.preferences.protobuf.Internal$ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    Internal$ProtobufList<Long> mutableCopyWithCapacity2(int capacity);

    @CanIgnoreReturnValue
    long setLong(int index, long element);
}
