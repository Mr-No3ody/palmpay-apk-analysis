package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f40728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f40729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D f40732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F f40733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0 f40734g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e0 f40735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0 f40736j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e0 f40737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f40738p;
    public final long t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final D.d f40739v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C1943k f40740w;

    public e0(Y request, W protocol, String message, int i7, D d2, F headers, h0 h0Var, e0 e0Var, e0 e0Var2, e0 e0Var3, long j6, long j10, D.d dVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f40728a = request;
        this.f40729b = protocol;
        this.f40730c = message;
        this.f40731d = i7;
        this.f40732e = d2;
        this.f40733f = headers;
        this.f40734g = h0Var;
        this.f40735i = e0Var;
        this.f40736j = e0Var2;
        this.f40737o = e0Var3;
        this.f40738p = j6;
        this.t = j10;
        this.f40739v = dVar;
    }

    public final C1943k a() {
        C1943k c1943k = this.f40740w;
        if (c1943k != null) {
            return c1943k;
        }
        C1943k c1943k2 = C1943k.f40923n.parse(this.f40733f);
        this.f40740w = c1943k2;
        return c1943k2;
    }

    public final String b(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strA = this.f40733f.a(name);
        return strA == null ? str : strA;
    }

    public final d0 c() {
        Intrinsics.checkNotNullParameter(this, "response");
        d0 d0Var = new d0();
        d0Var.f40715a = this.f40728a;
        d0Var.f40716b = this.f40729b;
        d0Var.f40717c = this.f40731d;
        d0Var.f40718d = this.f40730c;
        d0Var.f40719e = this.f40732e;
        d0Var.f40720f = this.f40733f.d();
        d0Var.f40721g = this.f40734g;
        d0Var.f40722h = this.f40735i;
        d0Var.f40723i = this.f40736j;
        d0Var.f40724j = this.f40737o;
        d0Var.f40725k = this.f40738p;
        d0Var.f40726l = this.t;
        d0Var.f40727m = this.f40739v;
        return d0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        h0 h0Var = this.f40734g;
        if (h0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        h0Var.close();
    }

    public final h0 d() throws IOException {
        h0 h0Var = this.f40734g;
        Intrinsics.e(h0Var);
        BufferedSource bufferedSourcePeek = h0Var.source().peek();
        Pg.k kVar = new Pg.k();
        bufferedSourcePeek.request(Long.MAX_VALUE);
        kVar.j(bufferedSourcePeek, Math.min(Long.MAX_VALUE, bufferedSourcePeek.getBuffer().f7358b));
        return h0.Companion.create(kVar, h0Var.contentType(), kVar.f7358b);
    }

    public final boolean isSuccessful() {
        int i7 = this.f40731d;
        return 200 <= i7 && i7 < 300;
    }

    public final String toString() {
        return "Response{protocol=" + this.f40729b + ", code=" + this.f40731d + ", message=" + this.f40730c + ", url=" + this.f40728a.f40685a + '}';
    }
}
