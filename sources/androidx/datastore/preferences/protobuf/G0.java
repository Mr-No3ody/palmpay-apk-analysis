package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum G0 implements Internal$EnumLite {
    IDEMPOTENCY_UNKNOWN(0),
    NO_SIDE_EFFECTS(1),
    IDEMPOTENT(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16487a;

    G0(int i7) {
        this.f16487a = i7;
    }

    public static G0 a(int i7) {
        if (i7 == 0) {
            return IDEMPOTENCY_UNKNOWN;
        }
        if (i7 == 1) {
            return NO_SIDE_EFFECTS;
        }
        if (i7 != 2) {
            return null;
        }
        return IDEMPOTENT;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.f16487a;
    }
}
