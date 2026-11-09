package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1103h0 implements Internal$EnumLite {
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
    TYPE_SINT64(18);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16645a;

    EnumC1103h0(int i7) {
        this.f16645a = i7;
    }

    public static EnumC1103h0 a(int i7) {
        switch (i7) {
            case 1:
                return TYPE_DOUBLE;
            case 2:
                return TYPE_FLOAT;
            case 3:
                return TYPE_INT64;
            case 4:
                return TYPE_UINT64;
            case 5:
                return TYPE_INT32;
            case 6:
                return TYPE_FIXED64;
            case 7:
                return TYPE_FIXED32;
            case 8:
                return TYPE_BOOL;
            case 9:
                return TYPE_STRING;
            case 10:
                return TYPE_GROUP;
            case 11:
                return TYPE_MESSAGE;
            case 12:
                return TYPE_BYTES;
            case 13:
                return TYPE_UINT32;
            case 14:
                return TYPE_ENUM;
            case 15:
                return TYPE_SFIXED32;
            case 16:
                return TYPE_SFIXED64;
            case 17:
                return TYPE_SINT32;
            case 18:
                return TYPE_SINT64;
            default:
                return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.f16645a;
    }
}
