package com.facebook.common.memory;

import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41451a)
public interface PooledByteBuffer extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Nullable
    ByteBuffer getByteBuffer();

    long getNativePtr();

    boolean isClosed();

    byte read(int i7);

    int read(int i7, byte[] bArr, int i10, int i11);

    int size();
}
