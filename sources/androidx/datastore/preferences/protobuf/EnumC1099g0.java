package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1099g0 implements Internal$EnumLite {
    LABEL_OPTIONAL(1),
    LABEL_REPEATED(3),
    LABEL_REQUIRED(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16625a;

    EnumC1099g0(int i7) {
        this.f16625a = i7;
    }

    public static EnumC1099g0 a(int i7) {
        if (i7 == 1) {
            return LABEL_OPTIONAL;
        }
        if (i7 == 2) {
            return LABEL_REQUIRED;
        }
        if (i7 != 3) {
            return null;
        }
        return LABEL_REPEATED;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.f16625a;
    }
}
