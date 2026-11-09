package Kf;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.C1846m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public class m extends l {
    public static byte[] a(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i7 = (int) length;
            byte[] bArrCopyOf = new byte[i7];
            int i10 = i7;
            int i11 = 0;
            while (i10 > 0) {
                int i12 = fileInputStream.read(bArrCopyOf, i11, i10);
                if (i12 < 0) {
                    break;
                }
                i10 -= i12;
                i11 += i12;
            }
            if (i10 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i11);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            } else {
                int i13 = fileInputStream.read();
                if (i13 != -1) {
                    b bVar = new b(8193);
                    bVar.write(i13);
                    p140j8.f.d(fileInputStream, bVar);
                    int size = bVar.size() + i7;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrA = bVar.a();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                    C1846m.e(bArrA, i7, bArrCopyOf, 0, bVar.size());
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                org.chromium.support_lib_boundary.util.b.o(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static String b(File file) throws IOException {
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strE = p264r5.a.E(inputStreamReader);
            inputStreamReader.close();
            return strE;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                org.chromium.support_lib_boundary.util.b.o(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static void c(File file, String text) throws IOException {
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            d(fileOutputStream, text, charset);
            Unit unit = Unit.f38893a;
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                org.chromium.support_lib_boundary.util.b.o(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static final void d(FileOutputStream fileOutputStream, String text, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(fileOutputStream, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        Intrinsics.checkNotNullParameter(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder encoder = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(UserMetadata.MAX_INTERNAL_KEY_SIZE);
        Intrinsics.e(encoder);
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(UserMetadata.MAX_INTERNAL_KEY_SIZE * ((int) Math.ceil(encoder.maxBytesPerChar())));
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        int i7 = 0;
        int i10 = 0;
        while (i7 < text.length()) {
            int iMin = Math.min(8192 - i10, text.length() - i7);
            int i11 = i7 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            Intrinsics.checkNotNullExpressionValue(cArrArray, "array(...)");
            text.getChars(i7, i11, cArrArray, i10);
            charBufferAllocate.limit(iMin + i10);
            i10 = 1;
            if (!encoder.encode(charBufferAllocate, byteBufferAllocate, i11 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i10 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i7 = i11;
        }
    }
}
