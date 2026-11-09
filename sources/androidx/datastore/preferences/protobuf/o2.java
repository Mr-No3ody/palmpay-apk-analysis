package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum o2 implements Internal$EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16720a;

    o2(int i7) {
        this.f16720a = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f16720a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
