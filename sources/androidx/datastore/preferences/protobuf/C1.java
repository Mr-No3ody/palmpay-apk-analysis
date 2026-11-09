package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class C1 implements ListFieldSchema {
    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public final void makeImmutableListAt(Object obj, long j6) {
        ((Internal$ProtobufList) w2.f16802c.k(obj, j6)).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public final void mergeListsAt(Object obj, Object obj2, long j6) {
        v2 v2Var = w2.f16802c;
        Internal$ProtobufList internal$ProtobufListMutableCopyWithCapacity2 = (Internal$ProtobufList) v2Var.k(obj, j6);
        Internal$ProtobufList internal$ProtobufList = (Internal$ProtobufList) v2Var.k(obj2, j6);
        int size = internal$ProtobufListMutableCopyWithCapacity2.size();
        int size2 = internal$ProtobufList.size();
        if (size > 0 && size2 > 0) {
            if (!internal$ProtobufListMutableCopyWithCapacity2.isModifiable()) {
                internal$ProtobufListMutableCopyWithCapacity2 = internal$ProtobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size2 + size);
            }
            internal$ProtobufListMutableCopyWithCapacity2.addAll(internal$ProtobufList);
        }
        if (size > 0) {
            internal$ProtobufList = internal$ProtobufListMutableCopyWithCapacity2;
        }
        w2.p(obj, j6, internal$ProtobufList);
    }

    @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
    public final List mutableListAt(Object obj, long j6) {
        Internal$ProtobufList internal$ProtobufList = (Internal$ProtobufList) w2.f16802c.k(obj, j6);
        if (internal$ProtobufList.isModifiable()) {
            return internal$ProtobufList;
        }
        int size = internal$ProtobufList.size();
        Internal$ProtobufList internal$ProtobufListMutableCopyWithCapacity2 = internal$ProtobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
        w2.p(obj, j6, internal$ProtobufListMutableCopyWithCapacity2);
        return internal$ProtobufListMutableCopyWithCapacity2;
    }
}
