package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
@CanIgnoreReturnValue
@ElementTypesAreNonnullByDefault
abstract class AbstractHasher implements Hasher {
    @Override // com.google.common.hash.Hasher
    public <T> Hasher putObject(@ParametricNullness T t, Funnel<? super T> funnel) {
        funnel.funnel(t, this);
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putBoolean(boolean z3) {
        return putByte(z3 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putChar(char c6) {
        putByte((byte) c6);
        putByte((byte) (c6 >>> '\b'));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putDouble(double d2) {
        return putLong(Double.doubleToRawLongBits(d2));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putFloat(float f10) {
        return putInt(Float.floatToRawIntBits(f10));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putInt(int i7) {
        putByte((byte) i7);
        putByte((byte) (i7 >>> 8));
        putByte((byte) (i7 >>> 16));
        putByte((byte) (i7 >>> 24));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putLong(long j6) {
        for (int i7 = 0; i7 < 64; i7 += 8) {
            putByte((byte) (j6 >>> i7));
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putShort(short s3) {
        putByte((byte) s3);
        putByte((byte) (s3 >>> 8));
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putString(CharSequence charSequence, Charset charset) {
        return putBytes(charSequence.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putUnencodedChars(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i7 = 0; i7 < length; i7++) {
            putChar(charSequence.charAt(i7));
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(byte[] bArr) {
        return putBytes(bArr, 0, bArr.length);
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(byte[] bArr, int i7, int i10) {
        Preconditions.checkPositionIndexes(i7, i7 + i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            putByte(bArr[i7 + i11]);
        }
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            putBytes(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            Java8Compatibility.position(byteBuffer, byteBuffer.limit());
            return this;
        }
        for (int iRemaining = byteBuffer.remaining(); iRemaining > 0; iRemaining--) {
            putByte(byteBuffer.get());
        }
        return this;
    }
}
