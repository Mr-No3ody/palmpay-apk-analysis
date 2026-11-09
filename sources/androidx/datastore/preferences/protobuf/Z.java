package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum Z implements Internal$EnumLite {
    MESSAGE_ENCODING_UNKNOWN(0),
    LENGTH_PREFIXED(1),
    DELIMITED(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16569a;

    Z(int i7) {
        this.f16569a = i7;
    }

    public static Z a(int i7) {
        if (i7 == 0) {
            return MESSAGE_ENCODING_UNKNOWN;
        }
        if (i7 == 1) {
            return LENGTH_PREFIXED;
        }
        if (i7 != 2) {
            return null;
        }
        return DELIMITED;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.f16569a;
    }
}
