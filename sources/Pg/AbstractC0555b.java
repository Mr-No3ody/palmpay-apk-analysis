package Pg;

import com.google.common.base.Ascii;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Sink;
import okio.Source;

/* JADX INFO: renamed from: Pg.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0555b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f7339a = new h();

    public static final boolean a(byte[] a3, int i7, byte[] b7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(a3, "a");
        Intrinsics.checkNotNullParameter(b7, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (a3[i12 + i7] != b7[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static final w b(Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        return new w(sink);
    }

    public static final x c(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return new x(source);
    }

    public static final void d(long j6, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j6 || j6 - j10 < j11) {
            StringBuilder sbR = androidx.camera.video.u.r(j6, "size=", " offset=");
            sbR.append(j10);
            sbR.append(" byteCount=");
            sbR.append(j11);
            throw new ArrayIndexOutOfBoundsException(sbR.toString());
        }
    }

    public static final boolean e(AssertionError assertionError) {
        Logger logger = s.f7375a;
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.A(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    public static final int f(int i7) {
        return ((i7 & 255) << 24) | (((-16777216) & i7) >>> 24) | ((16711680 & i7) >>> 8) | ((65280 & i7) << 8);
    }

    public static final long g(long j6) {
        return ((j6 & 255) << 56) | (((-72057594037927936L) & j6) >>> 56) | ((71776119061217280L & j6) >>> 40) | ((280375465082880L & j6) >>> 24) | ((1095216660480L & j6) >>> 8) | ((4278190080L & j6) << 8) | ((16711680 & j6) << 24) | ((65280 & j6) << 40);
    }

    public static final C0557d h(OutputStream outputStream) {
        Logger logger = s.f7375a;
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new C0557d(outputStream, new F());
    }

    public static final Sink i(Socket socket) throws IOException {
        Logger logger = s.f7375a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        C c6 = new C(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        return c6.sink(new C0557d(outputStream, c6));
    }

    public static C0557d j(File file) {
        Logger logger = s.f7375a;
        Intrinsics.checkNotNullParameter(file, "<this>");
        return h(new FileOutputStream(file, false));
    }

    public static long k(String str) {
        int i7;
        int length = str.length();
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException(androidx.camera.video.u.h(length, "endIndex < beginIndex: ", 0, " < ").toString());
        }
        if (length > str.length()) {
            StringBuilder sbE = androidx.camera.camera2.internal.F.e(length, "endIndex > string.length: ", " > ");
            sbE.append(str.length());
            throw new IllegalArgumentException(sbE.toString().toString());
        }
        long j6 = 0;
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                j6++;
            } else {
                if (cCharAt < 2048) {
                    i7 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i7 = 3;
                } else {
                    int i11 = i10 + 1;
                    char cCharAt2 = i11 < length ? str.charAt(i11) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j6++;
                        i10 = i11;
                    } else {
                        j6 += (long) 4;
                        i10 += 2;
                    }
                }
                j6 += (long) i7;
            }
            i10++;
        }
        return j6;
    }

    public static final C0558e l(InputStream inputStream) {
        Logger logger = s.f7375a;
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new C0558e(inputStream, new F());
    }

    public static final Source m(Socket socket) throws IOException {
        Logger logger = s.f7375a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        C c6 = new C(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return c6.source(new C0558e(inputStream, c6));
    }

    public static final String n(byte b7) {
        char[] cArr = Qg.b.f7851a;
        char[] cArr2 = {cArr[(b7 >> 4) & 15], cArr[b7 & Ascii.SI]};
        Intrinsics.checkNotNullParameter(cArr2, "<this>");
        return new String(cArr2);
    }
}
