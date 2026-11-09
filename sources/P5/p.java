package P5;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z5.b f6997a;

    public p(Z5.b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("The Base64URL-encoded object must not be null");
        }
        this.f6997a = bVar;
    }

    public final String toString() {
        Z5.b bVar = this.f6997a;
        if (bVar != null) {
            return new String(bVar.a(), Z5.e.f11524a);
        }
        return null;
    }
}
