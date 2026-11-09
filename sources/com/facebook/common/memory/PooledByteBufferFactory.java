package com.facebook.common.memory;

import java.io.IOException;
import java.io.InputStream;
import p262r2.f;

/* JADX INFO: loaded from: classes.dex */
public interface PooledByteBufferFactory {
    PooledByteBuffer newByteBuffer(int i7);

    PooledByteBuffer newByteBuffer(InputStream inputStream) throws IOException;

    PooledByteBuffer newByteBuffer(InputStream inputStream, int i7) throws IOException;

    PooledByteBuffer newByteBuffer(byte[] bArr);

    f newOutputStream();

    f newOutputStream(int i7);
}
