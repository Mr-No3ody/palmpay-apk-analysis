package p213o2;

import C0.G;
import Kf.b;
import Q2.a;
import androidx.camera.video.internal.c;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40018a = new a(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40019b = new a(4);

    public static void a(Boolean bool) {
        if (!bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z3, String str) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(boolean z3, String str, Object... objArr) {
        if (!z3) {
            throw new IllegalArgumentException(i(str, objArr));
        }
    }

    public static void d(int i7, int i10) {
        String strI;
        if (i7 < 0 || i7 >= i10) {
            if (i7 < 0) {
                strI = i("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i7));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(G.m(i10, "negative size: "));
                }
                strI = i("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i7), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strI);
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void f(boolean z3) {
        if (!z3) {
            throw new IllegalStateException();
        }
    }

    public static void g(InputStream inputStream, OutputStream outputStream) throws IOException {
        outputStream.getClass();
        byte[] bArr = new byte[4096];
        while (true) {
            int i7 = inputStream.read(bArr);
            if (i7 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i7);
            }
        }
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String i(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + str.length());
        int i7 = 0;
        int i10 = 0;
        while (i7 < objArr.length && (iIndexOf = str.indexOf("%s", i10)) != -1) {
            sb2.append(str.substring(i10, iIndexOf));
            sb2.append(objArr[i7]);
            i10 = iIndexOf + 2;
            i7++;
        }
        sb2.append(str.substring(i10));
        if (i7 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i7]);
            for (int i11 = i7 + 1; i11 < objArr.length; i11++) {
                sb2.append(", ");
                sb2.append(objArr[i11]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void j(Throwable th) throws Throwable {
        if (Error.class.isInstance(th)) {
            throw ((Throwable) Error.class.cast(th));
        }
        if (!RuntimeException.class.isInstance(th)) {
            throw new RuntimeException(th);
        }
        throw ((Throwable) RuntimeException.class.cast(th));
    }

    public static int k(int i7, InputStream inputStream, byte[] bArr) throws IOException {
        if (i7 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i10 = 0;
        while (i10 < i7) {
            int i11 = inputStream.read(bArr, i10, i7 - i10);
            if (i11 == -1) {
                break;
            }
            i10 += i11;
        }
        return i10;
    }

    public static byte[] l(FileInputStream fileInputStream, long j6) throws IOException {
        if (j6 > 2147483647L) {
            throw new OutOfMemoryError("file is too large to fit in a byte array: " + j6 + " bytes");
        }
        if (j6 == 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            g(fileInputStream, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        int i7 = (int) j6;
        byte[] bArr = new byte[i7];
        int i10 = i7;
        while (i10 > 0) {
            int i11 = i7 - i10;
            int i12 = fileInputStream.read(bArr, i11, i10);
            if (i12 == -1) {
                return Arrays.copyOf(bArr, i11);
            }
            i10 -= i12;
        }
        int i13 = fileInputStream.read();
        if (i13 == -1) {
            return bArr;
        }
        b bVar = new b();
        bVar.write(i13);
        g(fileInputStream, bVar);
        byte[] bArr2 = new byte[bVar.size() + i7];
        System.arraycopy(bArr, 0, bArr2, 0, i7);
        bVar.b(i7, bArr2);
        return bArr2;
    }

    public static c m(Object obj) {
        return new c(obj.getClass().getSimpleName());
    }
}
