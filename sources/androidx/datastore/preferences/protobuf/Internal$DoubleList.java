package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface Internal$DoubleList extends Internal$ProtobufList<Double> {
    void addDouble(double element);

    double getDouble(int index);

    @Override // androidx.datastore.preferences.protobuf.Internal$ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    Internal$ProtobufList<Double> mutableCopyWithCapacity2(int capacity);

    @CanIgnoreReturnValue
    double setDouble(int index, double element);
}
