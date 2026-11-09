package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
@CanIgnoreReturnValue
@Beta
@ElementTypesAreNonnullByDefault
public interface PrimitiveSink {
    PrimitiveSink putBoolean(boolean z3);

    PrimitiveSink putByte(byte b7);

    PrimitiveSink putBytes(ByteBuffer byteBuffer);

    PrimitiveSink putBytes(byte[] bArr);

    PrimitiveSink putBytes(byte[] bArr, int i7, int i10);

    PrimitiveSink putChar(char c6);

    PrimitiveSink putDouble(double d2);

    PrimitiveSink putFloat(float f10);

    PrimitiveSink putInt(int i7);

    PrimitiveSink putLong(long j6);

    PrimitiveSink putShort(short s3);

    PrimitiveSink putString(CharSequence charSequence, Charset charset);

    PrimitiveSink putUnencodedChars(CharSequence charSequence);
}
