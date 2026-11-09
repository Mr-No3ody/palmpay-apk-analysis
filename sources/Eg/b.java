package Eg;

import Pg.F;
import Pg.w;
import com.rnmaps.maps.M;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Source {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BufferedSource f2432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M f2433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f2434d;

    public b(BufferedSource bufferedSource, M m7, w wVar) {
        this.f2432b = bufferedSource;
        this.f2433c = m7;
        this.f2434d = wVar;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f2431a) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!Dg.c.h(this)) {
                this.f2431a = true;
                this.f2433c.abort();
            }
        }
        this.f2432b.close();
    }

    @Override // okio.Source
    public final long read(Pg.k sink, long j6) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            long j10 = this.f2432b.read(sink, j6);
            w wVar = this.f2434d;
            if (j10 != -1) {
                sink.d(wVar.f7386b, sink.f7358b - j10, j10);
                wVar.emitCompleteSegments();
                return j10;
            }
            if (!this.f2431a) {
                this.f2431a = true;
                wVar.close();
            }
            return -1L;
        } catch (IOException e10) {
            if (this.f2431a) {
                throw e10;
            }
            this.f2431a = true;
            this.f2433c.abort();
            throw e10;
        }
    }

    @Override // okio.Source
    public final F timeout() {
        return this.f2432b.timeout();
    }
}
