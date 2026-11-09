package androidx.camera.core.impl.utils;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class c extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14147a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OutputStream f14148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteOrder f14149c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OutputStream outputStream) {
        super(outputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f14148b = outputStream;
        this.f14149c = byteOrder;
    }

    public void a(int i7) throws IOException {
        this.f14148b.write(i7);
    }

    public final void b(int i7) throws IOException {
        switch (this.f14147a) {
            case 0:
                ByteOrder byteOrder = this.f14149c;
                ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream = this.f14148b;
                if (byteOrder == byteOrder2) {
                    outputStream.write(i7 & 255);
                    outputStream.write((i7 >>> 8) & 255);
                    outputStream.write((i7 >>> 16) & 255);
                    outputStream.write((i7 >>> 24) & 255);
                } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    outputStream.write((i7 >>> 24) & 255);
                    outputStream.write((i7 >>> 16) & 255);
                    outputStream.write((i7 >>> 8) & 255);
                    outputStream.write(i7 & 255);
                }
                break;
            default:
                ByteOrder byteOrder3 = this.f14149c;
                ByteOrder byteOrder4 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream2 = this.f14148b;
                if (byteOrder3 == byteOrder4) {
                    outputStream2.write(i7 & 255);
                    outputStream2.write((i7 >>> 8) & 255);
                    outputStream2.write((i7 >>> 16) & 255);
                    outputStream2.write((i7 >>> 24) & 255);
                } else if (byteOrder3 == ByteOrder.BIG_ENDIAN) {
                    outputStream2.write((i7 >>> 24) & 255);
                    outputStream2.write((i7 >>> 16) & 255);
                    outputStream2.write((i7 >>> 8) & 255);
                    outputStream2.write(i7 & 255);
                }
                break;
        }
    }

    public final void c(short s3) throws IOException {
        switch (this.f14147a) {
            case 0:
                ByteOrder byteOrder = this.f14149c;
                ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream = this.f14148b;
                if (byteOrder == byteOrder2) {
                    outputStream.write(s3 & 255);
                    outputStream.write((s3 >>> 8) & 255);
                } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    outputStream.write((s3 >>> 8) & 255);
                    outputStream.write(s3 & 255);
                }
                break;
            default:
                ByteOrder byteOrder3 = this.f14149c;
                ByteOrder byteOrder4 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream2 = this.f14148b;
                if (byteOrder3 == byteOrder4) {
                    outputStream2.write(s3 & 255);
                    outputStream2.write((s3 >>> 8) & 255);
                } else if (byteOrder3 == ByteOrder.BIG_ENDIAN) {
                    outputStream2.write((s3 >>> 8) & 255);
                    outputStream2.write(s3 & 255);
                }
                break;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        switch (this.f14147a) {
            case 0:
                this.f14148b.write(bArr);
                break;
            default:
                this.f14148b.write(bArr);
                break;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i10) throws IOException {
        switch (this.f14147a) {
            case 0:
                this.f14148b.write(bArr, i7, i10);
                break;
            default:
                this.f14148b.write(bArr, i7, i10);
                break;
        }
    }

    public c(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f14148b = outputStream;
        this.f14149c = byteOrder;
    }
}
