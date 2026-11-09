package Ug;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InputStream f9773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9777h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f9770a = new byte[4160];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f9771b = new int[1040];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1.d f9772c = new p1.d(14, false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9778i = 0;

    public static void a(a aVar, boolean z3) {
        if (aVar.f9774e) {
            int i7 = ((aVar.f9777h << 2) + ((aVar.f9776g + 7) >> 3)) - 8;
            int i10 = aVar.f9778i;
            if (i7 > i10) {
                throw new c("Read after end");
            }
            if (z3 && i7 != i10) {
                throw new c("Unused bytes after end");
            }
        }
    }

    public static void b(a aVar) {
        int i7 = aVar.f9776g;
        if (i7 >= 32) {
            int i10 = aVar.f9777h;
            aVar.f9777h = i10 + 1;
            aVar.f9775f = (((long) aVar.f9771b[i10]) << 32) | (aVar.f9775f >>> 32);
            aVar.f9776g = i7 - 32;
        }
    }

    public static int c(a aVar) {
        return (aVar.f9774e ? (aVar.f9778i + 3) >> 2 : 1024) - aVar.f9777h;
    }

    public static int d(a aVar, int i7) {
        b(aVar);
        long j6 = aVar.f9775f;
        int i10 = aVar.f9776g;
        int i11 = ((int) (j6 >>> i10)) & ((1 << i7) - 1);
        aVar.f9776g = i10 + i7;
        return i11;
    }

    public static void e(a aVar) {
        int i7 = aVar.f9777h;
        if (i7 <= 1015) {
            return;
        }
        if (aVar.f9774e) {
            if (c(aVar) < -2) {
                throw new c("No more input");
            }
            return;
        }
        int i10 = i7 << 2;
        int i11 = 4096 - i10;
        byte[] bArr = aVar.f9770a;
        System.arraycopy(bArr, i10, bArr, 0, i11);
        aVar.f9777h = 0;
        while (i11 < 4096) {
            try {
                int i12 = aVar.f9773d.read(bArr, i11, 4096 - i11);
                if (i12 <= 0) {
                    aVar.f9774e = true;
                    aVar.f9778i = i11;
                    i11 += 3;
                    break;
                }
                i11 += i12;
            } catch (IOException e10) {
                throw new c("Failed to read input", e10);
            }
        }
        int i13 = i11 >> 2;
        for (int i14 = 0; i14 < i13; i14++) {
            p1.d dVar = aVar.f9772c;
            int[] iArr = (int[]) dVar.f41179c;
            byte[] bArr2 = (byte[]) dVar.f41178b;
            int i15 = i14 * 4;
            iArr[i14] = ((bArr2[i15 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr2[i15] & UnsignedBytes.MAX_VALUE) | ((bArr2[i15 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr2[i15 + 2] & UnsignedBytes.MAX_VALUE) << 16);
        }
    }
}
