package T5;

import com.nimbusds.jose.jwk.AsymmetricJWK;
import com.nimbusds.jose.jwk.CurveBasedJWK;
import java.math.BigInteger;
import java.net.URI;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends d implements AsymmetricJWK, CurveBasedJWK {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final Set f8969H = Collections.unmodifiableSet(new HashSet(Arrays.asList(a.f8959b, a.f8960c, a.f8962e, a.f8963f)));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Z5.b f8970A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Z5.b f8971B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Z5.b f8972C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a f8973w;

    public b(a aVar, Z5.b bVar, Z5.b bVar2, i iVar, LinkedHashSet linkedHashSet, P5.a aVar2, String str, URI uri, Z5.b bVar3, Z5.b bVar4, LinkedList linkedList, Date date, Date date2, Date date3) {
        super(h.f8998b, iVar, linkedHashSet, aVar2, str, uri, bVar3, bVar4, linkedList, date, date2, date3);
        if (aVar == null) {
            throw new IllegalArgumentException("The curve must not be null");
        }
        this.f8973w = aVar;
        if (bVar == null) {
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        this.f8970A = bVar;
        if (bVar2 == null) {
            throw new IllegalArgumentException("The 'y' coordinate must not be null");
        }
        this.f8971B = bVar2;
        d(aVar, bVar, bVar2);
        List listA = a();
        if (listA != null && !matches((X509Certificate) listA.get(0))) {
            throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
        this.f8972C = null;
    }

    public static void d(a aVar, Z5.b bVar, Z5.b bVar2) {
        if (!f8969H.contains(aVar)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
        }
        BigInteger bigIntegerB = bVar.b();
        BigInteger bigIntegerB2 = bVar2.b();
        EllipticCurve curve = aVar.b().getCurve();
        BigInteger a3 = curve.getA();
        BigInteger b7 = curve.getB();
        BigInteger p3 = ((ECFieldFp) curve.getField()).getP();
        if (bigIntegerB2.pow(2).mod(p3).equals(bigIntegerB.pow(3).add(a3.multiply(bigIntegerB)).add(b7).mod(p3))) {
            return;
        }
        throw new IllegalArgumentException("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the " + aVar + " curve");
    }

    @Override // T5.d
    public final boolean b() {
        return this.f8972C != null;
    }

    @Override // T5.d
    public final HashMap c() {
        HashMap mapC = super.c();
        mapC.put("crv", this.f8973w.f8968a);
        mapC.put("x", this.f8970A.f11522a);
        mapC.put("y", this.f8971B.f11522a);
        Z5.b bVar = this.f8972C;
        if (bVar != null) {
            mapC.put("d", bVar.f11522a);
        }
        return mapC;
    }

    public final ECPrivateKey e() throws P5.d {
        Z5.b bVar = this.f8972C;
        if (bVar == null) {
            return null;
        }
        a aVar = this.f8973w;
        ECParameterSpec eCParameterSpecB = aVar.b();
        if (eCParameterSpecB == null) {
            throw new P5.d("Couldn't get EC parameter spec for curve " + aVar);
        }
        try {
            return (ECPrivateKey) KeyFactory.getInstance("EC").generatePrivate(new ECPrivateKeySpec(bVar.b(), eCParameterSpecB));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e10) {
            throw new P5.d(e10.getMessage(), e10);
        }
    }

    @Override // T5.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b) || !super.equals(obj)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f8973w, bVar.f8973w) && Objects.equals(this.f8970A, bVar.f8970A) && Objects.equals(this.f8971B, bVar.f8971B) && Objects.equals(this.f8972C, bVar.f8972C);
    }

    public final ECPublicKey f() throws P5.d {
        a aVar = this.f8973w;
        ECParameterSpec eCParameterSpecB = aVar.b();
        if (eCParameterSpecB == null) {
            throw new P5.d("Couldn't get EC parameter spec for curve " + aVar);
        }
        try {
            return (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(this.f8970A.b(), this.f8971B.b()), eCParameterSpecB));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e10) {
            throw new P5.d(e10.getMessage(), e10);
        }
    }

    @Override // com.nimbusds.jose.jwk.CurveBasedJWK
    public final a getCurve() {
        return this.f8973w;
    }

    @Override // T5.d
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f8973w, this.f8970A, this.f8971B, this.f8972C, null);
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final boolean matches(X509Certificate x509Certificate) {
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) ((X509Certificate) a().get(0)).getPublicKey();
            if (this.f8970A.b().equals(eCPublicKey.getW().getAffineX())) {
                return this.f8971B.b().equals(eCPublicKey.getW().getAffineY());
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final KeyPair toKeyPair() {
        return new KeyPair(f(), e());
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final PrivateKey toPrivateKey() throws P5.d {
        ECPrivateKey eCPrivateKeyE = e();
        if (eCPrivateKeyE != null) {
            return eCPrivateKeyE;
        }
        return null;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final PublicKey toPublicKey() {
        return f();
    }

    public b(a aVar, Z5.b bVar, Z5.b bVar2, Z5.b bVar3, i iVar, LinkedHashSet linkedHashSet, P5.a aVar2, String str, URI uri, Z5.b bVar4, Z5.b bVar5, LinkedList linkedList, Date date, Date date2, Date date3) {
        super(h.f8998b, iVar, linkedHashSet, aVar2, str, uri, bVar4, bVar5, linkedList, date, date2, date3);
        if (aVar != null) {
            this.f8973w = aVar;
            if (bVar != null) {
                this.f8970A = bVar;
                if (bVar2 != null) {
                    this.f8971B = bVar2;
                    d(aVar, bVar, bVar2);
                    List listA = a();
                    if (listA == null || matches((X509Certificate) listA.get(0))) {
                        this.f8972C = bVar3;
                        return;
                    }
                    throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
