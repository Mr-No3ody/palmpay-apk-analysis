package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1159z0 implements Internal$EnumLite {
    NONE(0),
    SET(1),
    ALIAS(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16815a;

    EnumC1159z0(int i7) {
        this.f16815a = i7;
    }

    public static EnumC1159z0 a(int i7) {
        if (i7 == 0) {
            return NONE;
        }
        if (i7 == 1) {
            return SET;
        }
        if (i7 != 2) {
            return null;
        }
        return ALIAS;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.f16815a;
    }
}
