package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1130p0 implements Internal$EnumLite {
    JS_NORMAL(0),
    JS_STRING(1),
    JS_NUMBER(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16733a;

    EnumC1130p0(int i7) {
        this.f16733a = i7;
    }

    public static EnumC1130p0 a(int i7) {
        if (i7 == 0) {
            return JS_NORMAL;
        }
        if (i7 == 1) {
            return JS_STRING;
        }
        if (i7 != 2) {
            return null;
        }
        return JS_NUMBER;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.f16733a;
    }
}
