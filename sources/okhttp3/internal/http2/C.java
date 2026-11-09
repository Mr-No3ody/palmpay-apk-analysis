package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements Source {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Pg.k f40770c = new Pg.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pg.k f40771d = new Pg.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public okhttp3.F f40772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ E f40774g;

    public C(E e10, long j6, boolean z3) {
        this.f40774g = e10;
        this.f40768a = j6;
        this.f40769b = z3;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j6;
        E e10 = this.f40774g;
        synchronized (e10) {
            this.f40773f = true;
            Pg.k kVar = this.f40771d;
            j6 = kVar.f7358b;
            kVar.a();
            e10.notifyAll();
            Unit unit = Unit.f38893a;
        }
        if (j6 > 0) {
            byte[] bArr = Dg.c.f1879a;
            this.f40774g.f40777b.f(j6);
        }
        this.f40774g.a();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0089 A[LOOP:0: B:4:0x000e->B:45:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:72:0x008c A[SYNTHETIC] */
    @Override // okio.Source
    public final long read(Pg.k sink, long j6) throws Throwable {
        EnumC1932c enumC1932c;
        Throwable l5;
        boolean z3;
        long j10;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j11 = 0;
        if (j6 < 0) {
            throw new IllegalArgumentException(androidx.camera.video.u.i(j6, "byteCount < 0: ").toString());
        }
        while (true) {
            E e10 = this.f40774g;
            synchronized (e10) {
                e10.f40786k.enter();
                try {
                    synchronized (e10) {
                        enumC1932c = e10.f40788m;
                    }
                    if (z3) {
                        if (j10 != -1) {
                            return j10;
                        }
                        if (l5 == null) {
                            return -1L;
                        }
                        throw l5;
                    }
                    j11 = 0;
                } catch (Throwable th) {
                    e10.f40786k.a();
                    throw th;
                }
            }
            if (enumC1932c == null || this.f40769b) {
                l5 = null;
            } else {
                l5 = e10.f40789n;
                if (l5 == null) {
                    synchronized (e10) {
                        EnumC1932c enumC1932c2 = e10.f40788m;
                        Intrinsics.e(enumC1932c2);
                        l5 = new L(enumC1932c2);
                    }
                }
            }
            if (this.f40773f) {
                throw new IOException("stream closed");
            }
            Pg.k kVar = this.f40771d;
            long j12 = kVar.f7358b;
            z3 = false;
            if (j12 > j11) {
                j10 = kVar.read(sink, Math.min(j6, j12));
                long j13 = e10.f40778c + j10;
                e10.f40778c = j13;
                long j14 = j13 - e10.f40779d;
                if (l5 == null && j14 >= e10.f40777b.f40871B.a() / 2) {
                    e10.f40777b.i(e10.f40776a, j14);
                    e10.f40779d = e10.f40778c;
                }
            } else {
                if (!this.f40769b && l5 == null) {
                    e10.k();
                    z3 = true;
                }
                j10 = -1;
            }
            e10.f40786k.a();
            Unit unit = Unit.f38893a;
            if (z3) {
                if (j10 != -1) {
                    return j10;
                }
                if (l5 == null) {
                    return -1L;
                }
                throw l5;
            }
            j11 = 0;
        }
    }

    @Override // okio.Source
    public final Pg.F timeout() {
        return this.f40774g.f40786k;
    }
}
