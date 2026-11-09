package Ig;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.J;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f4429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f4432g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, J url) {
        super(jVar);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f4432g = jVar;
        this.f4429d = url;
        this.f4430e = -1L;
        this.f4431f = true;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4424b) {
            return;
        }
        if (this.f4431f) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!Dg.c.h(this)) {
                this.f4432g.f4441b.k();
                a();
            }
        }
        this.f4424b = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r10.f4431f == false) goto L34;
     */
    @Override // Ig.c, okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(Pg.k r11, long r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ig.e.read(Pg.k, long):long");
    }
}
