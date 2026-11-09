package com.google.common.io;

import C0.G;
import N8.q0;
import androidx.camera.camera2.internal.F;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() { // from class: com.google.common.io.ByteStreams.1
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i7) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            Preconditions.checkNotNull(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i7, int i10) {
            Preconditions.checkNotNull(bArr);
            Preconditions.checkPositionIndexes(i7, i10 + i7, bArr.length);
        }
    };
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;
    private static final int ZERO_COPY_CHUNK_SIZE = 524288;

    private ByteStreams() {
    }

    private static byte[] combineBuffers(Queue<byte[]> queue, int i7) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = queue.remove();
        if (bArrRemove.length == i7) {
            return bArrRemove;
        }
        int length = i7 - bArrRemove.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrRemove, i7);
        while (length > 0) {
            byte[] bArrRemove2 = queue.remove();
            int iMin = Math.min(length, bArrRemove2.length);
            System.arraycopy(bArrRemove2, 0, bArrCopyOf, i7 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    @CanIgnoreReturnValue
    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(outputStream);
        byte[] bArrCreateBuffer = createBuffer();
        long j6 = 0;
        while (true) {
            int i7 = inputStream.read(bArrCreateBuffer);
            if (i7 == -1) {
                return j6;
            }
            outputStream.write(bArrCreateBuffer, 0, i7);
            j6 += (long) i7;
        }
    }

    public static byte[] createBuffer() {
        return new byte[8192];
    }

    @CanIgnoreReturnValue
    @Beta
    public static long exhaust(InputStream inputStream) throws IOException {
        byte[] bArrCreateBuffer = createBuffer();
        long j6 = 0;
        while (true) {
            long j10 = inputStream.read(bArrCreateBuffer);
            if (j10 == -1) {
                return j6;
            }
            j6 += j10;
        }
    }

    @Beta
    public static InputStream limit(InputStream inputStream, long j6) {
        return new LimitedInputStream(inputStream, j6);
    }

    @Beta
    public static ByteArrayDataInput newDataInput(byte[] bArr) {
        return newDataInput(new ByteArrayInputStream(bArr));
    }

    @Beta
    public static ByteArrayDataOutput newDataOutput() {
        return newDataOutput(new ByteArrayOutputStream());
    }

    @Beta
    public static OutputStream nullOutputStream() {
        return NULL_OUTPUT_STREAM;
    }

    @CanIgnoreReturnValue
    @Beta
    public static int read(InputStream inputStream, byte[] bArr, int i7, int i10) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(bArr);
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(F.c(i10, "len (", ") cannot be negative"));
        }
        Preconditions.checkPositionIndexes(i7, i7 + i10, bArr.length);
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i7 + i11, i10 - i11);
            if (i12 == -1) {
                break;
            }
            i11 += i12;
        }
        return i11;
    }

    @Beta
    @CanIgnoreReturnValue
    @ParametricNullness
    public static <T> T readBytes(InputStream inputStream, ByteProcessor<T> byteProcessor) throws IOException {
        int i7;
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(byteProcessor);
        byte[] bArrCreateBuffer = createBuffer();
        do {
            i7 = inputStream.read(bArrCreateBuffer);
            if (i7 == -1) {
                break;
            }
        } while (byteProcessor.processBytes(bArrCreateBuffer, 0, i7));
        return byteProcessor.getResult();
    }

    @Beta
    public static void readFully(InputStream inputStream, byte[] bArr) throws IOException {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    @Beta
    public static void skipFully(InputStream inputStream, long j6) throws IOException {
        long jSkipUpTo = skipUpTo(inputStream, j6);
        if (jSkipUpTo >= j6) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("reached end of stream after skipping ");
        sb2.append(jSkipUpTo);
        sb2.append(" bytes; ");
        throw new EOFException(q0.n(sb2, " bytes expected", j6));
    }

    private static long skipSafely(InputStream inputStream, long j6) throws IOException {
        int iAvailable = inputStream.available();
        if (iAvailable == 0) {
            return 0L;
        }
        return inputStream.skip(Math.min(iAvailable, j6));
    }

    public static long skipUpTo(InputStream inputStream, long j6) throws IOException {
        byte[] bArr = null;
        long j10 = 0;
        while (j10 < j6) {
            long j11 = j6 - j10;
            long jSkipSafely = skipSafely(inputStream, j11);
            if (jSkipSafely == 0) {
                int iMin = (int) Math.min(j11, 8192L);
                if (bArr == null) {
                    bArr = new byte[iMin];
                }
                jSkipSafely = inputStream.read(bArr, 0, iMin);
                if (jSkipSafely == -1) {
                    break;
                }
            }
            j10 += jSkipSafely;
        }
        return j10;
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        Preconditions.checkNotNull(inputStream);
        return toByteArrayInternal(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] toByteArrayInternal(InputStream inputStream, Queue<byte[]> queue, int i7) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i7) * 2));
        while (i7 < MAX_ARRAY_LEN) {
            int iMin2 = Math.min(iMin, MAX_ARRAY_LEN - i7);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i10 = 0;
            while (i10 < iMin2) {
                int i11 = inputStream.read(bArr, i10, iMin2 - i10);
                if (i11 == -1) {
                    return combineBuffers(queue, i7);
                }
                i10 += i11;
                i7 += i11;
            }
            iMin = IntMath.saturatedMultiply(iMin, iMin < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return combineBuffers(queue, MAX_ARRAY_LEN);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static class ByteArrayDataInputStream implements ByteArrayDataInput {
        final DataInput input;

        public ByteArrayDataInputStream(ByteArrayInputStream byteArrayInputStream) {
            this.input = new DataInputStream(byteArrayInputStream);
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public boolean readBoolean() {
            try {
                return this.input.readBoolean();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public byte readByte() {
            try {
                return this.input.readByte();
            } catch (EOFException e10) {
                throw new IllegalStateException(e10);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public char readChar() {
            try {
                return this.input.readChar();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public double readDouble() {
            try {
                return this.input.readDouble();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public float readFloat() {
            try {
                return this.input.readFloat();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] bArr) {
            try {
                this.input.readFully(bArr);
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readInt() {
            try {
                return this.input.readInt();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        @CheckForNull
        public String readLine() {
            try {
                return this.input.readLine();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public long readLong() {
            try {
                return this.input.readLong();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public short readShort() {
            try {
                return this.input.readShort();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public String readUTF() {
            try {
                return this.input.readUTF();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedByte() {
            try {
                return this.input.readUnsignedByte();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedShort() {
            try {
                return this.input.readUnsignedShort();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int skipBytes(int i7) {
            try {
                return this.input.skipBytes(i7);
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] bArr, int i7, int i10) {
            try {
                this.input.readFully(bArr, i7, i10);
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public static class ByteArrayDataOutputStream implements ByteArrayDataOutput {
        final ByteArrayOutputStream byteArrayOutputStream;
        final DataOutput output;

        public ByteArrayDataOutputStream(ByteArrayOutputStream byteArrayOutputStream) {
            this.byteArrayOutputStream = byteArrayOutputStream;
            this.output = new DataOutputStream(byteArrayOutputStream);
        }

        @Override // com.google.common.io.ByteArrayDataOutput
        public byte[] toByteArray() {
            return this.byteArrayOutputStream.toByteArray();
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(int i7) {
            try {
                this.output.write(i7);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBoolean(boolean z3) {
            try {
                this.output.writeBoolean(z3);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeByte(int i7) {
            try {
                this.output.writeByte(i7);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBytes(String str) {
            try {
                this.output.writeBytes(str);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChar(int i7) {
            try {
                this.output.writeChar(i7);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChars(String str) {
            try {
                this.output.writeChars(str);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeDouble(double d2) {
            try {
                this.output.writeDouble(d2);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeFloat(float f10) {
            try {
                this.output.writeFloat(f10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeInt(int i7) {
            try {
                this.output.writeInt(i7);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeLong(long j6) {
            try {
                this.output.writeLong(j6);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeShort(int i7) {
            try {
                this.output.writeShort(i7);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeUTF(String str) {
            try {
                this.output.writeUTF(str);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] bArr) {
            try {
                this.output.write(bArr);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] bArr, int i7, int i10) {
            try {
                this.output.write(bArr, i7, i10);
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    @Beta
    public static ByteArrayDataInput newDataInput(byte[] bArr, int i7) {
        Preconditions.checkPositionIndex(i7, bArr.length);
        return newDataInput(new ByteArrayInputStream(bArr, i7, bArr.length - i7));
    }

    @Beta
    public static ByteArrayDataOutput newDataOutput(int i7) {
        if (i7 >= 0) {
            return newDataOutput(new ByteArrayOutputStream(i7));
        }
        throw new IllegalArgumentException(G.m(i7, "Invalid size: "));
    }

    @Beta
    public static void readFully(InputStream inputStream, byte[] bArr, int i7, int i10) throws IOException {
        int i11 = read(inputStream, bArr, i7, i10);
        if (i11 == i10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(81);
        sb2.append("reached end of stream after reading ");
        sb2.append(i11);
        sb2.append(" bytes; ");
        sb2.append(i10);
        sb2.append(" bytes expected");
        throw new EOFException(sb2.toString());
    }

    public static final class LimitedInputStream extends FilterInputStream {
        private long left;
        private long mark;

        public LimitedInputStream(InputStream inputStream, long j6) {
            super(inputStream);
            this.mark = -1L;
            Preconditions.checkNotNull(inputStream);
            Preconditions.checkArgument(j6 >= 0, "limit must be non-negative");
            this.left = j6;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.left);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i7) {
            ((FilterInputStream) this).in.mark(i7);
            this.mark = this.left;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.left == 0) {
                return -1;
            }
            int i7 = ((FilterInputStream) this).in.read();
            if (i7 != -1) {
                this.left--;
            }
            return i7;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.mark == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.left = this.mark;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j6) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j6, this.left));
            this.left -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i7, int i10) throws IOException {
            long j6 = this.left;
            if (j6 == 0) {
                return -1;
            }
            int i11 = ((FilterInputStream) this).in.read(bArr, i7, (int) Math.min(i10, j6));
            if (i11 != -1) {
                this.left -= (long) i11;
            }
            return i11;
        }
    }

    public static byte[] toByteArray(InputStream inputStream, long j6) throws IOException {
        Preconditions.checkArgument(j6 >= 0, "expectedSize (%s) must be non-negative", j6);
        if (j6 <= 2147483639) {
            int i7 = (int) j6;
            byte[] bArr = new byte[i7];
            int i10 = i7;
            while (i10 > 0) {
                int i11 = i7 - i10;
                int i12 = inputStream.read(bArr, i11, i10);
                if (i12 == -1) {
                    return Arrays.copyOf(bArr, i11);
                }
                i10 -= i12;
            }
            int i13 = inputStream.read();
            if (i13 == -1) {
                return bArr;
            }
            ArrayDeque arrayDeque = new ArrayDeque(22);
            arrayDeque.add(bArr);
            arrayDeque.add(new byte[]{(byte) i13});
            return toByteArrayInternal(inputStream, arrayDeque, i7 + 1);
        }
        StringBuilder sb2 = new StringBuilder(62);
        sb2.append(j6);
        sb2.append(" bytes is too large to fit in a byte array");
        throw new OutOfMemoryError(sb2.toString());
    }

    @Beta
    public static ByteArrayDataInput newDataInput(ByteArrayInputStream byteArrayInputStream) {
        return new ByteArrayDataInputStream((ByteArrayInputStream) Preconditions.checkNotNull(byteArrayInputStream));
    }

    @CanIgnoreReturnValue
    public static long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        Preconditions.checkNotNull(readableByteChannel);
        Preconditions.checkNotNull(writableByteChannel);
        long jWrite = 0;
        if (readableByteChannel instanceof FileChannel) {
            FileChannel fileChannel = (FileChannel) readableByteChannel;
            long jPosition = fileChannel.position();
            long j6 = jPosition;
            while (true) {
                WritableByteChannel writableByteChannel2 = writableByteChannel;
                long jTransferTo = fileChannel.transferTo(j6, 524288L, writableByteChannel2);
                j6 += jTransferTo;
                fileChannel.position(j6);
                if (jTransferTo <= 0 && j6 >= fileChannel.size()) {
                    return j6 - jPosition;
                }
                writableByteChannel = writableByteChannel2;
            }
        } else {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(createBuffer());
            while (readableByteChannel.read(byteBufferWrap) != -1) {
                Java8Compatibility.flip(byteBufferWrap);
                while (byteBufferWrap.hasRemaining()) {
                    jWrite += (long) writableByteChannel.write(byteBufferWrap);
                }
                Java8Compatibility.clear(byteBufferWrap);
            }
            return jWrite;
        }
    }

    @Beta
    public static ByteArrayDataOutput newDataOutput(ByteArrayOutputStream byteArrayOutputStream) {
        return new ByteArrayDataOutputStream((ByteArrayOutputStream) Preconditions.checkNotNull(byteArrayOutputStream));
    }
}
