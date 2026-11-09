package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
public final class LittleEndianDataOutputStream extends FilterOutputStream implements DataOutput {
    public LittleEndianDataOutputStream(OutputStream outputStream) {
        super(new DataOutputStream((OutputStream) Preconditions.checkNotNull(outputStream)));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public void write(byte[] bArr, int i7, int i10) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i7, i10);
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean z3) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBoolean(z3);
    }

    @Override // java.io.DataOutput
    public void writeByte(int i7) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeByte(i7);
    }

    @Override // java.io.DataOutput
    @Deprecated
    public void writeBytes(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBytes(str);
    }

    @Override // java.io.DataOutput
    public void writeChar(int i7) throws IOException {
        writeShort(i7);
    }

    @Override // java.io.DataOutput
    public void writeChars(String str) throws IOException {
        for (int i7 = 0; i7 < str.length(); i7++) {
            writeChar(str.charAt(i7));
        }
    }

    @Override // java.io.DataOutput
    public void writeDouble(double d2) throws IOException {
        writeLong(Double.doubleToLongBits(d2));
    }

    @Override // java.io.DataOutput
    public void writeFloat(float f10) throws IOException {
        writeInt(Float.floatToIntBits(f10));
    }

    @Override // java.io.DataOutput
    public void writeInt(int i7) throws IOException {
        ((FilterOutputStream) this).out.write(i7 & 255);
        ((FilterOutputStream) this).out.write((i7 >> 8) & 255);
        ((FilterOutputStream) this).out.write((i7 >> 16) & 255);
        ((FilterOutputStream) this).out.write((i7 >> 24) & 255);
    }

    @Override // java.io.DataOutput
    public void writeLong(long j6) throws IOException {
        byte[] byteArray = Longs.toByteArray(Long.reverseBytes(j6));
        write(byteArray, 0, byteArray.length);
    }

    @Override // java.io.DataOutput
    public void writeShort(int i7) throws IOException {
        ((FilterOutputStream) this).out.write(i7 & 255);
        ((FilterOutputStream) this).out.write((i7 >> 8) & 255);
    }

    @Override // java.io.DataOutput
    public void writeUTF(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeUTF(str);
    }
}
