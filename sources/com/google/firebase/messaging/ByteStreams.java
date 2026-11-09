package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;

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

    public static byte[] createBuffer() {
        return new byte[8192];
    }

    public static InputStream limit(InputStream inputStream, long j6) {
        return new LimitedInputStream(inputStream, j6);
    }

    private static int saturatedCast(long j6) {
        if (j6 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j6 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j6;
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
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
            iMin = saturatedCast(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return combineBuffers(queue, MAX_ARRAY_LEN);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final class LimitedInputStream extends FilterInputStream {
        private long left;
        private long mark;

        public LimitedInputStream(InputStream inputStream, long j6) {
            super(inputStream);
            this.mark = -1L;
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
}
