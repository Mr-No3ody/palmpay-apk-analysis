package V5;

import N8.q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends com.nimbusds.jose.shaded.gson.stream.c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h f10013v = new h();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final com.nimbusds.jose.shaded.gson.s f10014w = new com.nimbusds.jose.shaded.gson.s("closed");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f10015o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f10016p;
    public com.nimbusds.jose.shaded.gson.o t;

    public i() {
        super(f10013v);
        this.f10015o = new ArrayList();
        this.t = com.nimbusds.jose.shaded.gson.q.f23687a;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.c
    public final void b() {
        com.nimbusds.jose.shaded.gson.n nVar = new com.nimbusds.jose.shaded.gson.n();
        u(nVar);
        this.f10015o.add(nVar);
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.c
    public final void c() {
        com.nimbusds.jose.shaded.gson.r rVar = new com.nimbusds.jose.shaded.gson.r();
        u(rVar);
        this.f10015o.add(rVar);
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f10015o;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f10014w);
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.c
    public final void e() {
        ArrayList arrayList = this.f10015o;
        if (arrayList.isEmpty() || this.f10016p != null) {
            throw new IllegalStateException();
        }
        if (!(t() instanceof com.nimbusds.jose.shaded.gson.n)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.c
    public final void f() {
        ArrayList arrayList = this.f10015o;
        if (arrayList.isEmpty() || this.f10016p != null) {
            throw new IllegalStateException();
        }
        if (!(t() instanceof com.nimbusds.jose.shaded.gson.r)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.c
    public final void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f10015o.isEmpty() || this.f10016p != null) {
            throw new IllegalStateException();
        }
        if (!(t() instanceof com.nimbusds.jose.shaded.gson.r)) {
            throw new IllegalStateException();
        }
        this.f10016p = str;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.c
    public final com.nimbusds.jose.shaded.gson.stream.c i() {
        u(com.nimbusds.jose.shaded.gson.q.f23687a);
        return this;
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.c
    public final void l(double d2) {
        if (this.f23714e || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
            u(new com.nimbusds.jose.shaded.gson.s(Double.valueOf(d2)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d2);
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.c
    public final void m(long j6) {
        u(new com.nimbusds.jose.shaded.gson.s(Long.valueOf(j6)));
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.c
    public final void n(Boolean bool) {
        if (bool == null) {
            u(com.nimbusds.jose.shaded.gson.q.f23687a);
        } else {
            u(new com.nimbusds.jose.shaded.gson.s(bool));
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.c
    public final void o(Number number) {
        if (number == null) {
            u(com.nimbusds.jose.shaded.gson.q.f23687a);
            return;
        }
        if (!this.f23714e) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        u(new com.nimbusds.jose.shaded.gson.s(number));
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.c
    public final void p(String str) {
        if (str == null) {
            u(com.nimbusds.jose.shaded.gson.q.f23687a);
        } else {
            u(new com.nimbusds.jose.shaded.gson.s(str));
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.c
    public final void q(boolean z3) {
        u(new com.nimbusds.jose.shaded.gson.s(Boolean.valueOf(z3)));
    }

    public final com.nimbusds.jose.shaded.gson.o s() {
        ArrayList arrayList = this.f10015o;
        if (arrayList.isEmpty()) {
            return this.t;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final com.nimbusds.jose.shaded.gson.o t() {
        return (com.nimbusds.jose.shaded.gson.o) q0.i(1, this.f10015o);
    }

    public final void u(com.nimbusds.jose.shaded.gson.o oVar) {
        if (this.f10016p != null) {
            if (!(oVar instanceof com.nimbusds.jose.shaded.gson.q) || this.f23716g) {
                com.nimbusds.jose.shaded.gson.r rVar = (com.nimbusds.jose.shaded.gson.r) t();
                rVar.f23688a.put(this.f10016p, oVar);
            }
            this.f10016p = null;
            return;
        }
        if (this.f10015o.isEmpty()) {
            this.t = oVar;
            return;
        }
        com.nimbusds.jose.shaded.gson.o oVarT = t();
        if (!(oVarT instanceof com.nimbusds.jose.shaded.gson.n)) {
            throw new IllegalStateException();
        }
        ((com.nimbusds.jose.shaded.gson.n) oVarT).f23686a.add(oVar);
    }

    @Override // com.nimbusds.jose.shaded.gson.stream.c, java.io.Flushable
    public final void flush() {
    }
}
