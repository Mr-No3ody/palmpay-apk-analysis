package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
@CanIgnoreReturnValue
@ElementTypesAreNonnullByDefault
abstract class AbstractByteHasher extends AbstractHasher {
    private final ByteBuffer scratch = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    public abstract void update(byte b7);

    public void update(byte[] bArr) {
        update(bArr, 0, bArr.length);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putByte(byte b7) {
        update(b7);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putChar(char c6) {
        this.scratch.putChar(c6);
        return update(2);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putInt(int i7) {
        this.scratch.putInt(i7);
        return update(4);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putLong(long j6) {
        this.scratch.putLong(j6);
        return update(8);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putShort(short s3) {
        this.scratch.putShort(s3);
        return update(2);
    }

    public void update(byte[] bArr, int i7, int i10) {
        for (int i11 = i7; i11 < i7 + i10; i11++) {
            update(bArr[i11]);
        }
    }

    public void update(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            update(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            Java8Compatibility.position(byteBuffer, byteBuffer.limit());
            return;
        }
        for (int iRemaining = byteBuffer.remaining(); iRemaining > 0; iRemaining--) {
            update(byteBuffer.get());
        }
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        update(bArr);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(byte[] bArr, int i7, int i10) {
        Preconditions.checkPositionIndexes(i7, i7 + i10, bArr.length);
        update(bArr, i7, i10);
        return this;
    }

    private Hasher update(int i7) {
        try {
            update(this.scratch.array(), 0, i7);
            return this;
        } finally {
            Java8Compatibility.clear(this.scratch);
        }
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(ByteBuffer byteBuffer) {
        update(byteBuffer);
        return this;
    }
}
