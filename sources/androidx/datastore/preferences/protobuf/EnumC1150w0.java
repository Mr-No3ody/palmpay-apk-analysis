package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1150w0 implements Internal$EnumLite {
    SPEED(1),
    CODE_SIZE(2),
    LITE_RUNTIME(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16797a;

    EnumC1150w0(int i7) {
        this.f16797a = i7;
    }

    public static EnumC1150w0 a(int i7) {
        if (i7 == 1) {
            return SPEED;
        }
        if (i7 == 2) {
            return CODE_SIZE;
        }
        if (i7 != 3) {
            return null;
        }
        return LITE_RUNTIME;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.f16797a;
    }
}
