package Pg;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: Pg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0554a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f7337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f7338b;

    static {
        l lVar = m.f7359d;
        f7337a = lVar.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").f7361a;
        f7338b = lVar.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").f7361a;
    }

    public static final String a(byte[] bArr, byte[] map) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i7 = 0;
        int i10 = 0;
        while (i7 < length) {
            byte b7 = bArr[i7];
            int i11 = i7 + 2;
            byte b10 = bArr[i7 + 1];
            i7 += 3;
            byte b11 = bArr[i11];
            bArr2[i10] = map[(b7 & UnsignedBytes.MAX_VALUE) >> 2];
            bArr2[i10 + 1] = map[((b7 & 3) << 4) | ((b10 & UnsignedBytes.MAX_VALUE) >> 4)];
            int i12 = i10 + 3;
            bArr2[i10 + 2] = map[((b10 & Ascii.SI) << 2) | ((b11 & UnsignedBytes.MAX_VALUE) >> 6)];
            i10 += 4;
            bArr2[i12] = map[b11 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b12 = bArr[i7];
            bArr2[i10] = map[(b12 & UnsignedBytes.MAX_VALUE) >> 2];
            bArr2[i10 + 1] = map[(b12 & 3) << 4];
            bArr2[i10 + 2] = 61;
            bArr2[i10 + 3] = 61;
        } else if (length2 == 2) {
            int i13 = i7 + 1;
            byte b13 = bArr[i7];
            byte b14 = bArr[i13];
            bArr2[i10] = map[(b13 & UnsignedBytes.MAX_VALUE) >> 2];
            bArr2[i10 + 1] = map[((b13 & 3) << 4) | ((b14 & UnsignedBytes.MAX_VALUE) >> 4)];
            bArr2[i10 + 2] = map[(b14 & Ascii.SI) << 2];
            bArr2[i10 + 3] = 61;
        }
        Intrinsics.checkNotNullParameter(bArr2, "<this>");
        return new String(bArr2, Charsets.UTF_8);
    }
}
