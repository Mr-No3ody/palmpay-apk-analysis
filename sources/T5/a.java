package T5;

import java.io.Serializable;
import java.security.spec.ECParameterSpec;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8959b = new a("P-256");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f8960c = new a("secp256k1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f8961d = new a("P-256K");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f8962e = new a("P-384");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f8963f = new a("P-521");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f8964g = new a("Ed25519");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f8965i = new a("Ed448");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f8966j = new a("X25519");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f8967o = new a("X448");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8968a;

    public a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The JOSE cryptographic curve name must not be null");
        }
        this.f8968a = str;
    }

    public static a a(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("The cryptographic curve string must not be null or empty");
        }
        a aVar = f8959b;
        if (str.equals(aVar.f8968a)) {
            return aVar;
        }
        a aVar2 = f8961d;
        if (str.equals(aVar2.f8968a)) {
            return aVar2;
        }
        a aVar3 = f8960c;
        if (str.equals(aVar3.f8968a)) {
            return aVar3;
        }
        a aVar4 = f8962e;
        if (str.equals(aVar4.f8968a)) {
            return aVar4;
        }
        a aVar5 = f8963f;
        if (str.equals(aVar5.f8968a)) {
            return aVar5;
        }
        a aVar6 = f8964g;
        if (str.equals(aVar6.f8968a)) {
            return aVar6;
        }
        a aVar7 = f8965i;
        if (str.equals(aVar7.f8968a)) {
            return aVar7;
        }
        a aVar8 = f8966j;
        if (str.equals(aVar8.f8968a)) {
            return aVar8;
        }
        a aVar9 = f8967o;
        return str.equals(aVar9.f8968a) ? aVar9 : new a(str);
    }

    public final ECParameterSpec b() {
        ECParameterSpec eCParameterSpec = c.f8974a;
        if (f8959b.equals(this)) {
            return c.f8974a;
        }
        if (f8960c.equals(this)) {
            return c.f8975b;
        }
        if (f8962e.equals(this)) {
            return c.f8976c;
        }
        if (f8963f.equals(this)) {
            return c.f8977d;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f8968a.equals(((a) obj).f8968a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f8968a);
    }

    public final String toString() {
        return this.f8968a;
    }
}
