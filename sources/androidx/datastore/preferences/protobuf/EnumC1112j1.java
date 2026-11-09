package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1112j1 implements Internal$EnumLite {
    CARDINALITY_UNKNOWN(0),
    CARDINALITY_OPTIONAL(1),
    CARDINALITY_REQUIRED(2),
    CARDINALITY_REPEATED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16664a;

    EnumC1112j1(int i7) {
        this.f16664a = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f16664a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
