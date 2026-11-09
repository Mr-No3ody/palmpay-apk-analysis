package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1135r0 implements Internal$EnumLite {
    TARGET_TYPE_UNKNOWN(0),
    TARGET_TYPE_FILE(1),
    TARGET_TYPE_EXTENSION_RANGE(2),
    TARGET_TYPE_MESSAGE(3),
    TARGET_TYPE_FIELD(4),
    TARGET_TYPE_ONEOF(5),
    TARGET_TYPE_ENUM(6),
    TARGET_TYPE_ENUM_ENTRY(7),
    TARGET_TYPE_SERVICE(8),
    TARGET_TYPE_METHOD(9);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16769a;

    EnumC1135r0(int i7) {
        this.f16769a = i7;
    }

    public static EnumC1135r0 a(int i7) {
        switch (i7) {
            case 0:
                return TARGET_TYPE_UNKNOWN;
            case 1:
                return TARGET_TYPE_FILE;
            case 2:
                return TARGET_TYPE_EXTENSION_RANGE;
            case 3:
                return TARGET_TYPE_MESSAGE;
            case 4:
                return TARGET_TYPE_FIELD;
            case 5:
                return TARGET_TYPE_ONEOF;
            case 6:
                return TARGET_TYPE_ENUM;
            case 7:
                return TARGET_TYPE_ENUM_ENTRY;
            case 8:
                return TARGET_TYPE_SERVICE;
            case 9:
                return TARGET_TYPE_METHOD;
            default:
                return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.f16769a;
    }
}
