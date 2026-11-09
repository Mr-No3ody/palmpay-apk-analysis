package androidx.datastore.preferences.protobuf;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x2 extends AbstractC1102h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16810a;

    public static int x(byte[] bArr, int i7, long j6, int i10) {
        if (i10 == 0) {
            AbstractC1102h abstractC1102h = z2.f16817a;
            if (i7 > -12) {
                return -1;
            }
            return i7;
        }
        if (i10 == 1) {
            return z2.c(i7, w2.g(bArr, j6));
        }
        if (i10 == 2) {
            return z2.d(i7, w2.g(bArr, j6), w2.g(bArr, j6 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e A[LOOP:2: B:24:0x0058->B:27:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0067 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC1102h
    public final String i(byte[] bArr, int i7, int i10) throws C1160z1 {
        int i11;
        int i12;
        byte b7;
        int i13;
        int i14;
        byte b10;
        switch (this.f16810a) {
            case 0:
                if ((i7 | i10 | ((bArr.length - i7) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i10)));
                }
                int i15 = i7 + i10;
                char[] cArr = new char[i10];
                int i16 = 0;
                while (i7 < i15) {
                    byte b11 = bArr[i7];
                    if (b11 < 0) {
                        i11 = i16;
                        while (i7 < i15) {
                            i12 = i7 + 1;
                            b7 = bArr[i7];
                            if (b7 >= 0) {
                                i13 = i11 + 1;
                                cArr[i11] = (char) b7;
                                i14 = i12;
                                while (i14 < i15) {
                                    b10 = bArr[i14];
                                    if (b10 >= 0) {
                                        i14++;
                                        cArr[i13] = (char) b10;
                                        i13++;
                                    } else {
                                        i11 = i13;
                                        i7 = i14;
                                    }
                                }
                                i11 = i13;
                                i7 = i14;
                            } else if (b7 < -32) {
                                if (i12 < i15) {
                                    throw C1160z1.b();
                                }
                                i7 += 2;
                                AbstractC1102h.b(b7, bArr[i12], cArr, i11);
                                i11++;
                            } else if (b7 < -16) {
                                if (i12 < i15 - 1) {
                                    throw C1160z1.b();
                                }
                                int i17 = i7 + 2;
                                i7 += 3;
                                AbstractC1102h.c(b7, bArr[i12], bArr[i17], cArr, i11);
                                i11++;
                            } else {
                                if (i12 < i15 - 2) {
                                    throw C1160z1.b();
                                }
                                byte b12 = bArr[i12];
                                int i18 = i7 + 3;
                                byte b13 = bArr[i7 + 2];
                                i7 += 4;
                                AbstractC1102h.a(b7, b12, b13, bArr[i18], cArr, i11);
                                i11 += 2;
                            }
                        }
                        return new String(cArr, 0, i11);
                    }
                    i7++;
                    cArr[i16] = (char) b11;
                    i16++;
                }
                i11 = i16;
                while (i7 < i15) {
                    i12 = i7 + 1;
                    b7 = bArr[i7];
                    if (b7 >= 0) {
                        i13 = i11 + 1;
                        cArr[i11] = (char) b7;
                        i14 = i12;
                        while (i14 < i15) {
                            b10 = bArr[i14];
                            if (b10 >= 0) {
                                i14++;
                                cArr[i13] = (char) b10;
                                i13++;
                            } else {
                                i11 = i13;
                                i7 = i14;
                            }
                        }
                        i11 = i13;
                        i7 = i14;
                    } else if (b7 < -32) {
                        if (i12 < i15) {
                            throw C1160z1.b();
                        }
                        i7 += 2;
                        AbstractC1102h.b(b7, bArr[i12], cArr, i11);
                        i11++;
                    } else if (b7 < -16) {
                        if (i12 < i15 - 1) {
                            throw C1160z1.b();
                        }
                        int i19 = i7 + 2;
                        i7 += 3;
                        AbstractC1102h.c(b7, bArr[i12], bArr[i19], cArr, i11);
                        i11++;
                    } else {
                        if (i12 < i15 - 2) {
                            throw C1160z1.b();
                        }
                        byte b14 = bArr[i12];
                        int i110 = i7 + 3;
                        byte b15 = bArr[i7 + 2];
                        i7 += 4;
                        AbstractC1102h.a(b7, b14, b15, bArr[i110], cArr, i11);
                        i11 += 2;
                    }
                }
                return new String(cArr, 0, i11);
            default:
                Charset charset = AbstractC1154x1.f16808a;
                String str = new String(bArr, i7, i10, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i7, i10 + i7))) {
                    throw C1160z1.b();
                }
                return str;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1102h
    public final String k(ByteBuffer byteBuffer, int i7, int i10) throws C1160z1 {
        long j6;
        byte bE;
        byte bE2;
        switch (this.f16810a) {
            case 0:
                return AbstractC1102h.j(byteBuffer, i7, i10);
            default:
                if ((i7 | i10 | ((byteBuffer.limit() - i7) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i10)));
                }
                long j10 = w2.f16802c.j(byteBuffer, w2.f16806g) + ((long) i7);
                long j11 = ((long) i10) + j10;
                char[] cArr = new char[i10];
                int i11 = 0;
                while (true) {
                    j6 = 1;
                    if (j10 < j11 && (bE2 = w2.f16802c.e(j10)) >= 0) {
                        j10++;
                        cArr[i11] = (char) bE2;
                        i11++;
                    }
                }
                int i12 = i11;
                while (j10 < j11) {
                    long j12 = j10 + j6;
                    v2 v2Var = w2.f16802c;
                    byte bE3 = v2Var.e(j10);
                    if (bE3 >= 0) {
                        int i13 = i12 + 1;
                        cArr[i12] = (char) bE3;
                        while (j12 < j11 && (bE = w2.f16802c.e(j12)) >= 0) {
                            j12 += j6;
                            cArr[i13] = (char) bE;
                            i13++;
                        }
                        i12 = i13;
                        j10 = j12;
                    } else {
                        if (!(bE3 < -32)) {
                            if (bE3 < -16) {
                                if (j12 >= j11 - j6) {
                                    throw C1160z1.b();
                                }
                                long j13 = j10 + 2;
                                j10 += 3;
                                AbstractC1102h.c(bE3, v2Var.e(j12), v2Var.e(j13), cArr, i12);
                                i12++;
                            } else {
                                if (j12 >= j11 - 2) {
                                    throw C1160z1.b();
                                }
                                byte bE4 = v2Var.e(j12);
                                long j14 = j10 + 3;
                                byte bE5 = v2Var.e(j10 + 2);
                                j10 += 4;
                                AbstractC1102h.a(bE3, bE4, bE5, v2Var.e(j14), cArr, i12);
                                i12 += 2;
                            }
                        } else {
                            if (j12 >= j11) {
                                throw C1160z1.b();
                            }
                            j10 += 2;
                            AbstractC1102h.b(bE3, v2Var.e(j12), cArr, i12);
                            i12++;
                        }
                    }
                    j6 = 1;
                }
                return new String(cArr, 0, i12);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1102h
    public final int p(String str, byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        char cCharAt;
        long j6;
        char c6;
        long j10;
        long j11;
        char c10;
        int i13;
        char cCharAt2;
        switch (this.f16810a) {
            case 0:
                int length = str.length();
                int i14 = i10 + i7;
                int i15 = 0;
                while (i15 < length && (i12 = i15 + i7) < i14 && (cCharAt = str.charAt(i15)) < 128) {
                    bArr[i12] = (byte) cCharAt;
                    i15++;
                }
                if (i15 == length) {
                    return i7 + length;
                }
                int i16 = i7 + i15;
                while (i15 < length) {
                    char cCharAt3 = str.charAt(i15);
                    if (cCharAt3 < 128 && i16 < i14) {
                        bArr[i16] = (byte) cCharAt3;
                        i16++;
                    } else if (cCharAt3 < 2048 && i16 <= i14 - 2) {
                        int i17 = i16 + 1;
                        bArr[i16] = (byte) ((cCharAt3 >>> 6) | 960);
                        i16 += 2;
                        bArr[i17] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i16 > i14 - 3) {
                            if (i16 > i14 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i11 = i15 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i11)))) {
                                    throw new y2(i15, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i16);
                            }
                            int i18 = i15 + 1;
                            if (i18 != str.length()) {
                                char cCharAt4 = str.charAt(i18);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i19 = i16 + 3;
                                    bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i16 += 4;
                                    bArr[i19] = (byte) ((codePoint & 63) | 128);
                                    i15 = i18;
                                } else {
                                    i15 = i18;
                                }
                            }
                            throw new y2(i15 - 1, length);
                        }
                        bArr[i16] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i20 = i16 + 2;
                        bArr[i16 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i16 += 3;
                        bArr[i20] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i15++;
                }
                return i16;
            default:
                long j12 = i7;
                long j13 = ((long) i10) + j12;
                int length2 = str.length();
                if (length2 > i10 || bArr.length - i10 < i7) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i7 + i10));
                }
                int i21 = 0;
                while (true) {
                    j6 = 1;
                    c6 = 128;
                    if (i21 < length2 && (cCharAt2 = str.charAt(i21)) < 128) {
                        w2.k(bArr, j12, (byte) cCharAt2);
                        i21++;
                        j12 = 1 + j12;
                    }
                }
                if (i21 == length2) {
                    return (int) j12;
                }
                while (i21 < length2) {
                    char cCharAt5 = str.charAt(i21);
                    if (cCharAt5 < c6 && j12 < j13) {
                        w2.k(bArr, j12, (byte) cCharAt5);
                        c10 = c6;
                        j10 = j6;
                        j11 = j12 + j6;
                    } else if (cCharAt5 >= 2048 || j12 > j13 - 2) {
                        j10 = j6;
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j12 > j13 - 3) {
                            long j14 = j12;
                            if (j14 > j13 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i13 = i21 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i13)))) {
                                    throw new y2(i21, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j14);
                            }
                            int i22 = i21 + 1;
                            if (i22 != length2) {
                                char cCharAt6 = str.charAt(i22);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    w2.k(bArr, j14, (byte) ((codePoint2 >>> 18) | 240));
                                    c10 = 128;
                                    w2.k(bArr, j14 + j10, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    w2.k(bArr, j14 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    w2.k(bArr, j14 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j11 = j14 + 4;
                                    i21 = i22;
                                } else {
                                    i21 = i22;
                                }
                            }
                            throw new y2(i21 - 1, length2);
                        }
                        w2.k(bArr, j12, (byte) ((cCharAt5 >>> '\f') | 480));
                        long j15 = j12;
                        w2.k(bArr, j12 + j10, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                        j11 = j15 + 3;
                        w2.k(bArr, j15 + 2, (byte) ((cCharAt5 & '?') | 128));
                        c10 = 128;
                    } else {
                        j10 = j6;
                        w2.k(bArr, j12, (byte) ((cCharAt5 >>> 6) | 960));
                        w2.k(bArr, j12 + j10, (byte) ((cCharAt5 & '?') | c6));
                        j11 = j12 + 2;
                        c10 = c6;
                    }
                    i21++;
                    c6 = c10;
                    j12 = j11;
                    j6 = j10;
                }
                return (int) j12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ed  */
    @Override // androidx.datastore.preferences.protobuf.AbstractC1102h
    public final int u(byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        long j6;
        long j10;
        byte bG;
        long j11;
        byte bG2;
        long j12;
        int i13 = i7;
        switch (this.f16810a) {
            case 0:
                break;
            default:
                if ((i13 | i10 | (bArr.length - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i10)));
                }
                long j13 = i13;
                int i14 = (int) (((long) i10) - j13);
                long j14 = 1;
                if (i14 < 16) {
                    i11 = 0;
                } else {
                    int i15 = 8 - (((int) j13) & 7);
                    long j15 = j13;
                    i11 = 0;
                    while (true) {
                        if (i11 < i15) {
                            long j16 = j15 + 1;
                            if (w2.g(bArr, j15) >= 0) {
                                i11++;
                                j15 = j16;
                            }
                        } else {
                            while (true) {
                                int i16 = i11 + 8;
                                if (i16 <= i14) {
                                    if ((w2.f16802c.j(bArr, w2.f16805f + j15) & (-9187201950435737472L)) == 0) {
                                        j15 += 8;
                                        i11 = i16;
                                    }
                                }
                            }
                            while (true) {
                                if (i11 < i14) {
                                    long j17 = j15 + 1;
                                    if (w2.g(bArr, j15) >= 0) {
                                        i11++;
                                        j15 = j17;
                                    }
                                } else {
                                    i11 = i14;
                                }
                            }
                        }
                    }
                }
                int i17 = i14 - i11;
                long j18 = j13 + ((long) i11);
                while (true) {
                    byte bG3 = 0;
                    while (i17 > 0) {
                        long j19 = j18 + j14;
                        bG3 = w2.g(bArr, j18);
                        if (bG3 >= 0) {
                            i17--;
                            j18 = j19;
                        } else {
                            j18 = j19;
                            if (i17 == 0) {
                                return 0;
                            }
                            i12 = i17 - 1;
                            if (bG3 < -32) {
                                if (i12 == 0) {
                                    return bG3;
                                }
                                i17 -= 2;
                                if (bG3 >= -62) {
                                    j12 = j18 + j14;
                                    if (w2.g(bArr, j18) > -65) {
                                        j6 = j14;
                                        j18 = j12;
                                        j14 = j6;
                                    }
                                }
                            } else if (bG3 < -16) {
                                j6 = j14;
                                if (i12 < 3) {
                                    return x(bArr, bG3, j18, i12);
                                }
                                i17 -= 4;
                                j10 = j18 + j6;
                                bG = w2.g(bArr, j18);
                                if (bG <= -65) {
                                    if ((((bG + 112) + (bG3 << Ascii.FS)) >> 30) == 0) {
                                        j11 = 2 + j18;
                                        if (w2.g(bArr, j10) <= -65) {
                                            j18 += 3;
                                            if (w2.g(bArr, j11) > -65) {
                                                j14 = j6;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (i12 < 2) {
                                    return x(bArr, bG3, j18, i12);
                                }
                                i17 -= 3;
                                j6 = j14;
                                long j20 = j18 + j6;
                                bG2 = w2.g(bArr, j18);
                                if (bG2 > -65 && ((bG3 != -32 || bG2 >= -96) && (bG3 != -19 || bG2 < -96))) {
                                    j18 += 2;
                                    if (w2.g(bArr, j20) <= -65) {
                                        j14 = j6;
                                    }
                                }
                            }
                        }
                    }
                    if (i17 == 0) {
                        return 0;
                    }
                    i12 = i17 - 1;
                    if (bG3 < -32) {
                        if (i12 == 0) {
                            return bG3;
                        }
                        i17 -= 2;
                        if (bG3 >= -62) {
                            j12 = j18 + j14;
                            if (w2.g(bArr, j18) > -65) {
                                j6 = j14;
                                j18 = j12;
                                j14 = j6;
                            }
                        }
                    } else if (bG3 < -16) {
                        j6 = j14;
                        if (i12 < 3) {
                            return x(bArr, bG3, j18, i12);
                        }
                        i17 -= 4;
                        j10 = j18 + j6;
                        bG = w2.g(bArr, j18);
                        if (bG <= -65) {
                            if ((((bG + 112) + (bG3 << Ascii.FS)) >> 30) == 0) {
                                j11 = 2 + j18;
                                if (w2.g(bArr, j10) <= -65) {
                                    j18 += 3;
                                    if (w2.g(bArr, j11) > -65) {
                                        j14 = j6;
                                    }
                                }
                            }
                        }
                    } else {
                        if (i12 < 2) {
                            return x(bArr, bG3, j18, i12);
                        }
                        i17 -= 3;
                        j6 = j14;
                        long j21 = j18 + j6;
                        bG2 = w2.g(bArr, j18);
                        if (bG2 > -65) {
                        }
                    }
                }
                return -1;
        }
        while (i13 < i10 && bArr[i13] >= 0) {
            i13++;
        }
        if (i13 < i10) {
            while (i13 < i10) {
                int i18 = i13 + 1;
                byte b7 = bArr[i13];
                if (b7 < 0) {
                    if (b7 < -32) {
                        if (i18 >= i10) {
                            return b7;
                        }
                        if (b7 >= -62) {
                            i13 += 2;
                            if (bArr[i18] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b7 < -16) {
                        if (i18 >= i10 - 1) {
                            return z2.a(bArr, i18, i10);
                        }
                        int i19 = i13 + 2;
                        byte b10 = bArr[i18];
                        if (b10 <= -65 && ((b7 != -32 || b10 >= -96) && (b7 != -19 || b10 < -96))) {
                            i13 += 3;
                            if (bArr[i19] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i18 >= i10 - 2) {
                        return z2.a(bArr, i18, i10);
                    }
                    int i20 = i13 + 2;
                    byte b11 = bArr[i18];
                    if (b11 <= -65) {
                        if ((((b11 + 112) + (b7 << Ascii.FS)) >> 30) == 0) {
                            int i21 = i13 + 3;
                            if (bArr[i20] <= -65) {
                                i13 += 4;
                                if (bArr[i21] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i13 = i18;
            }
        }
        return 0;
    }
}
