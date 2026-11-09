package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum W1 implements Internal$EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16553a;

    W1(int i7) {
        this.f16553a = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f16553a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
