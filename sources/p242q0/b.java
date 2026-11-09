package p242q0;

import androidx.camera.camera2.internal.F;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteOrder f41348e = ByteOrder.LITTLE_ENDIAN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ByteOrder f41349f = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataInputStream f41350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteOrder f41351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f41353d;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    public final void a(int i7) throws IOException {
        int i10 = 0;
        while (i10 < i7) {
            DataInputStream dataInputStream = this.f41350a;
            int i11 = i7 - i10;
            int iSkip = (int) dataInputStream.skip(i11);
            if (iSkip <= 0) {
                if (this.f41353d == null) {
                    this.f41353d = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
                }
                iSkip = dataInputStream.read(this.f41353d, 0, Math.min(UserMetadata.MAX_INTERNAL_KEY_SIZE, i11));
                if (iSkip == -1) {
                    throw new EOFException(F.c(i7, "Reached EOF while skipping ", " bytes."));
                }
            }
            i10 += iSkip;
        }
        this.f41352c += i10;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f41350a.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i7) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f41352c++;
        return this.f41350a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f41352c++;
        return this.f41350a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f41352c++;
        int i7 = this.f41350a.read();
        if (i7 >= 0) {
            return (byte) i7;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f41352c += 2;
        return this.f41350a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i7, int i10) throws IOException {
        this.f41352c += i10;
        this.f41350a.readFully(bArr, i7, i10);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f41352c += 4;
        DataInputStream dataInputStream = this.f41350a;
        int i7 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        if ((i7 | i10 | i11 | i12) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f41351b;
        if (byteOrder == f41348e) {
            return (i12 << 24) + (i11 << 16) + (i10 << 8) + i7;
        }
        if (byteOrder == f41349f) {
            return (i7 << 24) + (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IOException("Invalid byte order: " + this.f41351b);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j6;
        long j10;
        this.f41352c += 8;
        DataInputStream dataInputStream = this.f41350a;
        int i7 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        if ((i7 | i10 | i11 | i12 | i13 | i14 | i15 | i16) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f41351b;
        if (byteOrder == f41348e) {
            j6 = (((long) i16) << 56) + (((long) i15) << 48) + (((long) i14) << 40) + (((long) i13) << 32) + (((long) i12) << 24) + (((long) i11) << 16) + (((long) i10) << 8);
            j10 = i7;
        } else {
            if (byteOrder != f41349f) {
                throw new IOException("Invalid byte order: " + this.f41351b);
            }
            j6 = (((long) i7) << 56) + (((long) i10) << 48) + (((long) i11) << 40) + (((long) i12) << 32) + (((long) i13) << 24) + (((long) i14) << 16) + (((long) i15) << 8);
            j10 = i16;
        }
        return j6 + j10;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f41352c += 2;
        DataInputStream dataInputStream = this.f41350a;
        int i7 = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i7 | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f41351b;
        if (byteOrder == f41348e) {
            return (short) ((i10 << 8) + i7);
        }
        if (byteOrder == f41349f) {
            return (short) ((i7 << 8) + i10);
        }
        throw new IOException("Invalid byte order: " + this.f41351b);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f41352c += 2;
        return this.f41350a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f41352c++;
        return this.f41350a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f41352c += 2;
        DataInputStream dataInputStream = this.f41350a;
        int i7 = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i7 | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f41351b;
        if (byteOrder == f41348e) {
            return (i10 << 8) + i7;
        }
        if (byteOrder == f41349f) {
            return (i7 << 8) + i10;
        }
        throw new IOException("Invalid byte order: " + this.f41351b);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i7) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        this.f41351b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f41350a = dataInputStream;
        dataInputStream.mark(0);
        this.f41352c = 0;
        this.f41351b = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) {
        int i11 = this.f41350a.read(bArr, i7, i10);
        this.f41352c += i11;
        return i11;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f41352c += bArr.length;
        this.f41350a.readFully(bArr);
    }
}
