package T5;

/* JADX INFO: loaded from: classes3.dex */
public enum g {
    SIGN("sign"),
    VERIFY("verify"),
    ENCRYPT("encrypt"),
    DECRYPT("decrypt"),
    WRAP_KEY("wrapKey"),
    UNWRAP_KEY("unwrapKey"),
    /* JADX INFO: Fake field, exist only in values array */
    DERIVE_KEY("deriveKey"),
    /* JADX INFO: Fake field, exist only in values array */
    DERIVE_BITS("deriveBits");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8997a;

    g(String str) {
        this.f8997a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f8997a;
    }
}
