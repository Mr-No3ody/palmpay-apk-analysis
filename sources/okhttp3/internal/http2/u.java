package okhttp3.internal.http2;

import androidx.appcompat.widget.m1;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements Closeable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final C1939j f40868p0 = new C1939j(null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final K f40869q0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f40870A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final K f40871B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public K f40872C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f40873H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f40874L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f40875M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f40876Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final Socket f40877X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final G f40878Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final V8.p f40879Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f40880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f40881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Fg.d f40886g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Fg.b f40887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Fg.b f40888j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final LinkedHashSet f40889k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Fg.b f40890o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final I f40891p;
    public long t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f40892v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f40893w;

    static {
        K k2 = new K();
        k2.c(7, 65535);
        k2.c(5, 16384);
        f40869q0 = k2;
    }

    public u(m1 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f40880a = (m) builder.f12976f;
        this.f40881b = new LinkedHashMap();
        String str = (String) builder.f12973c;
        if (str == null) {
            Intrinsics.n("connectionName");
            throw null;
        }
        this.f40882c = str;
        this.f40884e = 3;
        Fg.d dVar = (Fg.d) builder.f12971a;
        this.f40886g = dVar;
        this.f40887i = dVar.e();
        this.f40888j = dVar.e();
        this.f40890o = dVar.e();
        this.f40891p = (I) builder.f12977g;
        K k2 = new K();
        k2.c(7, PointerEventHelper.X_FLAG_SUPPORTS_HOVER);
        this.f40871B = k2;
        K k8 = f40869q0;
        this.f40872C = k8;
        this.f40876Q = k8.a();
        Socket socket = (Socket) builder.f12972b;
        if (socket == null) {
            Intrinsics.n("socket");
            throw null;
        }
        this.f40877X = socket;
        Pg.w wVar = (Pg.w) builder.f12975e;
        if (wVar == null) {
            Intrinsics.n("sink");
            throw null;
        }
        this.f40878Y = new G(wVar);
        Pg.x xVar = (Pg.x) builder.f12974d;
        if (xVar == null) {
            Intrinsics.n("source");
            throw null;
        }
        this.f40879Z = new V8.p(this, new z(xVar));
        this.f40889k0 = new LinkedHashSet();
    }

    public final void a(EnumC1932c connectionCode, EnumC1932c streamCode, IOException iOException) {
        int i7;
        Object[] array;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        byte[] bArr = Dg.c.f1879a;
        try {
            e(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f40881b.isEmpty()) {
                    array = null;
                } else {
                    array = this.f40881b.values().toArray(new E[0]);
                    this.f40881b.clear();
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
        E[] eArr = (E[]) array;
        if (eArr != null) {
            for (E e10 : eArr) {
                try {
                    e10.c(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f40878Y.close();
        } catch (IOException unused3) {
        }
        try {
            this.f40877X.close();
        } catch (IOException unused4) {
        }
        this.f40887i.f();
        this.f40888j.f();
        this.f40890o.f();
    }

    public final void b(IOException iOException) {
        EnumC1932c enumC1932c = EnumC1932c.PROTOCOL_ERROR;
        a(enumC1932c, enumC1932c, iOException);
    }

    public final synchronized E c(int i7) {
        return (E) this.f40881b.get(Integer.valueOf(i7));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(EnumC1932c.NO_ERROR, EnumC1932c.CANCEL, null);
    }

    public final synchronized E d(int i7) {
        E e10;
        e10 = (E) this.f40881b.remove(Integer.valueOf(i7));
        notifyAll();
        return e10;
    }

    public final void e(EnumC1932c statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f40878Y) {
            synchronized (this) {
                if (this.f40885f) {
                    return;
                }
                this.f40885f = true;
                int i7 = this.f40883d;
                Unit unit = Unit.f38893a;
                this.f40878Y.d(i7, statusCode, Dg.c.f1879a);
            }
        }
    }

    public final synchronized void f(long j6) {
        long j10 = this.f40873H + j6;
        this.f40873H = j10;
        long j11 = j10 - this.f40874L;
        if (j11 >= this.f40871B.a() / 2) {
            i(0, j11);
            this.f40874L += j11;
        }
    }

    public final void flush() {
        this.f40878Y.flush();
    }

    public final void g(int i7, boolean z3, Pg.k kVar, long j6) {
        long j10;
        long j11;
        int iMin;
        long j12;
        if (j6 == 0) {
            this.f40878Y.b(z3, i7, kVar, 0);
            return;
        }
        while (j6 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j10 = this.f40875M;
                            j11 = this.f40876Q;
                            if (j10 >= j11) {
                                if (!this.f40881b.containsKey(Integer.valueOf(i7))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j6, j11 - j10), this.f40878Y.f40793c);
                j12 = iMin;
                this.f40875M += j12;
                Unit unit = Unit.f38893a;
            }
            j6 -= j12;
            this.f40878Y.b(z3 && j6 == 0, i7, kVar, iMin);
        }
    }

    public final void h(int i7, EnumC1932c errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f40887i.c(new s(this.f40882c + '[' + i7 + "] writeSynReset", this, i7, errorCode, 1), 0L);
    }

    public final void i(int i7, long j6) {
        this.f40887i.c(new t(this.f40882c + '[' + i7 + "] windowUpdate", this, i7, j6), 0L);
    }
}
