package T5;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f8998b = new h("EC");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f8999c = new h("RSA");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f9000d = new h("oct");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f9001e = new h("OKP");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9002a;

    public h(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The key type value must not be null");
        }
        this.f9002a = str;
    }

    public static h a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The key type to parse must not be null");
        }
        h hVar = f8998b;
        if (str.equals(hVar.f9002a)) {
            return hVar;
        }
        h hVar2 = f8999c;
        if (str.equals(hVar2.f9002a)) {
            return hVar2;
        }
        h hVar3 = f9000d;
        if (str.equals(hVar3.f9002a)) {
            return hVar3;
        }
        h hVar4 = f9001e;
        return str.equals(hVar4.f9002a) ? hVar4 : new h(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f9002a.equals(((h) obj).f9002a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9002a.hashCode();
    }

    public final String toString() {
        return this.f9002a;
    }
}
