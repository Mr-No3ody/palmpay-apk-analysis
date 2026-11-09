package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
@Immutable
@ElementTypesAreNonnullByDefault
abstract class AbstractHashFunction implements HashFunction {
    @Override // com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr) {
        return hashBytes(bArr, 0, bArr.length);
    }

    @Override // com.google.common.hash.HashFunction
    public HashCode hashInt(int i7) {
        return newHasher(4).putInt(i7).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public HashCode hashLong(long j6) {
        return newHasher(8).putLong(j6).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public <T> HashCode hashObject(@ParametricNullness T t, Funnel<? super T> funnel) {
        return newHasher().putObject(t, funnel).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public HashCode hashString(CharSequence charSequence, Charset charset) {
        return newHasher().putString(charSequence, charset).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public HashCode hashUnencodedChars(CharSequence charSequence) {
        return newHasher(charSequence.length() * 2).putUnencodedChars(charSequence).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher(int i7) {
        Preconditions.checkArgument(i7 >= 0, "expectedInputSize must be >= 0 but was %s", i7);
        return newHasher();
    }

    @Override // com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i7, int i10) {
        Preconditions.checkPositionIndexes(i7, i7 + i10, bArr.length);
        return newHasher(i10).putBytes(bArr, i7, i10).hash();
    }

    @Override // com.google.common.hash.HashFunction
    public HashCode hashBytes(ByteBuffer byteBuffer) {
        return newHasher(byteBuffer.remaining()).putBytes(byteBuffer).hash();
    }
}
