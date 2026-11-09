package okhttp3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y f40715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public W f40716b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f40718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public D f40719e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h0 f40721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e0 f40722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e0 f40723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e0 f40724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f40725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f40726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public D.d f40727m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40717c = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public F1.b f40720f = new F1.b(3);

    public static void b(String str, e0 e0Var) {
        if (e0Var != null) {
            if (e0Var.f40734g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (e0Var.f40735i != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (e0Var.f40736j != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (e0Var.f40737o != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final e0 a() {
        int i7 = this.f40717c;
        if (i7 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f40717c).toString());
        }
        Y y8 = this.f40715a;
        if (y8 == null) {
            throw new IllegalStateException("request == null");
        }
        W w3 = this.f40716b;
        if (w3 == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f40718d;
        if (str != null) {
            return new e0(y8, w3, str, i7, this.f40719e, this.f40720f.h(), this.f40721g, this.f40722h, this.f40723i, this.f40724j, this.f40725k, this.f40726l, this.f40727m);
        }
        throw new IllegalStateException("message == null");
    }

    public final void c(F headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f40720f = headers.d();
    }
}
