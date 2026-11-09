package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1079b0 implements Internal$EnumLite {
    UTF8_VALIDATION_UNKNOWN(0),
    VERIFY(2),
    NONE(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16586a;

    EnumC1079b0(int i7) {
        this.f16586a = i7;
    }

    public static EnumC1079b0 a(int i7) {
        if (i7 == 0) {
            return UTF8_VALIDATION_UNKNOWN;
        }
        if (i7 == 2) {
            return VERIFY;
        }
        if (i7 != 3) {
            return null;
        }
        return NONE;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.f16586a;
    }
}
