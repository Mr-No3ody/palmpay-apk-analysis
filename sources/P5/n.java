package P5;

import java.text.ParseException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f6993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Z5.b f6995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f6996f;

    public n(Z5.b bVar, Z5.b bVar2, Z5.b bVar3) throws ParseException {
        String string;
        byte[] bytes;
        p pVar = new p(bVar2);
        byte[] bytes2 = null;
        this.f6950a = null;
        this.f6951b = null;
        AtomicReference atomicReference = new AtomicReference();
        this.f6996f = atomicReference;
        if (bVar == null) {
            throw new IllegalArgumentException("The first part must not be null");
        }
        try {
            l lVarA = l.a(bVar);
            this.f6993c = lVarA;
            p022b6.d dVar = (p022b6.d) this;
            dVar.f18787g = null;
            dVar.f6950a = pVar;
            Z5.b bVar4 = lVarA.f6949f;
            boolean z3 = lVarA.f6989A;
            if (z3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((bVar4 == null ? Z5.b.c(lVarA.toString().getBytes(Z5.e.f11524a)) : bVar4).f11522a);
                sb2.append('.');
                p pVar2 = this.f6950a;
                Z5.b bVarC = pVar2.f6997a;
                if (bVarC == null) {
                    if (bVarC != null) {
                        bytes = bVarC.a();
                    } else {
                        String string2 = pVar2.toString();
                        bytes = string2 != null ? string2.getBytes(Z5.e.f11524a) : null;
                    }
                    bVarC = Z5.b.c(bytes);
                }
                sb2.append(bVarC.f11522a);
                string = sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append((bVar4 == null ? Z5.b.c(lVarA.toString().getBytes(Z5.e.f11524a)) : bVar4).f11522a);
                sb3.append('.');
                sb3.append(this.f6950a.toString());
                string = sb3.toString();
            }
            this.f6994d = string;
            if (bVar3 == null) {
                throw new IllegalArgumentException("The third part must not be null");
            }
            if (bVar3.f11522a.trim().isEmpty()) {
                throw new ParseException("The signature must not be empty", 0);
            }
            this.f6995e = bVar3;
            atomicReference.set(m.f6990a);
            if (!z3) {
                this.f6951b = new Z5.b[]{bVar, new Z5.b(""), bVar3};
                return;
            }
            if (bVar2 == null) {
                if (bVar2 != null) {
                    bytes2 = bVar2.a();
                } else {
                    String string3 = pVar.toString();
                    if (string3 != null) {
                        bytes2 = string3.getBytes(Z5.e.f11524a);
                    }
                }
                bVar2 = Z5.b.c(bytes2);
            }
            this.f6951b = new Z5.b[]{bVar, bVar2, bVar3};
        } catch (ParseException e10) {
            throw new ParseException("Invalid JWS header: " + e10.getMessage(), 0);
        }
    }

    public final synchronized boolean a(Q5.a aVar) {
        boolean zVerify;
        AtomicReference atomicReference = this.f6996f;
        if (atomicReference.get() != m.f6990a && atomicReference.get() != m.f6991b) {
            throw new IllegalStateException("The JWS object must be in a signed or verified state");
        }
        try {
            zVerify = aVar.verify(this.f6993c, this.f6994d.getBytes(Z5.e.f11524a), this.f6995e);
            if (zVerify) {
                this.f6996f.set(m.f6991b);
            }
        } catch (d e10) {
            throw e10;
        } catch (Exception e11) {
            throw new d(e11.getMessage(), e11);
        }
        return zVerify;
    }

    public final c getHeader() {
        return this.f6993c;
    }

    public final String serialize() {
        AtomicReference atomicReference = this.f6996f;
        if (atomicReference.get() != m.f6990a && atomicReference.get() != m.f6991b) {
            throw new IllegalStateException("The JWS object must be in a signed or verified state");
        }
        return this.f6994d + '.' + this.f6995e.f11522a;
    }
}
