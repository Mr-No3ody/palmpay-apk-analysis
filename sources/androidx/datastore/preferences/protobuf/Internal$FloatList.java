package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface Internal$FloatList extends Internal$ProtobufList<Float> {
    void addFloat(float element);

    float getFloat(int index);

    @Override // androidx.datastore.preferences.protobuf.Internal$ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    Internal$ProtobufList<Float> mutableCopyWithCapacity2(int capacity);

    @CanIgnoreReturnValue
    float setFloat(int index, float element);
}
