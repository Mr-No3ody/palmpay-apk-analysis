package W2;

import com.facebook.common.webp.WebpBitmapFactory;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int getBoxLength(byte[] bArr) {
        if (bArr.length < 4) {
            return -1;
        }
        return (bArr[3] & UnsignedBytes.MAX_VALUE) | ((bArr[0] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[2] & UnsignedBytes.MAX_VALUE) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e getWebpFormat(byte[] bArr, int i7) {
        if (i7 >= 20) {
            if (p346x2.a.b(0, bArr, p346x2.a.f43564c) && p346x2.a.b(8, bArr, p346x2.a.f43565d)) {
                if (p346x2.a.b(12, bArr, p346x2.a.f43566e)) {
                    return c.f10535f;
                }
                if (p346x2.a.b(12, bArr, p346x2.a.f43567f)) {
                    return c.f10536g;
                }
                if (i7 >= 21) {
                    byte[] bArr2 = p346x2.a.f43568g;
                    if (p346x2.a.b(12, bArr, bArr2)) {
                        boolean zB = p346x2.a.b(12, bArr, bArr2);
                        boolean z3 = (bArr[20] & 2) == 2;
                        if (zB && z3) {
                            return c.f10539j;
                        }
                        return (p346x2.a.b(12, bArr, bArr2) && ((bArr[20] & Ascii.DLE) == 16)) ? c.f10538i : c.f10537h;
                    }
                }
                return e.f10545c;
            }
        } else {
            WebpBitmapFactory webpBitmapFactory = p346x2.a.f43562a;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAvifHeader(byte[] bArr, int i7) {
        if (i7 >= 12 && getBoxLength(bArr) >= 8 && p059e1.a.M(4, bArr, b.f10528s)) {
            return p059e1.a.M(8, bArr, b.t);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isBinaryXmlHeader(byte[] bArr, int i7) {
        return i7 >= 4 && p059e1.a.a0(bArr, b.f10527r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isBmpHeader(byte[] bArr, int i7) {
        byte[] bArr2 = b.f10518i;
        if (i7 < bArr2.length) {
            return false;
        }
        return p059e1.a.a0(bArr, bArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDngHeader(byte[] bArr, int i7) {
        if (i7 >= b.f10526q) {
            return p059e1.a.a0(bArr, b.f10524o) || p059e1.a.a0(bArr, b.f10525p);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isGifHeader(byte[] bArr, int i7) {
        if (i7 < 6) {
            return false;
        }
        return p059e1.a.a0(bArr, b.f10516g) || p059e1.a.a0(bArr, b.f10517h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHeifHeader(byte[] bArr, int i7) {
        if (i7 >= 12 && bArr[3] >= 8 && p059e1.a.M(4, bArr, b.f10522m)) {
            for (byte[] bArr2 : b.f10523n) {
                if (p059e1.a.M(8, bArr, bArr2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isIcoHeader(byte[] bArr, int i7) {
        byte[] bArr2 = b.f10520k;
        if (i7 < bArr2.length) {
            return false;
        }
        return p059e1.a.a0(bArr, bArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isJpegHeader(byte[] bArr, int i7) {
        byte[] bArr2 = b.f10512c;
        return i7 >= bArr2.length && p059e1.a.a0(bArr, bArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPngHeader(byte[] bArr, int i7) {
        byte[] bArr2 = b.f10514e;
        return i7 >= bArr2.length && p059e1.a.a0(bArr, bArr2);
    }

    private a() {
    }
}
