package Pg;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BufferedSource f7354b;

    public /* synthetic */ i(BufferedSource bufferedSource, int i7) {
        this.f7353a = i7;
        this.f7354b = bufferedSource;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        switch (this.f7353a) {
            case 0:
                return (int) Math.min(((k) this.f7354b).f7358b, Integer.MAX_VALUE);
            default:
                x xVar = (x) this.f7354b;
                if (xVar.f7390c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(xVar.f7389b.f7358b, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f7353a) {
            case 0:
                break;
            default:
                ((x) this.f7354b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f7353a) {
            case 0:
                k kVar = (k) this.f7354b;
                if (kVar.f7358b > 0) {
                    return kVar.readByte() & UnsignedBytes.MAX_VALUE;
                }
                return -1;
            default:
                x xVar = (x) this.f7354b;
                if (xVar.f7390c) {
                    throw new IOException("closed");
                }
                k kVar2 = xVar.f7389b;
                if (kVar2.f7358b == 0 && xVar.f7388a.read(kVar2, 8192L) == -1) {
                    return -1;
                }
                return kVar2.readByte() & UnsignedBytes.MAX_VALUE;
        }
    }

    public final String toString() {
        switch (this.f7353a) {
            case 0:
                return ((k) this.f7354b) + ".inputStream()";
            default:
                return ((x) this.f7354b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i7, int i10) throws IOException {
        switch (this.f7353a) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                return ((k) this.f7354b).read(sink, i7, i10);
            default:
                Intrinsics.checkNotNullParameter(sink, "data");
                x xVar = (x) this.f7354b;
                if (!xVar.f7390c) {
                    AbstractC0555b.d(sink.length, i7, i10);
                    k kVar = xVar.f7389b;
                    if (kVar.f7358b == 0 && xVar.f7388a.read(kVar, 8192L) == -1) {
                        return -1;
                    }
                    return kVar.read(sink, i7, i10);
                }
                throw new IOException("closed");
        }
    }

    private final void a() {
    }
}
