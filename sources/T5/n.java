package T5;

import com.nimbusds.jose.jwk.AsymmetricJWK;
import java.math.BigInteger;
import java.net.URI;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAMultiPrimePrivateCrtKeySpec;
import java.security.spec.RSAOtherPrimeInfo;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends d implements AsymmetricJWK {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Z5.b f9017A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Z5.b f9018B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Z5.b f9019C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Z5.b f9020H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Z5.b f9021L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Z5.b f9022M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final Z5.b f9023Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final List f9024X;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Z5.b f9025w;

    public n(Z5.b bVar, Z5.b bVar2, Z5.b bVar3, Z5.b bVar4, Z5.b bVar5, Z5.b bVar6, Z5.b bVar7, Z5.b bVar8, ArrayList arrayList, i iVar, LinkedHashSet linkedHashSet, P5.a aVar, String str, URI uri, Z5.b bVar9, Z5.b bVar10, LinkedList linkedList, Date date, Date date2, Date date3) {
        super(h.f8999c, iVar, linkedHashSet, aVar, str, uri, bVar9, bVar10, linkedList, date, date2, date3);
        if (bVar == null) {
            throw new IllegalArgumentException("The modulus value must not be null");
        }
        this.f9025w = bVar;
        if (bVar2 == null) {
            throw new IllegalArgumentException("The public exponent value must not be null");
        }
        this.f9017A = bVar2;
        if (a() != null && !matches((X509Certificate) a().get(0))) {
            throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
        this.f9018B = bVar3;
        if (bVar4 != null && bVar5 != null && bVar6 != null && bVar7 != null && bVar8 != null) {
            this.f9019C = bVar4;
            this.f9020H = bVar5;
            this.f9021L = bVar6;
            this.f9022M = bVar7;
            this.f9023Q = bVar8;
            if (arrayList != null) {
                this.f9024X = Collections.unmodifiableList(arrayList);
                return;
            } else {
                this.f9024X = Collections.EMPTY_LIST;
                return;
            }
        }
        if (bVar4 == null && bVar5 == null && bVar6 == null && bVar7 == null && bVar8 == null && arrayList == null) {
            this.f9019C = null;
            this.f9020H = null;
            this.f9021L = null;
            this.f9022M = null;
            this.f9023Q = null;
            this.f9024X = Collections.EMPTY_LIST;
            return;
        }
        if (bVar4 == null && bVar5 == null && bVar6 == null && bVar7 == null && bVar8 == null) {
            this.f9019C = null;
            this.f9020H = null;
            this.f9021L = null;
            this.f9022M = null;
            this.f9023Q = null;
            this.f9024X = Collections.EMPTY_LIST;
            return;
        }
        if (bVar4 == null) {
            throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first prime factor must not be null");
        }
        if (bVar5 == null) {
            throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second prime factor must not be null");
        }
        if (bVar6 == null) {
            throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
        }
        if (bVar7 != null) {
            throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
        }
        throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
    }

    @Override // T5.d
    public final boolean b() {
        return (this.f9018B == null && this.f9019C == null) ? false : true;
    }

    @Override // T5.d
    public final HashMap c() {
        HashMap mapC = super.c();
        mapC.put("n", this.f9025w.f11522a);
        mapC.put("e", this.f9017A.f11522a);
        Z5.b bVar = this.f9018B;
        if (bVar != null) {
            mapC.put("d", bVar.f11522a);
        }
        Z5.b bVar2 = this.f9019C;
        if (bVar2 != null) {
            mapC.put("p", bVar2.f11522a);
        }
        Z5.b bVar3 = this.f9020H;
        if (bVar3 != null) {
            mapC.put("q", bVar3.f11522a);
        }
        Z5.b bVar4 = this.f9021L;
        if (bVar4 != null) {
            mapC.put("dp", bVar4.f11522a);
        }
        Z5.b bVar5 = this.f9022M;
        if (bVar5 != null) {
            mapC.put("dq", bVar5.f11522a);
        }
        Z5.b bVar6 = this.f9023Q;
        if (bVar6 != null) {
            mapC.put("qi", bVar6.f11522a);
        }
        List<m> list = this.f9024X;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (m mVar : list) {
                com.nimbusds.jose.shaded.gson.m mVar2 = Z5.c.f11523a;
                HashMap map = new HashMap();
                map.put("r", mVar.f9014a.f11522a);
                map.put("d", mVar.f9015b.f11522a);
                map.put("t", mVar.f9016c.f11522a);
                arrayList.add(map);
            }
            mapC.put("oth", arrayList);
        }
        return mapC;
    }

    public final RSAPublicKey d() throws P5.d {
        try {
            return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(this.f9025w.b(), this.f9017A.b()));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e10) {
            throw new P5.d(e10.getMessage(), e10);
        }
    }

    @Override // T5.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n) || !super.equals(obj)) {
            return false;
        }
        n nVar = (n) obj;
        return Objects.equals(this.f9025w, nVar.f9025w) && Objects.equals(this.f9017A, nVar.f9017A) && Objects.equals(this.f9018B, nVar.f9018B) && Objects.equals(this.f9019C, nVar.f9019C) && Objects.equals(this.f9020H, nVar.f9020H) && Objects.equals(this.f9021L, nVar.f9021L) && Objects.equals(this.f9022M, nVar.f9022M) && Objects.equals(this.f9023Q, nVar.f9023Q) && Objects.equals(this.f9024X, nVar.f9024X);
    }

    @Override // T5.d
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f9025w, this.f9017A, this.f9018B, this.f9019C, this.f9020H, this.f9021L, this.f9022M, this.f9023Q, this.f9024X, null);
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final boolean matches(X509Certificate x509Certificate) {
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) ((X509Certificate) a().get(0)).getPublicKey();
            if (this.f9017A.b().equals(rSAPublicKey.getPublicExponent())) {
                return this.f9025w.b().equals(rSAPublicKey.getModulus());
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final KeyPair toKeyPair() {
        return new KeyPair(d(), toPrivateKey());
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final PrivateKey toPrivateKey() throws P5.d {
        PrivateKey privateKey;
        RSAPrivateKeySpec rSAPrivateCrtKeySpec;
        RSAPrivateKeySpec rSAPrivateKeySpec;
        RSAPrivateKey rSAPrivateKey;
        Z5.b bVar = this.f9018B;
        if (bVar == null) {
            rSAPrivateKey = null;
            privateKey = null;
        } else {
            BigInteger bigIntegerB = this.f9025w.b();
            BigInteger bigIntegerB2 = bVar.b();
            Z5.b bVar2 = this.f9019C;
            if (bVar2 == null) {
                rSAPrivateKeySpec = new RSAPrivateKeySpec(bigIntegerB, bigIntegerB2);
                privateKey = null;
            } else {
                BigInteger bigIntegerB3 = this.f9017A.b();
                BigInteger bigIntegerB4 = bVar2.b();
                BigInteger bigIntegerB5 = this.f9020H.b();
                BigInteger bigIntegerB6 = this.f9021L.b();
                BigInteger bigIntegerB7 = this.f9022M.b();
                BigInteger bigIntegerB8 = this.f9023Q.b();
                List list = this.f9024X;
                if (list == null || list.isEmpty()) {
                    privateKey = null;
                    rSAPrivateCrtKeySpec = new RSAPrivateCrtKeySpec(bigIntegerB, bigIntegerB3, bigIntegerB2, bigIntegerB4, bigIntegerB5, bigIntegerB6, bigIntegerB7, bigIntegerB8);
                } else {
                    RSAOtherPrimeInfo[] rSAOtherPrimeInfoArr = new RSAOtherPrimeInfo[list.size()];
                    for (int i7 = 0; i7 < list.size(); i7++) {
                        m mVar = (m) list.get(i7);
                        rSAOtherPrimeInfoArr[i7] = new RSAOtherPrimeInfo(mVar.f9014a.b(), mVar.f9015b.b(), mVar.f9016c.b());
                    }
                    privateKey = null;
                    rSAPrivateCrtKeySpec = new RSAMultiPrimePrivateCrtKeySpec(bigIntegerB, bigIntegerB3, bigIntegerB2, bigIntegerB4, bigIntegerB5, bigIntegerB6, bigIntegerB7, bigIntegerB8, rSAOtherPrimeInfoArr);
                }
                rSAPrivateKeySpec = rSAPrivateCrtKeySpec;
            }
            try {
                rSAPrivateKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(rSAPrivateKeySpec);
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e10) {
                throw new P5.d(e10.getMessage(), e10);
            }
        }
        return rSAPrivateKey != null ? rSAPrivateKey : privateKey;
    }

    @Override // com.nimbusds.jose.jwk.AsymmetricJWK
    public final PublicKey toPublicKey() {
        return d();
    }
}
