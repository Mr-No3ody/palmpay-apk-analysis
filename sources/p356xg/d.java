package p356xg;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends OutputStream implements OutputStreamWithSplitZipSupport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BufferedOutputStream f43996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f43997b;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f43996a.close();
    }

    @Override // net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport
    public final int getCurrentSplitFileCounter() {
        return 0;
    }

    @Override // net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport
    public final long getFilePointer() {
        return this.f43997b;
    }

    @Override // java.io.OutputStream
    public final void write(int i7) throws IOException {
        write(new byte[]{(byte) i7}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i10) throws IOException {
        this.f43996a.write(bArr, i7, i10);
        this.f43997b += (long) i10;
    }
}
