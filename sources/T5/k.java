package T5;

import com.nimbusds.jose.jwk.AsymmetricJWK;
import com.nimbusds.jose.jwk.CurveBasedJWK;
import java.net.URI;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends d implements AsymmetricJWK, CurveBasedJWK {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final Set f9007L = Collections.unmodifiableSet(new HashSet(Arrays.asList(a.f8964g, a.f8965i, a.f8966j, a.f8967o)));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Z5.b f9008A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final byte[] f9009B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Z5.b f9010C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final byte[] f9011H;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a f9012w;

    public k(a aVar, Z5.b bVar, i iVar, LinkedHashSet linkedHashSet, P5.a aVar2, String str, URI uri, Z5.b bVar2, Z5.b bVar3, LinkedList linkedList, Date date, Date date2, Date date3) {
        super(h.f9001e, iVar, linkedHashSet, aVar2, str, uri, bVar2, bVar3, linkedList, date, date2, date3);
        if (aVar == null) {
            throw new IllegalArgumentException("The curve must not be null");
        }
        if (!f9007L.contains(aVar)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
        }
        this.f9012w = aVar;
        if (bVar == null) {
            throw new IllegalArgumentException("The 'x' parameter must not be null");
        }
        this.f9008A = bVar;
        this.f9009B = bVar.a();
        this.f9010C = null;
        this.f9011H = null;
    }

    @Override // T5.d
    public final boolean b() {
        return this.f9010C != null;
    }

    @Override // T5.d
    public final HashMap c() {
        HashMap mapC = super.c();
        mapC.put("crv", this.f9012w.f8968a);
        mapC.put("x", this.f9008A.f11522a);
        Z5.b bVar = this.f9010C;
        if (bVar != null) {
            mapC.put("d", bVar.f11522a);
        }
        return mapC;
    }

    @Override // T5.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k) || !super.equals(obj)) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equals(this.f9012w, kVar.f9012w) && Objects.equals(this.f9008A, kVar.f9008A) && Arrays.equals(this.f9009B, kVar.f9009B) && Objects.equals(this.f9010C, kVar.f9010C) && Arrays.equals(this.f9011H, kVar.f9011H);
    }

    @Override // com.nimbusds.jose.jwk.CurveBasedJWK
    public final a getCurve() {
        return this.f9012w;
    }

    @Override // T5.d
    public final int hashCode() {
        return Arrays.hashCode(this.f9011H) + ((Arrays.hashCode(this.f9009B) + (Objects.hash(Integer.valueOf(super.hashCode()), this.f9012w, this.f9008A, this.f9010C) * 31)) * 31);
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final boolean matches(X509Certificate x509Certificate) {
        return false;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final KeyPair toKeyPair() throws P5.d {
        throw new P5.d("Export to java.security.KeyPair not supported");
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final PrivateKey toPrivateKey() throws P5.d {
        throw new P5.d("Export to java.security.PrivateKey not supported");
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final PublicKey toPublicKey() throws P5.d {
        throw new P5.d("Export to java.security.PublicKey not supported");
    }

    public k(a aVar, Z5.b bVar, Z5.b bVar2, i iVar, LinkedHashSet linkedHashSet, P5.a aVar2, String str, URI uri, Z5.b bVar3, Z5.b bVar4, LinkedList linkedList, Date date, Date date2, Date date3) {
        super(h.f9001e, iVar, linkedHashSet, aVar2, str, uri, bVar3, bVar4, linkedList, date, date2, date3);
        if (aVar != null) {
            if (f9007L.contains(aVar)) {
                this.f9012w = aVar;
                if (bVar != null) {
                    this.f9008A = bVar;
                    this.f9009B = bVar.a();
                    this.f9010C = bVar2;
                    this.f9011H = bVar2.a();
                    return;
                }
                throw new IllegalArgumentException("The 'x' parameter must not be null");
            }
            throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
