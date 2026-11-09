package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
@CanIgnoreReturnValue
@Beta
@ElementTypesAreNonnullByDefault
public interface Hasher extends PrimitiveSink {
    HashCode hash();

    @Deprecated
    int hashCode();

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putBoolean(boolean z3);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putByte(byte b7);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putBytes(ByteBuffer byteBuffer);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putBytes(byte[] bArr);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putBytes(byte[] bArr, int i7, int i10);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putChar(char c6);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putDouble(double d2);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putFloat(float f10);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putInt(int i7);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putLong(long j6);

    <T> Hasher putObject(@ParametricNullness T t, Funnel<? super T> funnel);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putShort(short s3);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putString(CharSequence charSequence, Charset charset);

    @Override // com.google.common.hash.PrimitiveSink
    Hasher putUnencodedChars(CharSequence charSequence);
}
