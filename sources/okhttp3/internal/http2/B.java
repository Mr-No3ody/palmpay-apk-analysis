package okhttp3.internal.http2;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Sink;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements Sink {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pg.k f40765b = new Pg.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E f40767d;

    public B(E e10, boolean z3) {
        this.f40767d = e10;
        this.f40764a = z3;
    }

    public final void a(boolean z3) {
        long jMin;
        boolean z8;
        E e10 = this.f40767d;
        synchronized (e10) {
            try {
                e10.f40787l.enter();
                while (e10.f40780e >= e10.f40781f && !this.f40764a && !this.f40766c) {
                    try {
                        synchronized (e10) {
                            EnumC1932c enumC1932c = e10.f40788m;
                            if (enumC1932c != null) {
                                break;
                            } else {
                                e10.k();
                            }
                        }
                    } catch (Throwable th) {
                        e10.f40787l.a();
                        throw th;
                    }
                }
                e10.f40787l.a();
                e10.b();
                jMin = Math.min(e10.f40781f - e10.f40780e, this.f40765b.f7358b);
                e10.f40780e += jMin;
                z8 = z3 && jMin == this.f40765b.f7358b;
                Unit unit = Unit.f38893a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f40767d.f40787l.enter();
        try {
            E e11 = this.f40767d;
            e11.f40777b.g(e11.f40776a, z8, this.f40765b, jMin);
        } finally {
            this.f40767d.f40787l.a();
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z3;
        E e10 = this.f40767d;
        byte[] bArr = Dg.c.f1879a;
        synchronized (e10) {
            if (this.f40766c) {
                return;
            }
            synchronized (e10) {
                z3 = e10.f40788m == null;
                Unit unit = Unit.f38893a;
            }
            E e11 = this.f40767d;
            if (!e11.f40785j.f40764a) {
                if (this.f40765b.f7358b > 0) {
                    while (this.f40765b.f7358b > 0) {
                        a(true);
                    }
                } else if (z3) {
                    e11.f40777b.g(e11.f40776a, true, null, 0L);
                }
            }
            synchronized (this.f40767d) {
                this.f40766c = true;
                Unit unit2 = Unit.f38893a;
            }
            this.f40767d.f40777b.flush();
            this.f40767d.a();
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        E e10 = this.f40767d;
        byte[] bArr = Dg.c.f1879a;
        synchronized (e10) {
            e10.b();
            Unit unit = Unit.f38893a;
        }
        while (this.f40765b.f7358b > 0) {
            a(false);
            this.f40767d.f40777b.flush();
        }
    }

    @Override // okio.Sink
    public final Pg.F timeout() {
        return this.f40767d.f40787l;
    }

    @Override // okio.Sink
    public final void write(Pg.k source, long j6) {
        Intrinsics.checkNotNullParameter(source, "source");
        byte[] bArr = Dg.c.f1879a;
        Pg.k kVar = this.f40765b;
        kVar.write(source, j6);
        while (kVar.f7358b >= 16384) {
            a(false);
        }
    }
}
