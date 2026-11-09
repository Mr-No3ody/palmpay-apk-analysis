package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1133q0 implements Internal$EnumLite {
    RETENTION_UNKNOWN(0),
    RETENTION_RUNTIME(1),
    RETENTION_SOURCE(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16748a;

    EnumC1133q0(int i7) {
        this.f16748a = i7;
    }

    public static EnumC1133q0 a(int i7) {
        if (i7 == 0) {
            return RETENTION_UNKNOWN;
        }
        if (i7 == 1) {
            return RETENTION_RUNTIME;
        }
        if (i7 != 2) {
            return null;
        }
        return RETENTION_SOURCE;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.f16748a;
    }
}
