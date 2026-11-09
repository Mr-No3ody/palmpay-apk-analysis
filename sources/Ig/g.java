package Ig;

import Pg.k;
import androidx.camera.video.u;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f4434e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, long j6) {
        super(jVar);
        this.f4434e = jVar;
        this.f4433d = j6;
        if (j6 == 0) {
            a();
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4424b) {
            return;
        }
        if (this.f4433d != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!Dg.c.h(this)) {
                this.f4434e.f4441b.k();
                a();
            }
        }
        this.f4424b = true;
    }

    @Override // Ig.c, okio.Source
    public final long read(k sink, long j6) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j6 < 0) {
            throw new IllegalArgumentException(u.i(j6, "byteCount < 0: ").toString());
        }
        if (this.f4424b) {
            throw new IllegalStateException("closed");
        }
        long j10 = this.f4433d;
        if (j10 == 0) {
            return -1L;
        }
        long j11 = super.read(sink, Math.min(j10, j6));
        if (j11 == -1) {
            this.f4434e.f4441b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j12 = this.f4433d - j11;
        this.f4433d = j12;
        if (j12 == 0) {
            a();
        }
        return j11;
    }
}
