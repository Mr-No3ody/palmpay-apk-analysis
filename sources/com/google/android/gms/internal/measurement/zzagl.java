package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
final class zzagl {
    static {
        int i7 = zzacf.zza;
    }

    public static boolean zza(byte[] bArr, int i7, int i10) {
        while (i7 < i10 && bArr[i7] >= 0) {
            i7++;
        }
        if (i7 >= i10) {
            return true;
        }
        while (i7 < i10) {
            int i11 = i7 + 1;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                i7 = i11;
            } else {
                if (b7 < -32) {
                    if (i11 < i10 && b7 >= -62) {
                        i7 += 2;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return false;
                }
                if (b7 >= -16) {
                    if (i11 >= i10 - 2) {
                        return false;
                    }
                    int i12 = i7 + 2;
                    byte b10 = bArr[i11];
                    if (b10 <= -65) {
                        if ((((b10 + 112) + (b7 << Ascii.FS)) >> 30) == 0) {
                            int i13 = i7 + 3;
                            if (bArr[i12] <= -65) {
                                i7 += 4;
                                if (bArr[i13] > -65) {
                                }
                            }
                        }
                    }
                    return false;
                }
                if (i11 >= i10 - 1) {
                    return false;
                }
                int i14 = i7 + 2;
                byte b11 = bArr[i11];
                if (b11 > -65 || (b7 == -32 && b11 < -96)) {
                    return false;
                }
                if (b7 == -19 && b11 >= -96) {
                    return false;
                }
                i7 += 3;
                if (bArr[i14] > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int zzb(String str) {
        int length = str.length();
        int i7 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 2048) {
                try {
                    int length2 = str.length();
                    while (i10 < length2) {
                        char cCharAt2 = str.charAt(i10);
                        if (cCharAt2 < 2048) {
                            i7 += (127 - cCharAt2) >>> 31;
                        } else {
                            i7 += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i10) < 65536) {
                                    throw new zzagk(i10, length2);
                                }
                                i10++;
                            }
                        }
                        i10++;
                    }
                    i11 += i7;
                    break;
                } catch (zzagk unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            i11 += (127 - cCharAt) >>> 31;
            i10++;
        }
        if (i11 >= length) {
            return i11;
        }
        long j6 = ((long) i11) + 4294967296L;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j6).length() + 34);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j6);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int zzc(String str, byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        int i13;
        char cCharAt;
        int length = str.length();
        int i14 = 0;
        while (true) {
            i11 = i7 + i10;
            if (i14 >= length || (i13 = i14 + i7) >= i11 || (cCharAt = str.charAt(i14)) >= 128) {
                break;
            }
            bArr[i13] = (byte) cCharAt;
            i14++;
        }
        if (i14 == length) {
            return i7 + length;
        }
        int i15 = i7 + i14;
        while (i14 < length) {
            char cCharAt2 = str.charAt(i14);
            if (cCharAt2 < 128 && i15 < i11) {
                bArr[i15] = (byte) cCharAt2;
                i15++;
            } else if (cCharAt2 < 2048 && i15 <= i11 - 2) {
                bArr[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i15 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i15 > i11 - 3) {
                    if (i15 > i11 - 4) {
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i12 = i14 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        return zzagi.zza(str, bArr, i7, i10);
                    }
                    i14++;
                    if (i14 != str.length()) {
                        char cCharAt3 = str.charAt(i14);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i16 = i15 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i15 += 4;
                            bArr[i16] = (byte) ((codePoint & 63) | 128);
                        }
                    }
                    return zzagi.zza(str, bArr, i7, i10);
                }
                bArr[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i15 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i15 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i15 += 3;
            }
            i14++;
        }
        return i15;
    }

    public static String zzd(byte[] bArr, int i7, int i10) throws zzaeh {
        int i11;
        if (i10 == 0) {
            return "";
        }
        int length = bArr.length;
        if ((((length - i7) - i10) | i7 | i10) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i7), Integer.valueOf(i10)));
        }
        int i12 = i7 + i10;
        char[] cArr = new char[i10];
        int i13 = 0;
        while (i7 < i12) {
            byte b7 = bArr[i7];
            if (!zzagh.zza(b7)) {
                break;
            }
            i7++;
            cArr[i13] = (char) b7;
            i13++;
        }
        int i14 = i13;
        while (i7 < i12) {
            int i15 = i7 + 1;
            byte b10 = bArr[i7];
            if (zzagh.zza(b10)) {
                cArr[i14] = (char) b10;
                i14++;
                i7 = i15;
                while (i7 < i12) {
                    byte b11 = bArr[i7];
                    if (!zzagh.zza(b11)) {
                        break;
                    }
                    i7++;
                    cArr[i14] = (char) b11;
                    i14++;
                }
            } else {
                if (b10 < -32) {
                    if (i15 >= i12) {
                        throw new zzaeh("Protocol message had invalid UTF-8.");
                    }
                    i11 = i14 + 1;
                    i7 += 2;
                    zzagh.zzb(b10, bArr[i15], cArr, i14);
                } else if (b10 < -16) {
                    if (i15 >= i12 - 1) {
                        throw new zzaeh("Protocol message had invalid UTF-8.");
                    }
                    i11 = i14 + 1;
                    int i16 = i7 + 2;
                    i7 += 3;
                    zzagh.zzc(b10, bArr[i15], bArr[i16], cArr, i14);
                } else {
                    if (i15 >= i12 - 2) {
                        throw new zzaeh("Protocol message had invalid UTF-8.");
                    }
                    byte b12 = bArr[i15];
                    int i17 = i7 + 3;
                    byte b13 = bArr[i7 + 2];
                    i7 += 4;
                    zzagh.zzd(b10, b12, b13, bArr[i17], cArr, i14);
                    i14 += 2;
                }
                i14 = i11;
            }
        }
        return new String(cArr, 0, i14);
    }
}
