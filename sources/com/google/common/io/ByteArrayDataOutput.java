package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import java.io.DataOutput;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public interface ByteArrayDataOutput extends DataOutput {
    byte[] toByteArray();

    @Override // java.io.DataOutput
    void write(int i7);

    @Override // java.io.DataOutput
    void write(byte[] bArr);

    @Override // java.io.DataOutput
    void write(byte[] bArr, int i7, int i10);

    @Override // java.io.DataOutput
    void writeBoolean(boolean z3);

    @Override // java.io.DataOutput
    void writeByte(int i7);

    @Override // java.io.DataOutput
    @Deprecated
    void writeBytes(String str);

    @Override // java.io.DataOutput
    void writeChar(int i7);

    @Override // java.io.DataOutput
    void writeChars(String str);

    @Override // java.io.DataOutput
    void writeDouble(double d2);

    @Override // java.io.DataOutput
    void writeFloat(float f10);

    @Override // java.io.DataOutput
    void writeInt(int i7);

    @Override // java.io.DataOutput
    void writeLong(long j6);

    @Override // java.io.DataOutput
    void writeShort(int i7);

    @Override // java.io.DataOutput
    void writeUTF(String str);
}
