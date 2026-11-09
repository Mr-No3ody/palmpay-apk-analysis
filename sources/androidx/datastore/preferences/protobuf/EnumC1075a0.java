package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1075a0 implements Internal$EnumLite {
    REPEATED_FIELD_ENCODING_UNKNOWN(0),
    PACKED(1),
    EXPANDED(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16578a;

    EnumC1075a0(int i7) {
        this.f16578a = i7;
    }

    public static EnumC1075a0 a(int i7) {
        if (i7 == 0) {
            return REPEATED_FIELD_ENCODING_UNKNOWN;
        }
        if (i7 == 1) {
            return PACKED;
        }
        if (i7 != 2) {
            return null;
        }
        return EXPANDED;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.f16578a;
    }
}
