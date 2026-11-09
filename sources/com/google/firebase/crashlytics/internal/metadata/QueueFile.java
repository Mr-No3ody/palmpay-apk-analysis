package com.google.firebase.crashlytics.internal.metadata;

import C0.G;
import com.google.common.primitives.UnsignedBytes;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
class QueueFile implements Closeable {
    static final int HEADER_LENGTH = 16;
    private static final int INITIAL_LENGTH = 4096;
    private static final Logger LOGGER = Logger.getLogger(QueueFile.class.getName());
    private final byte[] buffer;
    private int elementCount;
    int fileLength;
    private Element first;
    private Element last;
    private final RandomAccessFile raf;

    public static class Element {
        static final int HEADER_LENGTH = 4;
        static final Element NULL = new Element(0, 0);
        final int length;
        final int position;

        public Element(int i7, int i10) {
            this.position = i7;
            this.length = i10;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append("[position = ");
            sb2.append(this.position);
            sb2.append(", length = ");
            return G.n(this.length, "]", sb2);
        }
    }

    public final class ElementInputStream extends InputStream {
        private int position;
        private int remaining;

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i7, int i10) throws IOException {
            QueueFile.nonNull(bArr, "buffer");
            if ((i7 | i10) < 0 || i10 > bArr.length - i7) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i11 = this.remaining;
            if (i11 <= 0) {
                return -1;
            }
            if (i10 > i11) {
                i10 = i11;
            }
            QueueFile.this.ringRead(this.position, bArr, i7, i10);
            this.position = QueueFile.this.wrapPosition(this.position + i10);
            this.remaining -= i10;
            return i10;
        }

        private ElementInputStream(Element element) {
            this.position = QueueFile.this.wrapPosition(element.position + 4);
            this.remaining = element.length;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.remaining == 0) {
                return -1;
            }
            QueueFile.this.raf.seek(this.position);
            int i7 = QueueFile.this.raf.read();
            this.position = QueueFile.this.wrapPosition(this.position + 1);
            this.remaining--;
            return i7;
        }
    }

    public interface ElementReader {
        void read(InputStream inputStream, int i7) throws IOException;
    }

    public QueueFile(File file) throws IOException {
        this.buffer = new byte[16];
        if (!file.exists()) {
            initialize(file);
        }
        this.raf = open(file);
        readHeader();
    }

    private void expandIfNecessary(int i7) throws IOException {
        int i10 = i7 + 4;
        int iRemainingBytes = remainingBytes();
        if (iRemainingBytes >= i10) {
            return;
        }
        int i11 = this.fileLength;
        do {
            iRemainingBytes += i11;
            i11 <<= 1;
        } while (iRemainingBytes < i10);
        setLength(i11);
        Element element = this.last;
        int iWrapPosition = wrapPosition(element.position + 4 + element.length);
        if (iWrapPosition < this.first.position) {
            FileChannel channel = this.raf.getChannel();
            channel.position(this.fileLength);
            long j6 = iWrapPosition - 4;
            if (channel.transferTo(16L, j6, channel) != j6) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i12 = this.last.position;
        int i13 = this.first.position;
        if (i12 < i13) {
            int i14 = (this.fileLength + i12) - 16;
            writeHeader(i11, this.elementCount, i13, i14);
            this.last = new Element(i14, this.last.length);
        } else {
            writeHeader(i11, this.elementCount, i13, i12);
        }
        this.fileLength = i11;
    }

    private static void initialize(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileOpen = open(file2);
        try {
            randomAccessFileOpen.setLength(4096L);
            randomAccessFileOpen.seek(0L);
            byte[] bArr = new byte[16];
            writeInts(bArr, 4096, 0, 0, 0);
            randomAccessFileOpen.write(bArr);
            randomAccessFileOpen.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFileOpen.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T nonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile open(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private Element readElement(int i7) throws IOException {
        if (i7 == 0) {
            return Element.NULL;
        }
        this.raf.seek(i7);
        return new Element(i7, this.raf.readInt());
    }

    private void readHeader() throws IOException {
        this.raf.seek(0L);
        this.raf.readFully(this.buffer);
        int i7 = readInt(this.buffer, 0);
        this.fileLength = i7;
        if (i7 > this.raf.length()) {
            throw new IOException("File is truncated. Expected length: " + this.fileLength + ", Actual length: " + this.raf.length());
        }
        this.elementCount = readInt(this.buffer, 4);
        int i10 = readInt(this.buffer, 8);
        int i11 = readInt(this.buffer, 12);
        this.first = readElement(i10);
        this.last = readElement(i11);
    }

    private static int readInt(byte[] bArr, int i7) {
        return ((bArr[i7] & UnsignedBytes.MAX_VALUE) << 24) + ((bArr[i7 + 1] & UnsignedBytes.MAX_VALUE) << 16) + ((bArr[i7 + 2] & UnsignedBytes.MAX_VALUE) << 8) + (bArr[i7 + 3] & UnsignedBytes.MAX_VALUE);
    }

    private int remainingBytes() {
        return this.fileLength - usedBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ringRead(int i7, byte[] bArr, int i10, int i11) throws IOException {
        int iWrapPosition = wrapPosition(i7);
        int i12 = iWrapPosition + i11;
        int i13 = this.fileLength;
        if (i12 <= i13) {
            this.raf.seek(iWrapPosition);
            this.raf.readFully(bArr, i10, i11);
            return;
        }
        int i14 = i13 - iWrapPosition;
        this.raf.seek(iWrapPosition);
        this.raf.readFully(bArr, i10, i14);
        this.raf.seek(16L);
        this.raf.readFully(bArr, i10 + i14, i11 - i14);
    }

    private void ringWrite(int i7, byte[] bArr, int i10, int i11) throws IOException {
        int iWrapPosition = wrapPosition(i7);
        int i12 = iWrapPosition + i11;
        int i13 = this.fileLength;
        if (i12 <= i13) {
            this.raf.seek(iWrapPosition);
            this.raf.write(bArr, i10, i11);
            return;
        }
        int i14 = i13 - iWrapPosition;
        this.raf.seek(iWrapPosition);
        this.raf.write(bArr, i10, i14);
        this.raf.seek(16L);
        this.raf.write(bArr, i10 + i14, i11 - i14);
    }

    private void setLength(int i7) throws IOException {
        this.raf.setLength(i7);
        this.raf.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int wrapPosition(int i7) {
        int i10 = this.fileLength;
        return i7 < i10 ? i7 : (i7 + 16) - i10;
    }

    private void writeHeader(int i7, int i10, int i11, int i12) throws IOException {
        writeInts(this.buffer, i7, i10, i11, i12);
        this.raf.seek(0L);
        this.raf.write(this.buffer);
    }

    private static void writeInt(byte[] bArr, int i7, int i10) {
        bArr[i7] = (byte) (i10 >> 24);
        bArr[i7 + 1] = (byte) (i10 >> 16);
        bArr[i7 + 2] = (byte) (i10 >> 8);
        bArr[i7 + 3] = (byte) i10;
    }

    private static void writeInts(byte[] bArr, int... iArr) {
        int i7 = 0;
        for (int i10 : iArr) {
            writeInt(bArr, i7, i10);
            i7 += 4;
        }
    }

    public void add(byte[] bArr) throws IOException {
        add(bArr, 0, bArr.length);
    }

    public synchronized void clear() throws IOException {
        try {
            writeHeader(4096, 0, 0, 0);
            this.elementCount = 0;
            Element element = Element.NULL;
            this.first = element;
            this.last = element;
            if (this.fileLength > 4096) {
                setLength(4096);
            }
            this.fileLength = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.raf.close();
    }

    public synchronized void forEach(ElementReader elementReader) throws IOException {
        int iWrapPosition = this.first.position;
        for (int i7 = 0; i7 < this.elementCount; i7++) {
            Element element = readElement(iWrapPosition);
            elementReader.read(new ElementInputStream(element), element.length);
            iWrapPosition = wrapPosition(element.position + 4 + element.length);
        }
    }

    public boolean hasSpaceFor(int i7, int i10) {
        return (usedBytes() + 4) + i7 <= i10;
    }

    public synchronized boolean isEmpty() {
        return this.elementCount == 0;
    }

    public synchronized byte[] peek() throws IOException {
        if (isEmpty()) {
            return null;
        }
        Element element = this.first;
        int i7 = element.length;
        byte[] bArr = new byte[i7];
        ringRead(element.position + 4, bArr, 0, i7);
        return bArr;
    }

    public synchronized void remove() throws IOException {
        try {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.elementCount == 1) {
                clear();
            } else {
                Element element = this.first;
                int iWrapPosition = wrapPosition(element.position + 4 + element.length);
                ringRead(iWrapPosition, this.buffer, 0, 4);
                int i7 = readInt(this.buffer, 0);
                writeHeader(this.fileLength, this.elementCount - 1, iWrapPosition, this.last.position);
                this.elementCount--;
                this.first = new Element(iWrapPosition, i7);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int size() {
        return this.elementCount;
    }

    public String toString() {
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.fileLength);
        sb2.append(", size=");
        sb2.append(this.elementCount);
        sb2.append(", first=");
        sb2.append(this.first);
        sb2.append(", last=");
        sb2.append(this.last);
        sb2.append(", element lengths=[");
        try {
            forEach(new ElementReader() { // from class: com.google.firebase.crashlytics.internal.metadata.QueueFile.1
                boolean first = true;

                @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
                public void read(InputStream inputStream, int i7) throws IOException {
                    if (this.first) {
                        this.first = false;
                    } else {
                        sb2.append(", ");
                    }
                    sb2.append(i7);
                }
            });
        } catch (IOException e10) {
            LOGGER.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public int usedBytes() {
        if (this.elementCount == 0) {
            return 16;
        }
        Element element = this.last;
        int i7 = element.position;
        int i10 = this.first.position;
        return i7 >= i10 ? (i7 - i10) + 4 + element.length + 16 : (((i7 + 4) + element.length) + this.fileLength) - i10;
    }

    public synchronized void add(byte[] bArr, int i7, int i10) throws IOException {
        int iWrapPosition;
        try {
            nonNull(bArr, "buffer");
            if ((i7 | i10) < 0 || i10 > bArr.length - i7) {
                throw new IndexOutOfBoundsException();
            }
            expandIfNecessary(i10);
            boolean zIsEmpty = isEmpty();
            if (zIsEmpty) {
                iWrapPosition = 16;
            } else {
                Element element = this.last;
                iWrapPosition = wrapPosition(element.position + 4 + element.length);
            }
            Element element2 = new Element(iWrapPosition, i10);
            writeInt(this.buffer, 0, i10);
            ringWrite(element2.position, this.buffer, 0, 4);
            ringWrite(element2.position + 4, bArr, i7, i10);
            writeHeader(this.fileLength, this.elementCount + 1, zIsEmpty ? element2.position : this.first.position, element2.position);
            this.last = element2;
            this.elementCount++;
            if (zIsEmpty) {
                this.first = element2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public QueueFile(RandomAccessFile randomAccessFile) throws IOException {
        this.buffer = new byte[16];
        this.raf = randomAccessFile;
        readHeader();
    }

    public synchronized void peek(ElementReader elementReader) throws IOException {
        if (this.elementCount > 0) {
            elementReader.read(new ElementInputStream(this.first), this.first.length);
        }
    }
}
