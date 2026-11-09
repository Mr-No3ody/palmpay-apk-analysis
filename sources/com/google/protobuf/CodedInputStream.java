package com.google.protobuf;

import C0.G;
import androidx.camera.camera2.internal.F;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    CodedInputStreamReader wrapper;

    public static final class ArrayDecoder extends CodedInputStream {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        private void recomputeBufferSizeAfterLimit() {
            int i7 = this.limit + this.bufferSizeAfterLimit;
            this.limit = i7;
            int i10 = i7 - this.startPos;
            int i11 = this.currentLimit;
            if (i10 <= i11) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i12 = i10 - i11;
            this.bufferSizeAfterLimit = i12;
            this.limit = i7 - i12;
        }

        private void skipRawVarint() throws IOException {
            if (this.limit - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i7 = 0; i7 < 10; i7++) {
                byte[] bArr = this.buffer;
                int i10 = this.pos;
                this.pos = i10 + 1;
                if (bArr[i10] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i7 = 0; i7 < 10; i7++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(final int value) throws InvalidProtocolBufferException {
            if (this.lastTag != value) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean enabled) {
            this.enableAliasing = enabled;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i7 = this.currentLimit;
            if (i7 == Integer.MAX_VALUE) {
                return -1;
            }
            return i7 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.pos - this.startPos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(final int oldLimit) {
            this.currentLimit = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int byteLimit) throws InvalidProtocolBufferException {
            if (byteLimit < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = byteLimit + getTotalBytesRead();
            if (totalBytesRead < 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            int i7 = this.currentLimit;
            if (totalBytesRead > i7) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i7;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i7 = this.limit;
                int i10 = this.pos;
                if (rawVarint32 <= i7 - i10) {
                    ByteBuffer byteBufferWrap = (this.immutable || !this.enableAliasing) ? ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i10, i10 + rawVarint32)) : ByteBuffer.wrap(this.buffer, i10, rawVarint32).slice();
                    this.pos += rawVarint32;
                    return byteBufferWrap;
                }
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i7 = this.limit;
                int i10 = this.pos;
                if (rawVarint32 <= i7 - i10) {
                    ByteString byteStringWrap = (this.immutable && this.enableAliasing) ? ByteString.wrap(this.buffer, i10, rawVarint32) : ByteString.copyFrom(this.buffer, i10, rawVarint32);
                    this.pos += rawVarint32;
                    return byteStringWrap;
                }
            }
            return rawVarint32 == 0 ? ByteString.EMPTY : ByteString.wrap(readRawBytes(rawVarint32));
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(final int fieldNumber, final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            int i7 = this.pos;
            if (i7 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i7 + 1;
            return bArr[i7];
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(final int length) throws IOException {
            if (length > 0) {
                int i7 = this.limit;
                int i10 = this.pos;
                if (length <= i7 - i10) {
                    int i11 = length + i10;
                    this.pos = i11;
                    return Arrays.copyOfRange(this.buffer, i10, i11);
                }
            }
            if (length > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (length == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            int i7 = this.pos;
            if (this.limit - i7 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i7 + 4;
            return ((bArr[i7 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i7] & UnsignedBytes.MAX_VALUE) | ((bArr[i7 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i7 + 2] & UnsignedBytes.MAX_VALUE) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            int i7 = this.pos;
            if (this.limit - i7 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i7 + 8;
            return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() throws IOException {
            int i7;
            int i10 = this.pos;
            int i11 = this.limit;
            if (i11 != i10) {
                byte[] bArr = this.buffer;
                int i12 = i10 + 1;
                byte b7 = bArr[i10];
                if (b7 >= 0) {
                    this.pos = i12;
                    return b7;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b7;
                    if (i14 < 0) {
                        i7 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << Ascii.SO) ^ i14;
                        if (i16 >= 0) {
                            i7 = i16 ^ 16256;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << Ascii.NAK);
                            if (i18 < 0) {
                                i7 = (-2080896) ^ i18;
                            } else {
                                i15 = i10 + 5;
                                byte b10 = bArr[i17];
                                int i19 = (i18 ^ (b10 << Ascii.FS)) ^ 266354560;
                                if (b10 < 0) {
                                    i17 = i10 + 6;
                                    if (bArr[i15] < 0) {
                                        i15 = i10 + 7;
                                        if (bArr[i17] < 0) {
                                            i17 = i10 + 8;
                                            if (bArr[i15] < 0) {
                                                i15 = i10 + 9;
                                                if (bArr[i17] < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i15] >= 0) {
                                                        i13 = i20;
                                                        i7 = i19;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i7 = i19;
                                }
                                i7 = i19;
                            }
                            i13 = i17;
                        }
                        i13 = i15;
                    }
                    this.pos = i13;
                    return i7;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
            long j6;
            long j10;
            long j11;
            int i7 = this.pos;
            int i10 = this.limit;
            if (i10 != i7) {
                byte[] bArr = this.buffer;
                int i11 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 >= 0) {
                    this.pos = i11;
                    return b7;
                }
                if (i10 - i11 >= 9) {
                    int i12 = i7 + 2;
                    int i13 = (bArr[i11] << 7) ^ b7;
                    if (i13 < 0) {
                        j6 = i13 ^ (-128);
                    } else {
                        int i14 = i7 + 3;
                        int i15 = (bArr[i12] << Ascii.SO) ^ i13;
                        if (i15 >= 0) {
                            j6 = i15 ^ 16256;
                            i12 = i14;
                        } else {
                            int i16 = i7 + 4;
                            int i17 = i15 ^ (bArr[i14] << Ascii.NAK);
                            if (i17 < 0) {
                                long j12 = (-2080896) ^ i17;
                                i12 = i16;
                                j6 = j12;
                            } else {
                                long j13 = i17;
                                i12 = i7 + 5;
                                long j14 = j13 ^ (((long) bArr[i16]) << 28);
                                if (j14 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    int i18 = i7 + 6;
                                    long j15 = j14 ^ (((long) bArr[i12]) << 35);
                                    if (j15 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        i12 = i7 + 7;
                                        j14 = j15 ^ (((long) bArr[i18]) << 42);
                                        if (j14 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            i18 = i7 + 8;
                                            j15 = j14 ^ (((long) bArr[i12]) << 49);
                                            if (j15 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                i12 = i7 + 9;
                                                long j16 = (j15 ^ (((long) bArr[i18]) << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    int i19 = i7 + 10;
                                                    if (bArr[i12] >= 0) {
                                                        i12 = i19;
                                                    }
                                                }
                                                j6 = j16;
                                            }
                                        }
                                    }
                                    j6 = j15 ^ j10;
                                    i12 = i18;
                                }
                                j6 = j14 ^ j11;
                            }
                        }
                    }
                    this.pos = i12;
                    return j6;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64SlowPath() throws IOException {
            long j6 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                byte rawByte = readRawByte();
                j6 |= ((long) (rawByte & Ascii.DEL)) << i7;
                if ((rawByte & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j6;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i7 = this.limit;
                int i10 = this.pos;
                if (rawVarint32 <= i7 - i10) {
                    String str = new String(this.buffer, i10, rawVarint32, Internal.UTF_8);
                    this.pos += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i7 = this.limit;
                int i10 = this.pos;
                if (rawVarint32 <= i7 - i10) {
                    String strDecodeUtf8 = Utf8.decodeUtf8(this.buffer, i10, rawVarint32);
                    this.pos += rawVarint32;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(final int fieldNumber, final MessageLite.Builder builder) throws IOException {
            readGroup(fieldNumber, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(final int tag) throws IOException {
            int tagWireType = WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(final int length) throws IOException {
            if (length >= 0) {
                int i7 = this.limit;
                int i10 = this.pos;
                if (length <= i7 - i10) {
                    this.pos = i10 + length;
                    return;
                }
            }
            if (length >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        private ArrayDecoder(final byte[] buffer, final int offset, final int len, boolean immutable) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = buffer;
            this.limit = len + offset;
            this.pos = offset;
            this.startPos = offset;
            this.immutable = immutable;
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(final int fieldNumber, final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(final int tag, final CodedOutputStream output) throws IOException {
            int tagWireType = WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                long int64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(tag), 4);
                checkLastTagWas(iMakeTag);
                output.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                output.writeUInt32NoTag(tag);
                output.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public static final class IterableDirectByteBufferDecoder extends CodedInputStream {
        private int bufferSizeAfterCurrentLimit;
        private long currentAddress;
        private ByteBuffer currentByteBuffer;
        private long currentByteBufferLimit;
        private long currentByteBufferPos;
        private long currentByteBufferStartPos;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private final Iterable<ByteBuffer> input;
        private final Iterator<ByteBuffer> iterator;
        private int lastTag;
        private int startOffset;
        private int totalBufferSize;
        private int totalBytesRead;

        private long currentRemaining() {
            return this.currentByteBufferLimit - this.currentByteBufferPos;
        }

        private void getNextByteBuffer() throws InvalidProtocolBufferException {
            if (!this.iterator.hasNext()) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            tryGetNextByteBuffer();
        }

        private void readRawBytesTo(byte[] bytes, int offset, final int length) throws IOException {
            if (length < 0 || length > remaining()) {
                if (length > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (length != 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i7 = length;
            while (i7 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(i7, (int) currentRemaining());
                long j6 = iMin;
                UnsafeUtil.copyMemory(this.currentByteBufferPos, bytes, (length - i7) + offset, j6);
                i7 -= iMin;
                this.currentByteBufferPos += j6;
            }
        }

        private void recomputeBufferSizeAfterLimit() {
            int i7 = this.totalBufferSize + this.bufferSizeAfterCurrentLimit;
            this.totalBufferSize = i7;
            int i10 = i7 - this.startOffset;
            int i11 = this.currentLimit;
            if (i10 <= i11) {
                this.bufferSizeAfterCurrentLimit = 0;
                return;
            }
            int i12 = i10 - i11;
            this.bufferSizeAfterCurrentLimit = i12;
            this.totalBufferSize = i7 - i12;
        }

        private int remaining() {
            return (int) ((((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos);
        }

        private void skipRawVarint() throws IOException {
            for (int i7 = 0; i7 < 10; i7++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer slice(int begin, int end) throws IOException {
            int iPosition = this.currentByteBuffer.position();
            int iLimit = this.currentByteBuffer.limit();
            ByteBuffer byteBuffer = this.currentByteBuffer;
            try {
                try {
                    byteBuffer.position(begin);
                    byteBuffer.limit(end);
                    ByteBuffer byteBufferSlice = this.currentByteBuffer.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } catch (Throwable th) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th;
            }
        }

        private void tryGetNextByteBuffer() {
            ByteBuffer next = this.iterator.next();
            this.currentByteBuffer = next;
            this.totalBytesRead += (int) (this.currentByteBufferPos - this.currentByteBufferStartPos);
            long jPosition = next.position();
            this.currentByteBufferPos = jPosition;
            this.currentByteBufferStartPos = jPosition;
            this.currentByteBufferLimit = this.currentByteBuffer.limit();
            long jAddressOffset = UnsafeUtil.addressOffset(this.currentByteBuffer);
            this.currentAddress = jAddressOffset;
            this.currentByteBufferPos += jAddressOffset;
            this.currentByteBufferStartPos += jAddressOffset;
            this.currentByteBufferLimit += jAddressOffset;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(final int value) throws InvalidProtocolBufferException {
            if (this.lastTag != value) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean enabled) {
            this.enableAliasing = enabled;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i7 = this.currentLimit;
            if (i7 == Integer.MAX_VALUE) {
                return -1;
            }
            return i7 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) ((((long) (this.totalBytesRead - this.startOffset)) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return (((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos == ((long) this.totalBufferSize);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(final int oldLimit) {
            this.currentLimit = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int byteLimit) throws InvalidProtocolBufferException {
            if (byteLimit < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = byteLimit + getTotalBytesRead();
            int i7 = this.currentLimit;
            if (totalBytesRead > i7) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i7;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j6 = rawVarint32;
                if (j6 <= currentRemaining()) {
                    if (this.immutable || !this.enableAliasing) {
                        byte[] bArr = new byte[rawVarint32];
                        UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j6);
                        this.currentByteBufferPos += j6;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j10 = this.currentByteBufferPos + j6;
                    this.currentByteBufferPos = j10;
                    long j11 = this.currentAddress;
                    return slice((int) ((j10 - j11) - j6), (int) (j10 - j11));
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return ByteBuffer.wrap(bArr2);
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j6 = rawVarint32;
                long j10 = this.currentByteBufferLimit;
                long j11 = this.currentByteBufferPos;
                if (j6 <= j10 - j11) {
                    if (this.immutable && this.enableAliasing) {
                        int i7 = (int) (j11 - this.currentAddress);
                        ByteString byteStringWrap = ByteString.wrap(slice(i7, rawVarint32 + i7));
                        this.currentByteBufferPos += j6;
                        return byteStringWrap;
                    }
                    byte[] bArr = new byte[rawVarint32];
                    UnsafeUtil.copyMemory(j11, bArr, 0L, j6);
                    this.currentByteBufferPos += j6;
                    return ByteString.wrap(bArr);
                }
            }
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (!this.immutable || !this.enableAliasing) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return ByteString.wrap(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (rawVarint32 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(rawVarint32, (int) currentRemaining());
                int i10 = (int) (this.currentByteBufferPos - this.currentAddress);
                arrayList.add(ByteString.wrap(slice(i10, i10 + iMin)));
                rawVarint32 -= iMin;
                this.currentByteBufferPos += (long) iMin;
            }
            return ByteString.copyFrom(arrayList);
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(final int fieldNumber, final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            long j6 = this.currentByteBufferPos;
            this.currentByteBufferPos = 1 + j6;
            return UnsafeUtil.getByte(j6);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(final int length) throws IOException {
            if (length >= 0) {
                long j6 = length;
                if (j6 <= currentRemaining()) {
                    byte[] bArr = new byte[length];
                    UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j6);
                    this.currentByteBufferPos += j6;
                    return bArr;
                }
            }
            if (length >= 0 && length <= remaining()) {
                byte[] bArr2 = new byte[length];
                readRawBytesTo(bArr2, 0, length);
                return bArr2;
            }
            if (length > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (length == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            if (currentRemaining() < 4) {
                return (readRawByte() & UnsignedBytes.MAX_VALUE) | ((readRawByte() & UnsignedBytes.MAX_VALUE) << 8) | ((readRawByte() & UnsignedBytes.MAX_VALUE) << 16) | ((readRawByte() & UnsignedBytes.MAX_VALUE) << 24);
            }
            long j6 = this.currentByteBufferPos;
            this.currentByteBufferPos = 4 + j6;
            return ((UnsafeUtil.getByte(j6 + 3) & UnsignedBytes.MAX_VALUE) << 24) | (UnsafeUtil.getByte(j6) & UnsignedBytes.MAX_VALUE) | ((UnsafeUtil.getByte(1 + j6) & UnsignedBytes.MAX_VALUE) << 8) | ((UnsafeUtil.getByte(2 + j6) & UnsignedBytes.MAX_VALUE) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            char c6;
            long rawByte;
            byte rawByte2;
            if (currentRemaining() >= 8) {
                long j6 = this.currentByteBufferPos;
                this.currentByteBufferPos = 8 + j6;
                c6 = '8';
                rawByte = (((long) UnsafeUtil.getByte(j6)) & 255) | ((((long) UnsafeUtil.getByte(1 + j6)) & 255) << 8) | ((((long) UnsafeUtil.getByte(2 + j6)) & 255) << 16) | ((((long) UnsafeUtil.getByte(3 + j6)) & 255) << 24) | ((((long) UnsafeUtil.getByte(4 + j6)) & 255) << 32) | ((((long) UnsafeUtil.getByte(5 + j6)) & 255) << 40) | ((((long) UnsafeUtil.getByte(6 + j6)) & 255) << 48);
                rawByte2 = UnsafeUtil.getByte(j6 + 7);
            } else {
                c6 = '8';
                rawByte = (((long) readRawByte()) & 255) | ((((long) readRawByte()) & 255) << 8) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48);
                rawByte2 = readRawByte();
            }
            return rawByte | ((((long) rawByte2) & 255) << c6);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() throws IOException {
            int i7;
            long j6 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j6) {
                long j10 = j6 + 1;
                byte b7 = UnsafeUtil.getByte(j6);
                if (b7 >= 0) {
                    this.currentByteBufferPos++;
                    return b7;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j11 = 2 + j6;
                    int i10 = (UnsafeUtil.getByte(j10) << 7) ^ b7;
                    if (i10 < 0) {
                        i7 = i10 ^ (-128);
                    } else {
                        long j12 = 3 + j6;
                        int i11 = (UnsafeUtil.getByte(j11) << Ascii.SO) ^ i10;
                        if (i11 >= 0) {
                            i7 = i11 ^ 16256;
                        } else {
                            long j13 = 4 + j6;
                            int i12 = i11 ^ (UnsafeUtil.getByte(j12) << Ascii.NAK);
                            if (i12 < 0) {
                                i7 = (-2080896) ^ i12;
                            } else {
                                j12 = 5 + j6;
                                byte b10 = UnsafeUtil.getByte(j13);
                                int i13 = (i12 ^ (b10 << Ascii.FS)) ^ 266354560;
                                if (b10 < 0) {
                                    j13 = 6 + j6;
                                    if (UnsafeUtil.getByte(j12) < 0) {
                                        j12 = 7 + j6;
                                        if (UnsafeUtil.getByte(j13) < 0) {
                                            j13 = 8 + j6;
                                            if (UnsafeUtil.getByte(j12) < 0) {
                                                j12 = 9 + j6;
                                                if (UnsafeUtil.getByte(j13) < 0) {
                                                    long j14 = j6 + 10;
                                                    if (UnsafeUtil.getByte(j12) >= 0) {
                                                        i7 = i13;
                                                        j11 = j14;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i7 = i13;
                                }
                                i7 = i13;
                            }
                            j11 = j13;
                        }
                        j11 = j12;
                    }
                    this.currentByteBufferPos = j11;
                    return i7;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
            long j6;
            long j10;
            long j11;
            long j12 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j12) {
                long j13 = j12 + 1;
                byte b7 = UnsafeUtil.getByte(j12);
                if (b7 >= 0) {
                    this.currentByteBufferPos++;
                    return b7;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j14 = 2 + j12;
                    int i7 = (UnsafeUtil.getByte(j13) << 7) ^ b7;
                    if (i7 < 0) {
                        j6 = i7 ^ (-128);
                    } else {
                        long j15 = 3 + j12;
                        int i10 = (UnsafeUtil.getByte(j14) << Ascii.SO) ^ i7;
                        if (i10 >= 0) {
                            j6 = i10 ^ 16256;
                            j14 = j15;
                        } else {
                            long j16 = 4 + j12;
                            int i11 = i10 ^ (UnsafeUtil.getByte(j15) << Ascii.NAK);
                            if (i11 < 0) {
                                j6 = (-2080896) ^ i11;
                                j14 = j16;
                            } else {
                                long j17 = 5 + j12;
                                long j18 = (((long) UnsafeUtil.getByte(j16)) << 28) ^ ((long) i11);
                                if (j18 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    long j19 = 6 + j12;
                                    long j20 = j18 ^ (((long) UnsafeUtil.getByte(j17)) << 35);
                                    if (j20 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        j17 = 7 + j12;
                                        j18 = j20 ^ (((long) UnsafeUtil.getByte(j19)) << 42);
                                        if (j18 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            j19 = 8 + j12;
                                            j20 = j18 ^ (((long) UnsafeUtil.getByte(j17)) << 49);
                                            if (j20 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                j17 = 9 + j12;
                                                long j21 = (j20 ^ (((long) UnsafeUtil.getByte(j19)) << 56)) ^ 71499008037633920L;
                                                if (j21 < 0) {
                                                    long j22 = j12 + 10;
                                                    if (UnsafeUtil.getByte(j17) >= 0) {
                                                        j14 = j22;
                                                        j6 = j21;
                                                    }
                                                } else {
                                                    j6 = j21;
                                                    j14 = j17;
                                                }
                                            }
                                        }
                                    }
                                    j6 = j10 ^ j20;
                                    j14 = j19;
                                }
                                j6 = j11 ^ j18;
                                j14 = j17;
                            }
                        }
                    }
                    this.currentByteBufferPos = j14;
                    return j6;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64SlowPath() throws IOException {
            long j6 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                byte rawByte = readRawByte();
                j6 |= ((long) (rawByte & Ascii.DEL)) << i7;
                if ((rawByte & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j6;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j6 = rawVarint32;
                long j10 = this.currentByteBufferLimit;
                long j11 = this.currentByteBufferPos;
                if (j6 <= j10 - j11) {
                    byte[] bArr = new byte[rawVarint32];
                    UnsafeUtil.copyMemory(j11, bArr, 0L, j6);
                    String str = new String(bArr, Internal.UTF_8);
                    this.currentByteBufferPos += j6;
                    return str;
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return new String(bArr2, Internal.UTF_8);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j6 = rawVarint32;
                long j10 = this.currentByteBufferLimit;
                long j11 = this.currentByteBufferPos;
                if (j6 <= j10 - j11) {
                    String strDecodeUtf8 = Utf8.decodeUtf8(this.currentByteBuffer, (int) (j11 - this.currentByteBufferStartPos), rawVarint32);
                    this.currentByteBufferPos += j6;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 >= 0 && rawVarint32 <= remaining()) {
                byte[] bArr = new byte[rawVarint32];
                readRawBytesTo(bArr, 0, rawVarint32);
                return Utf8.decodeUtf8(bArr, 0, rawVarint32);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(final int fieldNumber, final MessageLite.Builder builder) throws IOException {
            readGroup(fieldNumber, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startOffset = (int) ((((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(final int tag) throws IOException {
            int tagWireType = WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(final int length) throws IOException {
            if (length < 0 || length > (((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos) {
                if (length >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            while (length > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(length, (int) currentRemaining());
                length -= iMin;
                this.currentByteBufferPos += (long) iMin;
            }
        }

        private IterableDirectByteBufferDecoder(Iterable<ByteBuffer> inputBufs, int size, boolean immutableFlag) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.totalBufferSize = size;
            this.input = inputBufs;
            this.iterator = inputBufs.iterator();
            this.immutable = immutableFlag;
            this.totalBytesRead = 0;
            this.startOffset = 0;
            if (size != 0) {
                tryGetNextByteBuffer();
                return;
            }
            this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
            this.currentByteBufferPos = 0L;
            this.currentByteBufferStartPos = 0L;
            this.currentByteBufferLimit = 0L;
            this.currentAddress = 0L;
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(final int fieldNumber, final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(final int tag, final CodedOutputStream output) throws IOException {
            int tagWireType = WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                long int64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(tag), 4);
                checkLastTagWas(iMakeTag);
                output.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                output.writeUInt32NoTag(tag);
                output.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public static final class StreamDecoder extends CodedInputStream {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final InputStream input;
        private int lastTag;
        private int pos;
        private RefillCallback refillCallback;
        private int totalBytesRetired;

        public interface RefillCallback {
            void onRefill();
        }

        public class SkippedDataSink implements RefillCallback {
            private ByteArrayOutputStream byteArrayStream;
            private int lastPos;

            private SkippedDataSink() {
                this.lastPos = StreamDecoder.this.pos;
            }

            public ByteBuffer getSkippedData() {
                ByteArrayOutputStream byteArrayOutputStream = this.byteArrayStream;
                if (byteArrayOutputStream == null) {
                    return ByteBuffer.wrap(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
                }
                byteArrayOutputStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos);
                return ByteBuffer.wrap(this.byteArrayStream.toByteArray());
            }

            @Override // com.google.protobuf.CodedInputStream.StreamDecoder.RefillCallback
            public void onRefill() {
                if (this.byteArrayStream == null) {
                    this.byteArrayStream = new ByteArrayOutputStream();
                }
                this.byteArrayStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
                this.lastPos = 0;
            }
        }

        private static int available(InputStream input) throws IOException {
            try {
                return input.available();
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }

        private static int read(InputStream input, byte[] data, int offset, int length) throws IOException {
            try {
                return input.read(data, offset, length);
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }

        private ByteString readBytesSlowPath(final int size) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(size);
            if (rawBytesSlowPathOneChunk != null) {
                return ByteString.copyFrom(rawBytesSlowPathOneChunk);
            }
            int i7 = this.pos;
            int i10 = this.bufferSize;
            int length = i10 - i7;
            this.totalBytesRetired += i10;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(size - length);
            byte[] bArr = new byte[size];
            System.arraycopy(this.buffer, i7, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        private byte[] readRawBytesSlowPath(final int size, boolean ensureNoLeakedReferences) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(size);
            if (rawBytesSlowPathOneChunk != null) {
                return ensureNoLeakedReferences ? (byte[]) rawBytesSlowPathOneChunk.clone() : rawBytesSlowPathOneChunk;
            }
            int i7 = this.pos;
            int i10 = this.bufferSize;
            int length = i10 - i7;
            this.totalBytesRetired += i10;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(size - length);
            byte[] bArr = new byte[size];
            System.arraycopy(this.buffer, i7, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] readRawBytesSlowPathOneChunk(final int size) throws IOException {
            if (size == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            if (size < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i7 = this.totalBytesRetired;
            int i10 = this.pos;
            int i11 = i7 + i10 + size;
            if (i11 - this.sizeLimit > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i12 = this.currentLimit;
            if (i11 > i12) {
                skipRawBytes((i12 - i7) - i10);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i13 = this.bufferSize - i10;
            int i14 = size - i13;
            if (i14 >= 4096 && i14 > available(this.input)) {
                return null;
            }
            byte[] bArr = new byte[size];
            System.arraycopy(this.buffer, this.pos, bArr, 0, i13);
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            while (i13 < size) {
                int i15 = read(this.input, bArr, i13, size - i13);
                if (i15 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += i15;
                i13 += i15;
            }
            return bArr;
        }

        private List<byte[]> readRawBytesSlowPathRemainingChunks(int sizeLeft) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (sizeLeft > 0) {
                int iMin = Math.min(sizeLeft, 4096);
                byte[] bArr = new byte[iMin];
                int i7 = 0;
                while (i7 < iMin) {
                    int i10 = this.input.read(bArr, i7, iMin - i7);
                    if (i10 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.totalBytesRetired += i10;
                    i7 += i10;
                }
                sizeLeft -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i7 = this.bufferSize + this.bufferSizeAfterLimit;
            this.bufferSize = i7;
            int i10 = this.totalBytesRetired + i7;
            int i11 = this.currentLimit;
            if (i10 <= i11) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i12 = i10 - i11;
            this.bufferSizeAfterLimit = i12;
            this.bufferSize = i7 - i12;
        }

        private void refillBuffer(int n10) throws IOException {
            if (tryRefillBuffer(n10)) {
                return;
            }
            if (n10 <= (this.sizeLimit - this.totalBytesRetired) - this.pos) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        private static long skip(InputStream input, long length) throws IOException {
            try {
                return input.skip(length);
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }

        private void skipRawBytesSlowPath(final int size) throws IOException {
            if (size < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i7 = this.totalBytesRetired;
            int i10 = this.pos;
            int i11 = i7 + i10 + size;
            int i12 = this.currentLimit;
            if (i11 > i12) {
                skipRawBytes((i12 - i7) - i10);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i13 = 0;
            if (this.refillCallback == null) {
                this.totalBytesRetired = i7 + i10;
                int i14 = this.bufferSize - i10;
                this.bufferSize = 0;
                this.pos = 0;
                i13 = i14;
                while (i13 < size) {
                    try {
                        long j6 = size - i13;
                        long jSkip = skip(this.input, j6);
                        if (jSkip < 0 || jSkip > j6) {
                            throw new IllegalStateException(this.input.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i13 += (int) jSkip;
                        }
                    } catch (Throwable th) {
                        this.totalBytesRetired += i13;
                        recomputeBufferSizeAfterLimit();
                        throw th;
                    }
                }
                this.totalBytesRetired += i13;
                recomputeBufferSizeAfterLimit();
            }
            if (i13 >= size) {
                return;
            }
            int i15 = this.bufferSize;
            int i16 = i15 - this.pos;
            this.pos = i15;
            refillBuffer(1);
            while (true) {
                int i17 = size - i16;
                int i18 = this.bufferSize;
                if (i17 <= i18) {
                    this.pos = i17;
                    return;
                } else {
                    i16 += i18;
                    this.pos = i18;
                    refillBuffer(1);
                }
            }
        }

        private void skipRawVarint() throws IOException {
            if (this.bufferSize - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i7 = 0; i7 < 10; i7++) {
                byte[] bArr = this.buffer;
                int i10 = this.pos;
                this.pos = i10 + 1;
                if (bArr[i10] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i7 = 0; i7 < 10; i7++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private boolean tryRefillBuffer(int n10) throws IOException {
            int i7 = this.pos;
            if (i7 + n10 <= this.bufferSize) {
                throw new IllegalStateException(F.c(n10, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i10 = this.sizeLimit;
            int i11 = this.totalBytesRetired;
            if (n10 > (i10 - i11) - i7 || i11 + i7 + n10 > this.currentLimit) {
                return false;
            }
            RefillCallback refillCallback = this.refillCallback;
            if (refillCallback != null) {
                refillCallback.onRefill();
            }
            int i12 = this.pos;
            if (i12 > 0) {
                int i13 = this.bufferSize;
                if (i13 > i12) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i12, bArr, 0, i13 - i12);
                }
                this.totalBytesRetired += i12;
                this.bufferSize -= i12;
                this.pos = 0;
            }
            InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i14 = this.bufferSize;
            int i15 = read(inputStream, bArr2, i14, Math.min(bArr2.length - i14, (this.sizeLimit - this.totalBytesRetired) - i14));
            if (i15 == 0 || i15 < -1 || i15 > this.buffer.length) {
                throw new IllegalStateException(this.input.getClass() + "#read(byte[]) returned invalid result: " + i15 + "\nThe InputStream implementation is buggy.");
            }
            if (i15 <= 0) {
                return false;
            }
            this.bufferSize += i15;
            recomputeBufferSizeAfterLimit();
            if (this.bufferSize >= n10) {
                return true;
            }
            return tryRefillBuffer(n10);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(final int value) throws InvalidProtocolBufferException {
            if (this.lastTag != value) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean enabled) {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i7 = this.currentLimit;
            if (i7 == Integer.MAX_VALUE) {
                return -1;
            }
            return i7 - (this.totalBytesRetired + this.pos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.totalBytesRetired + this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return this.pos == this.bufferSize && !tryRefillBuffer(1);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(final int oldLimit) {
            this.currentLimit = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int byteLimit) throws InvalidProtocolBufferException {
            if (byteLimit < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i7 = this.totalBytesRetired + this.pos + byteLimit;
            int i10 = this.currentLimit;
            if (i7 > i10) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = i7;
            recomputeBufferSizeAfterLimit();
            return i10;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i7 = this.bufferSize;
            int i10 = this.pos;
            if (rawVarint32 > i7 - i10 || rawVarint32 <= 0) {
                if (rawVarint32 >= 0) {
                    return readRawBytesSlowPath(rawVarint32, false);
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.buffer, i10, i10 + rawVarint32);
            this.pos += rawVarint32;
            return bArrCopyOfRange;
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i7 = this.bufferSize;
            int i10 = this.pos;
            if (rawVarint32 <= i7 - i10 && rawVarint32 > 0) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i10, i10 + rawVarint32));
                this.pos += rawVarint32;
                return byteBufferWrap;
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 >= 0) {
                return ByteBuffer.wrap(readRawBytesSlowPath(rawVarint32, true));
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i7 = this.bufferSize;
            int i10 = this.pos;
            if (rawVarint32 <= i7 - i10 && rawVarint32 > 0) {
                ByteString byteStringCopyFrom = ByteString.copyFrom(this.buffer, i10, rawVarint32);
                this.pos += rawVarint32;
                return byteStringCopyFrom;
            }
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (rawVarint32 >= 0) {
                return readBytesSlowPath(rawVarint32);
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(final int fieldNumber, final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            if (this.pos == this.bufferSize) {
                refillBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i7 = this.pos;
            this.pos = i7 + 1;
            return bArr[i7];
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(final int size) throws IOException {
            int i7 = this.pos;
            if (size > this.bufferSize - i7 || size <= 0) {
                return readRawBytesSlowPath(size, false);
            }
            int i10 = size + i7;
            this.pos = i10;
            return Arrays.copyOfRange(this.buffer, i7, i10);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            int i7 = this.pos;
            if (this.bufferSize - i7 < 4) {
                refillBuffer(4);
                i7 = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i7 + 4;
            return ((bArr[i7 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i7] & UnsignedBytes.MAX_VALUE) | ((bArr[i7 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i7 + 2] & UnsignedBytes.MAX_VALUE) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            int i7 = this.pos;
            if (this.bufferSize - i7 < 8) {
                refillBuffer(8);
                i7 = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i7 + 8;
            return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() throws IOException {
            int i7;
            int i10 = this.pos;
            int i11 = this.bufferSize;
            if (i11 != i10) {
                byte[] bArr = this.buffer;
                int i12 = i10 + 1;
                byte b7 = bArr[i10];
                if (b7 >= 0) {
                    this.pos = i12;
                    return b7;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b7;
                    if (i14 < 0) {
                        i7 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << Ascii.SO) ^ i14;
                        if (i16 >= 0) {
                            i7 = i16 ^ 16256;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << Ascii.NAK);
                            if (i18 < 0) {
                                i7 = (-2080896) ^ i18;
                            } else {
                                i15 = i10 + 5;
                                byte b10 = bArr[i17];
                                int i19 = (i18 ^ (b10 << Ascii.FS)) ^ 266354560;
                                if (b10 < 0) {
                                    i17 = i10 + 6;
                                    if (bArr[i15] < 0) {
                                        i15 = i10 + 7;
                                        if (bArr[i17] < 0) {
                                            i17 = i10 + 8;
                                            if (bArr[i15] < 0) {
                                                i15 = i10 + 9;
                                                if (bArr[i17] < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i15] >= 0) {
                                                        i13 = i20;
                                                        i7 = i19;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i7 = i19;
                                }
                                i7 = i19;
                            }
                            i13 = i17;
                        }
                        i13 = i15;
                    }
                    this.pos = i13;
                    return i7;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
            long j6;
            long j10;
            long j11;
            int i7 = this.pos;
            int i10 = this.bufferSize;
            if (i10 != i7) {
                byte[] bArr = this.buffer;
                int i11 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 >= 0) {
                    this.pos = i11;
                    return b7;
                }
                if (i10 - i11 >= 9) {
                    int i12 = i7 + 2;
                    int i13 = (bArr[i11] << 7) ^ b7;
                    if (i13 < 0) {
                        j6 = i13 ^ (-128);
                    } else {
                        int i14 = i7 + 3;
                        int i15 = (bArr[i12] << Ascii.SO) ^ i13;
                        if (i15 >= 0) {
                            j6 = i15 ^ 16256;
                            i12 = i14;
                        } else {
                            int i16 = i7 + 4;
                            int i17 = i15 ^ (bArr[i14] << Ascii.NAK);
                            if (i17 < 0) {
                                long j12 = (-2080896) ^ i17;
                                i12 = i16;
                                j6 = j12;
                            } else {
                                long j13 = i17;
                                i12 = i7 + 5;
                                long j14 = j13 ^ (((long) bArr[i16]) << 28);
                                if (j14 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    int i18 = i7 + 6;
                                    long j15 = j14 ^ (((long) bArr[i12]) << 35);
                                    if (j15 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        i12 = i7 + 7;
                                        j14 = j15 ^ (((long) bArr[i18]) << 42);
                                        if (j14 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            i18 = i7 + 8;
                                            j15 = j14 ^ (((long) bArr[i12]) << 49);
                                            if (j15 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                i12 = i7 + 9;
                                                long j16 = (j15 ^ (((long) bArr[i18]) << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    int i19 = i7 + 10;
                                                    if (bArr[i12] >= 0) {
                                                        i12 = i19;
                                                    }
                                                }
                                                j6 = j16;
                                            }
                                        }
                                    }
                                    j6 = j15 ^ j10;
                                    i12 = i18;
                                }
                                j6 = j14 ^ j11;
                            }
                        }
                    }
                    this.pos = i12;
                    return j6;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64SlowPath() throws IOException {
            long j6 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                byte rawByte = readRawByte();
                j6 |= ((long) (rawByte & Ascii.DEL)) << i7;
                if ((rawByte & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j6;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i7 = this.bufferSize;
                int i10 = this.pos;
                if (rawVarint32 <= i7 - i10) {
                    String str = new String(this.buffer, i10, rawVarint32, Internal.UTF_8);
                    this.pos += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (rawVarint32 > this.bufferSize) {
                return new String(readRawBytesSlowPath(rawVarint32, false), Internal.UTF_8);
            }
            refillBuffer(rawVarint32);
            String str2 = new String(this.buffer, this.pos, rawVarint32, Internal.UTF_8);
            this.pos += rawVarint32;
            return str2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            byte[] rawBytesSlowPath;
            int rawVarint32 = readRawVarint32();
            int i7 = this.pos;
            int i10 = this.bufferSize;
            if (rawVarint32 <= i10 - i7 && rawVarint32 > 0) {
                rawBytesSlowPath = this.buffer;
                this.pos = i7 + rawVarint32;
            } else {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                i7 = 0;
                if (rawVarint32 <= i10) {
                    refillBuffer(rawVarint32);
                    rawBytesSlowPath = this.buffer;
                    this.pos = rawVarint32;
                } else {
                    rawBytesSlowPath = readRawBytesSlowPath(rawVarint32, false);
                }
            }
            return Utf8.decodeUtf8(rawBytesSlowPath, i7, rawVarint32);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(final int fieldNumber, final MessageLite.Builder builder) throws IOException {
            readGroup(fieldNumber, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.totalBytesRetired = -this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(final int tag) throws IOException {
            int tagWireType = WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(final int size) throws IOException {
            int i7 = this.bufferSize;
            int i10 = this.pos;
            if (size > i7 - i10 || size < 0) {
                skipRawBytesSlowPath(size);
            } else {
                this.pos = i10 + size;
            }
        }

        private StreamDecoder(final InputStream input, int bufferSize) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.refillCallback = null;
            Internal.checkNotNull(input, "input");
            this.input = input;
            this.buffer = new byte[bufferSize];
            this.bufferSize = 0;
            this.pos = 0;
            this.totalBytesRetired = 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(final int fieldNumber, final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(final int tag, final CodedOutputStream output) throws IOException {
            int tagWireType = WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                long int64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(tag), 4);
                checkLastTagWas(iMakeTag);
                output.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                output.writeUInt32NoTag(tag);
                output.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public static final class UnsafeDirectNioDecoder extends CodedInputStream {
        private final long address;
        private final ByteBuffer buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private long limit;
        private long pos;
        private long startPos;

        private int bufferPos(long pos) {
            return (int) (pos - this.address);
        }

        public static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void recomputeBufferSizeAfterLimit() {
            long j6 = this.limit + ((long) this.bufferSizeAfterLimit);
            this.limit = j6;
            int i7 = (int) (j6 - this.startPos);
            int i10 = this.currentLimit;
            if (i7 <= i10) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i11 = i7 - i10;
            this.bufferSizeAfterLimit = i11;
            this.limit = j6 - ((long) i11);
        }

        private int remaining() {
            return (int) (this.limit - this.pos);
        }

        private void skipRawVarint() throws IOException {
            if (remaining() >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i7 = 0; i7 < 10; i7++) {
                long j6 = this.pos;
                this.pos = 1 + j6;
                if (UnsafeUtil.getByte(j6) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i7 = 0; i7 < 10; i7++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer slice(long begin, long end) throws IOException {
            int iPosition = this.buffer.position();
            int iLimit = this.buffer.limit();
            ByteBuffer byteBuffer = this.buffer;
            try {
                try {
                    byteBuffer.position(bufferPos(begin));
                    byteBuffer.limit(bufferPos(end));
                    ByteBuffer byteBufferSlice = this.buffer.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException e10) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionTruncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                    invalidProtocolBufferExceptionTruncatedMessage.initCause(e10);
                    throw invalidProtocolBufferExceptionTruncatedMessage;
                }
            } catch (Throwable th) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(final int value) throws InvalidProtocolBufferException {
            if (this.lastTag != value) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean enabled) {
            this.enableAliasing = enabled;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i7 = this.currentLimit;
            if (i7 == Integer.MAX_VALUE) {
                return -1;
            }
            return i7 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (this.pos - this.startPos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(final int oldLimit) {
            this.currentLimit = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int byteLimit) throws InvalidProtocolBufferException {
            if (byteLimit < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = byteLimit + getTotalBytesRead();
            int i7 = this.currentLimit;
            if (totalBytesRead > i7) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i7;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return Internal.EMPTY_BYTE_BUFFER;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable || !this.enableAliasing) {
                byte[] bArr = new byte[rawVarint32];
                long j6 = rawVarint32;
                UnsafeUtil.copyMemory(this.pos, bArr, 0L, j6);
                this.pos += j6;
                return ByteBuffer.wrap(bArr);
            }
            long j10 = this.pos;
            long j11 = rawVarint32;
            ByteBuffer byteBufferSlice = slice(j10, j10 + j11);
            this.pos += j11;
            return byteBufferSlice;
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable && this.enableAliasing) {
                long j6 = this.pos;
                long j10 = rawVarint32;
                ByteBuffer byteBufferSlice = slice(j6, j6 + j10);
                this.pos += j10;
                return ByteString.wrap(byteBufferSlice);
            }
            byte[] bArr = new byte[rawVarint32];
            long j11 = rawVarint32;
            UnsafeUtil.copyMemory(this.pos, bArr, 0L, j11);
            this.pos += j11;
            return ByteString.wrap(bArr);
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(final int fieldNumber, final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            long j6 = this.pos;
            if (j6 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 1 + j6;
            return UnsafeUtil.getByte(j6);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(final int length) throws IOException {
            if (length < 0 || length > remaining()) {
                if (length > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (length == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArr = new byte[length];
            long j6 = this.pos;
            long j10 = length;
            slice(j6, j6 + j10).get(bArr);
            this.pos += j10;
            return bArr;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            long j6 = this.pos;
            if (this.limit - j6 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 4 + j6;
            return ((UnsafeUtil.getByte(j6 + 3) & UnsignedBytes.MAX_VALUE) << 24) | (UnsafeUtil.getByte(j6) & UnsignedBytes.MAX_VALUE) | ((UnsafeUtil.getByte(1 + j6) & UnsignedBytes.MAX_VALUE) << 8) | ((UnsafeUtil.getByte(2 + j6) & UnsignedBytes.MAX_VALUE) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            long j6 = this.pos;
            if (this.limit - j6 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 8 + j6;
            return ((((long) UnsafeUtil.getByte(j6 + 7)) & 255) << 56) | (((long) UnsafeUtil.getByte(j6)) & 255) | ((((long) UnsafeUtil.getByte(1 + j6)) & 255) << 8) | ((((long) UnsafeUtil.getByte(2 + j6)) & 255) << 16) | ((((long) UnsafeUtil.getByte(3 + j6)) & 255) << 24) | ((((long) UnsafeUtil.getByte(4 + j6)) & 255) << 32) | ((((long) UnsafeUtil.getByte(5 + j6)) & 255) << 40) | ((((long) UnsafeUtil.getByte(6 + j6)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r3) < 0) goto L34;
         */
        @Override // com.google.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int readRawVarint32() throws java.io.IOException {
            /*
                r9 = this;
                long r0 = r9.pos
                long r2 = r9.limit
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.google.protobuf.UnsafeUtil.getByte(r0)
                if (r4 < 0) goto L16
                r9.pos = r2
                return r4
            L16:
                long r5 = r9.limit
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.google.protobuf.UnsafeUtil.getByte(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.UnsafeUtil.getByte(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.UnsafeUtil.getByte(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.UnsafeUtil.getByte(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.UnsafeUtil.getByte(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.UnsafeUtil.getByte(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.UnsafeUtil.getByte(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = com.google.protobuf.UnsafeUtil.getByte(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.pos = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.readRawVarint32():int");
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
            long j6;
            long j10;
            long j11;
            int i7;
            long j12 = this.pos;
            if (this.limit != j12) {
                long j13 = 1 + j12;
                byte b7 = UnsafeUtil.getByte(j12);
                if (b7 >= 0) {
                    this.pos = j13;
                    return b7;
                }
                if (this.limit - j13 >= 9) {
                    long j14 = 2 + j12;
                    int i10 = (UnsafeUtil.getByte(j13) << 7) ^ b7;
                    if (i10 >= 0) {
                        long j15 = 3 + j12;
                        int i11 = i10 ^ (UnsafeUtil.getByte(j14) << Ascii.SO);
                        if (i11 >= 0) {
                            j6 = i11 ^ 16256;
                            j14 = j15;
                        } else {
                            j14 = 4 + j12;
                            int i12 = i11 ^ (UnsafeUtil.getByte(j15) << Ascii.NAK);
                            if (i12 < 0) {
                                i7 = (-2080896) ^ i12;
                            } else {
                                long j16 = 5 + j12;
                                long j17 = ((long) i12) ^ (((long) UnsafeUtil.getByte(j14)) << 28);
                                if (j17 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    long j18 = 6 + j12;
                                    long j19 = j17 ^ (((long) UnsafeUtil.getByte(j16)) << 35);
                                    if (j19 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        j16 = 7 + j12;
                                        j17 = j19 ^ (((long) UnsafeUtil.getByte(j18)) << 42);
                                        if (j17 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            j18 = 8 + j12;
                                            j19 = j17 ^ (((long) UnsafeUtil.getByte(j16)) << 49);
                                            if (j19 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                long j20 = j12 + 9;
                                                long j21 = (j19 ^ (((long) UnsafeUtil.getByte(j18)) << 56)) ^ 71499008037633920L;
                                                if (j21 < 0) {
                                                    long j22 = j12 + 10;
                                                    if (UnsafeUtil.getByte(j20) >= 0) {
                                                        j14 = j22;
                                                        j6 = j21;
                                                    }
                                                } else {
                                                    j6 = j21;
                                                    j14 = j20;
                                                }
                                            }
                                        }
                                    }
                                    j6 = j10 ^ j19;
                                    j14 = j18;
                                }
                                j6 = j11 ^ j17;
                                j14 = j16;
                            }
                        }
                        this.pos = j14;
                        return j6;
                    }
                    i7 = i10 ^ (-128);
                    j6 = i7;
                    this.pos = j14;
                    return j6;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64SlowPath() throws IOException {
            long j6 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                byte rawByte = readRawByte();
                j6 |= ((long) (rawByte & Ascii.DEL)) << i7;
                if ((rawByte & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j6;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[rawVarint32];
            long j6 = rawVarint32;
            UnsafeUtil.copyMemory(this.pos, bArr, 0L, j6);
            String str = new String(bArr, Internal.UTF_8);
            this.pos += j6;
            return str;
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                String strDecodeUtf8 = Utf8.decodeUtf8(this.buffer, bufferPos(this.pos), rawVarint32);
                this.pos += (long) rawVarint32;
                return strDecodeUtf8;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(final int fieldNumber, final MessageLite.Builder builder) throws IOException {
            readGroup(fieldNumber, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(final int tag) throws IOException {
            int tagWireType = WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(final int length) throws IOException {
            if (length >= 0 && length <= remaining()) {
                this.pos += (long) length;
            } else {
                if (length >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        private UnsafeDirectNioDecoder(ByteBuffer buffer, boolean immutable) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = buffer;
            long jAddressOffset = UnsafeUtil.addressOffset(buffer);
            this.address = jAddressOffset;
            this.limit = ((long) buffer.limit()) + jAddressOffset;
            long jPosition = jAddressOffset + ((long) buffer.position());
            this.pos = jPosition;
            this.startPos = jPosition;
            this.immutable = immutable;
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(final int fieldNumber, final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(final int tag, final CodedOutputStream output) throws IOException {
            int tagWireType = WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                long int64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(tag), 4);
                checkLastTagWas(iMakeTag);
                output.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                output.writeUInt32NoTag(tag);
                output.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public static int decodeZigZag32(final int n10) {
        return (-(n10 & 1)) ^ (n10 >>> 1);
    }

    public static long decodeZigZag64(final long n10) {
        return (-(n10 & 1)) ^ (n10 >>> 1);
    }

    public static CodedInputStream newInstance(final InputStream input) {
        return newInstance(input, 4096);
    }

    public static int readRawVarint32(final int firstByte, final InputStream input) throws IOException {
        if ((firstByte & 128) == 0) {
            return firstByte;
        }
        int i7 = firstByte & 127;
        int i10 = 7;
        while (i10 < 32) {
            int i11 = input.read();
            if (i11 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i7 |= (i11 & 127) << i10;
            if ((i11 & 128) == 0) {
                return i7;
            }
            i10 += 7;
        }
        while (i10 < 64) {
            int i12 = input.read();
            if (i12 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i12 & 128) == 0) {
                return i7;
            }
            i10 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public abstract void checkLastTagWas(final int value) throws InvalidProtocolBufferException;

    public void checkRecursionLimit() throws InvalidProtocolBufferException {
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    public final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean enabled);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(final int oldLimit);

    public abstract int pushLimit(int byteLimit) throws InvalidProtocolBufferException;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract ByteString readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends MessageLite> T readGroup(final int fieldNumber, final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException;

    public abstract void readGroup(final int fieldNumber, final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends MessageLite> T readMessage(final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException;

    public abstract void readMessage(final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(final int size) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    public abstract long readRawVarint64SlowPath() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(final int fieldNumber, final MessageLite.Builder builder) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(final int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException(G.m(limit, "Recursion limit cannot be negative: "));
        }
        int i7 = this.recursionLimit;
        this.recursionLimit = limit;
        return i7;
    }

    public final int setSizeLimit(final int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException(G.m(limit, "Size limit cannot be negative: "));
        }
        int i7 = this.sizeLimit;
        this.sizeLimit = limit;
        return i7;
    }

    public final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public abstract boolean skipField(final int tag) throws IOException;

    @Deprecated
    public abstract boolean skipField(final int tag, final CodedOutputStream output) throws IOException;

    public void skipMessage() throws IOException {
        boolean zSkipField;
        do {
            int tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            zSkipField = skipField(tag);
            this.recursionDepth--;
        } while (zSkipField);
    }

    public abstract void skipRawBytes(final int size) throws IOException;

    public final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }

    private CodedInputStream() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public static CodedInputStream newInstance(final InputStream input, int bufferSize) {
        if (bufferSize > 0) {
            return input == null ? newInstance(Internal.EMPTY_BYTE_ARRAY) : new StreamDecoder(input, bufferSize);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static CodedInputStream newInstance(final Iterable<ByteBuffer> input) {
        if (!UnsafeDirectNioDecoder.isSupported()) {
            return newInstance(new IterableByteBufferInputStream(input));
        }
        return newInstance(input, false);
    }

    public static int readRawVarint32(final InputStream input) throws IOException {
        int i7 = input.read();
        if (i7 != -1) {
            return readRawVarint32(i7, input);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public void skipMessage(CodedOutputStream output) throws IOException {
        boolean zSkipField;
        do {
            int tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            zSkipField = skipField(tag, output);
            this.recursionDepth--;
        } while (zSkipField);
    }

    public static CodedInputStream newInstance(final Iterable<ByteBuffer> bufs, final boolean bufferIsImmutable) {
        int i7 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : bufs) {
            iRemaining += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i7 |= 1;
            } else {
                i7 = byteBuffer.isDirect() ? i7 | 2 : i7 | 4;
            }
        }
        if (i7 == 2) {
            return new IterableDirectByteBufferDecoder(bufs, iRemaining, bufferIsImmutable);
        }
        return newInstance(new IterableByteBufferInputStream(bufs));
    }

    public static CodedInputStream newInstance(final byte[] buf) {
        return newInstance(buf, 0, buf.length);
    }

    public static CodedInputStream newInstance(final byte[] buf, final int off, final int len) {
        return newInstance(buf, off, len, false);
    }

    public static CodedInputStream newInstance(final byte[] buf, final int off, final int len, final boolean bufferIsImmutable) {
        ArrayDecoder arrayDecoder = new ArrayDecoder(buf, off, len, bufferIsImmutable);
        try {
            arrayDecoder.pushLimit(len);
            return arrayDecoder;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static CodedInputStream newInstance(ByteBuffer buf) {
        return newInstance(buf, false);
    }

    public static CodedInputStream newInstance(ByteBuffer buf, boolean bufferIsImmutable) {
        if (buf.hasArray()) {
            return newInstance(buf.array(), buf.position() + buf.arrayOffset(), buf.remaining(), bufferIsImmutable);
        }
        if (buf.isDirect() && UnsafeDirectNioDecoder.isSupported()) {
            return new UnsafeDirectNioDecoder(buf, bufferIsImmutable);
        }
        int iRemaining = buf.remaining();
        byte[] bArr = new byte[iRemaining];
        buf.duplicate().get(bArr);
        return newInstance(bArr, 0, iRemaining, true);
    }
}
