package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1115k0 implements Internal$EnumLite {
    STRING(0),
    CORD(1),
    STRING_PIECE(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16670a;

    EnumC1115k0(int i7) {
        this.f16670a = i7;
    }

    public static EnumC1115k0 a(int i7) {
        if (i7 == 0) {
            return STRING;
        }
        if (i7 == 1) {
            return CORD;
        }
        if (i7 != 2) {
            return null;
        }
        return STRING_PIECE;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.f16670a;
    }
}
