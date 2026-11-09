package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum A1 implements Internal$EnumLite {
    /* JADX INFO: Fake field, exist only in values array */
    UTF8_VALIDATION_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    DEFAULT(1),
    /* JADX INFO: Fake field, exist only in values array */
    VERIFY(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16430a;

    A1(int i7) {
        this.f16430a = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.f16430a;
    }
}
