package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1116k1 implements Internal$EnumLite {
    TYPE_UNKNOWN(0),
    TYPE_DOUBLE(1),
    TYPE_FLOAT(2),
    TYPE_INT64(3),
    TYPE_UINT64(4),
    TYPE_INT32(5),
    TYPE_FIXED64(6),
    TYPE_FIXED32(7),
    TYPE_BOOL(8),
    TYPE_STRING(9),
    TYPE_GROUP(10),
    TYPE_MESSAGE(11),
    TYPE_BYTES(12),
    TYPE_UINT32(13),
    TYPE_ENUM(14),
    TYPE_SFIXED32(15),
    TYPE_SFIXED64(16),
    TYPE_SINT32(17),
    TYPE_SINT64(18),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16691a;

    EnumC1116k1(int i7) {
        this.f16691a = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f16691a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
