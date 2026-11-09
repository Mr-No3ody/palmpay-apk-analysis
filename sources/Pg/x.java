package Pg;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements BufferedSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Source f7388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f7389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7390c;

    public x(Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f7388a = source;
        this.f7389b = new k();
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public final k buffer() {
        return this.f7389b;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7390c) {
            return;
        }
        this.f7390c = true;
        this.f7388a.close();
        this.f7389b.a();
    }

    @Override // okio.BufferedSource
    public final boolean exhausted() {
        if (this.f7390c) {
            throw new IllegalStateException("closed");
        }
        k kVar = this.f7389b;
        return kVar.exhausted() && this.f7388a.read(kVar, 8192L) == -1;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public final k getBuffer() {
        return this.f7389b;
    }

    @Override // okio.BufferedSource
    public final long indexOf(byte b7) {
        return indexOf(b7, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final long indexOfElement(m targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    public final InputStream inputStream() {
        return new i(this, 1);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f7390c;
    }

    @Override // okio.BufferedSource
    public final BufferedSource peek() {
        return AbstractC0555b.c(new v(this));
    }

    @Override // okio.BufferedSource
    public final boolean rangeEquals(long j6, m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return rangeEquals(j6, bytes, 0, bytes.d());
    }

    @Override // okio.BufferedSource
    public final int read(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.BufferedSource
    public final long readAll(Sink sink) throws IOException {
        k kVar;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j6 = 0;
        while (true) {
            Source source = this.f7388a;
            kVar = this.f7389b;
            if (source.read(kVar, 8192L) == -1) {
                break;
            }
            long jC = kVar.c();
            if (jC > 0) {
                j6 += jC;
                sink.write(kVar, jC);
            }
        }
        long j10 = kVar.f7358b;
        if (j10 <= 0) {
            return j6;
        }
        long j11 = j6 + j10;
        sink.write(kVar, j10);
        return j11;
    }

    @Override // okio.BufferedSource
    public final byte readByte() throws EOFException {
        require(1L);
        return this.f7389b.readByte();
    }

    @Override // okio.BufferedSource
    public final byte[] readByteArray() throws IOException {
        Source source = this.f7388a;
        k kVar = this.f7389b;
        kVar.writeAll(source);
        return kVar.readByteArray(kVar.f7358b);
    }

    @Override // okio.BufferedSource
    public final m readByteString() throws IOException {
        Source source = this.f7388a;
        k kVar = this.f7389b;
        kVar.writeAll(source);
        return kVar.readByteString(kVar.f7358b);
    }

    @Override // okio.BufferedSource
    public final long readDecimalLong() throws EOFException {
        k kVar;
        require(1L);
        long j6 = 0;
        while (true) {
            long j10 = j6 + 1;
            boolean zRequest = request(j10);
            kVar = this.f7389b;
            if (!zRequest) {
                break;
            }
            byte bE = kVar.e(j6);
            if ((bE < 48 || bE > 57) && !(j6 == 0 && bE == 45)) {
                if (j6 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder("Expected a digit or '-' but was 0x");
                String string = Integer.toString(bE, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            j6 = j10;
        }
        return kVar.readDecimalLong();
    }

    @Override // okio.BufferedSource
    public final void readFully(byte[] sink) throws EOFException {
        k kVar = this.f7389b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            require(sink.length);
            kVar.readFully(sink);
        } catch (EOFException e10) {
            int i7 = 0;
            while (true) {
                long j6 = kVar.f7358b;
                if (j6 <= 0) {
                    throw e10;
                }
                int i10 = kVar.read(sink, i7, (int) j6);
                if (i10 == -1) {
                    throw new AssertionError();
                }
                i7 += i10;
            }
        }
    }

    @Override // okio.BufferedSource
    public final long readHexadecimalUnsignedLong() throws EOFException {
        k kVar;
        require(1L);
        int i7 = 0;
        while (true) {
            int i10 = i7 + 1;
            boolean zRequest = request(i10);
            kVar = this.f7389b;
            if (!zRequest) {
                break;
            }
            byte bE = kVar.e(i7);
            if ((bE < 48 || bE > 57) && ((bE < 97 || bE > 102) && (bE < 65 || bE > 70))) {
                if (i7 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bE, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            i7 = i10;
        }
        return kVar.readHexadecimalUnsignedLong();
    }

    @Override // okio.BufferedSource
    public final int readInt() throws EOFException {
        require(4L);
        return this.f7389b.readInt();
    }

    @Override // okio.BufferedSource
    public final int readIntLe() throws EOFException {
        require(4L);
        return this.f7389b.readIntLe();
    }

    @Override // okio.BufferedSource
    public final long readLong() throws EOFException {
        require(8L);
        return this.f7389b.readLong();
    }

    @Override // okio.BufferedSource
    public final long readLongLe() throws EOFException {
        require(8L);
        return this.f7389b.readLongLe();
    }

    @Override // okio.BufferedSource
    public final short readShort() throws EOFException {
        require(2L);
        return this.f7389b.readShort();
    }

    @Override // okio.BufferedSource
    public final short readShortLe() throws EOFException {
        require(2L);
        return this.f7389b.readShortLe();
    }

    @Override // okio.BufferedSource
    public final String readString(Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        Source source = this.f7388a;
        k kVar = this.f7389b;
        kVar.writeAll(source);
        return kVar.readString(charset);
    }

    @Override // okio.BufferedSource
    public final String readUtf8() throws IOException {
        Source source = this.f7388a;
        k kVar = this.f7389b;
        kVar.writeAll(source);
        return kVar.readUtf8();
    }

    @Override // okio.BufferedSource
    public final int readUtf8CodePoint() throws EOFException {
        require(1L);
        k kVar = this.f7389b;
        byte bE = kVar.e(0L);
        if ((bE & 224) == 192) {
            require(2L);
        } else if ((bE & 240) == 224) {
            require(3L);
        } else if ((bE & 248) == 240) {
            require(4L);
        }
        return kVar.readUtf8CodePoint();
    }

    @Override // okio.BufferedSource
    public final String readUtf8Line() {
        long jIndexOf = indexOf((byte) 10);
        k kVar = this.f7389b;
        if (jIndexOf != -1) {
            return Qg.a.b(kVar, jIndexOf);
        }
        long j6 = kVar.f7358b;
        if (j6 != 0) {
            return readUtf8(j6);
        }
        return null;
    }

    @Override // okio.BufferedSource
    public final String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final boolean request(long j6) {
        k kVar;
        if (j6 < 0) {
            throw new IllegalArgumentException(androidx.camera.video.u.i(j6, "byteCount < 0: ").toString());
        }
        if (this.f7390c) {
            throw new IllegalStateException("closed");
        }
        do {
            kVar = this.f7389b;
            if (kVar.f7358b >= j6) {
                return true;
            }
        } while (this.f7388a.read(kVar, 8192L) != -1);
        return false;
    }

    @Override // okio.BufferedSource
    public final void require(long j6) throws EOFException {
        if (!request(j6)) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public final int select(u options) throws EOFException {
        k kVar;
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.f7390c) {
            throw new IllegalStateException("closed");
        }
        do {
            kVar = this.f7389b;
            int iC = Qg.a.c(kVar, options, true);
            if (iC != -2) {
                if (iC == -1) {
                    break;
                }
                kVar.skip(options.f7377b[iC].d());
                return iC;
            }
        } while (this.f7388a.read(kVar, 8192L) != -1);
        return -1;
    }

    @Override // okio.BufferedSource
    public final void skip(long j6) throws EOFException {
        if (this.f7390c) {
            throw new IllegalStateException("closed");
        }
        while (j6 > 0) {
            k kVar = this.f7389b;
            if (kVar.f7358b == 0 && this.f7388a.read(kVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j6, kVar.f7358b);
            kVar.skip(jMin);
            j6 -= jMin;
        }
    }

    @Override // okio.Source
    public final F timeout() {
        return this.f7388a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f7388a + ')';
    }

    @Override // okio.BufferedSource
    public final long indexOf(byte b7, long j6) {
        return indexOf(b7, j6, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final long indexOfElement(m targetBytes, long j6) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (this.f7390c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            k kVar = this.f7389b;
            long jIndexOfElement = kVar.indexOfElement(targetBytes, j6);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long j10 = kVar.f7358b;
            if (this.f7388a.read(kVar, 8192L) == -1) {
                return -1L;
            }
            j6 = Math.max(j6, j10);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        k kVar = this.f7389b;
        if (kVar.f7358b == 0 && this.f7388a.read(kVar, 8192L) == -1) {
            return -1;
        }
        return kVar.read(sink);
    }

    @Override // okio.BufferedSource
    public final String readUtf8LineStrict(long j6) throws EOFException {
        if (j6 < 0) {
            throw new IllegalArgumentException(androidx.camera.video.u.i(j6, "limit < 0: ").toString());
        }
        long j10 = j6 == Long.MAX_VALUE ? Long.MAX_VALUE : j6 + 1;
        long jIndexOf = indexOf((byte) 10, 0L, j10);
        k kVar = this.f7389b;
        if (jIndexOf != -1) {
            return Qg.a.b(kVar, jIndexOf);
        }
        if (j10 < Long.MAX_VALUE && request(j10) && kVar.e(j10 - 1) == 13 && request(j10 + 1) && kVar.e(j10) == 10) {
            return Qg.a.b(kVar, j10);
        }
        k kVar2 = new k();
        kVar.d(kVar2, 0L, Math.min(32, kVar.f7358b));
        throw new EOFException("\\n not found: limit=" + Math.min(kVar.f7358b, j6) + " content=" + kVar2.readByteString(kVar2.f7358b).e() + (char) 8230);
    }

    @Override // okio.BufferedSource
    public final long indexOf(m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSource
    public final boolean rangeEquals(long j6, m bytes, int i7, int i10) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!this.f7390c) {
            if (j6 >= 0 && i7 >= 0 && i10 >= 0 && bytes.d() - i7 >= i10) {
                for (int i11 = 0; i11 < i10; i11++) {
                    long j10 = ((long) i11) + j6;
                    if (request(1 + j10) && this.f7389b.e(j10) == bytes.g(i7 + i11)) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.BufferedSource
    public final String readString(long j6, Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        require(j6);
        return this.f7389b.readString(j6, charset);
    }

    @Override // okio.BufferedSource
    public final String readUtf8(long j6) throws EOFException {
        require(j6);
        k kVar = this.f7389b;
        kVar.getClass();
        return kVar.readString(j6, Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    public final long indexOf(byte b7, long j6, long j10) {
        if (this.f7390c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j6 || j6 > j10) {
            StringBuilder sbR = androidx.camera.video.u.r(j6, "fromIndex=", " toIndex=");
            sbR.append(j10);
            throw new IllegalArgumentException(sbR.toString().toString());
        }
        long jMax = j6;
        while (jMax < j10) {
            k kVar = this.f7389b;
            byte b10 = b7;
            long j11 = j10;
            long jIndexOf = kVar.indexOf(b10, jMax, j11);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long j12 = kVar.f7358b;
            if (j12 >= j11 || this.f7388a.read(kVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j12);
            b7 = b10;
            j10 = j11;
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public final byte[] readByteArray(long j6) throws EOFException {
        require(j6);
        return this.f7389b.readByteArray(j6);
    }

    @Override // okio.BufferedSource
    public final m readByteString(long j6) throws EOFException {
        require(j6);
        return this.f7389b.readByteString(j6);
    }

    @Override // okio.Source
    public final long read(k sink, long j6) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j6 >= 0) {
            if (!this.f7390c) {
                k kVar = this.f7389b;
                if (kVar.f7358b == 0 && this.f7388a.read(kVar, 8192L) == -1) {
                    return -1L;
                }
                return kVar.read(sink, Math.min(j6, kVar.f7358b));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(androidx.camera.video.u.i(j6, "byteCount < 0: ").toString());
    }

    @Override // okio.BufferedSource
    public final void readFully(k sink, long j6) throws IOException {
        k kVar = this.f7389b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            require(j6);
            kVar.readFully(sink, j6);
        } catch (EOFException e10) {
            sink.writeAll(kVar);
            throw e10;
        }
    }

    @Override // okio.BufferedSource
    public final long indexOf(m bytes, long j6) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f7390c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            k kVar = this.f7389b;
            long jIndexOf = kVar.indexOf(bytes, j6);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long j10 = kVar.f7358b;
            if (this.f7388a.read(kVar, 8192L) == -1) {
                return -1L;
            }
            j6 = Math.max(j6, (j10 - ((long) bytes.d())) + 1);
        }
    }

    @Override // okio.BufferedSource
    public final int read(byte[] sink, int i7, int i10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j6 = i10;
        AbstractC0555b.d(sink.length, i7, j6);
        k kVar = this.f7389b;
        if (kVar.f7358b == 0 && this.f7388a.read(kVar, 8192L) == -1) {
            return -1;
        }
        return kVar.read(sink, i7, (int) Math.min(j6, kVar.f7358b));
    }
}
