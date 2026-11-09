package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum Y implements Internal$EnumLite {
    JSON_FORMAT_UNKNOWN(0),
    ALLOW(1),
    LEGACY_BEST_EFFORT(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16564a;

    Y(int i7) {
        this.f16564a = i7;
    }

    public static Y a(int i7) {
        if (i7 == 0) {
            return JSON_FORMAT_UNKNOWN;
        }
        if (i7 == 1) {
            return ALLOW;
        }
        if (i7 != 2) {
            return null;
        }
        return LEGACY_BEST_EFFORT;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.f16564a;
    }
}
