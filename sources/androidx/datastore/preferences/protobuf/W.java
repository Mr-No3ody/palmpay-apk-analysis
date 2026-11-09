package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum W implements Internal$EnumLite {
    ENUM_TYPE_UNKNOWN(0),
    OPEN(1),
    CLOSED(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16549a;

    W(int i7) {
        this.f16549a = i7;
    }

    public static W a(int i7) {
        if (i7 == 0) {
            return ENUM_TYPE_UNKNOWN;
        }
        if (i7 == 1) {
            return OPEN;
        }
        if (i7 != 2) {
            return null;
        }
        return CLOSED;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.f16549a;
    }
}
