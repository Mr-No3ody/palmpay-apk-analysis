package com.google.protobuf;

import C0.G;
import N8.q0;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
public abstract class ByteString implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new LiteralByteString(Internal.EMPTY_BYTE_ARRAY);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final ByteArrayCopier byteArrayCopier;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    public static abstract class AbstractByteIterator implements ByteIterator {
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    public static final class ArraysByteArrayCopier implements ByteArrayCopier {
        private ArraysByteArrayCopier() {
        }

        @Override // com.google.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bytes, int offset, int size) {
            return Arrays.copyOfRange(bytes, offset, size + offset);
        }
    }

    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        public BoundedByteString(byte[] bytes, int offset, int length) {
            super(bytes);
            ByteString.checkRange(offset, offset + length, bytes.length);
            this.bytesOffset = offset;
            this.bytesLength = length;
        }

        private void readObject(ObjectInputStream in) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public byte byteAt(int index) {
            ByteString.checkIndex(index, size());
            return this.bytes[this.bytesOffset + index];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            System.arraycopy(this.bytes, getOffsetIntoBytes() + sourceOffset, target, targetOffset, numberToCopy);
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString
        public int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public byte internalByteAt(int index) {
            return this.bytes[this.bytesOffset + index];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            return ByteString.wrap(toByteArray());
        }
    }

    public interface ByteArrayCopier {
        byte[] copyFrom(byte[] bytes, int offset, int size);
    }

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    public static final class CodedBuilder {
        private final byte[] buffer;
        private final CodedOutputStream output;

        public ByteString build() {
            this.output.checkNoSpaceLeft();
            return new LiteralByteString(this.buffer);
        }

        public CodedOutputStream getCodedOutput() {
            return this.output;
        }

        private CodedBuilder(int size) {
            byte[] bArr = new byte[size];
            this.buffer = bArr;
            this.output = CodedOutputStream.newInstance(bArr);
        }
    }

    public static abstract class LeafByteString extends ByteString {
        private static final long serialVersionUID = 1;

        public abstract boolean equalsRange(ByteString other, int offset, int length);

        @Override // com.google.protobuf.ByteString
        public final int getTreeDepth() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        public final boolean isBalanced() {
            return true;
        }

        @Override // com.google.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator2();
        }

        @Override // com.google.protobuf.ByteString
        public void writeToReverse(ByteOutput byteOutput) throws IOException {
            writeTo(byteOutput);
        }
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public LiteralByteString(byte[] bytes) {
            bytes.getClass();
            this.bytes = bytes;
        }

        @Override // com.google.protobuf.ByteString
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.ByteString
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // com.google.protobuf.ByteString
        public byte byteAt(int index) {
            return this.bytes[index];
        }

        @Override // com.google.protobuf.ByteString
        public final void copyTo(ByteBuffer target) {
            target.put(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.ByteString
        public void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            System.arraycopy(this.bytes, sourceOffset, target, targetOffset, numberToCopy);
        }

        @Override // com.google.protobuf.ByteString
        public final boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ByteString) || size() != ((ByteString) other).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(other instanceof LiteralByteString)) {
                return other.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) other;
            int iPeekCachedHashCode = peekCachedHashCode();
            int iPeekCachedHashCode2 = literalByteString.peekCachedHashCode();
            if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                return equalsRange(literalByteString, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.ByteString.LeafByteString
        public final boolean equalsRange(ByteString other, int offset, int length) {
            if (length > other.size()) {
                throw new IllegalArgumentException("Length too large: " + length + size());
            }
            int i7 = offset + length;
            if (i7 > other.size()) {
                StringBuilder sbP = q0.p(offset, "Ran off end of other: ", length, ", ", ", ");
                sbP.append(other.size());
                throw new IllegalArgumentException(sbP.toString());
            }
            if (!(other instanceof LiteralByteString)) {
                return other.substring(offset, i7).equals(substring(0, length));
            }
            LiteralByteString literalByteString = (LiteralByteString) other;
            byte[] bArr = this.bytes;
            byte[] bArr2 = literalByteString.bytes;
            int offsetIntoBytes = getOffsetIntoBytes() + length;
            int offsetIntoBytes2 = getOffsetIntoBytes();
            int offsetIntoBytes3 = literalByteString.getOffsetIntoBytes() + offset;
            while (offsetIntoBytes2 < offsetIntoBytes) {
                if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                    return false;
                }
                offsetIntoBytes2++;
                offsetIntoBytes3++;
            }
            return true;
        }

        public int getOffsetIntoBytes() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        public byte internalByteAt(int index) {
            return this.bytes[index];
        }

        @Override // com.google.protobuf.ByteString
        public final boolean isValidUtf8() {
            int offsetIntoBytes = getOffsetIntoBytes();
            return Utf8.isValidUtf8(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
        }

        @Override // com.google.protobuf.ByteString
        public final CodedInputStream newCodedInput() {
            return CodedInputStream.newInstance(this.bytes, getOffsetIntoBytes(), size(), true);
        }

        @Override // com.google.protobuf.ByteString
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.ByteString
        public final int partialHash(int h7, int offset, int length) {
            return Internal.partialHash(h7, this.bytes, getOffsetIntoBytes() + offset, length);
        }

        @Override // com.google.protobuf.ByteString
        public final int partialIsValidUtf8(int state, int offset, int length) {
            int offsetIntoBytes = getOffsetIntoBytes() + offset;
            return Utf8.partialIsValidUtf8(state, this.bytes, offsetIntoBytes, length + offsetIntoBytes);
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // com.google.protobuf.ByteString
        public final ByteString substring(int beginIndex, int endIndex) {
            int iCheckRange = ByteString.checkRange(beginIndex, endIndex, size());
            return iCheckRange == 0 ? ByteString.EMPTY : new BoundedByteString(this.bytes, getOffsetIntoBytes() + beginIndex, iCheckRange);
        }

        @Override // com.google.protobuf.ByteString
        public final String toStringInternal(Charset charset) {
            return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
        }

        @Override // com.google.protobuf.ByteString
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        @Override // com.google.protobuf.ByteString
        public final void writeToInternal(OutputStream outputStream, int sourceOffset, int numberToWrite) throws IOException {
            outputStream.write(this.bytes, getOffsetIntoBytes() + sourceOffset, numberToWrite);
        }

        @Override // com.google.protobuf.ByteString
        public final void writeTo(ByteOutput output) throws IOException {
            output.writeLazy(this.bytes, getOffsetIntoBytes(), size());
        }
    }

    public static final class SystemByteArrayCopier implements ByteArrayCopier {
        private SystemByteArrayCopier() {
        }

        @Override // com.google.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bytes, int offset, int size) {
            byte[] bArr = new byte[size];
            System.arraycopy(bytes, offset, bArr, 0, size);
            return bArr;
        }
    }

    static {
        byteArrayCopier = Android.isOnAndroidDevice() ? new SystemByteArrayCopier() : new ArraysByteArrayCopier();
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new Comparator<ByteString>() { // from class: com.google.protobuf.ByteString.2
            /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.ByteString$ByteIterator, java.util.Iterator] */
            /* JADX WARN: Type inference failed for: r1v0, types: [com.google.protobuf.ByteString$ByteIterator, java.util.Iterator] */
            @Override // java.util.Comparator
            public int compare(ByteString former, ByteString latter) {
                ?? Iterator2 = former.iterator2();
                ?? Iterator3 = latter.iterator2();
                while (Iterator2.hasNext() && Iterator3.hasNext()) {
                    int iCompareTo = Integer.valueOf(ByteString.toInt(Iterator2.nextByte())).compareTo(Integer.valueOf(ByteString.toInt(Iterator3.nextByte())));
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                return Integer.valueOf(former.size()).compareTo(Integer.valueOf(latter.size()));
            }
        };
    }

    private static ByteString balancedConcat(Iterator<ByteString> iterator, int length) {
        if (length < 1) {
            throw new IllegalArgumentException(F.c(length, "length (", ") must be >= 1"));
        }
        if (length == 1) {
            return iterator.next();
        }
        int i7 = length >>> 1;
        return balancedConcat(iterator, i7).concat(balancedConcat(iterator, length - i7));
    }

    public static void checkIndex(int index, int size) {
        if (((size - (index + 1)) | index) < 0) {
            if (index >= 0) {
                throw new ArrayIndexOutOfBoundsException(u.h(index, "Index > length: ", size, ", "));
            }
            throw new ArrayIndexOutOfBoundsException(G.m(index, "Index < 0: "));
        }
    }

    @CanIgnoreReturnValue
    public static int checkRange(int startIndex, int endIndex, int size) {
        int i7 = endIndex - startIndex;
        if ((startIndex | endIndex | i7 | (size - endIndex)) >= 0) {
            return i7;
        }
        if (startIndex < 0) {
            throw new IndexOutOfBoundsException(F.c(startIndex, "Beginning index: ", " < 0"));
        }
        if (endIndex < startIndex) {
            throw new IndexOutOfBoundsException(u.h(startIndex, "Beginning index larger than ending index: ", endIndex, ", "));
        }
        throw new IndexOutOfBoundsException(u.h(endIndex, "End index: ", size, " >= "));
    }

    public static ByteString copyFrom(byte[] bytes, int offset, int size) {
        checkRange(offset, offset + size, bytes.length);
        return new LiteralByteString(byteArrayCopier.copyFrom(bytes, offset, size));
    }

    public static ByteString copyFromUtf8(String text) {
        return new LiteralByteString(text.getBytes(Internal.UTF_8));
    }

    public static final ByteString empty() {
        return EMPTY;
    }

    private static int extractHexDigit(String hexString, int index) {
        int iHexDigit = hexDigit(hexString.charAt(index));
        if (iHexDigit != -1) {
            return iHexDigit;
        }
        StringBuilder sbQ = q0.q("Invalid hexString ", hexString, " must only contain [0-9a-fA-F] but contained ");
        sbQ.append(hexString.charAt(index));
        sbQ.append(" at index ");
        sbQ.append(index);
        throw new NumberFormatException(sbQ.toString());
    }

    public static ByteString fromHex(@CompileTimeConstant String hexString) {
        if (hexString.length() % 2 != 0) {
            StringBuilder sbQ = q0.q("Invalid hexString ", hexString, " of length ");
            sbQ.append(hexString.length());
            sbQ.append(" must be even.");
            throw new NumberFormatException(sbQ.toString());
        }
        int length = hexString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = i7 * 2;
            bArr[i7] = (byte) (extractHexDigit(hexString, i10 + 1) | (extractHexDigit(hexString, i10) << 4));
        }
        return new LiteralByteString(bArr);
    }

    private static int hexDigit(char c6) {
        if (c6 >= '0' && c6 <= '9') {
            return c6 - '0';
        }
        if (c6 >= 'A' && c6 <= 'F') {
            return c6 - '7';
        }
        if (c6 < 'a' || c6 > 'f') {
            return -1;
        }
        return c6 - 'W';
    }

    public static CodedBuilder newCodedBuilder(int size) {
        return new CodedBuilder(size);
    }

    public static Output newOutput(int initialCapacity) {
        return new Output(initialCapacity);
    }

    private static ByteString readChunk(InputStream in, final int chunkSize) throws IOException {
        byte[] bArr = new byte[chunkSize];
        int i7 = 0;
        while (i7 < chunkSize) {
            int i10 = in.read(bArr, i7, chunkSize - i7);
            if (i10 == -1) {
                break;
            }
            i7 += i10;
        }
        if (i7 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i7);
    }

    public static ByteString readFrom(InputStream streamToDrain) throws IOException {
        return readFrom(streamToDrain, 256, 8192);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte value) {
        return value & UnsignedBytes.MAX_VALUE;
    }

    private String truncateAndEscapeForDisplay() {
        return size() <= 50 ? TextFormatEscaper.escapeBytes(this) : G.r(new StringBuilder(), TextFormatEscaper.escapeBytes(substring(0, 47)), "...");
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public static ByteString wrap(ByteBuffer buffer) {
        if (!buffer.hasArray()) {
            return new NioByteString(buffer);
        }
        return wrap(buffer.array(), buffer.position() + buffer.arrayOffset(), buffer.remaining());
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int index);

    public final ByteString concat(ByteString other) {
        if (Integer.MAX_VALUE - size() >= other.size()) {
            return RopeByteString.concatenate(this, other);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + other.size());
    }

    public abstract void copyTo(ByteBuffer target);

    public void copyTo(byte[] target, int offset) {
        copyTo(target, 0, offset, size());
    }

    public abstract void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy);

    public final boolean endsWith(ByteString suffix) {
        return size() >= suffix.size() && substring(size() - suffix.size()).equals(suffix);
    }

    public abstract boolean equals(Object o10);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int iPartialHash = this.hash;
        if (iPartialHash == 0) {
            int size = size();
            iPartialHash = partialHash(size, 0, size);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.hash = iPartialHash;
        }
        return iPartialHash;
    }

    public abstract byte internalByteAt(int index);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    public abstract CodedInputStream newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int h7, int offset, int length);

    public abstract int partialIsValidUtf8(int state, int offset, int length);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(ByteString prefix) {
        return size() >= prefix.size() && substring(0, prefix.size()).equals(prefix);
    }

    public final ByteString substring(int beginIndex) {
        return substring(beginIndex, size());
    }

    public abstract ByteString substring(int beginIndex, int endIndex);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String charsetName) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(charsetName));
        } catch (UnsupportedCharsetException e10) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(charsetName);
            unsupportedEncodingException.initCause(e10);
            throw unsupportedEncodingException;
        }
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(Internal.UTF_8);
    }

    public abstract void writeTo(ByteOutput byteOutput) throws IOException;

    public abstract void writeTo(OutputStream out) throws IOException;

    public final void writeTo(OutputStream out, int sourceOffset, int numberToWrite) throws IOException {
        checkRange(sourceOffset, sourceOffset + numberToWrite, size());
        if (numberToWrite > 0) {
            writeToInternal(out, sourceOffset, numberToWrite);
        }
    }

    public abstract void writeToInternal(OutputStream out, int sourceOffset, int numberToWrite) throws IOException;

    public abstract void writeToReverse(ByteOutput byteOutput) throws IOException;

    public static Output newOutput() {
        return new Output(128);
    }

    public static ByteString readFrom(InputStream streamToDrain, int chunkSize) throws IOException {
        return readFrom(streamToDrain, chunkSize, chunkSize);
    }

    @Deprecated
    public final void copyTo(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        checkRange(sourceOffset, sourceOffset + numberToCopy, size());
        checkRange(targetOffset, targetOffset + numberToCopy, target.length);
        if (numberToCopy > 0) {
            copyToInternal(target, sourceOffset, targetOffset, numberToCopy);
        }
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Byte> iterator2() {
        return new AbstractByteIterator() { // from class: com.google.protobuf.ByteString.1
            private final int limit;
            private int position = 0;

            {
                this.limit = ByteString.this.size();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.position < this.limit;
            }

            @Override // com.google.protobuf.ByteString.ByteIterator
            public byte nextByte() {
                int i7 = this.position;
                if (i7 >= this.limit) {
                    throw new NoSuchElementException();
                }
                this.position = i7 + 1;
                return ByteString.this.internalByteAt(i7);
            }
        };
    }

    public static ByteString copyFrom(byte[] bytes) {
        return copyFrom(bytes, 0, bytes.length);
    }

    public static ByteString readFrom(InputStream streamToDrain, int minChunkSize, int maxChunkSize) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString chunk = readChunk(streamToDrain, minChunkSize);
            if (chunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(chunk);
            minChunkSize = Math.min(minChunkSize * 2, maxChunkSize);
        }
    }

    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        public Output(int initialCapacity) {
            if (initialCapacity < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.initialCapacity = initialCapacity;
            this.flushedBuffers = new ArrayList<>();
            this.buffer = new byte[initialCapacity];
        }

        private void flushFullBuffer(int minSize) {
            this.flushedBuffers.add(new LiteralByteString(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(minSize, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i7 = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i7 >= bArr.length) {
                this.flushedBuffers.add(new LiteralByteString(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i7 > 0) {
                this.flushedBuffers.add(new LiteralByteString(Arrays.copyOf(bArr, i7)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        public synchronized void reset() {
            this.flushedBuffers.clear();
            this.flushedBuffersTotalBytes = 0;
            this.bufferPos = 0;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized ByteString toByteString() {
            flushLastBuffer();
            return ByteString.copyFrom(this.flushedBuffers);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int b7) {
            try {
                if (this.bufferPos == this.buffer.length) {
                    flushFullBuffer(1);
                }
                byte[] bArr = this.buffer;
                int i7 = this.bufferPos;
                this.bufferPos = i7 + 1;
                bArr[i7] = (byte) b7;
            } catch (Throwable th) {
                throw th;
            }
        }

        public void writeTo(OutputStream out) throws IOException {
            int i7;
            ByteString[] byteStringArr;
            byte[] bArr;
            int i10;
            synchronized (this) {
                byteStringArr = (ByteString[]) this.flushedBuffers.toArray(new ByteString[0]);
                bArr = this.buffer;
                i10 = this.bufferPos;
            }
            for (ByteString byteString : byteStringArr) {
                byteString.writeTo(out);
            }
            out.write(Arrays.copyOf(bArr, i10));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] b7, int offset, int length) {
            try {
                byte[] bArr = this.buffer;
                int length2 = bArr.length;
                int i7 = this.bufferPos;
                if (length <= length2 - i7) {
                    System.arraycopy(b7, offset, bArr, i7, length);
                    this.bufferPos += length;
                } else {
                    int length3 = bArr.length - i7;
                    System.arraycopy(b7, offset, bArr, i7, length3);
                    int i10 = length - length3;
                    flushFullBuffer(i10);
                    System.arraycopy(b7, offset + length3, this.buffer, 0, i10);
                    this.bufferPos = i10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ByteString copyFrom(ByteBuffer bytes, int size) {
        checkRange(0, size, bytes.remaining());
        byte[] bArr = new byte[size];
        bytes.get(bArr);
        return new LiteralByteString(bArr);
    }

    public static ByteString wrap(byte[] bytes) {
        return new LiteralByteString(bytes);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public static ByteString wrap(byte[] bytes, int offset, int length) {
        return new BoundedByteString(bytes, offset, length);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        String strTruncateAndEscapeForDisplay = truncateAndEscapeForDisplay();
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return G.r(sb2, strTruncateAndEscapeForDisplay, "\">");
    }

    public static ByteString copyFrom(ByteBuffer bytes) {
        return copyFrom(bytes, bytes.remaining());
    }

    public static ByteString copyFrom(String text, String charsetName) throws UnsupportedEncodingException {
        return new LiteralByteString(text.getBytes(charsetName));
    }

    public static ByteString copyFrom(String text, Charset charset) {
        return new LiteralByteString(text.getBytes(charset));
    }

    public static ByteString copyFrom(Iterable<ByteString> byteStrings) {
        int size;
        if (!(byteStrings instanceof Collection)) {
            Iterator<ByteString> it = byteStrings.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) byteStrings).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return balancedConcat(byteStrings.iterator(), size);
    }
}
