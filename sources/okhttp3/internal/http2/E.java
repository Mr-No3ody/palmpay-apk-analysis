package okhttp3.internal.http2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f40777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f40778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f40780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f40781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f40782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f40783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C f40784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final B f40785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final D f40786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final D f40787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public EnumC1932c f40788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IOException f40789n;

    static {
        new A(null);
    }

    public E(int i7, u connection, boolean z3, boolean z8, okhttp3.F f10) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f40776a = i7;
        this.f40777b = connection;
        this.f40781f = connection.f40872C.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f40782g = arrayDeque;
        this.f40784i = new C(this, connection.f40871B.a(), z8);
        this.f40785j = new B(this, z3);
        this.f40786k = new D(this);
        this.f40787l = new D(this);
        if (f10 == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(f10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001b  */
    public final void a() {
        boolean z3;
        boolean zH;
        byte[] bArr = Dg.c.f1879a;
        synchronized (this) {
            try {
                C c6 = this.f40784i;
                if (c6.f40769b || !c6.f40773f) {
                    z3 = false;
                } else {
                    B b7 = this.f40785j;
                    if (b7.f40764a || b7.f40766c) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                zH = h();
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            c(EnumC1932c.CANCEL, null);
        } else {
            if (zH) {
                return;
            }
            this.f40777b.d(this.f40776a);
        }
    }

    public final void b() throws IOException {
        B b7 = this.f40785j;
        if (b7.f40766c) {
            throw new IOException("stream closed");
        }
        if (b7.f40764a) {
            throw new IOException("stream finished");
        }
        if (this.f40788m != null) {
            IOException iOException = this.f40789n;
            if (iOException != null) {
                throw iOException;
            }
            EnumC1932c enumC1932c = this.f40788m;
            Intrinsics.e(enumC1932c);
            throw new L(enumC1932c);
        }
    }

    public final void c(EnumC1932c statusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(statusCode, "rstStatusCode");
        if (d(statusCode, iOException)) {
            u uVar = this.f40777b;
            uVar.getClass();
            Intrinsics.checkNotNullParameter(statusCode, "statusCode");
            uVar.f40878Y.g(this.f40776a, statusCode);
        }
    }

    public final boolean d(EnumC1932c enumC1932c, IOException iOException) {
        byte[] bArr = Dg.c.f1879a;
        synchronized (this) {
            if (this.f40788m != null) {
                return false;
            }
            this.f40788m = enumC1932c;
            this.f40789n = iOException;
            notifyAll();
            if (this.f40784i.f40769b && this.f40785j.f40764a) {
                return false;
            }
            Unit unit = Unit.f38893a;
            this.f40777b.d(this.f40776a);
            return true;
        }
    }

    public final void e(EnumC1932c errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (d(errorCode, null)) {
            this.f40777b.h(this.f40776a, errorCode);
        }
    }

    public final B f() {
        synchronized (this) {
            try {
                if (!this.f40783h && !g()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f40785j;
    }

    public final boolean g() {
        boolean z3 = (this.f40776a & 1) == 1;
        this.f40777b.getClass();
        return true == z3;
    }

    public final synchronized boolean h() {
        if (this.f40788m != null) {
            return false;
        }
        C c6 = this.f40784i;
        if (c6.f40769b || c6.f40773f) {
            B b7 = this.f40785j;
            if ((b7.f40764a || b7.f40766c) && this.f40783h) {
                return false;
            }
        }
        return true;
    }

    public final void i(okhttp3.F headers, boolean z3) {
        boolean zH;
        Intrinsics.checkNotNullParameter(headers, "headers");
        byte[] bArr = Dg.c.f1879a;
        synchronized (this) {
            try {
                if (this.f40783h && z3) {
                    this.f40784i.f40772e = headers;
                } else {
                    this.f40783h = true;
                    this.f40782g.add(headers);
                }
                if (z3) {
                    this.f40784i.f40769b = true;
                }
                zH = h();
                notifyAll();
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.f40777b.d(this.f40776a);
    }

    public final synchronized void j(EnumC1932c errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f40788m == null) {
            this.f40788m = errorCode;
            notifyAll();
        }
    }

    public final void k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
