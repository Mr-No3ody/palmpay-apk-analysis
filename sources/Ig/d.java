package Ig;

import Pg.F;
import Pg.k;
import Pg.p;
import Pg.w;
import kotlin.jvm.internal.Intrinsics;
import okio.Sink;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Sink {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f4426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f4428c;

    public d(j jVar) {
        this.f4428c = jVar;
        this.f4426a = new p(jVar.f4443d.f7385a.timeout());
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f4427b) {
            return;
        }
        this.f4427b = true;
        this.f4428c.f4443d.writeUtf8("0\r\n\r\n");
        j.a(this.f4428c, this.f4426a);
        this.f4428c.f4444e = 3;
    }

    @Override // okio.Sink, java.io.Flushable
    public final synchronized void flush() {
        if (this.f4427b) {
            return;
        }
        this.f4428c.f4443d.flush();
    }

    @Override // okio.Sink
    public final F timeout() {
        return this.f4426a;
    }

    @Override // okio.Sink
    public final void write(k source, long j6) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f4427b) {
            throw new IllegalStateException("closed");
        }
        if (j6 == 0) {
            return;
        }
        w wVar = this.f4428c.f4443d;
        wVar.writeHexadecimalUnsignedLong(j6);
        wVar.writeUtf8("\r\n");
        wVar.write(source, j6);
        wVar.writeUtf8("\r\n");
    }
}
