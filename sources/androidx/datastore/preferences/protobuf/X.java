package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum X implements Internal$EnumLite {
    FIELD_PRESENCE_UNKNOWN(0),
    EXPLICIT(1),
    IMPLICIT(2),
    LEGACY_REQUIRED(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16559a;

    X(int i7) {
        this.f16559a = i7;
    }

    public static X a(int i7) {
        if (i7 == 0) {
            return FIELD_PRESENCE_UNKNOWN;
        }
        if (i7 == 1) {
            return EXPLICIT;
        }
        if (i7 == 2) {
            return IMPLICIT;
        }
        if (i7 != 3) {
            return null;
        }
        return LEGACY_REQUIRED;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.f16559a;
    }
}
