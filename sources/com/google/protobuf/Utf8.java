package com.google.protobuf;

import androidx.camera.video.u;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    public static class DecodeUtil {
        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte byte1, byte byte2, byte byte3, byte byte4, char[] resultArr, int resultPos) throws InvalidProtocolBufferException {
            if (!isNotTrailingByte(byte2)) {
                if ((((byte2 + 112) + (byte1 << Ascii.FS)) >> 30) == 0 && !isNotTrailingByte(byte3) && !isNotTrailingByte(byte4)) {
                    int iTrailingByteValue = ((byte1 & 7) << 18) | (trailingByteValue(byte2) << 12) | (trailingByteValue(byte3) << 6) | trailingByteValue(byte4);
                    resultArr[resultPos] = highSurrogate(iTrailingByteValue);
                    resultArr[resultPos + 1] = lowSurrogate(iTrailingByteValue);
                    return;
                }
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte byte1, char[] resultArr, int resultPos) {
            resultArr[resultPos] = (char) byte1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte byte1, byte byte2, byte byte3, char[] resultArr, int resultPos) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(byte2) || ((byte1 == -32 && byte2 < -96) || ((byte1 == -19 && byte2 >= -96) || isNotTrailingByte(byte3)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            resultArr[resultPos] = (char) (((byte1 & Ascii.SI) << 12) | (trailingByteValue(byte2) << 6) | trailingByteValue(byte3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte byte1, byte byte2, char[] resultArr, int resultPos) throws InvalidProtocolBufferException {
            if (byte1 < -62 || isNotTrailingByte(byte2)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            resultArr[resultPos] = (char) (((byte1 & Ascii.US) << 6) | trailingByteValue(byte2));
        }

        private static char highSurrogate(int codePoint) {
            return (char) ((codePoint >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b7) {
            return b7 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b7) {
            return b7 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b7) {
            return b7 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b7) {
            return b7 < -32;
        }

        private static char lowSurrogate(int codePoint) {
            return (char) ((codePoint & 1023) + 56320);
        }

        private static int trailingByteValue(byte b7) {
            return b7 & 63;
        }
    }

    public static abstract class Processor {
        public final String decodeUtf8(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            if (buffer.hasArray()) {
                return decodeUtf8(buffer.array(), buffer.arrayOffset() + index, size);
            }
            return buffer.isDirect() ? decodeUtf8Direct(buffer, index, size) : decodeUtf8Default(buffer, index, size);
        }

        public abstract String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException;

        public final String decodeUtf8Default(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            if ((index | size | ((buffer.limit() - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(buffer.limit()), Integer.valueOf(index), Integer.valueOf(size)));
            }
            int i7 = index + size;
            char[] cArr = new char[size];
            int i10 = 0;
            while (index < i7) {
                byte b7 = buffer.get(index);
                if (!DecodeUtil.isOneByte(b7)) {
                    break;
                }
                index++;
                DecodeUtil.handleOneByte(b7, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (index < i7) {
                int i12 = index + 1;
                byte b10 = buffer.get(index);
                if (DecodeUtil.isOneByte(b10)) {
                    int i13 = i11 + 1;
                    DecodeUtil.handleOneByte(b10, cArr, i11);
                    int i14 = i12;
                    while (i14 < i7) {
                        byte b11 = buffer.get(i14);
                        if (!DecodeUtil.isOneByte(b11)) {
                            break;
                        }
                        i14++;
                        DecodeUtil.handleOneByte(b11, cArr, i13);
                        i13++;
                    }
                    i11 = i13;
                    index = i14;
                } else if (DecodeUtil.isTwoBytes(b10)) {
                    if (i12 >= i7) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    index += 2;
                    DecodeUtil.handleTwoBytes(b10, buffer.get(i12), cArr, i11);
                    i11++;
                } else if (DecodeUtil.isThreeBytes(b10)) {
                    if (i12 >= i7 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i15 = index + 2;
                    index += 3;
                    DecodeUtil.handleThreeBytes(b10, buffer.get(i12), buffer.get(i15), cArr, i11);
                    i11++;
                } else {
                    if (i12 >= i7 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b12 = buffer.get(i12);
                    int i16 = index + 3;
                    byte b13 = buffer.get(index + 2);
                    index += 4;
                    DecodeUtil.handleFourBytes(b10, b12, b13, buffer.get(i16), cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }

        public abstract String decodeUtf8Direct(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException;

        public abstract int encodeUtf8(CharSequence in, byte[] out, int offset, int length);

        public final void encodeUtf8(CharSequence in, ByteBuffer out) {
            if (out.hasArray()) {
                int iArrayOffset = out.arrayOffset();
                Java8Compatibility.position(out, Utf8.encode(in, out.array(), out.position() + iArrayOffset, out.remaining()) - iArrayOffset);
            } else if (out.isDirect()) {
                encodeUtf8Direct(in, out);
            } else {
                encodeUtf8Default(in, out);
            }
        }

        public final void encodeUtf8Default(CharSequence in, ByteBuffer out) {
            int length = in.length();
            int iPosition = out.position();
            int i7 = 0;
            while (i7 < length) {
                try {
                    char cCharAt = in.charAt(i7);
                    if (cCharAt >= 128) {
                        break;
                    }
                    out.put(iPosition + i7, (byte) cCharAt);
                    i7++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i7 == length) {
                Java8Compatibility.position(out, iPosition + i7);
                return;
            }
            iPosition += i7;
            while (i7 < length) {
                char cCharAt2 = in.charAt(i7);
                if (cCharAt2 < 128) {
                    out.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i10 = iPosition + 1;
                    try {
                        out.put(iPosition, (byte) ((cCharAt2 >>> 6) | JfifUtil.MARKER_SOFn));
                        out.put(i10, (byte) ((cCharAt2 & '?') | 128));
                        iPosition = i10;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i10;
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i11 = i7 + 1;
                        if (i11 != length) {
                            try {
                                char cCharAt3 = in.charAt(i11);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i12 = iPosition + 1;
                                    try {
                                        out.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        int i13 = iPosition + 2;
                                        try {
                                            out.put(i12, (byte) (((codePoint >>> 12) & 63) | 128));
                                            iPosition += 3;
                                            out.put(i13, (byte) (((codePoint >>> 6) & 63) | 128));
                                            out.put(iPosition, (byte) ((codePoint & 63) | 128));
                                            i7 = i11;
                                        } catch (IndexOutOfBoundsException unused3) {
                                            i7 = i11;
                                            iPosition = i13;
                                        }
                                    } catch (IndexOutOfBoundsException unused4) {
                                        iPosition = i12;
                                        i7 = i11;
                                    }
                                } else {
                                    i7 = i11;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                            i7 = i11;
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(i7) + " at index " + (Math.max(i7, (iPosition - out.position()) + 1) + out.position()));
                        }
                        throw new UnpairedSurrogateException(i7, length);
                    }
                    int i14 = iPosition + 1;
                    out.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    out.put(i14, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    out.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
                }
                i7++;
                iPosition++;
            }
            Java8Compatibility.position(out, iPosition);
        }

        public abstract void encodeUtf8Direct(CharSequence in, ByteBuffer out);

        public final boolean isValidUtf8(byte[] bytes, int index, int limit) {
            return partialIsValidUtf8(0, bytes, index, limit) == 0;
        }

        public final int partialIsValidUtf8(final int state, final ByteBuffer buffer, int index, final int limit) {
            if (!buffer.hasArray()) {
                return buffer.isDirect() ? partialIsValidUtf8Direct(state, buffer, index, limit) : partialIsValidUtf8Default(state, buffer, index, limit);
            }
            int iArrayOffset = buffer.arrayOffset();
            return partialIsValidUtf8(state, buffer.array(), index + iArrayOffset, iArrayOffset + limit);
        }

        public abstract int partialIsValidUtf8(int state, byte[] bytes, int index, int limit);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int partialIsValidUtf8Default(final int r7, final java.nio.ByteBuffer r8, int r9, final int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.google.protobuf.Utf8.access$000(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = com.google.protobuf.Utf8.access$000(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = com.google.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        public abstract int partialIsValidUtf8Direct(final int state, final ByteBuffer buffer, int index, final int limit);

        public final boolean isValidUtf8(ByteBuffer buffer, int index, int limit) {
            return partialIsValidUtf8(0, buffer, index, limit) == 0;
        }

        private static int partialIsValidUtf8(final ByteBuffer buffer, int index, final int limit) {
            int iEstimateConsecutiveAscii = index + Utf8.estimateConsecutiveAscii(buffer, index, limit);
            while (iEstimateConsecutiveAscii < limit) {
                int i7 = iEstimateConsecutiveAscii + 1;
                byte b7 = buffer.get(iEstimateConsecutiveAscii);
                if (b7 >= 0) {
                    iEstimateConsecutiveAscii = i7;
                } else if (b7 < -32) {
                    if (i7 >= limit) {
                        return b7;
                    }
                    if (b7 < -62 || buffer.get(i7) > -65) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 2;
                } else {
                    if (b7 >= -16) {
                        if (i7 >= limit - 2) {
                            return Utf8.incompleteStateFor(buffer, b7, i7, limit - i7);
                        }
                        int i10 = iEstimateConsecutiveAscii + 2;
                        byte b10 = buffer.get(i7);
                        if (b10 <= -65) {
                            if ((((b10 + 112) + (b7 << Ascii.FS)) >> 30) == 0) {
                                int i11 = iEstimateConsecutiveAscii + 3;
                                if (buffer.get(i10) <= -65) {
                                    iEstimateConsecutiveAscii += 4;
                                    if (buffer.get(i11) > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    if (i7 >= limit - 1) {
                        return Utf8.incompleteStateFor(buffer, b7, i7, limit - i7);
                    }
                    int i12 = iEstimateConsecutiveAscii + 2;
                    byte b11 = buffer.get(i7);
                    if (b11 > -65 || ((b7 == -32 && b11 < -96) || ((b7 == -19 && b11 >= -96) || buffer.get(i12) > -65))) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int index, int length) {
            super(u.h(index, "Unpaired surrogate at index ", length, " of "));
        }
    }

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    private Utf8() {
    }

    public static String decodeUtf8(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(buffer, index, size);
    }

    public static int encode(CharSequence in, byte[] out, int offset, int length) {
        return processor.encodeUtf8(in, out, offset, length);
    }

    public static void encodeUtf8(CharSequence in, ByteBuffer out) {
        processor.encodeUtf8(in, out);
    }

    public static int encodedLength(CharSequence sequence) {
        int length = sequence.length();
        int i7 = 0;
        while (i7 < length && sequence.charAt(i7) < 128) {
            i7++;
        }
        int iEncodedLengthGeneral = length;
        while (i7 < length) {
            char cCharAt = sequence.charAt(i7);
            if (cCharAt >= 2048) {
                iEncodedLengthGeneral += encodedLengthGeneral(sequence, i7);
                break;
            }
            iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
            i7++;
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence sequence, int start) {
        int length = sequence.length();
        int i7 = 0;
        while (start < length) {
            char cCharAt = sequence.charAt(start);
            if (cCharAt < 2048) {
                i7 += (127 - cCharAt) >>> 31;
            } else {
                i7 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(sequence, start) < 65536) {
                        throw new UnpairedSurrogateException(start, length);
                    }
                    start++;
                }
            }
            start++;
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer buffer, int index, int limit) {
        int i7 = limit - 7;
        int i10 = index;
        while (i10 < i7 && (buffer.getLong(i10) & ASCII_MASK_LONG) == 0) {
            i10 += 8;
        }
        return i10 - index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1) {
        if (byte1 > -12) {
            return -1;
        }
        return byte1;
    }

    public static boolean isValidUtf8(byte[] bytes) {
        return processor.isValidUtf8(bytes, 0, bytes.length);
    }

    public static int partialIsValidUtf8(int state, byte[] bytes, int index, int limit) {
        return processor.partialIsValidUtf8(state, bytes, index, limit);
    }

    public static String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bytes, index, size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1, int byte2) {
        if (byte1 > -12 || byte2 > -65) {
            return -1;
        }
        return byte1 ^ (byte2 << 8);
    }

    public static boolean isValidUtf8(byte[] bytes, int index, int limit) {
        return processor.isValidUtf8(bytes, index, limit);
    }

    public static int partialIsValidUtf8(int state, ByteBuffer buffer, int index, int limit) {
        return processor.partialIsValidUtf8(state, buffer, index, limit);
    }

    public static final class UnsafeProcessor extends Processor {
        public static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bytes, long offset, final int maxChars) {
            int i7 = 0;
            if (maxChars < 16) {
                return 0;
            }
            int i10 = 8 - (((int) offset) & 7);
            while (i7 < i10) {
                long j6 = 1 + offset;
                if (UnsafeUtil.getByte(bytes, offset) < 0) {
                    return i7;
                }
                i7++;
                offset = j6;
            }
            while (true) {
                int i11 = i7 + 8;
                if (i11 > maxChars || (UnsafeUtil.getLong((Object) bytes, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + offset) & Utf8.ASCII_MASK_LONG) != 0) {
                    break;
                }
                offset += 8;
                i7 = i11;
            }
            while (i7 < maxChars) {
                long j10 = offset + 1;
                if (UnsafeUtil.getByte(bytes, offset) < 0) {
                    return i7;
                }
                i7++;
                offset = j10;
            }
            return maxChars;
        }

        private static int unsafeIncompleteStateFor(byte[] bytes, int byte1, long offset, int remaining) {
            if (remaining == 0) {
                return Utf8.incompleteStateFor(byte1);
            }
            if (remaining == 1) {
                return Utf8.incompleteStateFor(byte1, UnsafeUtil.getByte(bytes, offset));
            }
            if (remaining == 2) {
                return Utf8.incompleteStateFor(byte1, UnsafeUtil.getByte(bytes, offset), UnsafeUtil.getByte(bytes, offset + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException {
            Charset charset = Internal.UTF_8;
            String str = new String(bytes, index, size, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bytes, index, size + index))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            if ((index | size | ((buffer.limit() - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(buffer.limit()), Integer.valueOf(index), Integer.valueOf(size)));
            }
            long jAddressOffset = UnsafeUtil.addressOffset(buffer) + ((long) index);
            long j6 = ((long) size) + jAddressOffset;
            char[] cArr = new char[size];
            int i7 = 0;
            while (jAddressOffset < j6) {
                byte b7 = UnsafeUtil.getByte(jAddressOffset);
                if (!DecodeUtil.isOneByte(b7)) {
                    break;
                }
                jAddressOffset++;
                DecodeUtil.handleOneByte(b7, cArr, i7);
                i7++;
            }
            int i10 = i7;
            while (jAddressOffset < j6) {
                long j10 = jAddressOffset + 1;
                byte b10 = UnsafeUtil.getByte(jAddressOffset);
                if (DecodeUtil.isOneByte(b10)) {
                    int i11 = i10 + 1;
                    DecodeUtil.handleOneByte(b10, cArr, i10);
                    long j11 = j10;
                    while (j11 < j6) {
                        byte b11 = UnsafeUtil.getByte(j11);
                        if (!DecodeUtil.isOneByte(b11)) {
                            break;
                        }
                        j11++;
                        DecodeUtil.handleOneByte(b11, cArr, i11);
                        i11++;
                    }
                    i10 = i11;
                    jAddressOffset = j11;
                } else if (DecodeUtil.isTwoBytes(b10)) {
                    if (j10 >= j6) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jAddressOffset += 2;
                    DecodeUtil.handleTwoBytes(b10, UnsafeUtil.getByte(j10), cArr, i10);
                    i10++;
                } else if (DecodeUtil.isThreeBytes(b10)) {
                    if (j10 >= j6 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j12 = 2 + jAddressOffset;
                    jAddressOffset += 3;
                    DecodeUtil.handleThreeBytes(b10, UnsafeUtil.getByte(j10), UnsafeUtil.getByte(j12), cArr, i10);
                    i10++;
                } else {
                    if (j10 >= j6 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b12 = UnsafeUtil.getByte(j10);
                    long j13 = jAddressOffset + 3;
                    byte b13 = UnsafeUtil.getByte(2 + jAddressOffset);
                    jAddressOffset += 4;
                    DecodeUtil.handleFourBytes(b10, b12, b13, UnsafeUtil.getByte(j13), cArr, i10);
                    i10 += 2;
                }
            }
            return new String(cArr, 0, i10);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int encodeUtf8(final CharSequence in, final byte[] out, final int offset, final int length) {
            long j6;
            long j10;
            long j11;
            int i7;
            char cCharAt;
            long j12 = offset;
            long j13 = ((long) length) + j12;
            int length2 = in.length();
            if (length2 > length || out.length - length < offset) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(length2 - 1) + " at index " + (offset + length));
            }
            int i10 = 0;
            while (true) {
                j6 = 1;
                if (i10 >= length2 || (cCharAt = in.charAt(i10)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(out, j12, (byte) cCharAt);
                i10++;
                j12 = 1 + j12;
            }
            if (i10 == length2) {
                return (int) j12;
            }
            while (i10 < length2) {
                char cCharAt2 = in.charAt(i10);
                if (cCharAt2 < 128 && j12 < j13) {
                    UnsafeUtil.putByte(out, j12, (byte) cCharAt2);
                    j11 = j13;
                    j10 = j6;
                    j12 += j6;
                } else if (cCharAt2 >= 2048 || j12 > j13 - 2) {
                    j10 = j6;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j12 > j13 - 3) {
                        j11 = j13;
                        if (j12 > j11 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i7 = i10 + 1) == length2 || !Character.isSurrogatePair(cCharAt2, in.charAt(i7)))) {
                                throw new UnpairedSurrogateException(i10, length2);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j12);
                        }
                        int i11 = i10 + 1;
                        if (i11 != length2) {
                            char cCharAt3 = in.charAt(i11);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                UnsafeUtil.putByte(out, j12, (byte) ((codePoint >>> 18) | 240));
                                UnsafeUtil.putByte(out, j12 + j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j14 = j12 + 3;
                                UnsafeUtil.putByte(out, j12 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j12 += 4;
                                UnsafeUtil.putByte(out, j14, (byte) ((codePoint & 63) | 128));
                                i10 = i11;
                            } else {
                                i10 = i11;
                            }
                        }
                        throw new UnpairedSurrogateException(i10 - 1, length2);
                    }
                    UnsafeUtil.putByte(out, j12, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j15 = j12 + 2;
                    j11 = j13;
                    UnsafeUtil.putByte(out, j12 + j10, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j12 += 3;
                    UnsafeUtil.putByte(out, j15, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j10 = j6;
                    long j16 = j12 + j10;
                    UnsafeUtil.putByte(out, j12, (byte) ((cCharAt2 >>> 6) | 960));
                    j12 += 2;
                    UnsafeUtil.putByte(out, j16, (byte) ((cCharAt2 & '?') | 128));
                    j11 = j13;
                }
                i10++;
                j6 = j10;
                j13 = j11;
            }
            return (int) j12;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public void encodeUtf8Direct(CharSequence in, ByteBuffer out) {
            long j6;
            char c6;
            long j10;
            int i7;
            char c10;
            char cCharAt;
            long jAddressOffset = UnsafeUtil.addressOffset(out);
            long jPosition = ((long) out.position()) + jAddressOffset;
            long jLimit = ((long) out.limit()) + jAddressOffset;
            int length = in.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(length - 1) + " at index " + out.limit());
            }
            int i10 = 0;
            while (true) {
                j6 = 1;
                c6 = 128;
                if (i10 >= length || (cCharAt = in.charAt(i10)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(jPosition, (byte) cCharAt);
                i10++;
                jPosition = 1 + jPosition;
            }
            if (i10 == length) {
                Java8Compatibility.position(out, (int) (jPosition - jAddressOffset));
                return;
            }
            while (i10 < length) {
                char cCharAt2 = in.charAt(i10);
                if (cCharAt2 >= c6 || jPosition >= jLimit) {
                    j10 = j6;
                    if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                        long j11 = jPosition + j10;
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        UnsafeUtil.putByte(j11, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            jAddressOffset = jAddressOffset;
                            jLimit = jLimit;
                            if (jPosition > jLimit - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i7 = i10 + 1) == length || !Character.isSurrogatePair(cCharAt2, in.charAt(i7)))) {
                                    throw new UnpairedSurrogateException(i10, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            int i11 = i10 + 1;
                            if (i11 != length) {
                                char cCharAt3 = in.charAt(i11);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    UnsafeUtil.putByte(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    c10 = 128;
                                    UnsafeUtil.putByte(jPosition + j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j12 = jPosition + 3;
                                    UnsafeUtil.putByte(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    UnsafeUtil.putByte(j12, (byte) ((codePoint & 63) | 128));
                                    i10 = i11;
                                } else {
                                    i10 = i11;
                                }
                            }
                            throw new UnpairedSurrogateException(i10 - 1, length);
                        }
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j13 = jPosition + 2;
                        UnsafeUtil.putByte(jPosition + j10, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jPosition += 3;
                        UnsafeUtil.putByte(j13, (byte) ((cCharAt2 & '?') | 128));
                    }
                    c10 = 128;
                } else {
                    UnsafeUtil.putByte(jPosition, (byte) cCharAt2);
                    jAddressOffset = jAddressOffset;
                    jLimit = jLimit;
                    c10 = c6;
                    jPosition += j6;
                    j10 = j6;
                }
                i10++;
                c6 = c10;
                j6 = j10;
                jAddressOffset = jAddressOffset;
                jLimit = jLimit;
            }
            Java8Compatibility.position(out, (int) (jPosition - jAddressOffset));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8(int r11, byte[] r12, final int r13, final int r14) {
            /*
                r10 = this;
                r0 = r13 | r14
                int r1 = r12.length
                int r1 = r1 - r14
                r0 = r0 | r1
                if (r0 < 0) goto La8
                long r0 = (long) r13
                long r13 = (long) r14
                if (r11 == 0) goto La1
                int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                if (r2 < 0) goto L10
                return r11
            L10:
                byte r2 = (byte) r11
                r3 = -32
                r4 = -1
                r5 = -65
                r6 = 1
                if (r2 >= r3) goto L2a
                r11 = -62
                if (r2 < r11) goto L29
                long r6 = r6 + r0
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r12, r0)
                if (r11 <= r5) goto L26
                goto L29
            L26:
                r0 = r6
                goto La1
            L29:
                return r4
            L2a:
                r8 = -16
                if (r2 >= r8) goto L5e
                int r11 = r11 >> 8
                int r11 = ~r11
                byte r11 = (byte) r11
                if (r11 != 0) goto L44
                long r8 = r0 + r6
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L43
                int r11 = com.google.protobuf.Utf8.access$000(r2, r11)
                return r11
            L43:
                r0 = r8
            L44:
                if (r11 > r5) goto L5d
                r8 = -96
                if (r2 != r3) goto L4c
                if (r11 < r8) goto L5d
            L4c:
                r3 = -19
                if (r2 != r3) goto L52
                if (r11 >= r8) goto L5d
            L52:
                long r2 = r0 + r6
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r12, r0)
                if (r11 <= r5) goto L5b
                goto L5d
            L5b:
                r0 = r2
                goto La1
            L5d:
                return r4
            L5e:
                int r3 = r11 >> 8
                int r3 = ~r3
                byte r3 = (byte) r3
                if (r3 != 0) goto L76
                long r8 = r0 + r6
                byte r3 = com.google.protobuf.UnsafeUtil.getByte(r12, r0)
                int r11 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r11 < 0) goto L73
                int r11 = com.google.protobuf.Utf8.access$000(r2, r3)
                return r11
            L73:
                r11 = 0
                r0 = r8
                goto L79
            L76:
                int r11 = r11 >> 16
                byte r11 = (byte) r11
            L79:
                if (r11 != 0) goto L8b
                long r8 = r0 + r6
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L8a
                int r11 = com.google.protobuf.Utf8.access$100(r2, r3, r11)
                return r11
            L8a:
                r0 = r8
            L8b:
                if (r3 > r5) goto La0
                int r2 = r2 << 28
                int r3 = r3 + 112
                int r3 = r3 + r2
                int r2 = r3 >> 30
                if (r2 != 0) goto La0
                if (r11 > r5) goto La0
                long r2 = r0 + r6
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r12, r0)
                if (r11 <= r5) goto L5b
            La0:
                return r4
            La1:
                long r13 = r13 - r0
                int r11 = (int) r13
                int r11 = partialIsValidUtf8(r12, r0, r11)
                return r11
            La8:
                java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException
                int r12 = r12.length
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r14}
                java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r12 = java.lang.String.format(r13, r12)
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L57;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8Direct(final int r10, java.nio.ByteBuffer r11, final int r12, final int r13) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int unsafeEstimateConsecutiveAscii(long address, final int maxChars) {
            if (maxChars < 16) {
                return 0;
            }
            int i7 = (int) ((-address) & 7);
            int i10 = i7;
            while (i10 > 0) {
                long j6 = 1 + address;
                if (UnsafeUtil.getByte(address) < 0) {
                    return i7 - i10;
                }
                i10--;
                address = j6;
            }
            int i11 = maxChars - i7;
            while (i11 >= 8 && (UnsafeUtil.getLong(address) & Utf8.ASCII_MASK_LONG) == 0) {
                address += 8;
                i11 -= 8;
            }
            return maxChars - i11;
        }

        private static int unsafeIncompleteStateFor(long address, final int byte1, int remaining) {
            if (remaining == 0) {
                return Utf8.incompleteStateFor(byte1);
            }
            if (remaining == 1) {
                return Utf8.incompleteStateFor(byte1, UnsafeUtil.getByte(address));
            }
            if (remaining == 2) {
                return Utf8.incompleteStateFor(byte1, UnsafeUtil.getByte(address), UnsafeUtil.getByte(address + 1));
            }
            throw new AssertionError();
        }

        private static int partialIsValidUtf8(final byte[] bytes, long offset, int remaining) {
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(bytes, offset, remaining);
            int i7 = remaining - iUnsafeEstimateConsecutiveAscii;
            long j6 = offset + ((long) iUnsafeEstimateConsecutiveAscii);
            while (true) {
                byte b7 = 0;
                while (i7 > 0) {
                    long j10 = j6 + 1;
                    b7 = UnsafeUtil.getByte(bytes, j6);
                    if (b7 < 0) {
                        j6 = j10;
                        break;
                    }
                    i7--;
                    j6 = j10;
                }
                if (i7 == 0) {
                    return 0;
                }
                int i10 = i7 - 1;
                if (b7 < -32) {
                    if (i10 == 0) {
                        return b7;
                    }
                    i7 -= 2;
                    if (b7 >= -62) {
                        long j11 = 1 + j6;
                        if (UnsafeUtil.getByte(bytes, j6) <= -65) {
                            j6 = j11;
                        }
                    }
                    return -1;
                }
                if (b7 < -16) {
                    if (i10 < 2) {
                        return unsafeIncompleteStateFor(bytes, b7, j6, i10);
                    }
                    i7 -= 3;
                    long j12 = 1 + j6;
                    byte b10 = UnsafeUtil.getByte(bytes, j6);
                    if (b10 <= -65 && ((b7 != -32 || b10 >= -96) && (b7 != -19 || b10 < -96))) {
                        j6 += 2;
                        if (UnsafeUtil.getByte(bytes, j12) > -65) {
                        }
                    }
                    return -1;
                }
                if (i10 < 3) {
                    return unsafeIncompleteStateFor(bytes, b7, j6, i10);
                }
                i7 -= 4;
                long j13 = 1 + j6;
                byte b11 = UnsafeUtil.getByte(bytes, j6);
                if (b11 <= -65) {
                    if ((((b11 + 112) + (b7 << Ascii.FS)) >> 30) == 0) {
                        long j14 = 2 + j6;
                        if (UnsafeUtil.getByte(bytes, j13) <= -65) {
                            j6 += 3;
                            if (UnsafeUtil.getByte(bytes, j14) > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
        }

        private static int partialIsValidUtf8(long address, int remaining) {
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(address, remaining);
            long j6 = address + ((long) iUnsafeEstimateConsecutiveAscii);
            int i7 = remaining - iUnsafeEstimateConsecutiveAscii;
            while (true) {
                byte b7 = 0;
                while (i7 > 0) {
                    long j10 = j6 + 1;
                    b7 = UnsafeUtil.getByte(j6);
                    if (b7 < 0) {
                        j6 = j10;
                        break;
                    }
                    i7--;
                    j6 = j10;
                }
                if (i7 == 0) {
                    return 0;
                }
                int i10 = i7 - 1;
                if (b7 < -32) {
                    if (i10 == 0) {
                        return b7;
                    }
                    i7 -= 2;
                    if (b7 >= -62) {
                        long j11 = 1 + j6;
                        if (UnsafeUtil.getByte(j6) <= -65) {
                            j6 = j11;
                        }
                    }
                    return -1;
                }
                if (b7 < -16) {
                    if (i10 < 2) {
                        return unsafeIncompleteStateFor(j6, b7, i10);
                    }
                    i7 -= 3;
                    long j12 = 1 + j6;
                    byte b10 = UnsafeUtil.getByte(j6);
                    if (b10 <= -65 && ((b7 != -32 || b10 >= -96) && (b7 != -19 || b10 < -96))) {
                        j6 += 2;
                        if (UnsafeUtil.getByte(j12) > -65) {
                        }
                    }
                    return -1;
                }
                if (i10 < 3) {
                    return unsafeIncompleteStateFor(j6, b7, i10);
                }
                i7 -= 4;
                long j13 = 1 + j6;
                byte b11 = UnsafeUtil.getByte(j6);
                if (b11 <= -65) {
                    if ((((b11 + 112) + (b7 << Ascii.FS)) >> 30) == 0) {
                        long j14 = 2 + j6;
                        if (UnsafeUtil.getByte(j13) <= -65) {
                            j6 += 3;
                            if (UnsafeUtil.getByte(j14) > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1, int byte2, int byte3) {
        if (byte1 > -12 || byte2 > -65 || byte3 > -65) {
            return -1;
        }
        return (byte1 ^ (byte2 << 8)) ^ (byte3 << 16);
    }

    public static boolean isValidUtf8(ByteBuffer buffer) {
        return processor.isValidUtf8(buffer, buffer.position(), buffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bytes, int index, int limit) {
        byte b7 = bytes[index - 1];
        int i7 = limit - index;
        if (i7 == 0) {
            return incompleteStateFor(b7);
        }
        if (i7 == 1) {
            return incompleteStateFor(b7, bytes[index]);
        }
        if (i7 == 2) {
            return incompleteStateFor(b7, bytes[index], bytes[index + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(final ByteBuffer buffer, final int byte1, final int index, final int remaining) {
        if (remaining == 0) {
            return incompleteStateFor(byte1);
        }
        if (remaining == 1) {
            return incompleteStateFor(byte1, buffer.get(index));
        }
        if (remaining == 2) {
            return incompleteStateFor(byte1, buffer.get(index), buffer.get(index + 1));
        }
        throw new AssertionError();
    }

    public static final class SafeProcessor extends Processor {
        private static int partialIsValidUtf8NonAscii(byte[] bytes, int index, int limit) {
            while (index < limit) {
                int i7 = index + 1;
                byte b7 = bytes[index];
                if (b7 < 0) {
                    if (b7 < -32) {
                        if (i7 >= limit) {
                            return b7;
                        }
                        if (b7 >= -62) {
                            index += 2;
                            if (bytes[i7] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b7 < -16) {
                        if (i7 >= limit - 1) {
                            return Utf8.incompleteStateFor(bytes, i7, limit);
                        }
                        int i10 = index + 2;
                        byte b10 = bytes[i7];
                        if (b10 <= -65 && ((b7 != -32 || b10 >= -96) && (b7 != -19 || b10 < -96))) {
                            index += 3;
                            if (bytes[i10] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i7 >= limit - 2) {
                        return Utf8.incompleteStateFor(bytes, i7, limit);
                    }
                    int i11 = index + 2;
                    byte b11 = bytes[i7];
                    if (b11 <= -65) {
                        if ((((b11 + 112) + (b7 << Ascii.FS)) >> 30) == 0) {
                            int i12 = index + 3;
                            if (bytes[i11] <= -65) {
                                index += 4;
                                if (bytes[i12] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                index = i7;
            }
            return 0;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException {
            if ((index | size | ((bytes.length - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bytes.length), Integer.valueOf(index), Integer.valueOf(size)));
            }
            int i7 = index + size;
            char[] cArr = new char[size];
            int i10 = 0;
            while (index < i7) {
                byte b7 = bytes[index];
                if (!DecodeUtil.isOneByte(b7)) {
                    break;
                }
                index++;
                DecodeUtil.handleOneByte(b7, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (index < i7) {
                int i12 = index + 1;
                byte b10 = bytes[index];
                if (DecodeUtil.isOneByte(b10)) {
                    int i13 = i11 + 1;
                    DecodeUtil.handleOneByte(b10, cArr, i11);
                    int i14 = i12;
                    while (i14 < i7) {
                        byte b11 = bytes[i14];
                        if (!DecodeUtil.isOneByte(b11)) {
                            break;
                        }
                        i14++;
                        DecodeUtil.handleOneByte(b11, cArr, i13);
                        i13++;
                    }
                    i11 = i13;
                    index = i14;
                } else if (DecodeUtil.isTwoBytes(b10)) {
                    if (i12 >= i7) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    index += 2;
                    DecodeUtil.handleTwoBytes(b10, bytes[i12], cArr, i11);
                    i11++;
                } else if (DecodeUtil.isThreeBytes(b10)) {
                    if (i12 >= i7 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i15 = index + 2;
                    index += 3;
                    DecodeUtil.handleThreeBytes(b10, bytes[i12], bytes[i15], cArr, i11);
                    i11++;
                } else {
                    if (i12 >= i7 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b12 = bytes[i12];
                    int i16 = index + 3;
                    byte b13 = bytes[index + 2];
                    index += 4;
                    DecodeUtil.handleFourBytes(b10, b12, b13, bytes[i16], cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            return decodeUtf8Default(buffer, index, size);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int encodeUtf8(CharSequence in, byte[] out, int offset, int length) {
            int i7;
            int i10;
            char cCharAt;
            int length2 = in.length();
            int i11 = length + offset;
            int i12 = 0;
            while (i12 < length2 && (i10 = i12 + offset) < i11 && (cCharAt = in.charAt(i12)) < 128) {
                out[i10] = (byte) cCharAt;
                i12++;
            }
            if (i12 == length2) {
                return offset + length2;
            }
            int i13 = offset + i12;
            while (i12 < length2) {
                char cCharAt2 = in.charAt(i12);
                if (cCharAt2 < 128 && i13 < i11) {
                    out[i13] = (byte) cCharAt2;
                    i13++;
                } else if (cCharAt2 < 2048 && i13 <= i11 - 2) {
                    int i14 = i13 + 1;
                    out[i13] = (byte) ((cCharAt2 >>> 6) | 960);
                    i13 += 2;
                    out[i14] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i13 > i11 - 3) {
                        if (i13 > i11 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i7 = i12 + 1) == in.length() || !Character.isSurrogatePair(cCharAt2, in.charAt(i7)))) {
                                throw new UnpairedSurrogateException(i12, length2);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i13);
                        }
                        int i15 = i12 + 1;
                        if (i15 != in.length()) {
                            char cCharAt3 = in.charAt(i15);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                out[i13] = (byte) ((codePoint >>> 18) | 240);
                                out[i13 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i16 = i13 + 3;
                                out[i13 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i13 += 4;
                                out[i16] = (byte) ((codePoint & 63) | 128);
                                i12 = i15;
                            } else {
                                i12 = i15;
                            }
                        }
                        throw new UnpairedSurrogateException(i12 - 1, length2);
                    }
                    out[i13] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i17 = i13 + 2;
                    out[i13 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i13 += 3;
                    out[i17] = (byte) ((cCharAt2 & '?') | 128);
                }
                i12++;
            }
            return i13;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public void encodeUtf8Direct(CharSequence in, ByteBuffer out) {
            encodeUtf8Default(in, out);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.protobuf.Utf8.access$000(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.google.protobuf.Utf8.access$000(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.google.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int partialIsValidUtf8Direct(int state, ByteBuffer buffer, int index, int limit) {
            return partialIsValidUtf8Default(state, buffer, index, limit);
        }

        private static int partialIsValidUtf8(byte[] bytes, int index, int limit) {
            while (index < limit && bytes[index] >= 0) {
                index++;
            }
            if (index >= limit) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bytes, index, limit);
        }
    }
}
