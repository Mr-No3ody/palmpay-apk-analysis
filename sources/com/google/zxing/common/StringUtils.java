package com.google.zxing.common;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class StringUtils {
    private static final boolean ASSUME_SHIFT_JIS;
    private static final Charset EUC_JP;
    public static final String GB2312 = "GB2312";
    public static final Charset GB2312_CHARSET;
    private static final Charset PLATFORM_DEFAULT_ENCODING = Charset.defaultCharset();
    public static final String SHIFT_JIS = "SJIS";
    public static final Charset SHIFT_JIS_CHARSET;

    static {
        Charset charsetForName;
        Charset charsetForName2;
        Charset charsetForName3 = null;
        try {
            charsetForName = Charset.forName(SHIFT_JIS);
        } catch (UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        SHIFT_JIS_CHARSET = charsetForName;
        try {
            charsetForName2 = Charset.forName(GB2312);
        } catch (UnsupportedCharsetException unused2) {
            charsetForName2 = null;
        }
        GB2312_CHARSET = charsetForName2;
        try {
            charsetForName3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        EUC_JP = charsetForName3;
        Charset charset = SHIFT_JIS_CHARSET;
        ASSUME_SHIFT_JIS = (charset != null && charset.equals(PLATFORM_DEFAULT_ENCODING)) || (charsetForName3 != null && charsetForName3.equals(PLATFORM_DEFAULT_ENCODING));
    }

    private StringUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:88:0x00e1 A[PHI: r19
      0x00e1: PHI (r19v6 boolean) = (r19v5 boolean), (r19v5 boolean), (r19v5 boolean), (r19v7 boolean), (r19v7 boolean), (r19v7 boolean) binds: [B:90:0x00e7, B:92:0x00eb, B:94:0x00ef, B:82:0x00d5, B:83:0x00d7, B:85:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    public static Charset guessCharset(byte[] bArr, Map<DecodeHintType, ?> map) {
        boolean z3;
        boolean z8;
        boolean z10;
        byte b7;
        byte[] bArr2 = bArr;
        if (map != null) {
            DecodeHintType decodeHintType = DecodeHintType.CHARACTER_SET;
            if (map.containsKey(decodeHintType)) {
                return Charset.forName(map.get(decodeHintType).toString());
            }
        }
        boolean z11 = true;
        int i7 = 0;
        if (bArr2.length > 2 && (((b7 = bArr2[0]) == -2 && bArr2[1] == -1) || (b7 == -1 && bArr2[1] == -2))) {
            return StandardCharsets.UTF_16;
        }
        int length = bArr2.length;
        boolean z12 = SHIFT_JIS_CHARSET != null;
        boolean z13 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        boolean z14 = z12;
        boolean z15 = true;
        while (i11 < length && (z11 || z14 || z15)) {
            byte b10 = bArr2[i11];
            int i21 = b10 & UnsignedBytes.MAX_VALUE;
            if (z15) {
                if (i12 <= 0) {
                    z3 = z11;
                    if ((b10 & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                        if ((b10 & SignedBytes.MAX_POWER_OF_TWO) != 0) {
                            int i22 = i12 + 1;
                            if ((b10 & 32) == 0) {
                                i14++;
                            } else {
                                i22 = i12 + 2;
                                if ((b10 & Ascii.DLE) == 0) {
                                    i15++;
                                } else {
                                    i12 += 3;
                                    if ((b10 & 8) == 0) {
                                        i16++;
                                    }
                                }
                            }
                            i12 = i22;
                        }
                    }
                } else if ((b10 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    z3 = z11;
                } else {
                    i12--;
                    z3 = z11;
                }
                z15 = false;
            } else {
                z3 = z11;
            }
            if (!z3) {
                z8 = z3;
            } else if (i21 <= 127 || i21 >= 160) {
                if (i21 > 159 && (i21 < 192 || i21 == 215 || i21 == 247)) {
                    i18++;
                }
                z8 = z3;
            } else {
                z8 = false;
            }
            if (!z14) {
                z10 = z8;
            } else if (i13 > 0) {
                z10 = z8;
                if (i21 < 64 || i21 == 127 || i21 > 252) {
                    z14 = false;
                } else {
                    i13--;
                }
            } else {
                z10 = z8;
                if (i21 == 128 || i21 == 160 || i21 > 239) {
                    z14 = false;
                } else if (i21 <= 160 || i21 >= 224) {
                    if (i21 > 127) {
                        i13++;
                        int i23 = i19 + 1;
                        if (i23 > i7) {
                            i7 = i23;
                            i19 = i7;
                        } else {
                            i19 = i23;
                        }
                    } else {
                        i19 = 0;
                    }
                    i20 = 0;
                } else {
                    i10++;
                    int i24 = i20 + 1;
                    if (i24 > i17) {
                        i17 = i24;
                        i20 = i17;
                    } else {
                        i20 = i24;
                    }
                    i19 = 0;
                }
            }
            i11++;
            bArr2 = bArr;
            z11 = z10;
        }
        boolean z16 = z11;
        if (z15 && i12 > 0) {
            z15 = false;
        }
        if (z14 && i13 > 0) {
            z14 = false;
        }
        if (z15 && (z13 || i14 + i15 + i16 > 0)) {
            return StandardCharsets.UTF_8;
        }
        if (z14 && (ASSUME_SHIFT_JIS || i17 >= 3 || i7 >= 3)) {
            return SHIFT_JIS_CHARSET;
        }
        if (z16 && z14) {
            return (!(i17 == 2 && i10 == 2) && i18 * 10 < length) ? StandardCharsets.ISO_8859_1 : SHIFT_JIS_CHARSET;
        }
        if (z16) {
            return StandardCharsets.ISO_8859_1;
        }
        if (z14) {
            return SHIFT_JIS_CHARSET;
        }
        return z15 ? StandardCharsets.UTF_8 : PLATFORM_DEFAULT_ENCODING;
    }

    public static String guessEncoding(byte[] bArr, Map<DecodeHintType, ?> map) {
        Charset charsetGuessCharset = guessCharset(bArr, map);
        if (charsetGuessCharset.equals(SHIFT_JIS_CHARSET)) {
            return SHIFT_JIS;
        }
        if (charsetGuessCharset.equals(StandardCharsets.UTF_8)) {
            return "UTF8";
        }
        return charsetGuessCharset.equals(StandardCharsets.ISO_8859_1) ? "ISO8859_1" : charsetGuessCharset.name();
    }
}
