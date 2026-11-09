package okio;

import Pg.k;
import Pg.m;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import p355xf.EnumC2125d;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ'\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\b\u0010\rJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\b\u0010\u0010J'\u0010\b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\b\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0013H&¢\u0006\u0004\b\b\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH&¢\u0006\u0004\b\u0019\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\nH&¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J/\u0010#\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010%J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\nH&¢\u0006\u0004\b'\u0010 J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\nH&¢\u0006\u0004\b)\u0010 J\u0017\u0010*\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\nH&¢\u0006\u0004\b*\u0010 J\u0017\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\nH&¢\u0006\u0004\b,\u0010 J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\nH&¢\u0006\u0004\b-\u0010 J\u0017\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H&¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H&¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H&¢\u0006\u0004\b2\u00100J\u0017\u00103\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H&¢\u0006\u0004\b3\u00100J\u000f\u00105\u001a\u000204H&¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0000H&¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0000H&¢\u0006\u0004\b9\u00108J\u000f\u0010;\u001a\u00020:H&¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0004\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0005\u0082\u0001\u0002\u0003>ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006?À\u0006\u0001"}, d2 = {"Lokio/BufferedSink;", "Lokio/Sink;", "Ljava/nio/channels/WritableByteChannel;", "LPg/k;", "buffer", "()LPg/k;", "LPg/m;", "byteString", "write", "(LPg/m;)Lokio/BufferedSink;", "", "offset", "byteCount", "(LPg/m;II)Lokio/BufferedSink;", "", "source", "([B)Lokio/BufferedSink;", "([BII)Lokio/BufferedSink;", "Lokio/Source;", "", "writeAll", "(Lokio/Source;)J", "(Lokio/Source;J)Lokio/BufferedSink;", "", "string", "writeUtf8", "(Ljava/lang/String;)Lokio/BufferedSink;", "beginIndex", "endIndex", "(Ljava/lang/String;II)Lokio/BufferedSink;", "codePoint", "writeUtf8CodePoint", "(I)Lokio/BufferedSink;", "Ljava/nio/charset/Charset;", "charset", "writeString", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/BufferedSink;", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/BufferedSink;", "b", "writeByte", "s", "writeShort", "writeShortLe", "i", "writeInt", "writeIntLe", "v", "writeLong", "(J)Lokio/BufferedSink;", "writeLongLe", "writeDecimalLong", "writeHexadecimalUnsignedLong", "", "flush", "()V", "emit", "()Lokio/BufferedSink;", "emitCompleteSegments", "Ljava/io/OutputStream;", "outputStream", "()Ljava/io/OutputStream;", "getBuffer", "LPg/w;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface BufferedSink extends Sink, WritableByteChannel {
    @Deprecated(level = EnumC2125d.f43962a, message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    @NotNull
    k buffer();

    @NotNull
    BufferedSink emit() throws IOException;

    @NotNull
    BufferedSink emitCompleteSegments() throws IOException;

    @Override // okio.Sink, java.io.Flushable
    void flush() throws IOException;

    @NotNull
    k getBuffer();

    @NotNull
    OutputStream outputStream();

    @NotNull
    BufferedSink write(@NotNull m byteString) throws IOException;

    @NotNull
    BufferedSink write(@NotNull m byteString, int offset, int byteCount) throws IOException;

    @NotNull
    BufferedSink write(@NotNull Source source, long byteCount) throws IOException;

    @NotNull
    BufferedSink write(@NotNull byte[] source) throws IOException;

    @NotNull
    BufferedSink write(@NotNull byte[] source, int offset, int byteCount) throws IOException;

    long writeAll(@NotNull Source source) throws IOException;

    @NotNull
    BufferedSink writeByte(int b7) throws IOException;

    @NotNull
    BufferedSink writeDecimalLong(long v3) throws IOException;

    @NotNull
    BufferedSink writeHexadecimalUnsignedLong(long v3) throws IOException;

    @NotNull
    BufferedSink writeInt(int i7) throws IOException;

    @NotNull
    BufferedSink writeIntLe(int i7) throws IOException;

    @NotNull
    BufferedSink writeLong(long v3) throws IOException;

    @NotNull
    BufferedSink writeLongLe(long v3) throws IOException;

    @NotNull
    BufferedSink writeShort(int s3) throws IOException;

    @NotNull
    BufferedSink writeShortLe(int s3) throws IOException;

    @NotNull
    BufferedSink writeString(@NotNull String string, int beginIndex, int endIndex, @NotNull Charset charset) throws IOException;

    @NotNull
    BufferedSink writeString(@NotNull String string, @NotNull Charset charset) throws IOException;

    @NotNull
    BufferedSink writeUtf8(@NotNull String string) throws IOException;

    @NotNull
    BufferedSink writeUtf8(@NotNull String string, int beginIndex, int endIndex) throws IOException;

    @NotNull
    BufferedSink writeUtf8CodePoint(int codePoint) throws IOException;
}
