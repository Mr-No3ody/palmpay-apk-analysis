package p346x2;

import com.facebook.common.webp.WebpBitmapFactory;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WebpBitmapFactory f43562a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f43563b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f43564c = a("RIFF");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f43565d = a("WEBP");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f43566e = a("VP8 ");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f43567f = a("VP8L");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f43568g = a("VP8X");

    public static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }

    public static boolean b(int i7, byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i7 > bArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            if (bArr[i10 + i7] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }
}
