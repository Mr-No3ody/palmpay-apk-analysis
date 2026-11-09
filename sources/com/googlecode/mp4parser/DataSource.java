package com.googlecode.mp4parser;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes3.dex */
public interface DataSource extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    ByteBuffer map(long j6, long j10) throws IOException;

    long position() throws IOException;

    void position(long j6) throws IOException;

    int read(ByteBuffer byteBuffer) throws IOException;

    long size() throws IOException;

    long transferTo(long j6, long j10, WritableByteChannel writableByteChannel) throws IOException;
}
