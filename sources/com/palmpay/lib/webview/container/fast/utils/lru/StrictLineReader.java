package com.palmpay.lib.webview.container.fast.utils.lru;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
class StrictLineReader implements Closeable {
    private static final byte CR = 13;
    private static final byte LF = 10;
    private byte[] buf;
    private final Charset charset;
    private int end;
    private final InputStream in;
    private int pos;

    public StrictLineReader(InputStream inputStream, Charset charset) {
        this(inputStream, UserMetadata.MAX_INTERNAL_KEY_SIZE, charset);
    }

    private void fillBuf() throws IOException {
        InputStream inputStream = this.in;
        byte[] bArr = this.buf;
        int i7 = inputStream.read(bArr, 0, bArr.length);
        if (i7 == -1) {
            throw new EOFException();
        }
        this.pos = 0;
        this.end = i7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.in) {
            try {
                if (this.buf != null) {
                    this.buf = null;
                    this.in.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean hasUnterminatedLine() {
        return this.end == -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public String readLine() throws IOException {
        int i7;
        byte[] bArr;
        int i10;
        synchronized (this.in) {
            try {
                if (this.buf == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.pos >= this.end) {
                    fillBuf();
                }
                for (int i11 = this.pos; i11 != this.end; i11++) {
                    byte[] bArr2 = this.buf;
                    if (bArr2[i11] == 10) {
                        int i12 = this.pos;
                        if (i11 != i12) {
                            i10 = i11 - 1;
                            if (bArr2[i10] != 13) {
                                i10 = i11;
                            }
                        } else {
                            i10 = i11;
                        }
                        String str = new String(bArr2, i12, i10 - i12, this.charset.name());
                        this.pos = i11 + 1;
                        return str;
                    }
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.end - this.pos) + 80) { // from class: com.palmpay.lib.webview.container.fast.utils.lru.StrictLineReader.1
                    @Override // java.io.ByteArrayOutputStream
                    public String toString() {
                        int i13 = ((ByteArrayOutputStream) this).count;
                        if (i13 > 0) {
                            int i14 = i13 - 1;
                            if (((ByteArrayOutputStream) this).buf[i14] == 13) {
                                i13 = i14;
                            }
                        }
                        try {
                            return new String(((ByteArrayOutputStream) this).buf, 0, i13, StrictLineReader.this.charset.name());
                        } catch (UnsupportedEncodingException e10) {
                            throw new AssertionError(e10);
                        }
                    }
                };
                loop1: while (true) {
                    byte[] bArr3 = this.buf;
                    int i13 = this.pos;
                    byteArrayOutputStream.write(bArr3, i13, this.end - i13);
                    this.end = -1;
                    fillBuf();
                    i7 = this.pos;
                    while (i7 != this.end) {
                        bArr = this.buf;
                        if (bArr[i7] == 10) {
                            break loop1;
                        }
                        i7++;
                    }
                }
                int i14 = this.pos;
                if (i7 != i14) {
                    byteArrayOutputStream.write(bArr, i14, i7 - i14);
                }
                this.pos = i7 + 1;
                return byteArrayOutputStream.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public StrictLineReader(InputStream inputStream, int i7, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(Util.US_ASCII)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.in = inputStream;
        this.charset = charset;
        this.buf = new byte[i7];
    }
}
