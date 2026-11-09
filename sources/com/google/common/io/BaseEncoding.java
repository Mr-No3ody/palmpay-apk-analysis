package com.google.common.io;

import C0.G;
import com.airbnb.lottie.model.layer.d;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public abstract class BaseEncoding {
    private static final BaseEncoding BASE64 = new Base64Encoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final BaseEncoding BASE64_URL = new Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final BaseEncoding BASE32 = new StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final BaseEncoding BASE32_HEX = new StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final BaseEncoding BASE16 = new Base16Encoding("base16()", "0123456789ABCDEF");

    public static final class Alphabet {
        final int bitsPerChar;
        final int bytesPerChunk;
        private final char[] chars;
        final int charsPerChunk;
        private final byte[] decodabet;
        final int mask;
        private final String name;
        private final boolean[] validPadding;

        public Alphabet(String str, char[] cArr) {
            this.name = (String) Preconditions.checkNotNull(str);
            this.chars = (char[]) Preconditions.checkNotNull(cArr);
            try {
                int iLog2 = IntMath.log2(cArr.length, RoundingMode.UNNECESSARY);
                this.bitsPerChar = iLog2;
                int iMin = Math.min(8, Integer.lowestOneBit(iLog2));
                try {
                    this.charsPerChunk = 8 / iMin;
                    this.bytesPerChunk = iLog2 / iMin;
                    this.mask = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i7 = 0; i7 < cArr.length; i7++) {
                        char c6 = cArr[i7];
                        Preconditions.checkArgument(c6 < 128, "Non-ASCII character: %s", c6);
                        Preconditions.checkArgument(bArr[c6] == -1, "Duplicate character: %s", c6);
                        bArr[c6] = (byte) i7;
                    }
                    this.decodabet = bArr;
                    boolean[] zArr = new boolean[this.charsPerChunk];
                    for (int i10 = 0; i10 < this.bytesPerChunk; i10++) {
                        zArr[IntMath.divide(i10 * 8, this.bitsPerChar, RoundingMode.CEILING)] = true;
                    }
                    this.validPadding = zArr;
                } catch (ArithmeticException e10) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e10);
                }
            } catch (ArithmeticException e11) {
                throw new IllegalArgumentException(d.g(35, cArr.length, "Illegal alphabet length "), e11);
            }
        }

        private boolean hasLowerCase() {
            for (char c6 : this.chars) {
                if (Ascii.isLowerCase(c6)) {
                    return true;
                }
            }
            return false;
        }

        private boolean hasUpperCase() {
            for (char c6 : this.chars) {
                if (Ascii.isUpperCase(c6)) {
                    return true;
                }
            }
            return false;
        }

        public boolean canDecode(char c6) {
            return c6 <= 127 && this.decodabet[c6] != -1;
        }

        public int decode(char c6) throws DecodingException {
            if (c6 > 127) {
                String strValueOf = String.valueOf(Integer.toHexString(c6));
                throw new DecodingException(strValueOf.length() != 0 ? "Unrecognized character: 0x".concat(strValueOf) : new String("Unrecognized character: 0x"));
            }
            byte b7 = this.decodabet[c6];
            if (b7 != -1) {
                return b7;
            }
            if (c6 <= ' ' || c6 == 127) {
                String strValueOf2 = String.valueOf(Integer.toHexString(c6));
                throw new DecodingException(strValueOf2.length() != 0 ? "Unrecognized character: 0x".concat(strValueOf2) : new String("Unrecognized character: 0x"));
            }
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Unrecognized character: ");
            sb2.append(c6);
            throw new DecodingException(sb2.toString());
        }

        public char encode(int i7) {
            return this.chars[i7];
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof Alphabet) {
                return Arrays.equals(this.chars, ((Alphabet) obj).chars);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.chars);
        }

        public boolean isValidPaddingStartPosition(int i7) {
            return this.validPadding[i7 % this.charsPerChunk];
        }

        public Alphabet lowerCase() {
            if (!hasUpperCase()) {
                return this;
            }
            Preconditions.checkState(!hasLowerCase(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.chars.length];
            int i7 = 0;
            while (true) {
                char[] cArr2 = this.chars;
                if (i7 >= cArr2.length) {
                    return new Alphabet(String.valueOf(this.name).concat(".lowerCase()"), cArr);
                }
                cArr[i7] = Ascii.toLowerCase(cArr2[i7]);
                i7++;
            }
        }

        public boolean matches(char c6) {
            byte[] bArr = this.decodabet;
            return c6 < bArr.length && bArr[c6] != -1;
        }

        public String toString() {
            return this.name;
        }

        public Alphabet upperCase() {
            if (!hasLowerCase()) {
                return this;
            }
            Preconditions.checkState(!hasUpperCase(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.chars.length];
            int i7 = 0;
            while (true) {
                char[] cArr2 = this.chars;
                if (i7 >= cArr2.length) {
                    return new Alphabet(String.valueOf(this.name).concat(".upperCase()"), cArr);
                }
                cArr[i7] = Ascii.toUpperCase(cArr2[i7]);
                i7++;
            }
        }
    }

    public static final class Base16Encoding extends StandardBaseEncoding {
        final char[] encoding;

        public Base16Encoding(String str, String str2) {
            this(new Alphabet(str, str2.toCharArray()));
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Preconditions.checkNotNull(bArr);
            if (charSequence.length() % 2 == 1) {
                throw new DecodingException(d.g(32, charSequence.length(), "Invalid input length "));
            }
            int i7 = 0;
            int i10 = 0;
            while (i7 < charSequence.length()) {
                bArr[i10] = (byte) ((this.alphabet.decode(charSequence.charAt(i7)) << 4) | this.alphabet.decode(charSequence.charAt(i7 + 1)));
                i7 += 2;
                i10++;
            }
            return i10;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i7, int i10) throws IOException {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i7, i7 + i10, bArr.length);
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = bArr[i7 + i11] & UnsignedBytes.MAX_VALUE;
                appendable.append(this.encoding[i12]);
                appendable.append(this.encoding[i12 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        public BaseEncoding newInstance(Alphabet alphabet, @CheckForNull Character ch2) {
            return new Base16Encoding(alphabet);
        }

        private Base16Encoding(Alphabet alphabet) {
            super(alphabet, null);
            this.encoding = new char[512];
            Preconditions.checkArgument(alphabet.chars.length == 16);
            for (int i7 = 0; i7 < 256; i7++) {
                this.encoding[i7] = alphabet.encode(i7 >>> 4);
                this.encoding[i7 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER] = alphabet.encode(i7 & 15);
            }
        }
    }

    public static final class Base64Encoding extends StandardBaseEncoding {
        public Base64Encoding(String str, String str2, @CheckForNull Character ch2) {
            this(new Alphabet(str, str2.toCharArray()), ch2);
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Preconditions.checkNotNull(bArr);
            CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(charSequence);
            if (!this.alphabet.isValidPaddingStartPosition(charSequenceTrimTrailingPadding.length())) {
                throw new DecodingException(d.g(32, charSequenceTrimTrailingPadding.length(), "Invalid input length "));
            }
            int i7 = 0;
            int i10 = 0;
            while (i7 < charSequenceTrimTrailingPadding.length()) {
                int i11 = i7 + 2;
                int iDecode = (this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i7)) << 18) | (this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i7 + 1)) << 12);
                int i12 = i10 + 1;
                bArr[i10] = (byte) (iDecode >>> 16);
                if (i11 < charSequenceTrimTrailingPadding.length()) {
                    int i13 = i7 + 3;
                    int iDecode2 = iDecode | (this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i11)) << 6);
                    int i14 = i10 + 2;
                    bArr[i12] = (byte) ((iDecode2 >>> 8) & 255);
                    if (i13 < charSequenceTrimTrailingPadding.length()) {
                        i7 += 4;
                        i10 += 3;
                        bArr[i14] = (byte) ((iDecode2 | this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i13))) & 255);
                    } else {
                        i10 = i14;
                        i7 = i13;
                    }
                } else {
                    i10 = i12;
                    i7 = i11;
                }
            }
            return i10;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i7, int i10) throws IOException {
            Preconditions.checkNotNull(appendable);
            int i11 = i7 + i10;
            Preconditions.checkPositionIndexes(i7, i11, bArr.length);
            while (i10 >= 3) {
                int i12 = i7 + 2;
                int i13 = ((bArr[i7 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i7] & UnsignedBytes.MAX_VALUE) << 16);
                i7 += 3;
                int i14 = i13 | (bArr[i12] & UnsignedBytes.MAX_VALUE);
                appendable.append(this.alphabet.encode(i14 >>> 18));
                appendable.append(this.alphabet.encode((i14 >>> 12) & 63));
                appendable.append(this.alphabet.encode((i14 >>> 6) & 63));
                appendable.append(this.alphabet.encode(i14 & 63));
                i10 -= 3;
            }
            if (i7 < i11) {
                encodeChunkTo(appendable, bArr, i7, i11 - i7);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        public BaseEncoding newInstance(Alphabet alphabet, @CheckForNull Character ch2) {
            return new Base64Encoding(alphabet, ch2);
        }

        private Base64Encoding(Alphabet alphabet, @CheckForNull Character ch2) {
            super(alphabet, ch2);
            Preconditions.checkArgument(alphabet.chars.length == 64);
        }
    }

    public static final class DecodingException extends IOException {
        public DecodingException(String str) {
            super(str);
        }

        public DecodingException(Throwable th) {
            super(th);
        }
    }

    public static final class SeparatedBaseEncoding extends BaseEncoding {
        private final int afterEveryChars;
        private final BaseEncoding delegate;
        private final String separator;

        public SeparatedBaseEncoding(BaseEncoding baseEncoding, String str, int i7) {
            this.delegate = (BaseEncoding) Preconditions.checkNotNull(baseEncoding);
            this.separator = (String) Preconditions.checkNotNull(str);
            this.afterEveryChars = i7;
            Preconditions.checkArgument(i7 > 0, "Cannot add a separator after every %s chars", i7);
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
            StringBuilder sb2 = new StringBuilder();
            for (int i7 = 0; i7 < charSequence.length(); i7++) {
                char cCharAt = charSequence.charAt(i7);
                if (this.separator.indexOf(cCharAt) < 0) {
                    sb2.append(cCharAt);
                }
            }
            return this.delegate.canDecode(sb2);
        }

        @Override // com.google.common.io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
            StringBuilder sb2 = new StringBuilder(charSequence.length());
            for (int i7 = 0; i7 < charSequence.length(); i7++) {
                char cCharAt = charSequence.charAt(i7);
                if (this.separator.indexOf(cCharAt) < 0) {
                    sb2.append(cCharAt);
                }
            }
            return this.delegate.decodeTo(bArr, sb2);
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public InputStream decodingStream(Reader reader) {
            return this.delegate.decodingStream(BaseEncoding.ignoringReader(reader, this.separator));
        }

        @Override // com.google.common.io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i7, int i10) throws IOException {
            this.delegate.encodeTo(BaseEncoding.separatingAppendable(appendable, this.separator, this.afterEveryChars), bArr, i7, i10);
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public OutputStream encodingStream(Writer writer) {
            return this.delegate.encodingStream(BaseEncoding.separatingWriter(writer, this.separator, this.afterEveryChars));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
            return this.delegate.lowerCase().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public int maxDecodedSize(int i7) {
            return this.delegate.maxDecodedSize(i7);
        }

        @Override // com.google.common.io.BaseEncoding
        public int maxEncodedSize(int i7) {
            int iMaxEncodedSize = this.delegate.maxEncodedSize(i7);
            return (IntMath.divide(Math.max(0, iMaxEncodedSize - 1), this.afterEveryChars, RoundingMode.FLOOR) * this.separator.length()) + iMaxEncodedSize;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
            return this.delegate.omitPadding().withSeparator(this.separator, this.afterEveryChars);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.delegate);
            String str = this.separator;
            return G.n(this.afterEveryChars, ")", d.p(strValueOf, d.c(strValueOf.length() + 31, str), ".withSeparator(\"", str, "\", "));
        }

        @Override // com.google.common.io.BaseEncoding
        public CharSequence trimTrailingPadding(CharSequence charSequence) {
            return this.delegate.trimTrailingPadding(charSequence);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding upperCase() {
            return this.delegate.upperCase().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withPadChar(char c6) {
            return this.delegate.withPadChar(c6).withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i7) {
            throw new UnsupportedOperationException("Already have a separator");
        }
    }

    public static class StandardBaseEncoding extends BaseEncoding {
        final Alphabet alphabet;

        @CheckForNull
        @LazyInit
        private transient BaseEncoding lowerCase;

        @CheckForNull
        final Character paddingChar;

        @CheckForNull
        @LazyInit
        private transient BaseEncoding upperCase;

        public StandardBaseEncoding(String str, String str2, @CheckForNull Character ch2) {
            this(new Alphabet(str, str2.toCharArray()), ch2);
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(charSequence);
            if (!this.alphabet.isValidPaddingStartPosition(charSequenceTrimTrailingPadding.length())) {
                return false;
            }
            for (int i7 = 0; i7 < charSequenceTrimTrailingPadding.length(); i7++) {
                if (!this.alphabet.canDecode(charSequenceTrimTrailingPadding.charAt(i7))) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Alphabet alphabet;
            Preconditions.checkNotNull(bArr);
            CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(charSequence);
            if (!this.alphabet.isValidPaddingStartPosition(charSequenceTrimTrailingPadding.length())) {
                throw new DecodingException(d.g(32, charSequenceTrimTrailingPadding.length(), "Invalid input length "));
            }
            int i7 = 0;
            int i10 = 0;
            while (i7 < charSequenceTrimTrailingPadding.length()) {
                long jDecode = 0;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    alphabet = this.alphabet;
                    if (i11 >= alphabet.charsPerChunk) {
                        break;
                    }
                    jDecode <<= alphabet.bitsPerChar;
                    if (i7 + i11 < charSequenceTrimTrailingPadding.length()) {
                        jDecode |= (long) this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i12 + i7));
                        i12++;
                    }
                    i11++;
                }
                int i13 = alphabet.bytesPerChunk;
                int i14 = (i13 * 8) - (i12 * alphabet.bitsPerChar);
                int i15 = (i13 - 1) * 8;
                while (i15 >= i14) {
                    bArr[i10] = (byte) ((jDecode >>> i15) & 255);
                    i15 -= 8;
                    i10++;
                }
                i7 += this.alphabet.charsPerChunk;
            }
            return i10;
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public InputStream decodingStream(final Reader reader) {
            Preconditions.checkNotNull(reader);
            return new InputStream() { // from class: com.google.common.io.BaseEncoding.StandardBaseEncoding.2
                int bitBuffer = 0;
                int bitBufferLength = 0;
                int readChars = 0;
                boolean hitPadding = false;

                @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    reader.close();
                }

                @Override // java.io.InputStream
                public int read() throws IOException {
                    int i7;
                    while (true) {
                        int i10 = reader.read();
                        if (i10 == -1) {
                            if (this.hitPadding || StandardBaseEncoding.this.alphabet.isValidPaddingStartPosition(this.readChars)) {
                                return -1;
                            }
                            throw new DecodingException(d.g(32, this.readChars, "Invalid input length "));
                        }
                        this.readChars++;
                        char c6 = (char) i10;
                        Character ch2 = StandardBaseEncoding.this.paddingChar;
                        if (ch2 == null || ch2.charValue() != c6) {
                            if (this.hitPadding) {
                                int i11 = this.readChars;
                                StringBuilder sb2 = new StringBuilder(61);
                                sb2.append("Expected padding character but found '");
                                sb2.append(c6);
                                sb2.append("' at index ");
                                sb2.append(i11);
                                throw new DecodingException(sb2.toString());
                            }
                            int i12 = this.bitBuffer;
                            Alphabet alphabet = StandardBaseEncoding.this.alphabet;
                            int i13 = i12 << alphabet.bitsPerChar;
                            this.bitBuffer = i13;
                            int iDecode = alphabet.decode(c6) | i13;
                            this.bitBuffer = iDecode;
                            int i14 = this.bitBufferLength + StandardBaseEncoding.this.alphabet.bitsPerChar;
                            this.bitBufferLength = i14;
                            if (i14 >= 8) {
                                int i15 = i14 - 8;
                                this.bitBufferLength = i15;
                                return (iDecode >> i15) & 255;
                            }
                        } else {
                            if (!this.hitPadding && ((i7 = this.readChars) == 1 || !StandardBaseEncoding.this.alphabet.isValidPaddingStartPosition(i7 - 1))) {
                                throw new DecodingException(d.g(41, this.readChars, "Padding cannot start at index "));
                            }
                            this.hitPadding = true;
                        }
                    }
                }

                @Override // java.io.InputStream
                public int read(byte[] bArr, int i7, int i10) throws IOException {
                    int i11 = i10 + i7;
                    Preconditions.checkPositionIndexes(i7, i11, bArr.length);
                    int i12 = i7;
                    while (i12 < i11) {
                        int i13 = read();
                        if (i13 == -1) {
                            int i14 = i12 - i7;
                            if (i14 == 0) {
                                return -1;
                            }
                            return i14;
                        }
                        bArr[i12] = (byte) i13;
                        i12++;
                    }
                    return i12 - i7;
                }
            };
        }

        public void encodeChunkTo(Appendable appendable, byte[] bArr, int i7, int i10) throws IOException {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i7, i7 + i10, bArr.length);
            int i11 = 0;
            Preconditions.checkArgument(i10 <= this.alphabet.bytesPerChunk);
            long j6 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                j6 = (j6 | ((long) (bArr[i7 + i12] & UnsignedBytes.MAX_VALUE))) << 8;
            }
            int i13 = ((i10 + 1) * 8) - this.alphabet.bitsPerChar;
            while (i11 < i10 * 8) {
                Alphabet alphabet = this.alphabet;
                appendable.append(alphabet.encode(((int) (j6 >>> (i13 - i11))) & alphabet.mask));
                i11 += this.alphabet.bitsPerChar;
            }
            if (this.paddingChar != null) {
                while (i11 < this.alphabet.bytesPerChunk * 8) {
                    appendable.append(this.paddingChar.charValue());
                    i11 += this.alphabet.bitsPerChar;
                }
            }
        }

        @Override // com.google.common.io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i7, int i10) throws IOException {
            Preconditions.checkNotNull(appendable);
            Preconditions.checkPositionIndexes(i7, i7 + i10, bArr.length);
            int i11 = 0;
            while (i11 < i10) {
                encodeChunkTo(appendable, bArr, i7 + i11, Math.min(this.alphabet.bytesPerChunk, i10 - i11));
                i11 += this.alphabet.bytesPerChunk;
            }
        }

        @Override // com.google.common.io.BaseEncoding
        @GwtIncompatible
        public OutputStream encodingStream(final Writer writer) {
            Preconditions.checkNotNull(writer);
            return new OutputStream() { // from class: com.google.common.io.BaseEncoding.StandardBaseEncoding.1
                int bitBuffer = 0;
                int bitBufferLength = 0;
                int writtenChars = 0;

                @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    int i7 = this.bitBufferLength;
                    if (i7 > 0) {
                        int i10 = this.bitBuffer;
                        Alphabet alphabet = StandardBaseEncoding.this.alphabet;
                        writer.write(alphabet.encode((i10 << (alphabet.bitsPerChar - i7)) & alphabet.mask));
                        this.writtenChars++;
                        if (StandardBaseEncoding.this.paddingChar != null) {
                            while (true) {
                                int i11 = this.writtenChars;
                                StandardBaseEncoding standardBaseEncoding = StandardBaseEncoding.this;
                                if (i11 % standardBaseEncoding.alphabet.charsPerChunk == 0) {
                                    break;
                                }
                                writer.write(standardBaseEncoding.paddingChar.charValue());
                                this.writtenChars++;
                            }
                        }
                    }
                    writer.close();
                }

                @Override // java.io.OutputStream, java.io.Flushable
                public void flush() throws IOException {
                    writer.flush();
                }

                @Override // java.io.OutputStream
                public void write(int i7) throws IOException {
                    this.bitBuffer = (i7 & 255) | (this.bitBuffer << 8);
                    this.bitBufferLength += 8;
                    while (true) {
                        int i10 = this.bitBufferLength;
                        Alphabet alphabet = StandardBaseEncoding.this.alphabet;
                        int i11 = alphabet.bitsPerChar;
                        if (i10 < i11) {
                            return;
                        }
                        writer.write(alphabet.encode((this.bitBuffer >> (i10 - i11)) & alphabet.mask));
                        this.writtenChars++;
                        this.bitBufferLength -= StandardBaseEncoding.this.alphabet.bitsPerChar;
                    }
                }
            };
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof StandardBaseEncoding) {
                StandardBaseEncoding standardBaseEncoding = (StandardBaseEncoding) obj;
                if (this.alphabet.equals(standardBaseEncoding.alphabet) && Objects.equal(this.paddingChar, standardBaseEncoding.paddingChar)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.alphabet.hashCode() ^ Objects.hashCode(this.paddingChar);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
            BaseEncoding baseEncodingNewInstance = this.lowerCase;
            if (baseEncodingNewInstance == null) {
                Alphabet alphabetLowerCase = this.alphabet.lowerCase();
                baseEncodingNewInstance = alphabetLowerCase == this.alphabet ? this : newInstance(alphabetLowerCase, this.paddingChar);
                this.lowerCase = baseEncodingNewInstance;
            }
            return baseEncodingNewInstance;
        }

        @Override // com.google.common.io.BaseEncoding
        public int maxDecodedSize(int i7) {
            return (int) (((((long) this.alphabet.bitsPerChar) * ((long) i7)) + 7) / 8);
        }

        @Override // com.google.common.io.BaseEncoding
        public int maxEncodedSize(int i7) {
            Alphabet alphabet = this.alphabet;
            return IntMath.divide(i7, alphabet.bytesPerChunk, RoundingMode.CEILING) * alphabet.charsPerChunk;
        }

        public BaseEncoding newInstance(Alphabet alphabet, @CheckForNull Character ch2) {
            return new StandardBaseEncoding(alphabet, ch2);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
            return this.paddingChar == null ? this : newInstance(this.alphabet, null);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.alphabet.toString());
            if (8 % this.alphabet.bitsPerChar != 0) {
                if (this.paddingChar == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.paddingChar);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        @Override // com.google.common.io.BaseEncoding
        public CharSequence trimTrailingPadding(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            Character ch2 = this.paddingChar;
            if (ch2 == null) {
                return charSequence;
            }
            char cCharValue = ch2.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding upperCase() {
            BaseEncoding baseEncodingNewInstance = this.upperCase;
            if (baseEncodingNewInstance == null) {
                Alphabet alphabetUpperCase = this.alphabet.upperCase();
                baseEncodingNewInstance = alphabetUpperCase == this.alphabet ? this : newInstance(alphabetUpperCase, this.paddingChar);
                this.upperCase = baseEncodingNewInstance;
            }
            return baseEncodingNewInstance;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withPadChar(char c6) {
            Character ch2;
            return (8 % this.alphabet.bitsPerChar == 0 || ((ch2 = this.paddingChar) != null && ch2.charValue() == c6)) ? this : newInstance(this.alphabet, Character.valueOf(c6));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withSeparator(String str, int i7) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                Preconditions.checkArgument(!this.alphabet.matches(str.charAt(i10)), "Separator (%s) cannot contain alphabet characters", str);
            }
            Character ch2 = this.paddingChar;
            if (ch2 != null) {
                Preconditions.checkArgument(str.indexOf(ch2.charValue()) < 0, "Separator (%s) cannot contain padding character", str);
            }
            return new SeparatedBaseEncoding(this, str, i7);
        }

        public StandardBaseEncoding(Alphabet alphabet, @CheckForNull Character ch2) {
            this.alphabet = (Alphabet) Preconditions.checkNotNull(alphabet);
            Preconditions.checkArgument(ch2 == null || !alphabet.matches(ch2.charValue()), "Padding character %s was already in alphabet", ch2);
            this.paddingChar = ch2;
        }
    }

    public static BaseEncoding base16() {
        return BASE16;
    }

    public static BaseEncoding base32() {
        return BASE32;
    }

    public static BaseEncoding base32Hex() {
        return BASE32_HEX;
    }

    public static BaseEncoding base64() {
        return BASE64;
    }

    public static BaseEncoding base64Url() {
        return BASE64_URL;
    }

    private static byte[] extract(byte[] bArr, int i7) {
        if (i7 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i7];
        System.arraycopy(bArr, 0, bArr2, 0, i7);
        return bArr2;
    }

    @GwtIncompatible
    public static Reader ignoringReader(final Reader reader, final String str) {
        Preconditions.checkNotNull(reader);
        Preconditions.checkNotNull(str);
        return new Reader() { // from class: com.google.common.io.BaseEncoding.3
            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                reader.close();
            }

            @Override // java.io.Reader
            public int read() throws IOException {
                int i7;
                do {
                    i7 = reader.read();
                    if (i7 == -1) {
                        break;
                    }
                } while (str.indexOf((char) i7) >= 0);
                return i7;
            }

            @Override // java.io.Reader
            public int read(char[] cArr, int i7, int i10) throws IOException {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static Appendable separatingAppendable(Appendable appendable, String str, int i7) {
        Preconditions.checkNotNull(appendable);
        Preconditions.checkNotNull(str);
        Preconditions.checkArgument(i7 > 0);
        return new Appendable(i7, appendable, str) { // from class: com.google.common.io.BaseEncoding.4
            int charsUntilSeparator;
            final /* synthetic */ int val$afterEveryChars;
            final /* synthetic */ Appendable val$delegate;
            final /* synthetic */ String val$separator;

            {
                this.val$afterEveryChars = i7;
                this.val$delegate = appendable;
                this.val$separator = str;
                this.charsUntilSeparator = i7;
            }

            @Override // java.lang.Appendable
            public Appendable append(char c6) throws IOException {
                if (this.charsUntilSeparator == 0) {
                    this.val$delegate.append(this.val$separator);
                    this.charsUntilSeparator = this.val$afterEveryChars;
                }
                this.val$delegate.append(c6);
                this.charsUntilSeparator--;
                return this;
            }

            @Override // java.lang.Appendable
            public Appendable append(@CheckForNull CharSequence charSequence, int i10, int i11) {
                throw new UnsupportedOperationException();
            }

            @Override // java.lang.Appendable
            public Appendable append(@CheckForNull CharSequence charSequence) {
                throw new UnsupportedOperationException();
            }
        };
    }

    @GwtIncompatible
    public static Writer separatingWriter(final Writer writer, String str, int i7) {
        final Appendable appendableSeparatingAppendable = separatingAppendable(writer, str, i7);
        return new Writer() { // from class: com.google.common.io.BaseEncoding.5
            @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                writer.close();
            }

            @Override // java.io.Writer, java.io.Flushable
            public void flush() throws IOException {
                writer.flush();
            }

            @Override // java.io.Writer
            public void write(int i10) throws IOException {
                appendableSeparatingAppendable.append((char) i10);
            }

            @Override // java.io.Writer
            public void write(char[] cArr, int i10, int i11) throws IOException {
                throw new UnsupportedOperationException();
            }
        };
    }

    public abstract boolean canDecode(CharSequence charSequence);

    public final byte[] decode(CharSequence charSequence) {
        try {
            return decodeChecked(charSequence);
        } catch (DecodingException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final byte[] decodeChecked(CharSequence charSequence) throws DecodingException {
        CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(charSequence);
        byte[] bArr = new byte[maxDecodedSize(charSequenceTrimTrailingPadding.length())];
        return extract(bArr, decodeTo(bArr, charSequenceTrimTrailingPadding));
    }

    public abstract int decodeTo(byte[] bArr, CharSequence charSequence) throws DecodingException;

    @GwtIncompatible
    public final ByteSource decodingSource(final CharSource charSource) {
        Preconditions.checkNotNull(charSource);
        return new ByteSource() { // from class: com.google.common.io.BaseEncoding.2
            @Override // com.google.common.io.ByteSource
            public InputStream openStream() throws IOException {
                return BaseEncoding.this.decodingStream(charSource.openStream());
            }
        };
    }

    @GwtIncompatible
    public abstract InputStream decodingStream(Reader reader);

    public String encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public abstract void encodeTo(Appendable appendable, byte[] bArr, int i7, int i10) throws IOException;

    @GwtIncompatible
    public final ByteSink encodingSink(final CharSink charSink) {
        Preconditions.checkNotNull(charSink);
        return new ByteSink() { // from class: com.google.common.io.BaseEncoding.1
            @Override // com.google.common.io.ByteSink
            public OutputStream openStream() throws IOException {
                return BaseEncoding.this.encodingStream(charSink.openStream());
            }
        };
    }

    @GwtIncompatible
    public abstract OutputStream encodingStream(Writer writer);

    public abstract BaseEncoding lowerCase();

    public abstract int maxDecodedSize(int i7);

    public abstract int maxEncodedSize(int i7);

    public abstract BaseEncoding omitPadding();

    public CharSequence trimTrailingPadding(CharSequence charSequence) {
        return (CharSequence) Preconditions.checkNotNull(charSequence);
    }

    public abstract BaseEncoding upperCase();

    public abstract BaseEncoding withPadChar(char c6);

    public abstract BaseEncoding withSeparator(String str, int i7);

    public final String encode(byte[] bArr, int i7, int i10) {
        Preconditions.checkPositionIndexes(i7, i7 + i10, bArr.length);
        StringBuilder sb2 = new StringBuilder(maxEncodedSize(i10));
        try {
            encodeTo(sb2, bArr, i7, i10);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
