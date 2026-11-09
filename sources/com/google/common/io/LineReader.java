package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
public final class LineReader {
    private final char[] buf;
    private final CharBuffer cbuf;
    private final LineBuffer lineBuf;
    private final Queue<String> lines;
    private final Readable readable;

    @CheckForNull
    private final Reader reader;

    public LineReader(Readable readable) {
        CharBuffer charBufferCreateBuffer = CharStreams.createBuffer();
        this.cbuf = charBufferCreateBuffer;
        this.buf = charBufferCreateBuffer.array();
        this.lines = new ArrayDeque();
        this.lineBuf = new LineBuffer() { // from class: com.google.common.io.LineReader.1
            @Override // com.google.common.io.LineBuffer
            public void handleLine(String str, String str2) {
                LineReader.this.lines.add(str);
            }
        };
        this.readable = (Readable) Preconditions.checkNotNull(readable);
        this.reader = readable instanceof Reader ? (Reader) readable : null;
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public String readLine() throws IOException {
        int i7;
        while (this.lines.peek() == null) {
            Java8Compatibility.clear(this.cbuf);
            Reader reader = this.reader;
            if (reader != null) {
                char[] cArr = this.buf;
                i7 = reader.read(cArr, 0, cArr.length);
            } else {
                i7 = this.readable.read(this.cbuf);
            }
            if (i7 == -1) {
                this.lineBuf.finish();
                break;
            }
            this.lineBuf.add(this.buf, 0, i7);
        }
        return this.lines.poll();
    }
}
