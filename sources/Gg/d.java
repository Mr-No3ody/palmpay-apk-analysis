package Gg;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.AbstractC1956y;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends Pg.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D.d f3421f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(D.d dVar, Source delegate, long j6) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f3421f = dVar;
        this.f3416a = j6;
        this.f3418c = true;
        if (j6 == 0) {
            a(null);
        }
    }

    public final IOException a(IOException iOException) {
        if (this.f3419d) {
            return iOException;
        }
        this.f3419d = true;
        if (iOException == null && this.f3418c) {
            this.f3418c = false;
            D.d dVar = this.f3421f;
            ((AbstractC1956y) dVar.f1580d).responseBodyStart((i) dVar.f1579c);
        }
        return this.f3421f.a(this.f3417b, true, false, iOException);
    }

    @Override // Pg.o, okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f3420e) {
            return;
        }
        this.f3420e = true;
        try {
            super.close();
            a(null);
        } catch (IOException e10) {
            throw a(e10);
        }
    }

    @Override // Pg.o, okio.Source
    public final long read(Pg.k sink, long j6) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f3420e) {
            throw new IllegalStateException("closed");
        }
        try {
            long j10 = delegate().read(sink, j6);
            if (this.f3418c) {
                this.f3418c = false;
                D.d dVar = this.f3421f;
                ((AbstractC1956y) dVar.f1580d).responseBodyStart((i) dVar.f1579c);
            }
            if (j10 == -1) {
                a(null);
                return -1L;
            }
            long j11 = this.f3417b + j10;
            long j12 = this.f3416a;
            if (j12 == -1 || j11 <= j12) {
                this.f3417b = j11;
                if (j11 == j12) {
                    a(null);
                }
                return j10;
            }
            throw new ProtocolException("expected " + j12 + " bytes but received " + j11);
        } catch (IOException e10) {
            throw a(e10);
        }
    }
}
