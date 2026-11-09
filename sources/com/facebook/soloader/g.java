package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ElfByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputStream f21883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZipEntry f21884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZipFile f21885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21887e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f21888f = 0;

    public g(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        this.f21885c = zipFile;
        this.f21884b = zipEntry;
        this.f21886d = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f21883a = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f21883a;
        if (inputStream != null) {
            inputStream.close();
            this.f21887e = false;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f21887e;
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public final long position() {
        return this.f21888f;
    }

    @Override // com.facebook.soloader.ElfByteChannel, java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return read(byteBuffer, this.f21888f);
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public final long size() {
        return this.f21886d;
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public final ElfByteChannel truncate(long j6) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support truncate");
    }

    @Override // com.facebook.soloader.ElfByteChannel, java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public final ElfByteChannel position(long j6) throws IOException {
        InputStream inputStream = this.f21883a;
        ZipEntry zipEntry = this.f21884b;
        if (inputStream == null) {
            throw new IOException(zipEntry.getName() + "'s InputStream is null");
        }
        long j10 = this.f21888f;
        if (j6 == j10) {
            return this;
        }
        long j11 = this.f21886d;
        if (j6 > j11) {
            j6 = j11;
        }
        if (j6 >= j10) {
            inputStream.skip(j6 - j10);
        } else {
            inputStream.close();
            InputStream inputStream2 = this.f21885c.getInputStream(zipEntry);
            this.f21883a = inputStream2;
            if (inputStream2 == null) {
                throw new IOException(zipEntry.getName() + "'s InputStream is null");
            }
            inputStream2.skip(j6);
        }
        this.f21888f = j6;
        return this;
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public final int read(ByteBuffer byteBuffer, long j6) throws IOException {
        if (this.f21883a == null) {
            throw new IOException("InputStream is null");
        }
        int iRemaining = byteBuffer.remaining();
        long j10 = this.f21886d - j6;
        if (j10 <= 0) {
            return -1;
        }
        int i7 = (int) j10;
        if (iRemaining > i7) {
            iRemaining = i7;
        }
        position(j6);
        if (byteBuffer.hasArray()) {
            this.f21883a.read(byteBuffer.array(), 0, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else {
            byte[] bArr = new byte[iRemaining];
            this.f21883a.read(bArr, 0, iRemaining);
            byteBuffer.put(bArr, 0, iRemaining);
        }
        this.f21888f += (long) iRemaining;
        return iRemaining;
    }
}
