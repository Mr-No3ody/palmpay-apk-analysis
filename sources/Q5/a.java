package Q5;

import P5.d;
import P5.k;
import P5.l;
import R5.b;
import com.nimbusds.jose.CriticalHeaderParamsAware;
import com.nimbusds.jose.JWSVerifier;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b implements JWSVerifier, CriticalHeaderParamsAware {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R5.a f7625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RSAPublicKey f7626e;

    public a(RSAPublicKey rSAPublicKey) {
        Set set = b.f7932c;
        this.f5950b = new S5.a();
        if (set == null) {
            throw new IllegalArgumentException("The supported JWS algorithm set must not be null");
        }
        this.f5949a = Collections.unmodifiableSet(set);
        R5.a aVar = new R5.a();
        Set set2 = Collections.EMPTY_SET;
        aVar.f7931a = set2;
        this.f7625d = aVar;
        if (rSAPublicKey == null) {
            throw new IllegalArgumentException("The public RSA key must not be null");
        }
        this.f7626e = rSAPublicKey;
        aVar.f7931a = set2;
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public final Set getDeferredCriticalHeaderParams() {
        return Collections.unmodifiableSet(this.f7625d.f7931a);
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public final Set getProcessedCriticalHeaderParams() {
        this.f7625d.getClass();
        return Collections.singleton("b64");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[PHI: r3
      0x008c: PHI (r3v5 java.security.Signature) = (r3v3 java.security.Signature), (r3v4 java.security.Signature), (r3v6 java.security.Signature) binds: [B:52:0x00e3, B:42:0x00b7, B:32:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x013f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0142  */
    /* JADX WARN: Code duplicated, block: B:72:0x0147  */
    /* JADX WARN: Code duplicated, block: B:73:0x014d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0152  */
    /* JADX WARN: Code duplicated, block: B:93:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0157 A[SYNTHETIC] */
    @Override // com.nimbusds.jose.JWSVerifier
    public final boolean verify(l lVar, byte[] bArr, Z5.b bVar) throws d {
        k kVar;
        k kVar2;
        k kVar3;
        k kVar4;
        k kVar5;
        StringBuilder sb2;
        Object[] array;
        Signature signatureX;
        Signature signatureX2;
        R5.a aVar = this.f7625d;
        aVar.getClass();
        Set<String> set = lVar.f6947d;
        if (set != null) {
            for (String str : set) {
                if (!Collections.singleton("b64").contains(str) && !Collections.unmodifiableSet(aVar.f7931a).contains(str)) {
                }
            }
            kVar = k.f6980f;
            kVar2 = lVar.f6944a;
            if (kVar2.equals(kVar)) {
                kVar3 = k.f6986v;
                if (!kVar2.equals(kVar3)) {
                    if (kVar2.equals(kVar3)) {
                        kVar4 = k.f6987w;
                        if (!kVar2.equals(kVar4)) {
                            if (kVar2.equals(kVar4)) {
                                kVar5 = k.f6975A;
                                if (!kVar2.equals(kVar5)) {
                                }
                                if (kVar2.equals(kVar5)) {
                                }
                                StringBuilder sb3 = new StringBuilder("Unsupported JWS algorithm ");
                                sb3.append(kVar2);
                                sb3.append(", must be ");
                                sb2 = new StringBuilder();
                                array = b.f7932c.toArray();
                                for (int i7 = 0; i7 < array.length; i7++) {
                                    if (i7 != 0) {
                                        if (i7 < array.length - 1) {
                                            sb2.append(", ");
                                        } else if (i7 == array.length - 1) {
                                            sb2.append(" or ");
                                        }
                                    }
                                    sb2.append(array[i7].toString());
                                }
                                sb3.append(sb2.toString());
                                throw new d(sb3.toString());
                            }
                            kVar5 = k.f6975A;
                            if (!kVar2.equals(kVar5)) {
                            }
                            if (kVar2.equals(kVar5)) {
                            }
                            StringBuilder sb4 = new StringBuilder("Unsupported JWS algorithm ");
                            sb4.append(kVar2);
                            sb4.append(", must be ");
                            sb2 = new StringBuilder();
                            array = b.f7932c.toArray();
                            while (i7 < array.length) {
                                if (i7 != 0) {
                                    if (i7 < array.length - 1) {
                                        sb2.append(", ");
                                    } else if (i7 == array.length - 1) {
                                        sb2.append(" or ");
                                    }
                                }
                                sb2.append(array[i7].toString());
                            }
                            sb4.append(sb2.toString());
                            throw new d(sb4.toString());
                        }
                        if (kVar2.equals(kVar4)) {
                            kVar5 = k.f6975A;
                            if (!kVar2.equals(kVar5)) {
                            }
                            if (kVar2.equals(kVar5)) {
                            }
                            StringBuilder sb5 = new StringBuilder("Unsupported JWS algorithm ");
                            sb5.append(kVar2);
                            sb5.append(", must be ");
                            sb2 = new StringBuilder();
                            array = b.f7932c.toArray();
                            while (i7 < array.length) {
                                if (i7 != 0) {
                                    if (i7 < array.length - 1) {
                                        sb2.append(", ");
                                    } else if (i7 == array.length - 1) {
                                        sb2.append(" or ");
                                    }
                                }
                                sb2.append(array[i7].toString());
                            }
                            sb5.append(sb2.toString());
                            throw new d(sb5.toString());
                        }
                        kVar5 = k.f6975A;
                        if (!kVar2.equals(kVar5)) {
                        }
                        if (kVar2.equals(kVar5)) {
                        }
                        StringBuilder sb6 = new StringBuilder("Unsupported JWS algorithm ");
                        sb6.append(kVar2);
                        sb6.append(", must be ");
                        sb2 = new StringBuilder();
                        array = b.f7932c.toArray();
                        while (i7 < array.length) {
                            if (i7 != 0) {
                                if (i7 < array.length - 1) {
                                    sb2.append(", ");
                                } else if (i7 == array.length - 1) {
                                    sb2.append(" or ");
                                }
                            }
                            sb2.append(array[i7].toString());
                        }
                        sb6.append(sb2.toString());
                        throw new d(sb6.toString());
                    }
                    kVar4 = k.f6987w;
                    if (!kVar2.equals(kVar4)) {
                        if (kVar2.equals(kVar4)) {
                            kVar5 = k.f6975A;
                            if (!kVar2.equals(kVar5)) {
                            }
                            if (kVar2.equals(kVar5)) {
                            }
                            StringBuilder sb7 = new StringBuilder("Unsupported JWS algorithm ");
                            sb7.append(kVar2);
                            sb7.append(", must be ");
                            sb2 = new StringBuilder();
                            array = b.f7932c.toArray();
                            while (i7 < array.length) {
                                if (i7 != 0) {
                                    if (i7 < array.length - 1) {
                                        sb2.append(", ");
                                    } else if (i7 == array.length - 1) {
                                        sb2.append(" or ");
                                    }
                                }
                                sb2.append(array[i7].toString());
                            }
                            sb7.append(sb2.toString());
                            throw new d(sb7.toString());
                        }
                        kVar5 = k.f6975A;
                        if (!kVar2.equals(kVar5)) {
                        }
                        if (kVar2.equals(kVar5)) {
                        }
                        StringBuilder sb8 = new StringBuilder("Unsupported JWS algorithm ");
                        sb8.append(kVar2);
                        sb8.append(", must be ");
                        sb2 = new StringBuilder();
                        array = b.f7932c.toArray();
                        while (i7 < array.length) {
                            if (i7 != 0) {
                                if (i7 < array.length - 1) {
                                    sb2.append(", ");
                                } else if (i7 == array.length - 1) {
                                    sb2.append(" or ");
                                }
                            }
                            sb2.append(array[i7].toString());
                        }
                        sb8.append(sb2.toString());
                        throw new d(sb8.toString());
                    }
                    if (kVar2.equals(kVar4)) {
                        kVar5 = k.f6975A;
                        if (!kVar2.equals(kVar5)) {
                        }
                        if (kVar2.equals(kVar5)) {
                        }
                        StringBuilder sb9 = new StringBuilder("Unsupported JWS algorithm ");
                        sb9.append(kVar2);
                        sb9.append(", must be ");
                        sb2 = new StringBuilder();
                        array = b.f7932c.toArray();
                        while (i7 < array.length) {
                            if (i7 != 0) {
                                if (i7 < array.length - 1) {
                                    sb2.append(", ");
                                } else if (i7 == array.length - 1) {
                                    sb2.append(" or ");
                                }
                            }
                            sb2.append(array[i7].toString());
                        }
                        sb9.append(sb2.toString());
                        throw new d(sb9.toString());
                    }
                    kVar5 = k.f6975A;
                    if (!kVar2.equals(kVar5)) {
                    }
                    if (kVar2.equals(kVar5)) {
                    }
                    StringBuilder sb10 = new StringBuilder("Unsupported JWS algorithm ");
                    sb10.append(kVar2);
                    sb10.append(", must be ");
                    sb2 = new StringBuilder();
                    array = b.f7932c.toArray();
                    while (i7 < array.length) {
                        if (i7 != 0) {
                            if (i7 < array.length - 1) {
                                sb2.append(", ");
                            } else if (i7 == array.length - 1) {
                                sb2.append(" or ");
                            }
                        }
                        sb2.append(array[i7].toString());
                    }
                    sb10.append(sb2.toString());
                    throw new d(sb10.toString());
                }
                if (kVar2.equals(kVar3)) {
                    kVar4 = k.f6987w;
                    if (!kVar2.equals(kVar4)) {
                        if (kVar2.equals(kVar4)) {
                            kVar5 = k.f6975A;
                            if (!kVar2.equals(kVar5)) {
                            }
                            if (kVar2.equals(kVar5)) {
                            }
                            StringBuilder sb11 = new StringBuilder("Unsupported JWS algorithm ");
                            sb11.append(kVar2);
                            sb11.append(", must be ");
                            sb2 = new StringBuilder();
                            array = b.f7932c.toArray();
                            while (i7 < array.length) {
                                if (i7 != 0) {
                                    if (i7 < array.length - 1) {
                                        sb2.append(", ");
                                    } else if (i7 == array.length - 1) {
                                        sb2.append(" or ");
                                    }
                                }
                                sb2.append(array[i7].toString());
                            }
                            sb11.append(sb2.toString());
                            throw new d(sb11.toString());
                        }
                        kVar5 = k.f6975A;
                        if (!kVar2.equals(kVar5)) {
                        }
                        if (kVar2.equals(kVar5)) {
                        }
                        StringBuilder sb12 = new StringBuilder("Unsupported JWS algorithm ");
                        sb12.append(kVar2);
                        sb12.append(", must be ");
                        sb2 = new StringBuilder();
                        array = b.f7932c.toArray();
                        while (i7 < array.length) {
                            if (i7 != 0) {
                                if (i7 < array.length - 1) {
                                    sb2.append(", ");
                                } else if (i7 == array.length - 1) {
                                    sb2.append(" or ");
                                }
                            }
                            sb2.append(array[i7].toString());
                        }
                        sb12.append(sb2.toString());
                        throw new d(sb12.toString());
                    }
                    if (kVar2.equals(kVar4)) {
                        kVar5 = k.f6975A;
                        if (!kVar2.equals(kVar5)) {
                        }
                        if (kVar2.equals(kVar5)) {
                        }
                        StringBuilder sb13 = new StringBuilder("Unsupported JWS algorithm ");
                        sb13.append(kVar2);
                        sb13.append(", must be ");
                        sb2 = new StringBuilder();
                        array = b.f7932c.toArray();
                        while (i7 < array.length) {
                            if (i7 != 0) {
                                if (i7 < array.length - 1) {
                                    sb2.append(", ");
                                } else if (i7 == array.length - 1) {
                                    sb2.append(" or ");
                                }
                            }
                            sb2.append(array[i7].toString());
                        }
                        sb13.append(sb2.toString());
                        throw new d(sb13.toString());
                    }
                    kVar5 = k.f6975A;
                    if (!kVar2.equals(kVar5)) {
                    }
                    if (kVar2.equals(kVar5)) {
                    }
                    StringBuilder sb14 = new StringBuilder("Unsupported JWS algorithm ");
                    sb14.append(kVar2);
                    sb14.append(", must be ");
                    sb2 = new StringBuilder();
                    array = b.f7932c.toArray();
                    while (i7 < array.length) {
                        if (i7 != 0) {
                            if (i7 < array.length - 1) {
                                sb2.append(", ");
                            } else if (i7 == array.length - 1) {
                                sb2.append(" or ");
                            }
                        }
                        sb2.append(array[i7].toString());
                    }
                    sb14.append(sb2.toString());
                    throw new d(sb14.toString());
                }
                kVar4 = k.f6987w;
                if (!kVar2.equals(kVar4)) {
                    if (kVar2.equals(kVar4)) {
                        kVar5 = k.f6975A;
                        if (!kVar2.equals(kVar5)) {
                        }
                        if (kVar2.equals(kVar5)) {
                        }
                        StringBuilder sb15 = new StringBuilder("Unsupported JWS algorithm ");
                        sb15.append(kVar2);
                        sb15.append(", must be ");
                        sb2 = new StringBuilder();
                        array = b.f7932c.toArray();
                        while (i7 < array.length) {
                            if (i7 != 0) {
                                if (i7 < array.length - 1) {
                                    sb2.append(", ");
                                } else if (i7 == array.length - 1) {
                                    sb2.append(" or ");
                                }
                            }
                            sb2.append(array[i7].toString());
                        }
                        sb15.append(sb2.toString());
                        throw new d(sb15.toString());
                    }
                    kVar5 = k.f6975A;
                    if (!kVar2.equals(kVar5)) {
                    }
                    if (kVar2.equals(kVar5)) {
                    }
                    StringBuilder sb16 = new StringBuilder("Unsupported JWS algorithm ");
                    sb16.append(kVar2);
                    sb16.append(", must be ");
                    sb2 = new StringBuilder();
                    array = b.f7932c.toArray();
                    while (i7 < array.length) {
                        if (i7 != 0) {
                            if (i7 < array.length - 1) {
                                sb2.append(", ");
                            } else if (i7 == array.length - 1) {
                                sb2.append(" or ");
                            }
                        }
                        sb2.append(array[i7].toString());
                    }
                    sb16.append(sb2.toString());
                    throw new d(sb16.toString());
                }
                if (kVar2.equals(kVar4)) {
                    kVar5 = k.f6975A;
                    if (!kVar2.equals(kVar5)) {
                    }
                    if (kVar2.equals(kVar5)) {
                    }
                    StringBuilder sb17 = new StringBuilder("Unsupported JWS algorithm ");
                    sb17.append(kVar2);
                    sb17.append(", must be ");
                    sb2 = new StringBuilder();
                    array = b.f7932c.toArray();
                    while (i7 < array.length) {
                        if (i7 != 0) {
                            if (i7 < array.length - 1) {
                                sb2.append(", ");
                            } else if (i7 == array.length - 1) {
                                sb2.append(" or ");
                            }
                        }
                        sb2.append(array[i7].toString());
                    }
                    sb17.append(sb2.toString());
                    throw new d(sb17.toString());
                }
                kVar5 = k.f6975A;
                if (!kVar2.equals(kVar5)) {
                }
                if (kVar2.equals(kVar5)) {
                }
                StringBuilder sb18 = new StringBuilder("Unsupported JWS algorithm ");
                sb18.append(kVar2);
                sb18.append(", must be ");
                sb2 = new StringBuilder();
                array = b.f7932c.toArray();
                while (i7 < array.length) {
                    if (i7 != 0) {
                        if (i7 < array.length - 1) {
                            sb2.append(", ");
                        } else if (i7 == array.length - 1) {
                            sb2.append(" or ");
                        }
                    }
                    sb2.append(array[i7].toString());
                }
                sb18.append(sb2.toString());
                throw new d(sb18.toString());
            }
            kVar3 = k.f6986v;
            if (!kVar2.equals(kVar3)) {
                if (kVar2.equals(kVar3)) {
                    kVar4 = k.f6987w;
                    if (!kVar2.equals(kVar4)) {
                        if (kVar2.equals(kVar4)) {
                            kVar5 = k.f6975A;
                            if (!kVar2.equals(kVar5)) {
                            }
                            if (kVar2.equals(kVar5)) {
                            }
                            StringBuilder sb19 = new StringBuilder("Unsupported JWS algorithm ");
                            sb19.append(kVar2);
                            sb19.append(", must be ");
                            sb2 = new StringBuilder();
                            array = b.f7932c.toArray();
                            while (i7 < array.length) {
                                if (i7 != 0) {
                                    if (i7 < array.length - 1) {
                                        sb2.append(", ");
                                    } else if (i7 == array.length - 1) {
                                        sb2.append(" or ");
                                    }
                                }
                                sb2.append(array[i7].toString());
                            }
                            sb19.append(sb2.toString());
                            throw new d(sb19.toString());
                        }
                        kVar5 = k.f6975A;
                        if (!kVar2.equals(kVar5)) {
                        }
                        if (kVar2.equals(kVar5)) {
                        }
                        StringBuilder sb110 = new StringBuilder("Unsupported JWS algorithm ");
                        sb110.append(kVar2);
                        sb110.append(", must be ");
                        sb2 = new StringBuilder();
                        array = b.f7932c.toArray();
                        while (i7 < array.length) {
                            if (i7 != 0) {
                                if (i7 < array.length - 1) {
                                    sb2.append(", ");
                                } else if (i7 == array.length - 1) {
                                    sb2.append(" or ");
                                }
                            }
                            sb2.append(array[i7].toString());
                        }
                        sb110.append(sb2.toString());
                        throw new d(sb110.toString());
                    }
                    if (kVar2.equals(kVar4)) {
                        kVar5 = k.f6975A;
                        if (!kVar2.equals(kVar5)) {
                        }
                        if (kVar2.equals(kVar5)) {
                        }
                        StringBuilder sb111 = new StringBuilder("Unsupported JWS algorithm ");
                        sb111.append(kVar2);
                        sb111.append(", must be ");
                        sb2 = new StringBuilder();
                        array = b.f7932c.toArray();
                        while (i7 < array.length) {
                            if (i7 != 0) {
                                if (i7 < array.length - 1) {
                                    sb2.append(", ");
                                } else if (i7 == array.length - 1) {
                                    sb2.append(" or ");
                                }
                            }
                            sb2.append(array[i7].toString());
                        }
                        sb111.append(sb2.toString());
                        throw new d(sb111.toString());
                    }
                    kVar5 = k.f6975A;
                    if (!kVar2.equals(kVar5)) {
                    }
                    if (kVar2.equals(kVar5)) {
                    }
                    StringBuilder sb112 = new StringBuilder("Unsupported JWS algorithm ");
                    sb112.append(kVar2);
                    sb112.append(", must be ");
                    sb2 = new StringBuilder();
                    array = b.f7932c.toArray();
                    while (i7 < array.length) {
                        if (i7 != 0) {
                            if (i7 < array.length - 1) {
                                sb2.append(", ");
                            } else if (i7 == array.length - 1) {
                                sb2.append(" or ");
                            }
                        }
                        sb2.append(array[i7].toString());
                    }
                    sb112.append(sb2.toString());
                    throw new d(sb112.toString());
                }
                kVar4 = k.f6987w;
                if (!kVar2.equals(kVar4)) {
                    if (kVar2.equals(kVar4)) {
                        kVar5 = k.f6975A;
                        if (!kVar2.equals(kVar5)) {
                        }
                        if (kVar2.equals(kVar5)) {
                        }
                        StringBuilder sb113 = new StringBuilder("Unsupported JWS algorithm ");
                        sb113.append(kVar2);
                        sb113.append(", must be ");
                        sb2 = new StringBuilder();
                        array = b.f7932c.toArray();
                        while (i7 < array.length) {
                            if (i7 != 0) {
                                if (i7 < array.length - 1) {
                                    sb2.append(", ");
                                } else if (i7 == array.length - 1) {
                                    sb2.append(" or ");
                                }
                            }
                            sb2.append(array[i7].toString());
                        }
                        sb113.append(sb2.toString());
                        throw new d(sb113.toString());
                    }
                    kVar5 = k.f6975A;
                    if (!kVar2.equals(kVar5)) {
                    }
                    if (kVar2.equals(kVar5)) {
                    }
                    StringBuilder sb114 = new StringBuilder("Unsupported JWS algorithm ");
                    sb114.append(kVar2);
                    sb114.append(", must be ");
                    sb2 = new StringBuilder();
                    array = b.f7932c.toArray();
                    while (i7 < array.length) {
                        if (i7 != 0) {
                            if (i7 < array.length - 1) {
                                sb2.append(", ");
                            } else if (i7 == array.length - 1) {
                                sb2.append(" or ");
                            }
                        }
                        sb2.append(array[i7].toString());
                    }
                    sb114.append(sb2.toString());
                    throw new d(sb114.toString());
                }
                if (kVar2.equals(kVar4)) {
                    kVar5 = k.f6975A;
                    if (!kVar2.equals(kVar5)) {
                    }
                    if (kVar2.equals(kVar5)) {
                    }
                    StringBuilder sb115 = new StringBuilder("Unsupported JWS algorithm ");
                    sb115.append(kVar2);
                    sb115.append(", must be ");
                    sb2 = new StringBuilder();
                    array = b.f7932c.toArray();
                    while (i7 < array.length) {
                        if (i7 != 0) {
                            if (i7 < array.length - 1) {
                                sb2.append(", ");
                            } else if (i7 == array.length - 1) {
                                sb2.append(" or ");
                            }
                        }
                        sb2.append(array[i7].toString());
                    }
                    sb115.append(sb2.toString());
                    throw new d(sb115.toString());
                }
                kVar5 = k.f6975A;
                if (!kVar2.equals(kVar5)) {
                }
                if (kVar2.equals(kVar5)) {
                }
                StringBuilder sb116 = new StringBuilder("Unsupported JWS algorithm ");
                sb116.append(kVar2);
                sb116.append(", must be ");
                sb2 = new StringBuilder();
                array = b.f7932c.toArray();
                while (i7 < array.length) {
                    if (i7 != 0) {
                        if (i7 < array.length - 1) {
                            sb2.append(", ");
                        } else if (i7 == array.length - 1) {
                            sb2.append(" or ");
                        }
                    }
                    sb2.append(array[i7].toString());
                }
                sb116.append(sb2.toString());
                throw new d(sb116.toString());
            }
            if (kVar2.equals(kVar3)) {
                kVar4 = k.f6987w;
                if (!kVar2.equals(kVar4)) {
                    if (kVar2.equals(kVar4)) {
                        kVar5 = k.f6975A;
                        if (!kVar2.equals(kVar5)) {
                        }
                        if (kVar2.equals(kVar5)) {
                        }
                        StringBuilder sb117 = new StringBuilder("Unsupported JWS algorithm ");
                        sb117.append(kVar2);
                        sb117.append(", must be ");
                        sb2 = new StringBuilder();
                        array = b.f7932c.toArray();
                        while (i7 < array.length) {
                            if (i7 != 0) {
                                if (i7 < array.length - 1) {
                                    sb2.append(", ");
                                } else if (i7 == array.length - 1) {
                                    sb2.append(" or ");
                                }
                            }
                            sb2.append(array[i7].toString());
                        }
                        sb117.append(sb2.toString());
                        throw new d(sb117.toString());
                    }
                    kVar5 = k.f6975A;
                    if (!kVar2.equals(kVar5)) {
                    }
                    if (kVar2.equals(kVar5)) {
                    }
                    StringBuilder sb118 = new StringBuilder("Unsupported JWS algorithm ");
                    sb118.append(kVar2);
                    sb118.append(", must be ");
                    sb2 = new StringBuilder();
                    array = b.f7932c.toArray();
                    while (i7 < array.length) {
                        if (i7 != 0) {
                            if (i7 < array.length - 1) {
                                sb2.append(", ");
                            } else if (i7 == array.length - 1) {
                                sb2.append(" or ");
                            }
                        }
                        sb2.append(array[i7].toString());
                    }
                    sb118.append(sb2.toString());
                    throw new d(sb118.toString());
                }
                if (kVar2.equals(kVar4)) {
                    kVar5 = k.f6975A;
                    if (!kVar2.equals(kVar5)) {
                    }
                    if (kVar2.equals(kVar5)) {
                    }
                    StringBuilder sb119 = new StringBuilder("Unsupported JWS algorithm ");
                    sb119.append(kVar2);
                    sb119.append(", must be ");
                    sb2 = new StringBuilder();
                    array = b.f7932c.toArray();
                    while (i7 < array.length) {
                        if (i7 != 0) {
                            if (i7 < array.length - 1) {
                                sb2.append(", ");
                            } else if (i7 == array.length - 1) {
                                sb2.append(" or ");
                            }
                        }
                        sb2.append(array[i7].toString());
                    }
                    sb119.append(sb2.toString());
                    throw new d(sb119.toString());
                }
                kVar5 = k.f6975A;
                if (!kVar2.equals(kVar5)) {
                }
                if (kVar2.equals(kVar5)) {
                }
                StringBuilder sb1110 = new StringBuilder("Unsupported JWS algorithm ");
                sb1110.append(kVar2);
                sb1110.append(", must be ");
                sb2 = new StringBuilder();
                array = b.f7932c.toArray();
                while (i7 < array.length) {
                    if (i7 != 0) {
                        if (i7 < array.length - 1) {
                            sb2.append(", ");
                        } else if (i7 == array.length - 1) {
                            sb2.append(" or ");
                        }
                    }
                    sb2.append(array[i7].toString());
                }
                sb1110.append(sb2.toString());
                throw new d(sb1110.toString());
            }
            kVar4 = k.f6987w;
            if (!kVar2.equals(kVar4)) {
                if (kVar2.equals(kVar4)) {
                    kVar5 = k.f6975A;
                    if (!kVar2.equals(kVar5)) {
                    }
                    if (kVar2.equals(kVar5)) {
                    }
                    StringBuilder sb1111 = new StringBuilder("Unsupported JWS algorithm ");
                    sb1111.append(kVar2);
                    sb1111.append(", must be ");
                    sb2 = new StringBuilder();
                    array = b.f7932c.toArray();
                    while (i7 < array.length) {
                        if (i7 != 0) {
                            if (i7 < array.length - 1) {
                                sb2.append(", ");
                            } else if (i7 == array.length - 1) {
                                sb2.append(" or ");
                            }
                        }
                        sb2.append(array[i7].toString());
                    }
                    sb1111.append(sb2.toString());
                    throw new d(sb1111.toString());
                }
                kVar5 = k.f6975A;
                if (!kVar2.equals(kVar5)) {
                }
                if (kVar2.equals(kVar5)) {
                }
                StringBuilder sb1112 = new StringBuilder("Unsupported JWS algorithm ");
                sb1112.append(kVar2);
                sb1112.append(", must be ");
                sb2 = new StringBuilder();
                array = b.f7932c.toArray();
                while (i7 < array.length) {
                    if (i7 != 0) {
                        if (i7 < array.length - 1) {
                            sb2.append(", ");
                        } else if (i7 == array.length - 1) {
                            sb2.append(" or ");
                        }
                    }
                    sb2.append(array[i7].toString());
                }
                sb1112.append(sb2.toString());
                throw new d(sb1112.toString());
            }
            if (kVar2.equals(kVar4)) {
                kVar5 = k.f6975A;
                if (!kVar2.equals(kVar5)) {
                }
                if (kVar2.equals(kVar5)) {
                }
                StringBuilder sb1113 = new StringBuilder("Unsupported JWS algorithm ");
                sb1113.append(kVar2);
                sb1113.append(", must be ");
                sb2 = new StringBuilder();
                array = b.f7932c.toArray();
                while (i7 < array.length) {
                    if (i7 != 0) {
                        if (i7 < array.length - 1) {
                            sb2.append(", ");
                        } else if (i7 == array.length - 1) {
                            sb2.append(" or ");
                        }
                    }
                    sb2.append(array[i7].toString());
                }
                sb1113.append(sb2.toString());
                throw new d(sb1113.toString());
            }
            kVar5 = k.f6975A;
            if (!kVar2.equals(kVar5)) {
            }
            if (kVar2.equals(kVar5)) {
            }
            StringBuilder sb1114 = new StringBuilder("Unsupported JWS algorithm ");
            sb1114.append(kVar2);
            sb1114.append(", must be ");
            sb2 = new StringBuilder();
            array = b.f7932c.toArray();
            while (i7 < array.length) {
                if (i7 != 0) {
                    if (i7 < array.length - 1) {
                        sb2.append(", ");
                    } else if (i7 == array.length - 1) {
                        sb2.append(" or ");
                    }
                }
                sb2.append(array[i7].toString());
            }
            sb1114.append(sb2.toString());
            throw new d(sb1114.toString());
            signatureX.initVerify(this.f7626e);
            signatureX.update(bArr);
            return signatureX.verify(bVar.a());
        }
        kVar = k.f6980f;
        kVar2 = lVar.f6944a;
        if ((kVar2.equals(kVar) || (signatureX = J3.a.x("SHA256withRSA", null, null)) == null) && ((!kVar2.equals(k.f6981g) || (signatureX = J3.a.x("SHA384withRSA", null, null)) == null) && (!kVar2.equals(k.f6982i) || (signatureX = J3.a.x("SHA512withRSA", null, null)) == null))) {
            kVar3 = k.f6986v;
            if (!kVar2.equals(kVar3) && (signatureX2 = J3.a.x("RSASSA-PSS", null, new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1))) != null) {
                signatureX = signatureX2;
            } else if (kVar2.equals(kVar3) || (signatureX = J3.a.x("SHA256withRSAandMGF1", null, null)) == null) {
                kVar4 = k.f6987w;
                if (!kVar2.equals(kVar4) && (signatureX2 = J3.a.x("RSASSA-PSS", null, new PSSParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, 48, 1))) != null) {
                    signatureX = signatureX2;
                } else if (kVar2.equals(kVar4) || (signatureX = J3.a.x("SHA384withRSAandMGF1", null, null)) == null) {
                    kVar5 = k.f6975A;
                    if (!kVar2.equals(kVar5) && (signatureX2 = J3.a.x("RSASSA-PSS", null, new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1))) != null) {
                        signatureX = signatureX2;
                    } else if (kVar2.equals(kVar5) || (signatureX = J3.a.x("SHA512withRSAandMGF1", null, null)) == null) {
                        StringBuilder sb1115 = new StringBuilder("Unsupported JWS algorithm ");
                        sb1115.append(kVar2);
                        sb1115.append(", must be ");
                        sb2 = new StringBuilder();
                        array = b.f7932c.toArray();
                        while (i7 < array.length) {
                            if (i7 != 0) {
                                if (i7 < array.length - 1) {
                                    sb2.append(", ");
                                } else if (i7 == array.length - 1) {
                                    sb2.append(" or ");
                                }
                            }
                            sb2.append(array[i7].toString());
                        }
                        sb1115.append(sb2.toString());
                        throw new d(sb1115.toString());
                    }
                }
            }
        }
        try {
            signatureX.initVerify(this.f7626e);
            try {
                signatureX.update(bArr);
                return signatureX.verify(bVar.a());
            } catch (SignatureException unused) {
            }
        } catch (InvalidKeyException e10) {
            throw new d("Invalid public RSA key: " + e10.getMessage(), e10);
        }
        return false;
    }
}
