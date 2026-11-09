package W2;

import com.facebook.common.webp.WebpBitmapFactory;
import com.facebook.imageformat.ImageFormat$FormatChecker;
import com.google.common.base.Ascii;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ImageFormat$FormatChecker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10511b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f10512c = {-1, -40, -1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f10513d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f10514e = {-119, 80, 78, 71, Ascii.CR, 10, Ascii.SUB, 10};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f10515f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f10516g = p059e1.a.c("GIF87a");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f10517h = p059e1.a.c("GIF89a");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f10518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f10519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte[] f10520k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f10521l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final byte[] f10522m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[][] f10523n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f10524o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f10525p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f10526q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f10527r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f10528s;
    public static final byte[] t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10529a;

    static {
        byte[] bArrC = p059e1.a.c("BM");
        f10518i = bArrC;
        f10519j = bArrC.length;
        f10520k = new byte[]{0, 0, 1, 0};
        f10521l = 4;
        f10522m = p059e1.a.c("ftyp");
        f10523n = new byte[][]{p059e1.a.c("heic"), p059e1.a.c("heix"), p059e1.a.c("hevc"), p059e1.a.c("hevx"), p059e1.a.c("mif1"), p059e1.a.c("msf1")};
        f10524o = new byte[]{73, 73, 42, 0};
        f10525p = new byte[]{77, 77, 0, 42};
        f10526q = 4;
        f10527r = new byte[]{3, 0, 8, 0};
        f10528s = p059e1.a.c("ftyp");
        t = p059e1.a.c("avif");
    }

    public b() {
        Integer num;
        Integer[] numArr = {21, 20, Integer.valueOf(f10513d), Integer.valueOf(f10515f), 6, Integer.valueOf(f10519j), Integer.valueOf(f10521l), 12, 4, 12};
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        if (numArr.length == 0) {
            num = null;
        } else {
            Integer num2 = numArr[0];
            Intrinsics.checkNotNullParameter(numArr, "<this>");
            int i7 = 1;
            int length = numArr.length - 1;
            if (1 <= length) {
                while (true) {
                    Integer num3 = numArr[i7];
                    num2 = num2.compareTo(num3) < 0 ? num3 : num2;
                    if (i7 == length) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            num = num2;
        }
        if (num == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f10529a = num.intValue();
    }

    @Override // com.facebook.imageformat.ImageFormat$FormatChecker
    public final e determineFormat(byte[] headerBytes, int i7) {
        Intrinsics.checkNotNullParameter(headerBytes, "headerBytes");
        boolean z3 = false;
        if (i7 < 20) {
            WebpBitmapFactory webpBitmapFactory = p346x2.a.f43562a;
        } else if (p346x2.a.b(0, headerBytes, p346x2.a.f43564c) && p346x2.a.b(8, headerBytes, p346x2.a.f43565d)) {
            z3 = true;
        }
        a aVar = f10511b;
        if (z3) {
            return aVar.getWebpFormat(headerBytes, i7);
        }
        if (aVar.isJpegHeader(headerBytes, i7)) {
            return c.f10530a;
        }
        if (aVar.isPngHeader(headerBytes, i7)) {
            return c.f10531b;
        }
        if (aVar.isGifHeader(headerBytes, i7)) {
            return c.f10532c;
        }
        if (aVar.isBmpHeader(headerBytes, i7)) {
            return c.f10533d;
        }
        if (aVar.isIcoHeader(headerBytes, i7)) {
            return c.f10534e;
        }
        if (aVar.isAvifHeader(headerBytes, i7)) {
            return c.f10543n;
        }
        if (aVar.isHeifHeader(headerBytes, i7)) {
            return c.f10540k;
        }
        if (aVar.isBinaryXmlHeader(headerBytes, i7)) {
            return c.f10542m;
        }
        return aVar.isDngHeader(headerBytes, i7) ? c.f10541l : e.f10545c;
    }

    @Override // com.facebook.imageformat.ImageFormat$FormatChecker
    public final int getHeaderSize() {
        return this.f10529a;
    }
}
