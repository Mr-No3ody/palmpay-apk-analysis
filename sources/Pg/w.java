package Pg;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.Sink;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements BufferedSink {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sink f7385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f7386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7387c;

    public w(Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f7385a = sink;
        this.f7386b = new k();
    }

    @Override // okio.BufferedSink
    public final k buffer() {
        return this.f7386b;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Sink sink = this.f7385a;
        if (this.f7387c) {
            return;
        }
        k kVar = this.f7386b;
        long j6 = kVar.f7358b;
        if (j6 > 0) {
            sink.write(kVar, j6);
        }
        th = null;
        try {
            sink.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f7387c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.BufferedSink
    public final BufferedSink emit() throws IOException {
        if (this.f7387c) {
            throw new IllegalStateException("closed");
        }
        k kVar = this.f7386b;
        long j6 = kVar.f7358b;
        if (j6 > 0) {
            this.f7385a.write(kVar, j6);
        }
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink emitCompleteSegments() {
        if (this.f7387c) {
            throw new IllegalStateException("closed");
        }
        k kVar = this.f7386b;
        long jC = kVar.c();
        if (jC > 0) {
            this.f7385a.write(kVar, jC);
        }
        return this;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public final void flush() {
        if (this.f7387c) {
            throw new IllegalStateException("closed");
        }
        k kVar = this.f7386b;
        long j6 = kVar.f7358b;
        Sink sink = this.f7385a;
        if (j6 > 0) {
            sink.write(kVar, j6);
        }
        sink.flush();
    }

    @Override // okio.BufferedSink
    public final k getBuffer() {
        return this.f7386b;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f7387c;
    }

    @Override // okio.BufferedSink
    public final OutputStream outputStream() {
        return new j(this, 1);
    }

    @Override // okio.Sink
    public final F timeout() {
        return this.f7385a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f7385a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f7387c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f7386b.write(source);
        emitCompleteSegments();
        return iWrite;
    }

    @Override // okio.BufferedSink
    public final long writeAll(Source source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j6 = 0;
        while (true) {
            long j10 = source.read(this.f7386b, 8192L);
            if (j10 == -1) {
                return j6;
            }
            j6 += j10;
            emitCompleteSegments();
        }
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeByte(int i7) {
        if (this.f7387c) {
            throw new IllegalStateException("closed");
        }
        this.f7386b.m(i7);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeDecimalLong(long j6) {
        if (this.f7387c) {
            throw new IllegalStateException("closed");
        }
        this.f7386b.n(j6);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeHexadecimalUnsignedLong(long j6) {
        if (this.f7387c) {
            throw new IllegalStateException("closed");
        }
        this.f7386b.o(j6);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeInt(int i7) {
        if (this.f7387c) {
            throw new IllegalStateException("closed");
        }
        this.f7386b.p(i7);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeIntLe(int i7) {
        if (this.f7387c) {
            throw new IllegalStateException("closed");
        }
        this.f7386b.p(AbstractC0555b.f(i7));
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeLong(long j6) {
        if (this.f7387c) {
            throw new IllegalStateException("closed");
        }
        this.f7386b.q(j6);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeLongLe(long j6) {
        if (this.f7387c) {
            throw new IllegalStateException("closed");
        }
        this.f7386b.q(AbstractC0555b.g(j6));
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeShort(int i7) {
        if (this.f7387c) {
            throw new IllegalStateException("closed");
        }
        this.f7386b.r(i7);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeShortLe(int i7) {
        if (this.f7387c) {
            throw new IllegalStateException("closed");
        }
        short s3 = (short) i7;
        this.f7386b.r((short) (((s3 & 255) << 8) | ((65280 & s3) >>> 8)));
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeString(String string, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (this.f7387c) {
            throw new IllegalStateException("closed");
        }
        this.f7386b.t(string, charset);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeUtf8(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f7387c) {
            throw new IllegalStateException("closed");
        }
        this.f7386b.v(string);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeUtf8CodePoint(int i7) {
        if (this.f7387c) {
            throw new IllegalStateException("closed");
        }
        this.f7386b.w(i7);
        emitCompleteSegments();
        return this;
    }

    @Override // okio.Sink
    public final void write(k source, long j6) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f7387c) {
            this.f7386b.write(source, j6);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeString(String string, int i7, int i10, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (!this.f7387c) {
            this.f7386b.s(string, i7, i10, charset);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeUtf8(String string, int i7, int i10) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!this.f7387c) {
            this.f7386b.u(i7, i10, string);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(m byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!this.f7387c) {
            this.f7386b.i(byteString);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(m byteString, int i7, int i10) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!this.f7387c) {
            k kVar = this.f7386b;
            Intrinsics.checkNotNullParameter(byteString, "byteString");
            byteString.m(kVar, i7, i10);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f7387c) {
            this.f7386b.k(source);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(byte[] source, int i7, int i10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f7387c) {
            this.f7386b.l(source, i7, i10);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(Source source, long j6) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        while (j6 > 0) {
            long j10 = source.read(this.f7386b, j6);
            if (j10 != -1) {
                j6 -= j10;
                emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }
}
