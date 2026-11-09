package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
final class CharSequenceReader extends Reader {
    private int mark;
    private int pos;

    @CheckForNull
    private CharSequence seq;

    public CharSequenceReader(CharSequence charSequence) {
        this.seq = (CharSequence) Preconditions.checkNotNull(charSequence);
    }

    private void checkOpen() throws IOException {
        if (this.seq == null) {
            throw new IOException("reader closed");
        }
    }

    private boolean hasRemaining() {
        return remaining() > 0;
    }

    private int remaining() {
        Objects.requireNonNull(this.seq);
        return this.seq.length() - this.pos;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.seq = null;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i7) throws IOException {
        Preconditions.checkArgument(i7 >= 0, "readAheadLimit (%s) may not be negative", i7);
        checkOpen();
        this.mark = this.pos;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer charBuffer) throws IOException {
        Preconditions.checkNotNull(charBuffer);
        checkOpen();
        Objects.requireNonNull(this.seq);
        if (!hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(charBuffer.remaining(), remaining());
        for (int i7 = 0; i7 < iMin; i7++) {
            CharSequence charSequence = this.seq;
            int i10 = this.pos;
            this.pos = i10 + 1;
            charBuffer.put(charSequence.charAt(i10));
        }
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws IOException {
        checkOpen();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        checkOpen();
        this.pos = this.mark;
    }

    @Override // java.io.Reader
    public synchronized long skip(long j6) throws IOException {
        int iMin;
        Preconditions.checkArgument(j6 >= 0, "n (%s) may not be negative", j6);
        checkOpen();
        iMin = (int) Math.min(remaining(), j6);
        this.pos += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized int read() throws IOException {
        int iCharAt;
        checkOpen();
        Objects.requireNonNull(this.seq);
        if (hasRemaining()) {
            CharSequence charSequence = this.seq;
            int i7 = this.pos;
            this.pos = i7 + 1;
            iCharAt = charSequence.charAt(i7);
        } else {
            iCharAt = -1;
        }
        return iCharAt;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cArr, int i7, int i10) throws IOException {
        Preconditions.checkPositionIndexes(i7, i7 + i10, cArr.length);
        checkOpen();
        Objects.requireNonNull(this.seq);
        if (!hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i10, remaining());
        for (int i11 = 0; i11 < iMin; i11++) {
            CharSequence charSequence = this.seq;
            int i12 = this.pos;
            this.pos = i12 + 1;
            cArr[i7 + i11] = charSequence.charAt(i12);
        }
        return iMin;
    }
}
