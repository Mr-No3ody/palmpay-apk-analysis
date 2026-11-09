package Qg;

import Pg.k;
import Pg.u;
import Pg.z;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f7850a;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "<this>");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        f7850a = bytes;
    }

    public static final boolean a(z segment, int i7, byte[] bytes, int i10) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i11 = segment.f7393c;
        byte[] bArr = segment.f7391a;
        for (int i12 = 1; i12 < i10; i12++) {
            if (i7 == i11) {
                segment = segment.f7396f;
                Intrinsics.e(segment);
                i7 = segment.f7392b;
                i11 = segment.f7393c;
                bArr = segment.f7391a;
            }
            if (bArr[i7] != bytes[i12]) {
                return false;
            }
            i7++;
        }
        return true;
    }

    public static final String b(k kVar, long j6) throws EOFException {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (j6 > 0) {
            long j10 = j6 - 1;
            if (kVar.e(j10) == 13) {
                String string = kVar.readString(j10, Charsets.UTF_8);
                kVar.skip(2L);
                return string;
            }
        }
        String string2 = kVar.readString(j6, Charsets.UTF_8);
        kVar.skip(1L);
        return string2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a5 A[LOOP:0: B:8:0x0023->B:48:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4 A[SYNTHETIC] */
    public static final int c(k kVar, u options, boolean z3) {
        int i7;
        byte[] bArr;
        int i10;
        int i11;
        z zVar;
        byte[] bArr2;
        int i12;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        z zVar2 = kVar.f7357a;
        if (zVar2 == null) {
            return z3 ? -2 : -1;
        }
        int i13 = zVar2.f7392b;
        int i14 = zVar2.f7393c;
        int[] iArr = options.f7378c;
        byte[] bArr3 = zVar2.f7391a;
        z zVar3 = zVar2;
        int i15 = -1;
        int i16 = 0;
        loop0: while (true) {
            int i17 = i16 + 1;
            int i18 = iArr[i16];
            int i19 = i16 + 2;
            int i20 = iArr[i17];
            if (i20 != -1) {
                i15 = i20;
            }
            if (zVar3 == null) {
                break;
            }
            if (i18 >= 0) {
                int i21 = i13 + 1;
                int i22 = bArr3[i13] & UnsignedBytes.MAX_VALUE;
                int i23 = i19 + i18;
                while (i19 != i23) {
                    if (i22 == iArr[i19]) {
                        i7 = iArr[i19 + i18];
                        if (i21 == i14) {
                            zVar3 = zVar3.f7396f;
                            Intrinsics.e(zVar3);
                            i11 = zVar3.f7392b;
                            i10 = zVar3.f7393c;
                            bArr = zVar3.f7391a;
                            if (zVar3 == zVar2) {
                                zVar3 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i10 = i14;
                            i11 = i21;
                        }
                        if (i7 >= 0) {
                            return i7;
                        }
                        byte[] bArr4 = bArr;
                        i16 = -i7;
                        i13 = i11;
                        i14 = i10;
                        bArr3 = bArr4;
                    } else {
                        i19++;
                    }
                }
                return i15;
            }
            int i24 = (i18 * (-1)) + i19;
            while (true) {
                int i25 = i13 + 1;
                int i26 = i19 + 1;
                if ((bArr3[i13] & UnsignedBytes.MAX_VALUE) == iArr[i19]) {
                    boolean z8 = i26 == i24;
                    if (i25 == i14) {
                        Intrinsics.e(zVar3);
                        z zVar4 = zVar3.f7396f;
                        Intrinsics.e(zVar4);
                        i12 = zVar4.f7392b;
                        int i27 = zVar4.f7393c;
                        bArr2 = zVar4.f7391a;
                        if (zVar4 != zVar2) {
                            zVar = zVar4;
                            i14 = i27;
                        } else {
                            if (!z8) {
                                break loop0;
                            }
                            i14 = i27;
                            zVar = null;
                        }
                    } else {
                        zVar = zVar3;
                        bArr2 = bArr3;
                        i12 = i25;
                    }
                    if (z8) {
                        i7 = iArr[i26];
                        int i28 = i12;
                        i10 = i14;
                        i11 = i28;
                        byte[] bArr5 = bArr2;
                        zVar3 = zVar;
                        bArr = bArr5;
                        break;
                    }
                    i13 = i12;
                    bArr3 = bArr2;
                    zVar3 = zVar;
                    i19 = i26;
                }
                return i15;
            }
            if (i7 >= 0) {
                return i7;
            }
            byte[] bArr6 = bArr;
            i16 = -i7;
            i13 = i11;
            i14 = i10;
            bArr3 = bArr6;
        }
        if (z3) {
            return -2;
        }
        return i15;
    }
}
