package Ig;

import Pg.k;
import androidx.camera.video.u;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4439d;

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4424b) {
            return;
        }
        if (!this.f4439d) {
            a();
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
        if (this.f4439d) {
            return -1L;
        }
        long j10 = super.read(sink, j6);
        if (j10 != -1) {
            return j10;
        }
        this.f4439d = true;
        a();
        return -1L;
    }
}
