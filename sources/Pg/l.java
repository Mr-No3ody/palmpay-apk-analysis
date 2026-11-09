package Pg;

import C0.G;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.collections.C1844k;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.EnumC2125d;

/* JADX INFO: loaded from: classes4.dex */
public final class l {
    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ m encodeString$default(l lVar, String str, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return lVar.encodeString(str, charset);
    }

    public static /* synthetic */ m of$default(l lVar, byte[] bArr, int i7, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = -1234567890;
        }
        return lVar.of(bArr, i7, i10);
    }

    @Deprecated(level = EnumC2125d.f43963b, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
    @JvmName(name = "-deprecated_decodeBase64")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_decodeBase64, reason: not valid java name */
    public final m m1deprecated_decodeBase64(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return decodeBase64(string);
    }

    @Deprecated(level = EnumC2125d.f43963b, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
    @JvmName(name = "-deprecated_decodeHex")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_decodeHex, reason: not valid java name */
    public final m m2deprecated_decodeHex(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return decodeHex(string);
    }

    @Deprecated(level = EnumC2125d.f43963b, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
    @JvmName(name = "-deprecated_encodeString")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_encodeString, reason: not valid java name */
    public final m m3deprecated_encodeString(@NotNull String string, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return encodeString(string, charset);
    }

    @Deprecated(level = EnumC2125d.f43963b, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
    @JvmName(name = "-deprecated_encodeUtf8")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_encodeUtf8, reason: not valid java name */
    public final m m4deprecated_encodeUtf8(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return encodeUtf8(string);
    }

    @Deprecated(level = EnumC2125d.f43963b, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
    @JvmName(name = "-deprecated_of")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
    public final m m5deprecated_of(@NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return of(buffer);
    }

    @Deprecated(level = EnumC2125d.f43963b, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
    @JvmName(name = "-deprecated_read")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_read, reason: not valid java name */
    public final m m7deprecated_read(@NotNull InputStream inputstream, int i7) {
        Intrinsics.checkNotNullParameter(inputstream, "inputstream");
        return read(inputstream, i7);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb A[RETURN] */
    @JvmStatic
    @Nullable
    public final m decodeBase64(@NotNull String str) {
        char c6;
        int i7;
        char cCharAt;
        char c10 = 'A';
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArr = AbstractC0554a.f7337a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (true) {
            c6 = '\t';
            if (length <= 0 || !((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                break;
            }
            length--;
        }
        int i10 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i11 >= length) {
                int i15 = i12 % 4;
                if (i15 != 1) {
                    if (i15 == 2) {
                        bArrCopyOf[i14] = (byte) ((i13 << 12) >> 16);
                        i14 = 1 + i14;
                    } else if (i15 == 3) {
                        int i16 = i13 << 6;
                        int i17 = 1 + i14;
                        bArrCopyOf[i14] = (byte) (i16 >> 16);
                        i14 += 2;
                        bArrCopyOf[i17] = (byte) (i16 >> 8);
                    }
                    if (i14 != i10) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
                    }
                }
                if (bArrCopyOf != null) {
                    return new m(bArrCopyOf);
                }
                return null;
            }
            char cCharAt2 = str.charAt(i11);
            char c11 = c10;
            if (c10 <= cCharAt2 && cCharAt2 < '[') {
                i7 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i7 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i7 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i7 = 62;
            } else {
                if (cCharAt2 != '/' && cCharAt2 != '_') {
                    if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != c6) {
                        break;
                    }
                } else {
                    i7 = 63;
                }
                i11++;
                c10 = c11;
                c6 = '\t';
            }
            int i18 = i7 | (i13 << 6);
            i12++;
            if (i12 % 4 == 0) {
                bArrCopyOf[i14] = (byte) (i18 >> 16);
                int i19 = i14 + 2;
                bArrCopyOf[i14 + 1] = (byte) (i18 >> 8);
                i14 += 3;
                bArrCopyOf[i19] = (byte) i18;
            }
            i13 = i18;
            i11++;
            c10 = c11;
            c6 = '\t';
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new m(bArrCopyOf);
        }
        return null;
    }

    @JvmStatic
    @NotNull
    public final m decodeHex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = i7 * 2;
            bArr[i7] = (byte) (Qg.b.a(str.charAt(i10 + 1)) + (Qg.b.a(str.charAt(i10)) << 4));
        }
        return new m(bArr);
    }

    @JvmStatic
    @JvmName(name = "encodeString")
    @NotNull
    public final m encodeString(@NotNull String str, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return new m(bytes);
    }

    @JvmStatic
    @NotNull
    public final m encodeUtf8(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        m mVar = new m(bytes);
        mVar.f7363c = str;
        return mVar;
    }

    @JvmStatic
    @JvmName(name = "of")
    @NotNull
    public final m of(@NotNull byte[] bArr, int i7, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i10 == -1234567890) {
            i10 = bArr.length;
        }
        AbstractC0555b.d(bArr.length, i7, i10);
        int i11 = i10 + i7;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        C1844k.a(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i7, i11);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(...)");
        return new m(bArrCopyOfRange);
    }

    @JvmStatic
    @JvmName(name = "read")
    @NotNull
    public final m read(@NotNull InputStream inputStream, int i7) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(G.m(i7, "byteCount < 0: ").toString());
        }
        byte[] bArr = new byte[i7];
        int i10 = 0;
        while (i10 < i7) {
            int i11 = inputStream.read(bArr, i10, i7 - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
        return new m(bArr);
    }

    private l() {
    }

    @Deprecated(level = EnumC2125d.f43963b, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
    @JvmName(name = "-deprecated_of")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
    public final m m6deprecated_of(@NotNull byte[] array, int i7, int i10) {
        Intrinsics.checkNotNullParameter(array, "array");
        return of(array, i7, i10);
    }

    @JvmStatic
    @JvmName(name = "of")
    @NotNull
    public final m of(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new m(bArr);
    }

    @JvmStatic
    @NotNull
    public final m of(@NotNull byte... data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return new m(bArrCopyOf);
    }
}
