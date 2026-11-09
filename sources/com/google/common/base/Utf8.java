package com.google.common.base;

import com.airbnb.lottie.model.layer.d;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes2.dex */
@Beta
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Utf8 {
    private Utf8() {
    }

    public static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length && charSequence.charAt(i7) < 128) {
            i7++;
        }
        int iEncodedLengthGeneral = length;
        while (i7 < length) {
            char cCharAt = charSequence.charAt(i7);
            if (cCharAt >= 2048) {
                iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i7);
                break;
            }
            iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
            i7++;
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        long j6 = ((long) iEncodedLengthGeneral) + 4294967296L;
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j6);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        int i10 = 0;
        while (i7 < length) {
            char cCharAt = charSequence.charAt(i7);
            if (cCharAt < 2048) {
                i10 += (127 - cCharAt) >>> 31;
            } else {
                i10 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i7) == cCharAt) {
                        throw new IllegalArgumentException(unpairedSurrogateMsg(i7));
                    }
                    i7++;
                }
            }
            i7++;
        }
        return i10;
    }

    public static boolean isWellFormed(byte[] bArr) {
        return isWellFormed(bArr, 0, bArr.length);
    }

    private static boolean isWellFormedSlowPath(byte[] bArr, int i7, int i10) {
        byte b7;
        while (i7 < i10) {
            int i11 = i7 + 1;
            byte b10 = bArr[i7];
            if (b10 < 0) {
                if (b10 < -32) {
                    if (i11 != i10 && b10 >= -62) {
                        i7 += 2;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return false;
                }
                if (b10 < -16) {
                    int i12 = i7 + 2;
                    if (i12 < i10 && (b7 = bArr[i11]) <= -65 && ((b10 != -32 || b7 >= -96) && (b10 != -19 || -96 > b7))) {
                        i7 += 3;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return false;
                }
                if (i7 + 3 >= i10) {
                    return false;
                }
                int i13 = i7 + 2;
                byte b11 = bArr[i11];
                if (b11 <= -65) {
                    if ((((b11 + 112) + (b10 << Ascii.FS)) >> 30) == 0) {
                        int i14 = i7 + 3;
                        if (bArr[i13] <= -65) {
                            i7 += 4;
                            if (bArr[i14] > -65) {
                            }
                        }
                    }
                }
                return false;
            }
            i7 = i11;
        }
        return true;
    }

    private static String unpairedSurrogateMsg(int i7) {
        return d.g(39, i7, "Unpaired surrogate at index ");
    }

    public static boolean isWellFormed(byte[] bArr, int i7, int i10) {
        int i11 = i10 + i7;
        Preconditions.checkPositionIndexes(i7, i11, bArr.length);
        while (i7 < i11) {
            if (bArr[i7] < 0) {
                return isWellFormedSlowPath(bArr, i7, i11);
            }
            i7++;
        }
        return true;
    }
}
