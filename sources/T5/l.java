package T5;

import com.nimbusds.jose.jwk.SecretJWK;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Objects;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends d implements SecretJWK {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Z5.b f9013w;

    public l(Z5.b bVar, i iVar, LinkedHashSet linkedHashSet, P5.a aVar, String str, URI uri, Z5.b bVar2, Z5.b bVar3, LinkedList linkedList, Date date, Date date2, Date date3) {
        super(h.f9000d, iVar, linkedHashSet, aVar, str, uri, bVar2, bVar3, linkedList, date, date2, date3);
        if (bVar == null) {
            throw new IllegalArgumentException("The key value must not be null");
        }
        this.f9013w = bVar;
    }

    @Override // T5.d
    public final boolean b() {
        return true;
    }

    @Override // T5.d
    public final HashMap c() {
        HashMap mapC = super.c();
        mapC.put("k", this.f9013w.f11522a);
        return mapC;
    }

    @Override // T5.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && super.equals(obj)) {
            return Objects.equals(this.f9013w, ((l) obj).f9013w);
        }
        return false;
    }

    @Override // T5.d
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f9013w);
    }

    @Override // com.nimbusds.jose.jwk.SecretJWK
    public final SecretKey toSecretKey() {
        return new SecretKeySpec(this.f9013w.a(), "NONE");
    }
}
