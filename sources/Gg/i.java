package Gg;

import Jg.t;
import Pg.F;
import com.transsnet.palmpay.custom_view.dialog.y;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.AbstractC1956y;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.U;
import okhttp3.Y;
import okhttp3.e0;
import okhttp3.internal.http.ExchangeCodec;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Call {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f3437A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public volatile boolean f3438B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public volatile D.d f3439C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public volatile n f3440H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f3441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y f3442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f3444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC1956y f3445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f3446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f3447g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f3448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f3449j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n f3450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3451p;
    public D.d t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3452v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3453w;

    public i(U client, Y originalRequest, boolean z3) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f3441a = client;
        this.f3442b = originalRequest;
        this.f3443c = z3;
        this.f3444d = client.f40654b.f40970a;
        this.f3445e = client.f40657e.create(this);
        h hVar = new h(this);
        hVar.timeout(client.f40652Z, TimeUnit.MILLISECONDS);
        this.f3446f = hVar;
        this.f3447g = new AtomicBoolean();
        this.f3437A = true;
    }

    public static final String a(i iVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iVar.f3438B ? "canceled " : "");
        sb2.append(iVar.f3443c ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(iVar.f3442b.f40685a.i());
        return sb2.toString();
    }

    public final void b(n connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr = Dg.c.f1879a;
        if (this.f3450o != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f3450o = connection;
        connection.f3476p.add(new g(this, this.f3448i));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketH;
        byte[] bArr = Dg.c.f1879a;
        n nVar = this.f3450o;
        if (nVar != null) {
            synchronized (nVar) {
                socketH = h();
            }
            if (this.f3450o == null) {
                if (socketH != null) {
                    Dg.c.d(socketH);
                }
                this.f3445e.connectionReleased(this, nVar);
            } else if (socketH != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f3451p && this.f3446f.exit()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException == null) {
            this.f3445e.callEnd(this);
            return interruptedIOException;
        }
        AbstractC1956y abstractC1956y = this.f3445e;
        Intrinsics.e(interruptedIOException);
        abstractC1956y.callFailed(this, interruptedIOException);
        return interruptedIOException;
    }

    @Override // okhttp3.Call
    public final void cancel() {
        Socket socket;
        if (this.f3438B) {
            return;
        }
        this.f3438B = true;
        D.d dVar = this.f3439C;
        if (dVar != null) {
            ((ExchangeCodec) dVar.f1582f).cancel();
        }
        n nVar = this.f3440H;
        if (nVar != null && (socket = nVar.f3463c) != null) {
            Dg.c.d(socket);
        }
        this.f3445e.canceled(this);
    }

    public final Object clone() {
        return new i(this.f3441a, this.f3442b, this.f3443c);
    }

    public final void d(boolean z3) {
        D.d dVar;
        synchronized (this) {
            if (!this.f3437A) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.f38893a;
        }
        if (z3 && (dVar = this.f3439C) != null) {
            ((ExchangeCodec) dVar.f1582f).cancel();
            ((i) dVar.f1579c).f(dVar, true, true, null);
        }
        this.t = null;
    }

    public final e0 e() {
        ArrayList arrayList = new ArrayList();
        v.n(arrayList, this.f3441a.f40655c);
        arrayList.add(new Hg.i(this.f3441a));
        arrayList.add(new Hg.a(this.f3441a.f40663o));
        arrayList.add(new Eg.c(this.f3441a.f40664p));
        arrayList.add(a.f3406a);
        if (!this.f3443c) {
            v.n(arrayList, this.f3441a.f40656d);
        }
        arrayList.add(new Hg.b(this.f3443c));
        Y y8 = this.f3442b;
        U u6 = this.f3441a;
        try {
            try {
                e0 e0VarProceed = new Hg.f(this, arrayList, 0, null, y8, u6.f40662k0, u6.f40665p0, u6.f40666q0).proceed(this.f3442b);
                if (this.f3438B) {
                    Dg.c.c(e0VarProceed);
                    throw new IOException("Canceled");
                }
                g(null);
                return e0VarProceed;
            } catch (IOException e10) {
                IOException iOExceptionG = g(e10);
                Intrinsics.f(iOExceptionG, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionG;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                g(null);
            }
            throw th;
        }
    }

    @Override // okhttp3.Call
    public final void enqueue(Callback responseCallback) {
        f other;
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f3447g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f3448i = t.f4869a.get().g();
        this.f3445e.callStart(this);
        y yVar = this.f3441a.f40653a;
        f call = new f(this, responseCallback);
        yVar.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (yVar) {
            ((ArrayDeque) yVar.f31323a).add(call);
            if (!this.f3443c) {
                String str = this.f3442b.f40685a.f40582d;
                Iterator it = ((ArrayDeque) yVar.f31324b).iterator();
                do {
                    if (!it.hasNext()) {
                        Iterator it2 = ((ArrayDeque) yVar.f31323a).iterator();
                        do {
                            if (!it2.hasNext()) {
                                other = null;
                                break;
                            }
                            other = (f) it2.next();
                        } while (!Intrinsics.c(other.f3434c.f3442b.f40685a.f40582d, str));
                    } else {
                        other = (f) it.next();
                    }
                } while (!Intrinsics.c(other.f3434c.f3442b.f40685a.f40582d, str));
                if (other != null) {
                    Intrinsics.checkNotNullParameter(other, "other");
                    call.f3433b = other.f3433b;
                }
            }
            Unit unit = Unit.f38893a;
        }
        yVar.e();
    }

    @Override // okhttp3.Call
    public final e0 execute() {
        if (!this.f3447g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f3446f.enter();
        this.f3448i = t.f4869a.get().g();
        this.f3445e.callStart(this);
        try {
            y yVar = this.f3441a.f40653a;
            synchronized (yVar) {
                Intrinsics.checkNotNullParameter(this, "call");
                ((ArrayDeque) yVar.f31328f).add(this);
            }
            e0 e0VarE = e();
            y yVar2 = this.f3441a.f40653a;
            yVar2.getClass();
            Intrinsics.checkNotNullParameter(this, "call");
            yVar2.c((ArrayDeque) yVar2.f31328f, this);
            return e0VarE;
        } catch (Throwable th) {
            y yVar3 = this.f3441a.f40653a;
            yVar3.getClass();
            Intrinsics.checkNotNullParameter(this, "call");
            yVar3.c((ArrayDeque) yVar3.f31328f, this);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001c), top: B:54:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001c), top: B:54:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final IOException f(D.d exchange, boolean z3, boolean z8, IOException iOException) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (Intrinsics.c(exchange, this.f3439C)) {
            synchronized (this) {
                z10 = false;
                if (z3) {
                    try {
                        if (this.f3452v) {
                            if (z3) {
                                this.f3452v = false;
                            }
                            if (z8) {
                                this.f3453w = false;
                            }
                            z12 = this.f3452v;
                            if (z12) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                            if (!z12) {
                                z10 = true;
                            }
                            z11 = z10;
                            z10 = z13;
                        } else if (z8 || !this.f3453w) {
                            z11 = false;
                        } else {
                            if (z3) {
                                this.f3452v = false;
                            }
                            if (z8) {
                                this.f3453w = false;
                            }
                            z12 = this.f3452v;
                            if (z12 || this.f3453w) {
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                            if (!z12 && !this.f3453w && !this.f3437A) {
                                z10 = true;
                            }
                            z11 = z10;
                            z10 = z13;
                        }
                        Unit unit = Unit.f38893a;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z8) {
                    }
                    z11 = false;
                    Unit unit2 = Unit.f38893a;
                }
            }
            if (z10) {
                this.f3439C = null;
                n nVar = this.f3450o;
                if (nVar != null) {
                    synchronized (nVar) {
                        nVar.f3473m++;
                    }
                }
            }
            if (z11) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException g(IOException iOException) {
        boolean z3;
        synchronized (this) {
            try {
                z3 = false;
                if (this.f3437A) {
                    this.f3437A = false;
                    if (!this.f3452v && !this.f3453w) {
                        z3 = true;
                    }
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3 ? c(iOException) : iOException;
    }

    public final Socket h() {
        n connection = this.f3450o;
        Intrinsics.e(connection);
        byte[] bArr = Dg.c.f1879a;
        ArrayList arrayList = connection.f3476p;
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (Intrinsics.c(((Reference) it.next()).get(), this)) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i7);
        this.f3450o = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        connection.f3477q = System.nanoTime();
        p pVar = this.f3444d;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr2 = Dg.c.f1879a;
        boolean z3 = connection.f3470j;
        Fg.b bVar = pVar.f3480c;
        if (!z3 && pVar.f3478a != 0) {
            bVar.c(pVar.f3481d, 0L);
            return null;
        }
        connection.f3470j = true;
        ConcurrentLinkedQueue concurrentLinkedQueue = pVar.f3482e;
        concurrentLinkedQueue.remove(connection);
        if (concurrentLinkedQueue.isEmpty()) {
            bVar.a();
        }
        Socket socket = connection.f3464d;
        Intrinsics.e(socket);
        return socket;
    }

    @Override // okhttp3.Call
    public final boolean isCanceled() {
        return this.f3438B;
    }

    @Override // okhttp3.Call
    public final boolean isExecuted() {
        return this.f3447g.get();
    }

    @Override // okhttp3.Call
    public final Y request() {
        return this.f3442b;
    }

    @Override // okhttp3.Call
    public final F timeout() {
        return this.f3446f;
    }

    @Override // okhttp3.Call
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Call mo0clone() {
        return new i(this.f3441a, this.f3442b, this.f3443c);
    }
}
