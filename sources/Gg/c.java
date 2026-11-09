package Gg;

import androidx.camera.video.u;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import okio.Sink;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends Pg.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D.d f3415f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(D.d dVar, Sink delegate, long j6) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f3415f = dVar;
        this.f3411b = j6;
    }

    public final IOException a(IOException iOException) {
        if (this.f3412c) {
            return iOException;
        }
        this.f3412c = true;
        return this.f3415f.a(this.f3413d, false, true, iOException);
    }

    @Override // Pg.n, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f3414e) {
            return;
        }
        this.f3414e = true;
        long j6 = this.f3411b;
        if (j6 != -1 && this.f3413d != j6) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            a(null);
        } catch (IOException e10) {
            throw a(e10);
        }
    }

    @Override // Pg.n, okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e10) {
            throw a(e10);
        }
    }

    @Override // Pg.n, okio.Sink
    public final void write(Pg.k source, long j6) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f3414e) {
            throw new IllegalStateException("closed");
        }
        long j10 = this.f3411b;
        if (j10 != -1 && this.f3413d + j6 > j10) {
            StringBuilder sbR = u.r(j10, "expected ", " bytes but received ");
            sbR.append(this.f3413d + j6);
            throw new ProtocolException(sbR.toString());
        }
        try {
            super.write(source, j6);
            this.f3413d += j6;
        } catch (IOException e10) {
            throw a(e10);
        }
    }
}
