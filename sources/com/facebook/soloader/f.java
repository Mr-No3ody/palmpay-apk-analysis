package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ElfByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f21880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileInputStream f21881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FileChannel f21882c;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f21881b.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f21882c.isOpen();
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public final long position() {
        return this.f21882c.position();
    }

    @Override // com.facebook.soloader.ElfByteChannel, java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.f21882c.read(byteBuffer);
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public final long size() {
        return this.f21882c.size();
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public final ElfByteChannel truncate(long j6) throws IOException {
        this.f21882c.truncate(j6);
        return this;
    }

    @Override // com.facebook.soloader.ElfByteChannel, java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        return this.f21882c.write(byteBuffer);
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public final ElfByteChannel position(long j6) throws IOException {
        this.f21882c.position(j6);
        return this;
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public final int read(ByteBuffer byteBuffer, long j6) {
        return this.f21882c.read(byteBuffer, j6);
    }
}
