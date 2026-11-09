package retrofit2;

import Pg.AbstractC0555b;
import java.io.IOException;
import okhttp3.C1923c;
import okhttp3.h0;
import okio.BufferedSource;

/* JADX INFO: renamed from: retrofit2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2000s extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f41950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pg.x f41951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f41952c;

    public C2000s(h0 h0Var) {
        this.f41950a = h0Var;
        this.f41951b = AbstractC0555b.c(new C1923c(this, h0Var.source()));
    }

    @Override // okhttp3.h0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41950a.close();
    }

    @Override // okhttp3.h0
    public final long contentLength() {
        return this.f41950a.contentLength();
    }

    @Override // okhttp3.h0
    public final okhttp3.L contentType() {
        return this.f41950a.contentType();
    }

    @Override // okhttp3.h0
    public final BufferedSource source() {
        return this.f41951b;
    }
}
