package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface Internal$IntList extends Internal$ProtobufList<Integer> {
    void addInt(int element);

    int getInt(int index);

    @Override // androidx.datastore.preferences.protobuf.Internal$ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    Internal$ProtobufList<Integer> mutableCopyWithCapacity2(int capacity);

    @CanIgnoreReturnValue
    int setInt(int index, int element);
}
